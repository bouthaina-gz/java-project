package com.oca.pratique.revision;

public class Janvier19 {

    public static void main(String[] args){
        System.out.println(new Boolean("oui"));

        final String hello  = "hello";

        methodthatTakeVarargsAsParams("hola","hi","bonjour");
    }
    public static void methodthatTakeVarargsAsParams(String... varargs){
        System.out.println(varargs);
    }
}
