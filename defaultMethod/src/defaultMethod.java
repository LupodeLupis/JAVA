
interface nameInterface {

    // abstract method --> syntax to implement an abs method -> method();
    public void square (int a );

    // default Method
    default void show(){

         System.out.println("Hello from Default Method!!");
    }
}


public class defaultMethod implements nameInterface {

    // the abstract method has be to implemented in the interface
    public  void square (int a){

        System.out.println(a*a);
    }

    public static void main(String[] args) {

        defaultMethod testMethod =  new defaultMethod();
        testMethod.square(6);
        testMethod.show();

    }
}

/*
 Utilizing Interface is possible to reach the concept of Abstraction in Java
 An Interface is a reference type in JAVA. It can contains method, default method, static method, nested type.
 An interface create a reference type as the Class does ( interface NameInterface{} -- interface is the JAVA KEYWORD --

 */

/*
Because an Interface could only have the possibility to include an abs method which had to be implemented
in the following class, DEFAULT METHOD have been introduced. Default method can be implemented in the Interface without
interfere with the Class.
 */

