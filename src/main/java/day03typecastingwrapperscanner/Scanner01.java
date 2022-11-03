package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    //Scanner kullanıcıdan data almaya yarar. Scanner kullanıcı ile etkileşim kurmamızı sağlar.
    //Scanner bir Java Class'ıdır. Bu Claas'ı kullanabilmek için "import" etmek gerekir.
    // Scanner Claas'ı Java'nın util kütüphanesindedir.

    public static void main(String[] args) {

        //Kullanıcıdan data almak için yapılması gerekenler;

        // 1.Adım: Scanner Class'ından object oluşturun.
                Scanner input = new Scanner(System.in);

        // 2.Adım: Kullanıcıya ne yapacağını söylememiz lazım ve söyle;
        System.out.println("Hey kullanıcı yaşını gir...");


        // 3.Adım: Kullanıcıdan aldığınız data'yı bir variable nin içine koyun.
        byte age = input.nextByte();

        System.out.println("Hey kullıcı senin yaşın " + age);





    }



}
