package src.oops_06_Jan2024.basics;

public class Lab136 {


    public static void main(String[] args) {

        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("SaiMahesh");
        stringBuilder.reverse();
        System.out.println(stringBuilder);



    }
}
