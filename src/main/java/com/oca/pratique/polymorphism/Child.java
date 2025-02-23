package com.oca.pratique.polymorphism;

public class Child extends Parent{

    public static String myfriend = "MY friend";

    public String yourFriend = "YOUR friend";

    public static void methodThatShouldBeHerited(){
        System.out.println("i am called from child context");
    }

    static{

        final int a = 5;
         final Integer element = 10;

         Object myObject = new Object();

         String myParentVariable = "variable from child";

         System.out.println("hello from static block of child");
    }

    {

        System.out.println("hello from non static block of child");
    }


    public Child(){
        System.out.println("hello I al child");
    }

    public static void main(String[] args) {
        System.out.println("the main of child class");

        Child child1 = new Child();
        Child child2 = new Child();
        Parent parentCastedToChild = child1;
        Parent parentClass = new Parent();


        child1.methodThatShouldBeHerited();
        parentClass.methodThatShouldBeHerited();
        parentCastedToChild.methodThatShouldBeHerited();
    }
}
