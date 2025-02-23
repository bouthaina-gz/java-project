package com.oca.pratique.accessModifiers;

public class PublicClassUsesProtectedAttributes extends ProtectedAccessModifier{


    ProtectedAccessModifier a = new ProtectedAccessModifier();

    //accessible because it's in the same package as class that containes protected access modifier
    int aOfProtectedAccesModifier = a.aOfProtectedAccessModifier;

    private String name;

    /******************************Methods and Encapsulation ************************/
    PublicClassUsesProtectedAttributes(){
        this("Bouthaina");
    }

    PublicClassUsesProtectedAttributes(String name){
        this.name = name;
    }
}
