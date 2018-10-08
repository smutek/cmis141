var host_re = /\w*:\/\/([^\/]*)/; //RE looking for :// in location to capture local host
var popup_re = /\b(popup[a-zA-Z0-9-_]*)\b/;  // RE for matching class value as any string starting with "popup"
var coursewin_re = /\b(courseWin[a-zA-Z0-9-_]*)\b/;  // RE for matching class value as any string starting with "courseWinp"
var print_re = /\b(popupPrint[a-zA-Z0-9-_]*)\b/; // RE for matching printModules
var site_re = /\b(site[a-zA-Z0-9-_]*)\b/; // RE for matching siteMap
var copy_re = /\b(popupCopy[a-zA-Z0-9-_]*)\b/; // RE for matching Copyright pop up
var width_re = /\bw(\d{3,4})\b/;
var height_re = /\bh(\d{3,4})\b/;

if((top.location.hostname.indexOf("coursedev") < 0)
&& ( /^.*(printModules\.pl|CDI).*$/gi.test(document.location) == false )
&& ( /^popup.*/i.test(window.name) == false))
{
	checkForCookie();
}

function trace( st ) {
	if (window.console ) { console.log('>>>>>> ALPHA.JS >>>>>>>>' + st ); }
}


function extractURLParam (fullurl, searchParam ) {
	//
	// use the current page location and extracts 
	// parameter pair specified by you search string.
	//
	//var fullurl=window.location.search;
	var param=(fullurl.slice(1)); 
	var pairs = param.split("&");
	var my_var = '';
	
	if ( fullurl.length == 0) return;
		
	for(var i = 0; i < pairs.length; i++)
	{ 
		if (pairs[i].indexOf(searchParam) > -1 ) {
			my_var = pairs[i];
			break;
		}
	}
	return my_var;
}


function linkToHere() { 

	var strOptions = 'resizable=yes,scrollbars=yes,menubar=yes,status=yes,width=500,height=300';
	var myOpenerURL='';
	var myTargetURL='';
	var modulesParam='';
	var myAnchor='';
	var myTop = '';
	var p2 ='';
	
// window.name -	is the name of the window in which the button is clicked
// myTarget -		holds the location of the window to which we want to link.
//
	if ( window.name.match(popup_re)) {
		myOpenerURL = parent.window.opener.parent.location.toString(); //use opener location to get the module 
		myTargetURL = window.location.toString();
		myTop = 'top&';
	}
	else if (window.name == 'left') {
		myOpenerURL = parent.window.location.toString(); // use parent location to extract the module.
		myTargetURL = parent.window.frames[2].location.toString();
	}
	else if (window.name.match(coursewin_re)) {
		myTargetURL = window.location.toString();
	}
	else {
		alert('ATTENTION \nLink to here does not recognize window name: ' + window.name );
	}
	
	
	if ( myTargetURL.indexOf('fs_link.pl') > -1 ) {
		myTargetURL = myTargetURL.substring( myTargetURL.indexOf("/", myTargetURL.indexOf(location.hostname)), myTargetURL.indexOf('?'));
		var my_fs_project_id = extractURLParam(window.location.search,  'fs_project_id' );
		//my_fs_project_id = (my_fs_project_id.length>0) ? my_fs_project_id + "&" : '';
		var my_tmpl = extractURLParam(window.location.search, 'tmpl' );
		my_tmpl = (my_tmpl.length>0) ? "&" + my_tmpl : '';
		p2 = 'default=' + myTargetURL + '?'+ my_fs_project_id + my_tmpl;
	}
	else {
		modulesParam = extractURLParam( myOpenerURL,'module');
		modulesParam = (modulesParam.length > 0 ) ? modulesParam + '&' : modulesParam;
		if ( myTargetURL.indexOf('Modules') > 0) {
			p2 = myTargetURL.substring(myTargetURL.indexOf('/', myTargetURL.indexOf('Modules'))+1 , myTargetURL.indexOf('?'));
		}
		else {
			p2 = myTargetURL.substring(myTargetURL.indexOf('/', myTargetURL.indexOf(top.location.hostname)), myTargetURL.indexOf('?'));
		}
		p2 =  myTop +  modulesParam + 'default=' + p2;
	}

	if ( myTargetURL.indexOf('#') > 0 ) {
		p2 = p2.substring( p2.indexOf('#')).replace('#','%23');
	}
	
	var linkToURL =  'http://tychousa.umuc.edu/cgi-bin/id/CDI/index.pl?' + p2 + '&amp;lth'
	makeLinkWindow( linkToURL);
} // end function linkToHere()

