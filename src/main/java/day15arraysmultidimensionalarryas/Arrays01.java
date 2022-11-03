package day15arraysmultidimensionalarryas;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //binarySearch() Method: Bu method'u kullnarak bir elemanin Array'de olup olmadigini anlariz.
        //              binarySearch() Method'unu kullanmadan once mutlaka "Arrays.sort()" kullanilmalidir.
        //             binarySearch() Method'u aradiginiz eleman Array'de varsa o elemanin indexini return eder.

        //               binarySearch() Method'u aradiginiz eleman Array'de yoksa "- a" seklinde bir negatif sayi alirsiniz.
        //               Bu sayidaki "-" isaretinin anlami bu eleman Array'de yok dmeektir, "a" nin anlami olsaydi kacinci sirada olurdu demektir.
            // binarySearch() methodu tekrarlayan elemnalar icin kullanilmaz.

        int arr[]={12,31,43,14};

        int sayi=43;

        Arrays.sort(arr);//[12, 14, 31, 43](Burada Arrays.sort oldugu icin once rakamlar kucukten buyuge dogru siralandi.)
        int idx1 = Arrays.binarySearch(arr,sayi);
        System.out.println(idx1);//3(Burada indeksini aldigi icin 3 bulundu.)

        int sayi2 = 17;
        int sonuc = Arrays.binarySearch(arr, sayi2);
        System.out.println(sonuc);//-3

    }

}
