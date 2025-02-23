package com.oca.pratique;

import com.oca.pratique.accessModifiers.ProtectedAccessModifier;
import com.oca.pratique.accessModifiers.PublicClassUsesProtectedAttributes;
import com.oca.pratique.polymorphism.Child;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class PratiqueApplication extends ProtectedAccessModifier{

	public static void mainkjpo(String[] args) {

		//SpringApplication.run(PratiqueApplication.class, args);

		System.out.println(args.length);

		LocalDate myDate = LocalDate.parse("2005-03-18");

		/**********************************Date/Time*********************************/
		System.out.println(myDate.minusYears(-5));



		/**********************************Inheritance*********************************/
		ProtectedAccessModifier a = new ProtectedAccessModifier();

		PratiqueApplication pratiqueApplication = new PratiqueApplication();


		//1-compilation error because of protected modifier
		//System.out.println(a.a);
		/**********************************Polymorphism*********************************/

		//parent class reference can refer to child class object. This is Polymorphism.
		//B=child                     A=parent

		Child child = new Child();

		System.out.println(child.age);

		//System.out.println(child.myParentVariable);

		//System.out.println("polymorphisme");

		//child.myParentMethod();

		//System.out.println(new Child());


		//protected access modifier
		int element = pratiqueApplication.aOfProtectedAccessModifier;

	}

}
