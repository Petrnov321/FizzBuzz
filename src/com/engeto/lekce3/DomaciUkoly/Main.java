package com.engeto.lekce3.DomaciUkoly;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i <= 100; i++) {
            String s = String.valueOf(i);
            if ((i%3) == 0 && (i%5 != 0)){    s = "Fizz";    }
            else if ((i%5 == 0 && (i%3) != 0)) {     s = "Buzz";     }
            else if ((i%3) == 0 && (i%5 == 0)) {    s = "FizzBuzz";    }
            System.out.println(s);


            System.out.println(s);
            System.out.println(s);
        }

    }
}
