package day18arrayListsPassByValue;

public class PostPreIncrementDecrement {

    public static void main(String[] args) {

        int a = 5;

        //Post Increment (veriable yi aldiktan sonra arttirma yapacagim.)
        //Java anlamli bir cumle gordugunde hemen uygular.

        int b = a++;
        System.out.println(b);//5 (Java burada once b==a yi gorunce hemen Java okuma yapti ve b=5 dedi.)

        System.out.println(a);//6   (Java burada once b==a yi gorunce hemen Java okuma yapti ve b=5 dedi.)
        // (Fakat devaminda arttirma islemii gorunce bunun sonucunada 6 dedi.)

        //Post Incremen
        //

        int c = 10;

        int d = ++c;

        System.out.println(d);//11 (Java burada d== den sonra arttirmayi gordugu icin sonucu arttirarak konsola yazdi.)
        System.out.println(c);//11

        //Post Decrement

        int e = 20;
        int f = e--;

        System.out.println(f);//20

        System.out.println(e);//19

        //Pre Decrement

        int h =30;

        int i=--h;

        System.out.println(i);//29
        System.out.println(h);//29


    }
}
