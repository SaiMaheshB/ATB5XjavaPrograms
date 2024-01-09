package src.basics_05_23Dec;

public class Lab077 {

    public static void main(String[] args) {

        // for (A; B; C)
        //A -> Initialization ->JVM what variable, where you are starting point
        //B -> Condition -> When you want this to stop. -> True, false
        //C -> Increment/Decrement

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Mahesh");
        }
        // i started from zero so it will be printed 10 times not 11 times
        // | i=0 , 1 |
        // | i=1 , 2 |
        // | i=2 , 3 |
        // | i=3 , 4 |
        // | i=4 , 5 |
        // | i=5 , 6 |
        // | i=6 , 7 |
        // | i=7 , 8 |
        // | i=8 , 9 |
        // | i=9 , 10 |

        // Start with 1 = 1 only to avoid confusion if you use zero you
        //will get confused by the number of times its running

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Pramod");
        }


        // | i=1 , 1 |
        // | i=2 , 2 |
        // | i=3 , 3 |
        // | i=4 , 4 |
        // | i=5 , 5 |
        // | i=6 , 6 |
        // | i=7 , 7 |
        // | i=8 , 8 |
        // | i=9 , 9 |
        // | i=10 , 10 |



    }
}
