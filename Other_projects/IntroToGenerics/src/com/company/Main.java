package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// Example without Generics
        List names = new ArrayList();
        names.add("Alex");
        String name = (String) names.get(0);
        System.out.println("The First name is : " + name);
        //names.add(7);
    //Example with Generics
        List<String> names2 = new ArrayList();
        names2.add("Alex");
        String name2 = names2.get(0);
        System.out.println("First name : " + name2);
        //names.add(7); -- Since this is generic it will throw an error

    }
}
