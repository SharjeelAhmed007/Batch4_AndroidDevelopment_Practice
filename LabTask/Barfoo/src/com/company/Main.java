package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for(int i=1; i<=100; i++){
            //System.out.println(i);
            if(i%2 != 0 && i%3 != 0)
            {
                String sortout=" ";
                System.out.println(i +" " +sortout);
            }
            if(i%2 == 0){
                String sortout="bar";
                System.out.println(i + " " + sortout);
            }
            if(i%3 == 0){
                String sortout="foo";
                System.out.println(i +" " +sortout);
            }
            if(i%2 == 0 && i%3 == 0)
            {
                String sortout="Barfoo";
                System.out.println(i + sortout);
            }
        }
    }
}
