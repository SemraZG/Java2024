package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {
        //Ornek 1: Bir tane Integer List olusturunuz. Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        //  [12, 23, 10, 19] ==> 12 ve 10

        //Iki turlu sort() kullanabiliriz
        //1- List icindeki sort (Java 8 sonrasi cikti)
        //2- Collections icindeki sort()

        List<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        Collections.sort(nums);
        //veya
        //nums.sort(null); == Arrays.sort(nums)-->Arrayde bu sekilde//list'lerde dogal siralama icin null gecilmesi gerekir
        System.out.println(nums);//[10, 12, 19, 23]

        int minDiff=nums.get(1)-nums.get(0);

        for (int i=0; i<nums.size()-1; i++){
            int diff=nums.get(i+1)-nums.get(i);
            if (diff<minDiff){
                minDiff=diff;
            }
            if (minDiff==diff){
                System.out.println(nums.get(i+1) +" ve "+ nums.get(i));//12 ve 10
            }
        }

        System.out.println(minDiff);

        //2.way
        int minFark=nums.get(1)-nums.get(0);
        for (int i=0; i<nums.size()-1; i++){
            minFark= Math.min(minFark, nums.get(i+1)-nums.get(i));
        }
        System.out.println(minFark);

        for (int i=0; i<nums.size()-1; i++){
            if (nums.get(i+1)-nums.get(i)==minFark){
                System.out.println(nums.get(i+1) +" ve "+ nums.get(i));//12 ve 10
            }
        }

    }
}
