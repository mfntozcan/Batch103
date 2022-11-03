package day18arrayListsPassByValue;

public class Varargs01 {

    /*
    1- Farkli sayilardaki parametreler ile calisabilen bir method olusturmak isterseniz; "Varargs" kullanmalisiniz.
    2- Varargs arka tarafta Array kullanir. Bu yuzden "varargs" larla calisirken "Array" lerle calisiyormus gibi davranabilriz.
    3- Varargs olusturmak icin "<data type...   <varargs ismi>>" veya "<data type   ...<varargs ismi>>" bu sekilde yazilarak olusturulur.
    4- Bir method da Varargs in yaninda baska bir parametre kullanilabilir mi?
        "Varargs" en sonda olmak sarti ile kullanilir.
    5-  Bir methodda birden fazla "varargs" kullanilabilirmi?
        Varargs en sonra olmak zorunda oldugundan birden fazla kullanilirsa en az biri en sonra olmayacaktir.
        Bu da bir onceki kural(4ncu madde) ile celisir.
     */

    public static void main(String[] args) {

        int r1= add(2,3);
        System.out.println(r1);

        int r2 = add(2, 3, 4);
        System.out.println(r2);

        int r3= add(1,2,3,4,5,6,7,8,9,10);
        System.out.println(r3);




    }
    // Iki sayinin toplamini return eden bir method olusturunuz.
    public static int add (int a, int b){
                return a+b ;

    }
     //Iki sayinin toplamini return eden bir method olusturunuz.
    public static int add (int a, int b, int c){
        return a+b+c ;
    }
    // Dort sayinin toplamini return eden bir method olusturunuz.
    public static int add (int a, int b, int c, int d){
        return a+b+c +d ;
    }

    //Istedigimiz kadar sayiyi toplayabilecegimiz bir method olusturalim.

    public  static int add(int...a){// Bu yapi (int...a) Varargs dir. Veriable Arguments in kisaltmasidir.
                                    // Bu methodun icerisine ne kadar sayi koyarsak koyabiliriz.
                                    // Bu toplama isleminin icerisinde istedigmiz sayi kadar islem yapabiliriz,
        int sum=0;

        for (int w:a){
            sum = sum +w;
        }
        return sum;
    }

}
