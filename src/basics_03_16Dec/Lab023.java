package src.basics_03_16Dec;

public class Lab023 {

    public static void main(String[] args) {

        // || - OR
        // T || T --> True
        // T || F --> True
        // F || T --> True
        // F || F --> False

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // And && (anyone is false means its false
        // T || T --> True
        // T || F --> False
        // F || T --> False
        // F || F --> False

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);









    }
}
