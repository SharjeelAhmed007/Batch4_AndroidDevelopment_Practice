package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int PrimeNumber[]= new int[20];
        boolean chk = false;
        for (int a = 2; a <= 100;a++) {
            for (int i = 2; i < 100; i++) {
                if (a % i == 0 && a != i) {
                    chk = true;
                    break;
                }
            }
            if (chk == false) {

                System.out.println("Prime no is: " + a);

            }
            chk = false;
        }
    }
}
