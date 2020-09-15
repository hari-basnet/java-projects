package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DonList<String> firstList = new DonList<>();
        firstList.add("Hari");
        firstList.add("Ram");
        firstList.add("MadhuKumar");

        System.out.println(firstList.toString());


        firstList.remove("Ram");

        System.out.println(firstList.toString());
    }
}