function makeLinkWindow( myText ) {
/*
	this function creates a pop up window 
	that displays the myText argument in a textArea
*/
	var strOptions = 'resizable=yes,scrollbars=yes,menubar=yes,status=yes,width=500,height=300';
	var nw = window.open('','linkWindow', unescape(strOptions));
	var doc = nw.document;
	
	if( nw != null ){
		nw.document.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> ");
		nw.document.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">");
		nw.document.write("<head>");
		nw.document.write("<title>Link To Here</title>");
		nw.document.write("</head>");
		nw.document.write("<body style=\"font-family: Verdana,Arial,Courier New; font-size: 0.7em;\">");
		nw.document.write("<div id=\"div0\">");
		nw.document.write("<h2 style=\"color: rgb(51, 102, 153); font-size: 1.2em;\">Link To Here</h2>");
		nw.document.write("<p id=\"p0\">Copy and paste this HTML code to link to this page.</p>");
		nw.document.write("<form id=\"form0\">");
		nw.document.write("<textarea id=\"linkText\" rows=\"8\" cols=\"50\">" + myText + "</textarea>");
		nw.document.write("</form>");
		nw.document.write("<div id=\"divClose\" class=\"centered\">");
		nw.document.write("<input type=\"button\" value=\"Close\" onclick=\"if (!window.close()) history.back();\">");
		nw.document.write("</div></div>");
		nw.document.write("</body></html>");
	}
	
	nw.focus()
	nw.document.close();
	
}

function trace( st ) {
	if (window.console ) { console.log('>>>>>> ALPHA.JS >>>>>>>>' + st ); }
}


function addLinkButtonIfNeed(  ) {
	
	if (!this.name.match(coursewin_re) && !this.name.match(popup_re)) { // && this.opener.parent.left) {
		return;
	}
	if ( this.name.match(copy_re) ) {
		return;
	}
	if ( this.name.match(site_re) ) {
		return;
	}
	if ( this.name.match(print_re) ) {
		return;
	}	
	if ( !this.opener.parent.left ) {
		return;
	}
	
	var str = this.opener.parent.left.location.toString();
	
	if ( str.search(/faculty=true/i)<0 ) {
		return;
	}

	var div, hr, form, button, beforeMe, str;

	window.resizeBy(0,50);
	div	= document.createElement('div');
	hr = document.createElement('hr'); // horizontal separator
	form = document.createElement('form');
	form.setAttribute('name','form0');
	form.setAttribute('id','form0');
	form.setAttribute('action','Javascript: linkToHere();');
	form.setAttribute('method','post');
	form.style.margin = '0px';
	form.style.padding = '0px';
	button = document.createElement('input');
	button.setAttribute('type','submit');
	button.setAttribute('name','btnSubmit');
	button.setAttribute('value','Link To Here');
	
	// put everything in the div
	form.appendChild(button);
	div.appendChild(form);
	div.appendChild(hr);
	beforeMe = document.body.childNodes[0];
	if(beforeMe!==undefined)
		document.body.insertBefore(div, beforeMe);	
}



