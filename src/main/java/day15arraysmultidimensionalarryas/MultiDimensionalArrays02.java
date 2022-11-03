package day15arraysmultidimensionalarryas;


import java.util.Arrays;

public class MultiDimensionalArrays02 {

    public static void main(String[] args) {

        // MultiDimensionalArray kisa yoldan nasil olusturulu?

        char arr[][] = {{'a', 'b'}, {'C', 'D', 'E'}, {'?'}};

        System.out.println(Arrays.deepToString(arr));//[[a, b], [C, D, E], [?]]

        //Bir String multidimensional array de icinde "a" olan elamnalri concole a yazdiriniz.

        String brr[][] = {{"learn", "java", "it" }, {"is", "easy" }};

        for (String[] w : brr) {

            for (String k : w) {
                if (k.contains("a")) {
                    System.out.print(k + " ");
                }

            }


        }


    }
}
