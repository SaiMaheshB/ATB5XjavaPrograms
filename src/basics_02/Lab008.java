package src.basics_02;

public class Lab008 {

    public static void main(String[] args) {
        int number = 9;
       // System.out.printf("%d*1=%d*1",number,2);
//        System.out.printf("%d*2=%d*2");
//        System.out.println("%d*3=%d*3");

        // why are we using this?
        //Jus to Format or Formatting purpose we use this
        String name = "Mahesh"; //Bunch of Char
        //Concate +
        System.out.println("Your name is -->" + name);

        //Formatting (printf)
        System.out.printf("Your name is--->%s",name);

        System.out.println();

        float pi = 3.14159f;
        System.out.printf("Your value is  %f",pi);


    }
}
