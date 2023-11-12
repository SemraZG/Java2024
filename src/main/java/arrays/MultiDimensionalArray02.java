package arrays;

import java.util.Arrays;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {
        //Ornek 1: Iki boyutlu bir Array'i tek boyutlu bir Array'e ceviriniz.
        // int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> { 5,4,2,3,2 }

        int[][] numbers = {{5, 4}, {2, 3, 2}};
        System.out.println(numbers.length);//2
        int topElemanSayisi=0;
        for (int [] w: numbers ){
            topElemanSayisi=topElemanSayisi+w.length;
        }
        System.out.println(topElemanSayisi);//5

        int [] newNumbersArray=new int[topElemanSayisi];
        int index=0;
        for (int [] w: numbers){
            for (int k: w){
                newNumbersArray[index]=k;
                index++;
            }
        }
        System.out.println(Arrays.toString(newNumbersArray));//[5, 4, 2, 3, 2]

        //Ornek 1: int turunde bir multidimensional Array'deki en kucuk ve en buyuk elemanlari bulunuz.

        int[][] ages = {{15, 4}, {12, 43, 21}};
        int min=ages[0][0];
        int max=ages[0][0];

        for (int [] w: ages){
            for (int k: w){
                min=Math.min(min, k);
                max=Math.max(max, k);
            }
        }
        System.out.println(min);//4
        System.out.println(max);//43

    }
}
