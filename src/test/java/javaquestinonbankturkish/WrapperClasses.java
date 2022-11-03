package javaquestinonbankturkish;

public class WrapperClasses {
    public static void main(String[] args) {

        //Question 1;


        byte min=Byte.MIN_VALUE;
        short max=Short.MAX_VALUE;
        System.out.println(min+max);

        //Question 2;

       byte sayi1=Byte.valueOf("113");
       short sayi2=Short.valueOf("2321");
        System.out.println(sayi2-sayi1);

        //Question 3;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Boolean.FALSE);

        System.out.println(Short.MIN_VALUE + " "+ Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE+ " " +Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE + " " + Long.MIN_VALUE);

        float f1=13.99F;
        Float wrapperF1=f1;


        Character w1 ='s';
        char primitiveW1=w1;









    }
}