function addPops()
{ // Add popup functionability to all anchors with class="popup*" and add titles

	addLinkButtonIfNeed();
	
	var x = collectionToArray(document.getElementsByTagName('a'));
	x = x.concat(collectionToArray(document.getElementsByTagName('area')));
	var pophost;
	var test;	
	for(var i = 0; i < x.length; i++)
	{ // traverse all anchors on page
		test = x[i].getAttribute('class');
		if((!test) || (test == '')) { test = x[i].getAttribute('classname'); }
		if((test) && (test.match(popup_re)))
		{ 	
			if(!x[i].title)
			{	// fill empty titles with anchor's href
				// x[i].title = x[i].href;
			}
			var pophost = host_re.exec(x[i].href);
			// x[i].title += pophost && (pophost[1] != window.location.host) ? ' (External Popup)' : ' (Popup)';
			x[i].onclick = function () { return popup( this); }
			if (!x[i].onmouseover) x[i].onmouseover = function () { window.status = this.title; return true; }
			if (!x[i].onmouseout ) x[i].onmouseout = function () { window.status = ''; return true; }
		}
	}
}


function popup(obj, url, name)
{ 	// Creates a pop up window with the href of the obj (e.j. anchor) passed.

	// Set the default size of the window
	var windowWidth = 600;
	var windowHeight = 450;

	// alert('FUNCTION \npopup: \nOBJECT: \n\n[' + obj + ']');
	var href = url;
	if (obj) {
		href = url || obj.href;
	}	
	var pophost = host_re.exec(href);
	var options = 'resizable=yes,scrollbars=yes,menubar=yes,status=yes';
	var default_size = 'height='+windowHeight+',width='+windowWidth+',';
	var test;
	var h, w;
	if(obj)
	{
		test = obj.getAttribute('class');
		if((!test) || (test == '')) { test = obj.getAttribute('classname'); }
		if((!test) || ((name = (test.match(popup_re))[1]) == '')) { name = 'popup_unnamed'; }
		if((test) && (w = test.match(width_re))) { options = 'width=' + w[1] +
			',' + options; windowWidth = w[1];}
		if((test) && (h = test.match(height_re))) { options = 'height=' + h[1] +
			',' + options; windowHeight = h[1];}
	} // end if obj
	
	if(!w && !h) { options = default_size + options;}
	
	if(pophost && (pophost[1] != window.location.host))
	{ // external Popup
		options += ',toolbar=yes,location=yes,copyhistory=yes,directories=yes';
	}

	var screenCenterX = screen.availWidth / 2;
	var screenCenterY = screen.availHeight / 2;
	var windowTop = screenCenterY - (windowHeight/2);
	var windowLeft = screenCenterX - (windowWidth/2);
	if (windowTop < 0) {windowTop = 0;}
	if (windowLeft < 0) {windowLeft = 0;}

	options +=
		',top='+windowTop+',left='+windowLeft;
	
	var newwindow = window.open(urlabsolute(href), name, unescape(options));	
	if (window.focus)
	{ // if window.focus is supported, use it to focus new window
		newwindow.focus();
	}

	if (!obj) return;
	return false;
}



function collectionToArray(col) {
	var a = new Array();
	for (var i = 0; i < col.length; i++)
		a[a.length] = col[i];
	return a;
}


function getCookie(name)
{ // Fecthes the cookie with name 'name'
	var re = new RegExp(name + "=([^;]+)");
	var value = re.exec(document.cookie);
	
	return (value != null) ? unescape(value[1]) : null;
}

function parseCookie(info)
{ // Extract all the pieces of the MyInfo cookie and return them in an array.
	var re = /^([^+]*)\+([^&]*)&([^&]*)&([^&]*)&(\d{4})(\w{4}\d{3}\w?)(\d{4})/;
	var values = re.exec(info);

	if(!values)
	{  // Must be a TA Cookie if it fails first regular expression
		re = /^([^+]*)\+([^&]*)&([^&]*)/;
		values = re.exec(info);
	}	// If its neither the MyInfo or TA cookies, it returns null;
	return (values != null) ? values : null;
}

function checkForCookie()
{
	var re = /^.*\/(w{4}\d{3}\w?)\/(\d{4})\/.*/;
	var cookie_values = parseCookie(getCookie('MyInfo'));

	if(cookie_values != null)
	{
		path_values = re.exec(top.location.pathname);
	}
}

var ureg=new RegExp('^([^:/?#]+:)?(//([^/?#]*))?(((/?)(?:[^?#/]*/)*)([^?#/]*))(\\?[^#]*)?(#.*)?');
//(rf RFC2396 appx b) 1           2  3          456                 7         8          9

