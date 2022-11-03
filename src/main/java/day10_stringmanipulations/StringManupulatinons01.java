package day10_stringmanipulations;

public class StringManupulatinons01 {

    public static void main(String[] args) {

        String a = "Java kolaydir.";

        boolean b = a.startsWith("kola", 5);// startsWith kodu ilk bes karekterden sonra ki String e bakar.
                                                        // Ve o Stringin kola ile baslayip baslamadigini kontrol edern.
                                                        //  Eger kola ile basliyorsa true yoksa false yazdirir.
        System.out.println(b);




        String c = a.replaceFirst("a", "*"); // replace methodunda butun a lar * olurdu.
                                             // replaceFirst methodunda ise ilk a harfini * yapar,
        System.out.println(c);// Konsolda 'J*va kolaydir' seklinde gorulur.



        String d = a.concat(" Anladin mi?");// concat() methodu iki tane Stringi birbirne yapistirmaya yarar.
                                                // "Concatenation" islemi iki turlu yapilabirlir;
                                                        //Birincisi; + ile
                                                        //Ikincisi de; concat() ile yapilabilir
                                                // Java bir method olusturmussa o methodu kullanmak "best practice"dir
        System.out.println(d);

        //trim; bir seyi ucundan kesmek anlamindadir.
        //Java da ise trim; bastaki ve sondaki "space" karekterlerini siler, aradaki "space" karekterini silmez.

        String e = "    Tom Hanks   ";
        System.out.println(e);// konsolda; "     Tom Hanks    "

        String f = e.trim();
        System.out.println(f);// konsolda; "Tom Hanks"


        //compareTo() karsilastirmak demektir.
        //h.compareTo(i): Bu kod iki tane Stirin i alfebetik (lexicographic) olarak karsilastirir.
        // Buyuk ve kucuk harfe karsi duyarlidirn. Bu
        //Buyuk ve kucuk harfe duyarli olmasini istemez isek h.copareToIgnoreCase(i); kullanabilirsiniz.
        // h.compareTo(i); bu kodda 'h' nin alphabetik sirasinda 'i' nin alfabetik sirasi cikarilir.
        String h = "Java";
        String i = "java";

        int k = h.compareTo(i);
        System.out.println(k);

        //a.repeat(5); kodu a Stringini yan yana 5 kere tekrarlar.
        //a.repeat(0); kodu empty(bos) return eder.
        // Java Documet'e ulasmak icin ; windows: Conrl e basili tutun ve mause ile istedigimiz methodun uzerini tiklayin.

        String n = a.repeat(5);
        System.out.println(n);









    }


}
