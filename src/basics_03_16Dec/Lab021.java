package src.basics_03_16Dec;

public class Lab021 {
    public static void main(String[] args) {
        //Interview question  - Relational Operator
        System.out.println(10 == 10);
        System.out.println(10 >= 10);
        System.out.println(10 <= 10);
        System.out.println(10 > 10);
        System.out.println(10 < 10);

        System.out.println("-------");


        System.out.println('A'== 65); //ASCII
        System.out.println('A'== 65);
        System.out.println('A');
        System.out.println('S');

        //Intevriew Question
        byte b = 65;
       // System.out.println('A'==b); // b becomes integer
        System.out.println('A'== 65.0); // ? (This is a property of Java)
        System.out.println('A'== 65.0f);

        //System.out.println('A'== 65.2); // false
        //System.out.println('A'== 65.000000); //True

        //System.out.println(true == 0); //Not applicable






    }
}
