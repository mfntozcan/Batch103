package day19datetime;

import java.io.FilterOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {

     //Java DateTime ile ilgili tarihlerin formatini kendine gore verir.
     //Ama biz o formati degistirebilir.

     //Example 1; Java'dan aldigimiz Date i "ay/gun/yil" olarak yaziniz.

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-10-21

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("MM/dd//yyyy");//"MM" 10 dan kucuk aylari, 01,02,03 seklinde yazar
        //bu sekilde uzun class isimlerinde bas harfleri obje ismi yapmak yaygindir.


        String formattedDate1=dtf1.format(currentDate);
        System.out.println(formattedDate1);//10/21//2022

        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("MMM/dd//yyyy");
        String formattedDate2=dtf2.format(currentDate);
        System.out.println(formattedDate2);//Oct/21//2022

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("MMMM/dd//yyyy");
        String formattedDate3=dtf3.format(currentDate);
        System.out.println(formattedDate3);//October/21//2022

        DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("M/dd//yyyy");//"M" 10 dan kucuk aylari, 1,2,3 seklinde yazar
        String formattedDate4=dtf4.format(currentDate);
        System.out.println(formattedDate4);//10/21//2022

        DateTimeFormatter dtf5= DateTimeFormatter.ofPattern("MM/dd//yy");
        String formattedDate5=dtf5.format(currentDate);
        System.out.println(formattedDate5);// 10/21/22

        DateTimeFormatter dtf6= DateTimeFormatter.ofPattern("MM/d//yy");//"d" 10 dan kucuk aylari, 1,2,3 seklinde yazar. 01,02,03, yapmaz.
        String formattedDate6=dtf6.format(currentDate);
        System.out.println(formattedDate6);// 10/21/22


        //Example 1; Java'dan aldigimiz Time"in formatini degistiriniz.

        LocalTime mytime=LocalTime.of(16,23,54,2345);
        System.out.println(mytime);//16:23:54.000002345

        DateTimeFormatter dtf7=DateTimeFormatter.ofPattern("hh:mm");//"hh" kullandigimizda 12 saat sistemini kullanir.
        String formettedMyTime= dtf7.format(mytime);
        System.out.println(formettedMyTime);//04:23

        DateTimeFormatter dtf8=DateTimeFormatter.ofPattern("HH:mm");//"HH" kullandigimizda 24 saat sistemini kullanir.
        String formettedMyTime8= dtf8.format(mytime);
        System.out.println(formettedMyTime8);//16:23

        DateTimeFormatter dtf9=DateTimeFormatter.ofPattern("hh:mm a");//"hh" kullandigimizda 12 saat sistemini kullanir.
        String formettedMyTime9= dtf9.format(mytime);
        System.out.println(formettedMyTime9);//04:23 PM

    }
}
