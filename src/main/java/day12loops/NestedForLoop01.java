package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {

    public static void main(String[] args) {

        //Example 1; Asagidaki sekli ekrana yazdiran kodu yaziziz.
        //      ****
        //      ****
        //      ****

/*
Scanner input= new Scanner(System.in);
System.out.println("Satir sayisini giriniz");
int satir= input.nextInt();

System.out.println("Sutun sayisini giriniz");
int sutun = input.nextInt();

System.out.println("Karakter seciniz");
char ch= input.next().charAt(0);

for(int i=1; i<3; i++){
    for(int k=1; k<4;     k++){
        System.out.print(ch;
    }
    System.out.println();
 */
        for (int i = 1; i < 4; i++) {

            for (int k = 1; k < 5; k++) {

                System.out.print("*");
            }

            System.out.println();
        }

        /*Example 2; Asagidaki sekili cizen kodu yaziniz.
          1
          12
          123
          1234
          12345

         */

        for (int i=1;i<6; i++){

            for (int k=1; k<=i; k++){
                System.out.print(k+" ");

            }
            System.out.println();
        }

        /*Example 2; Asagidaki sekili cizen kodu yaziniz.

          ****
          ***
          **
          *

         */
        int row=4;


        for (int i=1; i<=row; i++){

            for (int k=row; k>=i; k--){
                System.out.print("* ");

            }
            System.out.println();


        }





    }
}
