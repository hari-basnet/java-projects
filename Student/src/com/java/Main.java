package com.java;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "hari", "Helsinki"));
        ar.add(new Student(112, "Ram", "Espoo"));
        ar.add(new Student(112, "shyam", "Vantaa"));

        System.out.println("Unsorted");
        for(int i = 0; i < ar.size(); i++){
            System.out.println(ar.get(i));
        }

        Collections.sort(ar, new SortByRoll());

        System.out.println("\nSorted by rollno");
        for(int i = 0; i < ar.size(); i++){
            System.out.println(ar.get(i));
        }

        Collections.sort(ar, new SortByName());

        System.out.println("\nSorted by name");
        for(int i = 0; i < ar.size(); i++){
            System.out.println(ar.get(i));
        }


    }
}
