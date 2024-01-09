package src.basics_05_23Dec;

public class Lab082 {

    public static void main(String[] args) {

        // for (A; B; C)
        //A -> Initialization ->JVM what variable, where you are starting point
        //B -> Condition -> When you want this to stop. -> True, false
        //C -> Increment/Decrement


        // Print the Odd number in between the 1 to 50.
        // If Else

//        for (int i = 1; i <= 50; i++) {
//            if(i%2==1){
//                System.out.println(i+ " is Odd!");
//            }
//        }
//        System.out.println("End of Program!!");

        //for (int i = 50; i > 0; i--) {
        //            if(i%2==1){
        //                System.out.println(i+ " is Odd!");
        //            }
        //        }
////        for (int i = 1; i <= 50; i++) {
//            if!(i%2==1){
//                System.out.println(i+ " is Odd!");
//            }
//        }
        for (int i = 0; i<=50; ++i) {
            if(i%2==0){ // !(i%2==1) OR (i%2==0)
                System.out.println(i+ " is Even!");
            }
        }
        System.out.println(" --- End of Program!! --- ");


        // !(i%2==1) OR (i%2==0)



    }
}
