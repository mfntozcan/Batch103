package day16mmultidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists01 {

    /*
    Arraylists ler ayni data tipine sahip birden fazla datayi depolamak icin kullanilir.

                                        ****Arraylists ile Array in arasindaki farki nedir?(Interwiev sorusu)*******

    1)  Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz. Soyledigimiz eleman sayisdnan fazla eleman koyamayiz.
        Array ler eleman sayisinda "fixed" tirler. (Bu  buyuk bir problemdir. Ornegin bir okul app si yaparken bu okula anca bin ogrenci gelir
        diye dusunup ona gore app yaptirirsak ve ogrenci sayisi 1000 den fazla olursa app calismaz. Sayiyi en basta fazla verirsek bu da memory in dolmasi anlamina gelir.)

        ArrayList leri olustururken eleman sayisi soylemeye gerek yok. Cunku ArrayList ler eleman sayisinda "filexible(esnek)"tirler.

     2) Arraylerin icine "primitive " ve "reference"lar konabilir.
        ArrayList lerin icine ise dsadece "non-primitive" ler konulur.

     3) Array ler super fast(cok hizli)dir. Array'ler memory cok az kullanir.
        **Note; Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz.
                Ama eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin.



     */
    public static void main(String[] args) {

        //ArrayList nasil olusturulur?

        //1.yol
        ArrayList<Integer> ages= new ArrayList<>();

        //2.yol;
        ArrayList<Integer> heights = new ArrayList<>();

        //3.yol;
        List<Integer> nums = new ArrayList<>();



        //Arraylistleri nasil yazdiririz?
        System.out.println(nums);// []

        //Arraylistlere nasil eleman eklenir.
        //  add() methodu herzaman elemani en sona ekler. Buna "Insertion order" denir. (Yerlestirme Sirasi)

        nums.add(21);// boolean return eder.Boolean'in true ve false degeri vardir.
                    // True gorev tamamdir. False ise yerlestiremedi anlamina gelir
        nums.add(18);
        nums.add(20);

        System.out.println(nums);//[21, 18, 20]

        nums.add(1,50);//Bunda hicbir sey return etmez.
        System.out.println(nums);//[21, 50, 18, 20]





        List<Integer> prices = new ArrayList<>();

        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);//[21, 50, 18, 20, 23, 185]
        System.out.println(prices);//[23, 185]

        nums.addAll(2, prices);
        System.out.println(nums);//[21, 50, 23, 185, 18, 20, 23, 185]

        //ArrayList lerin eleman sayisini nasil buluruz?

        int elemanSAyisi= nums.size();
        System.out.println(elemanSAyisi);//8

        //ArrayList lerde herhangi bir eleman nasil secilir.
        // get() methodu istenen bir indexteki elemani verir. onemli,

        int el1= nums.get(3);
        System.out.println(el1);//185

        // ArrayListin bos olup olmadigini nasil anlariz?

        boolean bos1=nums.isEmpty();
        System.out.println(bos1);//false==> cunku num listinde eleman var. Eleman varsa false' elemen yoksa true verir.

        boolean bos2= ages.isEmpty();//Cunku biz ages veriable sinde eleman olmadigi icin true verir bize.
        System.out.println(bos2);

        //ArrayList tte bir eleman nasil degistirilir?

        nums.set(3,200);// set methodu programla dillerinde var olan bir seyi degistirme anlaminda kullanilir.
        System.out.println(nums);//Normali buydu=[21, 50, 23, 185, 18, 20, 23, 185],
                                // ama biz 3ncu indexi degistirince [21, 50, 23, 200, 18, 20, 23, 185] boyle oldu.



        //Example 1; nums ArrayList'indeki tum tek sayilari 11 arttirdiktan sonra ekrana yaziniz.

        for (int w :nums ) {

            if (w%2!=0){
                nums.set(nums.indexOf(w), w+11 );//indexOf Stringlerdekinin aynisidir.
            }
        }
        System.out.println(nums);//Normali buydu=[21, 50, 23, 185, 18, 20, 23, 185],
                                // ama biz tek sayilara 11 ekleyince [32, 50, 34, 200, 18, 20, 34, 196] oldu.


        //remove bir elemani listeden uzaklastirmak istedigimizde kullaniriz.
        // remove() methodunun icerisine tam sayi koyarsak; java onu index olarak kabul eder.
        // Onun icin once bunu wrapper classa cevirmeliyiz.
        // Herhangi bir methodun uzeri cizili olursa; bunun anlami java bunu kaldirmis. Yakinda yeni surumlerde olmayacai anlamina gelir.
        //nums.remove(200);// Bu sekilde olursa hata verir. Cunku burada 200 i index olarak gorur.



        Integer sayi=200;
        nums.remove(sayi);

        System.out.println(nums);//Normali [32, 50, 34, 200, 18, 20, 34, 196] bu sekildeydi.
                                // [32, 50, 34, 18, 20, 34, 196] boyle oldu. Yani 200 silindi.





        //Example 2; ArrayList ten 34 elemaninin ilk gorunumunu siliniz.

        //NOte: Tum tam sayilar Java icin aksi soylenmedikce primitive dir. yani int dir.
        //Note2; primitive ler ArrayList lerin elemani olamazlar. Listler non-primitive depolar.
        //Note3; primitive yi "Wrapper Class" a cevirirseniz non-primitive olur. ve non-primitive ler ArrayList lerin elemani olurlar.

        Integer sayi1=34;
        nums.remove(sayi1);// Bu sekilde olursa hata verir. Cunku burada 200 i index olarak gorur.

        System.out.println(nums);// Normali Normali  [32, 50, 34, 18, 20, 34, 196]boyleydi
                                // son hali          [32, 50, 18, 20, 34, 196] bu sekilde oldu.














    }
}
