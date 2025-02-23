package com.oca.pratique.exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassThatThrowException {

    public record Student(String firstName, String lastName, String job){

        public Student{
            System.out.println("hello canonical constructor");
        }
    };

    public static void methodThatThrowsException() throws CustomException {

        try {
            List<String> list = new ArrayList<>();

            list.add("hello");
            list.add("hi");
            list.add("bonjour");
            System.out.println("hello from try block");
            //list.get(6);
            throw new CustomException("my custom Exception of both 1");
        }catch(IndexOutOfBoundsException e){
            throw new CustomException("my exception of index out of bounds");
        }catch (CustomException e){
            throw new CustomException("my custom Exception of both");
        }finally {
            System.out.println("calling finally block");
        }

    }

    public static void main(String[] args) throws CustomException {


        //methodThatThrowsException();

        var student = new Student("both" , "gazbouri" , "developer");

        System.out.println(student);

    }




}


