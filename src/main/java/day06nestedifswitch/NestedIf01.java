package day06nestedifswitch;

public class NestedIf01 {

    /*
    Nested ic ice gecmis demektir. Ingilzcede ic ice girmis seylere Nested denir. Zigon sehpa ornegi.
    Ingilizcede ic ice girmis olma haline Nested denir.
     */
    public static void main(String[] args) {

        /*

                  */

        //Java "nested" kodlari calistirirken cok zaman harcar; buna "Time Complexity" denir.
        //Bu yuzden mumkunse nested kod yazmamaya calisiriz.

        //1/ yol;
        //
        String pwd = "kxy12!";



        if (pwd.charAt(0)>='A' && pwd.charAt(0)<='Z'){

            if (pwd.charAt(0)=='A'){//burada equals() kullanilamaz. Cunku equals String lerde kullanilir.
                                    // Buradaki ifade char oldugu icin equals kullanilamaz.
                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }

        } else if (pwd.charAt(0)>='a'  && pwd.charAt(0)<='z') {

            if (pwd.charAt(0)=='z'){
                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }

        }else {
            System.out.println("Ilk karekter harf olmalidir");
        }

        //2 yol

        /*String pwd = "kxy12!";

        char ilkHarf = pwd.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z'){

            if (ilkHarf=='A'){
                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }

        } else if (ilkHarf>='a'  && ilkHarf<='z') {

            if (ilkHarf=='z'){
                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }

        }else {
            System.out.println("Ilk karekter harf olmalidir");

         */

            /* Hocanin kodu
            String pwd = "5xy12!";

        char ilkHarf = pwd.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z'){


            if(ilkHarf=='A'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password");
            }


        }else if(ilkHarf>='a' && ilkHarf<='z'){


            if(ilkHarf=='z'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password");
            }


        }else{

            System.out.println("Ilk karakter harf olmalidir");

        }

             */
        }
    }
