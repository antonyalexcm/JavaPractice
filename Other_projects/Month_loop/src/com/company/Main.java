package com.company;

import javax.print.DocFlavor;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Looping through a month with for loop

        String[] months = { "January", "February", "March",
                            "April", "May", "June",
                            "July", "August", "September",
                            "October", "November", "December"};

      //  for(int i=0; i < months.length; i++){
      //    System.out.println(months[i]);

         Arrays.stream(months).forEach(System.out::println);
    }
}
