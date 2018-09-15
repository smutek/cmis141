Module 3: Abstraction and Methods

Figure 3.II-1 below is a framework showing how to define a method. By passing your mouse over the highlighted items, you can see a brief explanation of the parts of this framework. Following this framework is a detailed discussion of each its parts.

Figure 3.II-1
Framework for a Method
```
/*
 * Method Documentation
 */

 MethodModifiers returnType methodName
   (paramType parm1, paramType parm2,...) {
   
   // definition of local variables
   type variableName = initialValue;   

   ...
   
   // executable statements in method

   // return statement
   return value;
}
```

A. Method Documentation

Generally, it is a good habit to first document each method with one or more lines of comments. What should be documented for each method depends on the local standards for the project on which you are working. Sometimes tools are used to generate documentation from the source file, and so rigid standards are applied for documenting a method. So although it is difficult to draw rigid rules that must always be followed in documenting a method, it is good practice to give at least a brief description of each method, and we will do so for all methods created in this course.

B. Method Modifiers

Method modifiers include public, private, static, final, abstract, and protected. The modifiers abstract and protected are relevant only with inheritance and so are not covered in this course.

The modifiers public and private relate to whether or not a method is visible outside of the current class. If it is visible outside the current class, it is public. If a method is visible only in the current class, it is private.

Static refers to whether a method is associated with a class or an object, and we will cover this topic in module 5. For this course, public static will always be used for class methods, and public for instance methods, which are covered in module 5. We will also discuss the final modifier further in module 5.
C. returnType

Many methods return a value to be used elsewhere in the program. For example, a method that finds the maximum of two ints would return a value that is the larger of the two int numbers input to the method. Thus, the max method below would have a return type of an int that would be assigned to the maxValue variable.

int val1 = 7, val2 = 9, maxValue;
int maxValue = max(val1, val2);

Not all methods will return a value. For example, the printStars method mentioned earlier did not return a value—it just printed stars. However, all methods in Java (with the exception of constructors, which we will cover in module 5) must have a return type. A method that does not return anything must have a return type of void. An example of calling a method named printStars that does not return anything is shown below.

int numStars = 5;
printStars(numStars);

D. methodName

The method name is the identifier used to invoke the method, for example, printStars. A method name is what is used to identify a method in Java so that it can be invoked.

Java has standards for method names. In Java, all method names should begin with a lowercase letter, and each new word should begin with an uppercase letter. Some good names for methods are:

    max
    printStars
    getName
    setMyAddress

Names that do not follow the Java standard, and would not be considered good names for methods in Java would be:

    MAX
    PrintStars
    Get_Name
    Set_Name

E. paramType param1,...

Parameters are the data the method uses to implement its behavior. For example, in the printStars method, there would be one parameter—the number of stars to print. In the max method, there would be two parameters, the two numbers to be compared. A method can have as many parameters as needed; there is no practical limit on the number of parameters that can be passed to a method.

Each parameter must have a data type, such as int or double, associated with it, similar to the data types associated with declaring a variable. In fact, the memory space for a parameter is always created when the method is entered, just as it is for a variable. As will be shown later, the only difference between a variable and a parameter is that a variable must be initialized before it is used (at or after declaration), and a parameter is initialized by passing a value to it when the method is invoked.

Note that the parentheses are required in both the method definition and the method call. If a method uses no parameters, the parentheses should still be present, and the method would be defined as follows:
```
<returntype> foo() {  // method uses no parameters
   .
   .
   .
} // end method foo
```

The method would be invoked by writing foo(), either as a statement (if the return type of foo is void) or as part of an appropriate expression (if foo returns a value).

We have already seen examples of methods that use no parameters—for example, the following line occurs in several places in the Case Study in module 2:

grade = stdin.nextInt();

F. Delineating the Method Block

A method has a sequence of statements associated with it. As was shown in module 2, a sequence of statements can be delineated by placing them inside of two braces, which is then called a block of code or code block. Thus, the sequence of statements that make up a method is enclosed by a beginning and ending brace.
G. Local Variable Declarations

The next step in defining a method is to declare variables that may be needed inside the method. For class methods, all variables used must be either parameters or variables that are declared inside the method. For this course, all variables will be declared at the start of the code block for the method. Because these variables and the parameters to this method will exist only inside of the code block for the method, they are referred to as being local to the method and are often called local variables or method variables.
H. Executable Statements

The next part of the method is where the behavior is implemented for the method. The executable statements are the Java code containing the control structures needed to make the method work in the prescribed manner.
I. return Statement

The return statement assigns the value to be returned from the method, after which the method is exited. When a return statement is encountered, the program stops running in the method and returns to the statement that follows the statement that invoked the method.

There are three ways return statements can be used:

    Some methods do not return values, and in these cases, for example, printStars, the method will have a void return type. When the method has a void return type, the return statement in the method can either be omitted or it can be used without an associated value. If the return statement is omitted, there is an implied return statement after the last statement in the method as shown in figure 3.II-2 below.

    Click successively on the "next" button to see the illustration. The final step is a summary of the previous steps.

    Figure 3.II-2
    Called and Calling Environments
    (No Return Value)


    Methods can return a single value for each return statement. In this case, the literal constant or the value of the variable, which is lexically placed immediately following the return statement in the called function, is saved and returned to the calling function. The variable on the left-hand side of the assignment statement where the method is called is then assigned the saved and returned value before execution resumes in the calling method. The calling method is then resumed at the statement following the method call, as shown in figure 3.II-3 below.

    Click successively on the "next" button to see the illustration. The final step is a summary of the previous steps.

    Figure 3.II-3
    Called and Calling Environments
    (One Return Value)


    Although it is more common for methods to have a single return statement, methods can have multiple return statements. When multiple return statements are used, they behave similarly to the value-returning method above. We will show an example of a method with multiple return statements later in this module.

