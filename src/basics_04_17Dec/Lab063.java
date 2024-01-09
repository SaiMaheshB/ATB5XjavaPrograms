package src.basics_04_17Dec;

public class Lab063 {

    public static void main(String[] args) {

        // JDK > 13
        // -> this arrow symbol automatically works as a break in the below code


        int itemCode = 001;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003,004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }



    }
}
