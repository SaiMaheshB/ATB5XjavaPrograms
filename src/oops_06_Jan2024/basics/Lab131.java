package src.oops_06_Jan2024.basics;

public class Lab131 {


    public static void main(String[] args) {


        String name = "Mahesh";
        System.out.println(name.concat(" Sai"));
        System.out.println(name + " Sai");
        System.out.println(name.contains("a"));
        System.out.println(name);


        String name2 = new String("Sai");


        String expected_result = "password@123";
        String actual_result = "Password@123";
        if (expected_result.equalsIgnoreCase(actual_result)) {
            System.out.println("Yes");


        }
    }
}