package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting : Bir numeric data type'ni diğer numeric data type'ne çevirmek demektir.
    //                  byte < short < int < long < float < double

    //Note 1: küçük data type'inden büyük data type'ine çevirmeye " Auto Widening" denir.
    //Note 2: Büyük data type'inden küçük data type'ine çevirmeye " Explicit Narrowing " denir.


    public static void main(String[] args) {

         byte age = 23;
         int newAge = age;

         long population = 1234;
         int newPopulation = (int) population;

         //Example 1: short'u double'ye çeviren kodu yazınız.
        short numOfStudents = 235;
        double newNumOfStudents = numOfStudents;//Auto Widening

        // Example 2: float'ı byte çeviren kodu yazınız.
        float price = 12.99F;
        byte newPrice = (byte)price;// Explicit Narrowing

        System.out.println(newPrice);//12==> Java ondaliık sayıyı, tam sayıya çevirirken yuvarlam işlemi yapmaz.
                                     //      Java ondalik sayıyı, tam sayıya çevirirken ondalık kısmını siler.


        int number = 515;

        byte newNumber = (byte) number;

        System.out.println(newNumber);//3 (Java 515 i 256/byte daki sayıların sayısı) ya böldü ve kalanı return etti. (moduler aritmektikten kaynaklı)

        int num = 510;

        byte newNum = (byte)num;

        System.out.println(newNum);// -2











    }



}
