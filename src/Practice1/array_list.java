package Practice1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array_list {
    public static void main(String[] args) {
        int[] number=new int[5];
        System.out.println(number.length);
        number[0]=10;
        number[1]=70;
        number[2]=30;
        number[3]=40;
        number[4]=50;
        for(int i=0;i<number.length;i++) {
            System.out.println(number[i]);
        }
        Arrays.sort(number);
        for(int i=0;i<number.length;i++) {
            System.out.println(number[i]);
        }
        int min=number[0];
        for(int i=0;i<number.length;i++){
            if(min>number[i]){
                min=number[i];
            }
        }
        System.out.println(min);
        }
}