function urlabsolute(loc){
	var locm=loc.match(ureg);
	if(locm[6]) return loc;
	var baseh=document.getElementsByTagName('BASE')[0];
	if(!baseh || !baseh.href) return loc;
	var basem=baseh.href.match(ureg);
	if(!basem[1] || !basem[2]) return loc;
	return basem[1]+basem[2]+basem[5]+loc;
}


if(window.addEventListener) {
	// browsers that brand themselves as netscape use this code.
	// mozilla seems to use this method. Mike Slie 4/20/09.marker
	// safari seems to also use this method.
	window.addEventListener("load",addPops,false);
	}
else if(window.attachEvent) {
	// internet explorer seems to use this method. Mike Slie 04/20/09 marker
	window.attachEvent("onload",addPops);
	}
else {
	// ?
	window.onload=addPops;
	}
	

// ---------------------------------------------------------------------
// From here to the end of this file:
// COPY of class.js
// (do not edit here ... edit fully commented version, and then paste)
//

var acpT1=new Date();
var acpDprintdiv;
var acpDphase='parsing script';
var acpClass;
var acpOnClick;
var acpIntvId;
var acpVerbose=(document.cookie.match(new RegExp("(?:^|; )classdebug=(?:[a-zA-Z0-9_]*,|)*verbose(?:[,;]|$)"))?true:false);
function acpClickHandler(target){
var tagName=target.tagName.toLowerCase();
acpDprint("you clicked on &lt;"+target.tagName.toLowerCase()+"&gt;");
var ta=[['a','href'],['area','href']]; for(var j in ta){
if(tagName==ta[j][0]){
if(	(target.attributes!==undefined) &&
(target.attributes[ta[j][1]]!==undefined) &&
target.attributes[ta[j][1]].specified){
acpAddUrlParam(target.attributes[ta[j][1]],'class',acpClass);
}
}
}
return true;
}
function acpNormalClick(){
(function(m){if(!m)return;m.parentNode.removeChild(m);})(document.getElementById('acpTempMsg'));
if(!window.addEventListener && window.attachEvent){

document.detachEvent("onclick",acpOnClick);
}else{
window.captureEvents(Event.CLICK|Event.MOUSEDOWN);
window.removeEventListener("click",acpOnClick,true);
window.removeEventListener("mousedown",acpOnClick,true);
}
}
var acpDstatusArr=new Array;
function acpDstatus(e){
if(!acpVerbose) return;
var hasbody=(document.body&&document.body.firstChild);
var t=(new Date() - acpT1)/1000;
var lstatus=(acpDstatusArr.length>0 ? acpDstatusArr[acpDstatusArr.length-1] : {phase:'',body:-1,t:-1});
var status={phase:acpDphase,body:(hasbody?document.body.childNodes.length:0),t:t};
if(status.phase!=lstatus.phase || status.body!=lstatus.body) acpDstatusArr.push(status);
if(hasbody && acpDphase=="acp done"){
window.clearInterval(acpIntvId2);
for(var i=0,o='';i<acpDstatusArr.length;i++){
o+=acpDstatusArr[i].t.toFixed(2)+" "+acpDstatusArr[i].phase+" "+acpDstatusArr[i].body+"<br />\n";
}
var d=document.createElement('div'); d.id='acpStatus';
d.style.position="absolute";
d.style.border="1px solid #bbb";
d.style.left="100px";
d.style.backgroundColor="#eea";
d.style.top="100px";
d.style.padding="10px 8px 8px 8px";
d.innerHTML='<p style="margin: 0">'+o+'</p>';
document.body.insertBefore(d,document.body.firstChild);
}
}
if(acpVerbose) var acpIntvId2=window.setInterval(acpDstatus,1);
function acpDprint(msg,escape){
if(!acpVerbose) return;
var m=new String(msg);
if(escape!==undefined && escape){
m=m.replace(/&/g,'&amp;').replace(/</g,'&lt;');
}
if(!acpDprintdiv||!(acpDprintdiv=document.getElementById('diagmsg'))){
acpDprintdiv=document.createElement('div');
acpDprintdiv.id='diagmsg';
document.body.insertBefore(acpDprintdiv,document.body.firstChild);
document.body.appendChild(acpDprintdiv);
var s=document.createElement('style'); s.type='text/css';
document.getElementsByTagName('head')[0].appendChild(s);
var sty='div#diagmsg { border: 1px solid #888; background-color: #ffd; margin: 0; font-size: smaller;} '+
'div#diagmsg p{margin: 0;}';
if(s.styleSheet){s.styleSheet.cssText+=sty;}
else{s.textContent+=sty;}
acpDprintdiv.innerHTML='<p><b>Debug output '+
'<a href="javascript:void 0;" '+
'onClick="document.body.removeChild(document.getElementById(\'diagmsg\'))"'+
'>remove</a></p>\n';
}
var dm=document.createElement('p');
dm.innerHTML=m;
acpDprintdiv.appendChild(dm);
acpDprintdiv.appendChild(document.createTextNode("\n"));
return msg;
}
function acpScanLinksAndFix(e){
acpDphase='acp begin'; acpDstatus();
acpDprint("acpScanLinksAndFix() started at "+(new Date()-acpT1)/1000);
var tags=function(x){return document.getElementsByTagName(x);}
var a=tags('meta'); for(var i=0;i<a.length;i++){
try{
if(a[i].attributes['http-equiv'].value.toLowerCase()!='refresh') continue;
var pseudolink=new Object();
pseudolink.value=a[i].attributes["content"].value.match(new RegExp('^[0-9]*; *url=(.*)$'))[1];
acpDprint("Fixing META pseudolink "+pseudolink.value);
document.location=acpAddUrlParam(pseudolink,'class',acpClass);
acpDprint("... into "+pseudolink.value);
document.location=pseudolink.value;
}catch(e){}
}
var ta=[['a','href'],['area','href']]; for(var j in ta){
var a=tags(ta[j][0]); for(var i=0;i<a.length;i++){
if(	(a[i]!==undefined) && 
(a[i].attributes!==undefined) &&
(a[i].attributes[ta[j][1]]!==undefined) && 
(a[i].attributes[ta[j][1]]!==null) &&
a[i].attributes[ta[j][1]].specified){
acpAddUrlParam(a[i].attributes[ta[j][1]],'class',acpClass);
}
}
}
acpNormalClick();
acpDphase="acp end";acpDstatus();
acpDphase="acp done";
}
function acpAddUrlParam(li,key,val){
var m,jspre='',link='',jspost='';
if(null!==(m=li.value.match(new RegExp(
"^\\s*javascript:\\s*popUp([234]?)\\s*\\(\\s*'([^']*)'\\s*,\\s*'([^']*)'\\s*\\)\\s*(.*)$"
,'i')))){
jspre="javascript:popUp"+m[1]+"('";
link=m[2];
jspost="','"+m[3]+"')"+m[4];
} else if(null!==(m=li.value.match(new RegExp(
"^\\s*javascript:\\s*popup\\s*\\(\\s*([^']*')([^']*)('[^']*)$"
,'i')))){
jspre="javascript:popup("+m[1];
link=m[2];
jspost=m[3];
} else if(null!==(m=li.value.match(new RegExp('^\\s*javascript:','i')))){
return;
} else link=li.value;
if(null===(m=link.match(
new RegExp(
'^\\s*([a-z]*:|)'+
'(/'+'/[^/?#]*(\\.umuc\\.edu)|/'+'/[^/?#]*|)'+
'(/|)'+
'([^?#]*(\\.[a-z0-9_]*)|[^?#]*)'+
'(\\?([^#]*)|)'+
'(#.*|)\\s*$'
,'i')
))) return;
if( m[6] &&
m[6].match(new RegExp(
'.(?:ram|jpe?g|png|gif|mpe?g|avi|mp3|m3u|m4u|pls|rm|wav|mov|mp4)',
'i'))
) return;
if( !m[2] || m[2]=='/'+'/'+window.location.host ){
m[7]='?'+key+'='+val;
if(m[8]){
for(var m8=m[8].split(new RegExp('[&;]')),i=0;i<m8.length;i++){
if(m8[i].split('=')[0]!='class') m[7]+='&'+m8[i];
}
}
} else {
}
li.value=jspre+m[1]+m[2]+m[4]+m[5]+m[7]+m[9]+jspost;
}
(function(c){
if(!document.location.hostname.match(new RegExp('\.umuc\.edu$'))) return;
if(document.cookie.match(new RegExp("(?:^|; )classdebug=(?:[a-zA-Z0-9_]*,|)*noclass(?:[,;]|$)"))) return;
if(c === null){
acpIntvId=window.setInterval(function(e){
if(!document.body || !document.body.firstChild) return;
window.clearInterval(acpIntvId);
if(acpVerbose){
var s=document.createElement('style'); s.type='text/css';
document.getElementsByTagName('head')[0].appendChild(s);
var sty=
".classwarning {\n  font-family: sans-serif; font-size: 9pt;\n"+
"  border: 1px solid #800;\n  background-color: #ffd;\n"+
"  position: absolute; right: 10px; top: 10px;\n  padding: 0px;\n"+
"  width: 80%;\n  padding: 6pt 0pt 6pt 10pt;\n}\n"+
".classwarning p {\n  list-style-type: none;\n  margin: 0px;\n"+
"  padding: 0px;\n  color: #400;\n  text-align: justify;\n}\n"+
".classwarning p span.nowrap {\n  white-space: nowrap;\n}\n"+
".classwarning p.close {\n  border-left: 1px solid #800;\n"+
"  border-bottom: 1px solid #800;\n  margin: 0;\n"+
"  position: absolute;\n  right: 1px;\n  top: 1px;\n}\n"+
".classwarning p.close a{\n  color: #800; font-weight: bold;\n"+
"  text-decoration: none;\n"+"}\n";
if(s.styleSheet){s.styleSheet.cssText=sty;}
else{s.textContent=sty;}
var w=document.createElement('div');
w.className='classwarning';
w.id='classwarning';
w.innerHTML='<p><b>Warning:</b></p> '+
'<p class="close"><a href="javascript:void 0" '+
'onClick="document.body.removeChild(this.parentNode.parentNode)"'+
' title="Remove the warning">&nbsp;x&nbsp;</a></p>\n'+
'<p>We have detected an internal error which may cause links on this page not to work.</p>';
document.body.insertBefore(w,document.body.firstChild);
}
var logdata={
location: document.location,
referer: document.referrer,
ssize: screen.width+","+screen.height,
wsize: (window.width !== undefined ? window.width+","+document.height :
document.body.clientWidth+","+document.body.clientHeight),
framenum: window.top.length,
wname: window.name
};
var l="errno=819&errtx=js_no_target";
for(var x in logdata){ l+="&"+x+"="+encodeURIComponent(logdata[x]); }
},1);
} else {
acpClass = c[1]+':'+c[3]+':'+c[4]+(c[5].length>0?':'+c[5]:'');
if(!window.addEventListener && window.attachEvent)
{ window.attachEvent("onload",acpScanLinksAndFix); }
else
{ window.addEventListener("load",acpScanLinksAndFix,false); }
if(!window.addEventListener && window.attachEvent){
acpOnClick=function(){if(!acpClickHandler(window.event.srcElement)){window.event.returnValue=false;}}
document.attachEvent("onclick",acpOnClick);
}else{
acpOnClick=function(e){if(!acpClickHandler(e.target)){e.stopPropagation();e.preventDefault();}}
window.captureEvents(Event.CLICK|Event.MOUSEDOWN);
window.addEventListener("click",acpOnClick,true);
window.addEventListener("mousedown",acpOnClick,true);
}
}
})(location.search.match(new RegExp(
'(?:\\?|[&;])class=(\\w{4})(:?)(\\w{7,8}?)\\2(\\w{4}):?(d?)(?:$|[&;])','i'))); 
acpDphase='script end'; acpDstatus();
acpDphase='script parsed';
