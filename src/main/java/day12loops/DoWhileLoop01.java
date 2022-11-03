package day12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        int i =1;

        while (i<1){
            System.out.println("While Loop");// While loop icin loop body so icindeki kodun hic calistirilmama durumu vardir,
                                            // "zero execution" mumkundur (Dusun - hareket et)
            i++;
        }


        int k = 1;

        do{

            System.out.println("do-while loop");// do-while loop kullandiginizda loop body si icindeki kod en az bir kere calisir.
                                                //Yani do-while loop icin "zero execution" mumkun degildir.(Hareket et - dusun)

            k++;
        }while (k<1);



        //Example 1; Bir ondalik sayinin ondalik kismindaki rakamlarin toplamini bulunuz.
        //      24.5673 ==> 5+6+7+3=21 olmali sonuc.

        double num = 25.5673;
        System.out.println(num);

        String str = String.valueOf(num); //String.valueOf() methodunun icine konulan degeri stringe cevirir.
        System.out.println(str);

        //Regex icin nokta isareti kullandigimizda onune "\\" koyunuz. Yani "\\." seklinde kullanilir.
        String decimalPart = str.split("\\.")[1];// decimalPart virgullu kisim demektir.
        System.out.println(decimalPart);

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);

        int sum = 0;

        do {

            sum = sum + decimalInt%10;

           decimalInt= decimalInt/10;

        }while (decimalInt>0);

        System.out.println(sum);











    }
}
