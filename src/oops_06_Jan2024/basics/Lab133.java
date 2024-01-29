package src.oops_06_Jan2024.basics;

public class Lab133 {

    public static void main(String[] args) {

        // Immutable in nature (that can't changed)
        String s1 = "Mahesh";
        String s2 = new String("Mahesh");


        // Mutable - that can be changed!!

        //StringBuffer sbuf4 = new StringBuffer("Mahesh");


        StringBuilder sb3 = new StringBuilder("Mahesh");
        sb3.append(" Sai");
        System.out.println(sb3);


        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);



    }
}
