
interface TestInterface1{

     default void show(){

        System.out.println("Hello from Default method Interface 1");
    }
}

interface TestInterface2{

    default void show(){

        System.out.println("Hello from Default method Interface 2");
    }
}



public class MultipleInheritanceInterface implements TestInterface1,TestInterface2 {


    // Override the show method
    // A class that implements the interface may simply use the default implementation for the method or override the method with a new implementation
    public void show(){

        TestInterface1.super.show();
        TestInterface2.super.show();

    }

    public static void main(String[] args) {

        MultipleInheritanceInterface TestDefault = new MultipleInheritanceInterface();

        TestDefault.show();
        //TestDefault.show1();


    }
}














/*

Since Java does not have multiple inheritance, using abstract classes prevents your users from using any other class hierarchy.
In general, prefer interfaces when there are no default implementations or state.

An interface is a contract (or a protocol, or a common understanding) of what the classes can do.
When a class implements a certain interface, it promises to provide implementation to all the abstract methods declared in the interface.
Interface defines a set of common behaviors.
The classes implement the interface agree to these behaviors and provide their own implementation to the behaviors.
This allows you to program at the interface, instead of the actual implementation.

One of the main usage of interface is provide a communication contract between two objects.
If you know a class implements an interface, then you know that class contains concrete implementations of the methods declared in that interface,
and you are guaranteed to be able to invoke these methods safely.

In short main use of interface is to facilitate polymorphism.
Interface allows a class to behave like multiple types, which is not possible without multiple inheritance of class.
It also ensures that you follow programming to interface than implementation pattern, which eventually adds lot of flexibility in your system.
* */