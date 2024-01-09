package src.basics_06_24Dec;

public class Lab104 {

    public static void main(String[] args) {

        int[] int_array = {34, 45, 46};
        float[] f_array = {45.6f, 32.34f, 43.43f};
        long[] l_array = {34l, 45l, 43l};
        double[] d_array = {34.3, 43.4, 12.32};

        boolean[] b_array = {true, false, true, false};
        char[] c_array = {'A', 'B', 'C'};
        String[] names = {"Mahesh", "Sai", "Burra"};

        System.out.println(int_array.length);
        System.out.println(names.length);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }



    }
}
