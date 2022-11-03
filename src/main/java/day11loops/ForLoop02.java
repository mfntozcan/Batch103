package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1; Bir String'deki "m" karakteri haric tum karekteri yazdiriniz.
        // Andromeda==> Androeda seklinde yazilmasini istiyoruz

        String str = "madam";

        //1.yol
        for (int i=0 ; i<str.length()  ; i++  ){
            char c = str.charAt(i);
            if (c!='m'){
                System.out.print(c);
            }
        }

        //2.yol;
        for (int i=0 ; i<str.length()  ; i++  ){

            char c = str.charAt(i);

            if (c=='m'){
                continue; //continue ile burdada javaya; eger c, m'ye esitse bosver dedik.
                          //continue sadece loop larda kullanilir.
                          //loop un icinde bazi degerler icin loop un calismamasini isterseniz continue kullaniniz.
                          // ornegin bu ornekte m yi yazdirmak istemedigimiz icin c==m dedik. ve m harfi yazdirilmadin
            }
            System.out.println(c);

        }

        //Example 2; 1 den 100 e kadar 6 ile bolunenler haric tum sayilari ekrana yazdiriniz.

        for (int i=1 ; i<101; i++){

            if (i%6==0){
                continue;
            }
            System.out.print(i + "-");
        }
        System.out.println("     ");
        //Example 3; Size verilen bir String deki 'm' den onceki karekterleri yazdiriniz.
        // Luxemburg==> Luxe seklide yazdirmasini istiyoruz.

        String s = "Luxemburg";

        for (int i=0 ; i<s.length(); i++ ){

            char c = s.charAt(i);

            if (c=='m'){
                break;
            }
            System.out.print(c);

        }

    }
}
