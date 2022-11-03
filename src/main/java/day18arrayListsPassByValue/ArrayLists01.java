package day18arrayListsPassByValue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        //Example 1; Bir Integer ArrayList teki 7 haric tum elemanlari arttiriniz.

        List<Integer> ages=new ArrayList<>();

        ages.add(22);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w : ages){
            if (w==7){
                continue;
            }
            //w=w + 2; ==> List ler boyle update edilmezler.
            ages.set(ages.indexOf(w), w+2);
        }
        System.out.println(ages);

        //Example 2; Size verilen ArrayList te 8 ve 8 den onceki tum elemanlari iki katina cikariniz.

        List<Integer> nums=new ArrayList<>();

        nums.add(22);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);

        for (Integer w :nums){

            nums.set(nums.indexOf(w),w*2);

            if (w==8){
                break;

            }
            //nums.set(nums.indexOf(w),w*2); Bu formul burada olursa 8 i almaz.
            // Ama if den onceye konursa kod, 8 alindiktan sonra kod kirilacagindan 8 i de alir.

        }
        System.out.println(nums);













    }
}
