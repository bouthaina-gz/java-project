package com.oca.pratique.accessModifiers;

public class ProtectedAccessModifier  {

    //can't be accessed by outside its package but only through inheritance
    protected int aOfProtectedAccessModifier;

    final static  void helle(String s){
        System.out.println("CC" + s);
    }


    public static void main(String[] args){
        helle("hi");
        helle("hiho");
    }
}
