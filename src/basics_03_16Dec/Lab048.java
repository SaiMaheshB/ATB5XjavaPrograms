package src.basics_03_16Dec;

import java.util.Scanner;

public class Lab048 {

    public static void main(String[] args) {

        //Take three input from user and give max out of two number
        // a,b a>b-->a, else b

        Scanner sc = new Scanner(System.in);//In OOPS will learn more about Scanner class
        System.out.println("Enter the values a,b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b) {
            System.out.println("Max is " + a);//we are adding + for proper concatenation - combining
        }else{
            System.out.println("Max is " +b);// role of + is adding the value of integer and String

        }


    }
}
