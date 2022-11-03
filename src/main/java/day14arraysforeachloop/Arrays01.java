package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    //Arrays'lerin icine   "Primitive data type"leri ve "reference(adres)" ler yerlestirilebilir.

    public static void main(String[] args) {

        String str[]=new String[3];
        str[0]="Java";
        str[1]="did";
        str[2]="sruprised you";
        System.out.println(Arrays.toString(str));

        //String bir Array olusturunuz ve "Tom" ve "Tom"dan onceki tum elemanlari ekrana yazdiriniz.

        String arr[]={"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w:arr){

            System.out.print(w + "  ");// eger bunu en sona yazdirirsak Tom yazdirmaz.

            if (w.equals("Tom")){
                break;
            }
        }
        System.out.println();

        //String bir Array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz.

        String brr[]={"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for ( String w :brr){

            if (w.equals("Jane") || w.equals("Tom")){
                continue;
            }
            System.out.print(w + " ");

        }
        System.out.println();

        //Example 1; Bir ogretmenin sinifindaki ogrencilerin isimlerini application a yuklmesini saglayan kodu yaziniz.
        //             (Kullanici ile beraber bir Arrah olusturunuz ve icine data ekleyiniz.)

        Scanner input = new Scanner(System.in);

        System.out.println("Kac ogrenci ismi gireceksiniz...");
        int numOfStd=input.nextInt();

        String names[]=new String[numOfStd];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");

        for (int i=1; i<=numOfStd; i++){

            System.out.println("Lutfen " + i + ".ogrenci ismini giriniz...");

            String stdName=input.next();

            if (stdName.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1] = stdName;
        }
        System.out.println(Arrays.toString(names));







    }
}
