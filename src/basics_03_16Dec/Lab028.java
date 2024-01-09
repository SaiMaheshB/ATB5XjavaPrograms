package src.basics_03_16Dec;

public class Lab028 {
    public static void main(String[] args) {

        int course = 100;
        float GST = 0.1845f;
        float total = course+GST*course; //you have to use the bigger bucket such as Float here rather than using int
        System.out.println(total); //if you dont use you will loose data




    }
}
