package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {

    /*
    1) Ayni data tipinde coklu data'yi depolamak icin Java nin olusturdugu yapilar vardir.
        Bu yapilardan birisi de "Array"lerdir.


     */
    public static void main(String[] args) {
        //
        int stdAges[]= new int[7];//[0,0,0,0,0,0,0]
        //Array bu sekilde olusturulur.

        System.out.println(Arrays.toString(stdAges));
        //Bu da Array in yazdirilma sekli.

        stdAges[0]=12;
        stdAges[1]=11;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;
       System.out.println(Arrays.toString(stdAges));//[12, 11, 13, 14, 10, 12, 12]
       //Istedigimiz sayilari Array ler bu  sekilde eklenir.


        //Array deki herhangi bir elemenai asagidaki sekilde yazdiririz.
        System.out.println(stdAges[4]);//10


        //Example 1; Array deki en kucuk ve en buyuk elemani ekrana yazddiriniz.

        Arrays.sort(stdAges);//sort ingilizce de siraya koy anlamindadir.
        System.out.println(Arrays.toString(stdAges));

        int ilk=stdAges[0];

        //note; "length()" String lerde kullanilir. "length" Arraylarde kullanirlir.
        int son=stdAges[stdAges.length-1];
        System.out.println("En kucuk sayi; " + ilk + "<>" + "En buyuk sayi; " + son);

        //Example 2; stdAges Array'i icindeki tum elemanlarin toplamin iekrana yazdoiran kodu yaziniz.

        //1nci yol;

        int sum=0;

        for (int i=0; i<stdAges.length; i++){

            sum = sum + stdAges[i];

        }
        System.out.println(sum);

        //2nci yol;while loop

        int i=0;

        int toplam=0;

        while (i< stdAges.length){

            toplam = toplam + stdAges[i];

            i++;

        }
        System.out.println(toplam);

        //3ncu yol;do=-while-loop

        int k=0;

        int s=0;

        do {
            s= s +stdAges[k];

            k++;
        }while (k< stdAges.length);
        System.out.println(s);

        //4ncu yol;for each loop==> en gelismis loop tur. Mumkunse bundan baskasini kullanmayin.
        // Bu Array lerde ve Collections larda kullanilir.

        int t=0;

        for (int w :stdAges){
            t= t + w;

        }
        System.out.println(t);

        //Example 3: String bir Array olusturunuz
        //           Bu Array'5 adet isim yazdiriniz.
        //          Bu isimlerdeki kareketer sayilarinin toplamini ekrana yazdiniriniz.

       String stdNames[]=new String[5];
       stdNames[0]="Ali";
       stdNames[1]="Tom";
       stdNames[2]="Veli";
       stdNames[3]="Kemal";
       stdNames[4]="Cem";

       int karaketerSAyilariToplami=0;

       for (String  w: stdNames){

           karaketerSAyilariToplami = karaketerSAyilariToplami+w.length();

       }
        System.out.println(karaketerSAyilariToplami);


       //Example 4: Char bir Array olusturunuz.
        //          Bu Array a 5 eleman ekleyiniz.
        //          Bu Array deki sadece buyuk harfleri ekrana yazdiriniz.

        char ch[]={'A', 'c', 'D', 'k', 'M'};

        for (char w: ch){
            if (w>='A' && w<='Z'){
                System.out.print(w);
            }
        }
    }
}
