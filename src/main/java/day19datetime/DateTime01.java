package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

        // Exammple 1; 'Anlik tarihi (Current Date)' ekrana yazdiran kodu yaziniz.

        LocalDate currentDate= LocalDate.now();//
        System.out.println(currentDate);//2022-10-21

        //Example 2; "Anlik zamani (Current Time)" ekrana yazdiran kodu yazinir.

        LocalTime currentTime= LocalTime.now();
        System.out.println(currentTime);//19:45:59.623184900

        //Example 3; "Anlik tarihi (Current Date)" ve "Anlik zamani (Current Time)"ekrana yazdiran kodu yazinir.

        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T19:45:59.623184900

        //Example 4; Japonya daki "Anlik tarihi (Current Date)" ve "Anlik zamani (Current Time)"ekrana yazdiran kodu yaziniz.

        LocalDateTime currentDateTimeInJapan= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-10-22T02:50:50.018036600

        //Example 5; Istanbuld daki "Anlik tarihi (Current Date)" ve "Anlik zamani (Current Time)"ekrana yazdiran kodu yaziniz.

        LocalDateTime currentDateTimeInIstanbul= LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);//2022-10-21T20:52:11.894701300

        //Example 6; Bugunden 789 gun sonra emekli olacaginiza gore; Emeklilik tarihini hesaplayan kodu yaziniz.

        LocalDate countDate=LocalDate.of(2022,10,21);
        LocalDate retireDate= countDate.plusDays(789);
        System.out.println(retireDate);//

        //Example 7; Iki cocugunuzun dogum tarihleri arasinsaki farki gun olarak hesaplayan kodu yaziniz.

        LocalDate dobFurkan = LocalDate.of(2012, 6, 19);
        LocalDate dobUmut = LocalDate.of(2015, 7, 17);

        Long diff=ChronoUnit.DAYS.between(dobFurkan, dobUmut);  //Between methodu kullanildiginda daha eski olan tarih
                                                                // once olmalidir.(Yoksa eksi tarih verir.)
        System.out.println(diff);

        //Example 8; istanbul un fethi ile Cumhuriyetin kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.
        //29 Mayis 1453    ==> 29 Ekim 1923

        LocalDate istFetih= LocalDate.of(1453,5,29);
        LocalDate cumKur= LocalDate.of(1923,10,29);

        Long aySayisi= ChronoUnit.MONTHS.between(istFetih, cumKur);
        System.out.println(aySayisi);//5645

        //Example 9; Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz.

        LocalDate myDate= LocalDate.of(1983,5,13);

        int day =myDate.getDayOfMonth();
        int month=myDate.getMonthValue();
        System.out.println(day+ "    ===="+month);

        //1nci yol
        if (day>=21 && month==3){
            System.out.println("Koc");
        }else if (day<=20 && month==4){
            System.out.println("Koc");
        } else if (day>=21 && month==4) {
            System.out.println("Boga");
        } else if (day<=20 && month==5) {
            System.out.println("Boga");
        }

        //2nci yol/
        if ((day>=21 && month==3) || (day<=20 && month==4)){
            System.out.println("Koc");
        } else if ((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("Boga");
        }






    }
}
