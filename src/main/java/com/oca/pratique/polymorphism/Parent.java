package com.oca.pratique.polymorphism;

public class Parent {

    public static String parent_static_field = "static field of parent";

    public static void methodThatShouldBeHerited(){
        System.out.println("i am called from parent context");
    }

    public int age;
    Parent(){
        System.out.println("hello from Parent");
    }

    static{
        System.out.println("hello from static block from parent");
    }

    {
        System.out.println("hello from non static block from parent");
    }


     public void myParentMethod(){

            System.out.println("hello from parent !");
    }

    public String myParentVariable = "variable from parent";

    public static void myParentStaticMethod(){ System.out.println("hola from parent");}

    /*************************methodes varibles************************/

    private String printVariable(){
        final String[] myVariable = {"0"};
        myVariable[0] = "3";
        return myVariable[0];
    }

    private static void myMethod(){
        int element = 0;
    }
    private void mySecondmethod(){
        System.out.println("hola");
    }

    private String instanceVariable = "hello";

    private int a = 3;

    private Integer b = 3;

    //unboxing
    private int c = b;

    //autoboxing
    private Integer d=a;

    //boxing (new Integer(a)) aussi
    private Integer e = Integer.valueOf(a);

    //autocasting
    private long f = a;

    //autocasting + autoboxing
    private Long g = Long.valueOf(a);
}
