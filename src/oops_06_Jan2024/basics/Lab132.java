package src.oops_06_Jan2024.basics;

public class Lab132 {


    public static void main(String[] args) {

        String s1 = "Mahesh";
        String s2 = new String("Mahesh");
        String s3 = new String("Mahesh");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        System.out.println(s1.equalsIgnoreCase(s3));



    }
}
