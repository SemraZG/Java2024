package arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 4 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        //sort() methodu sayilari kucukten buyuge siralar (ascending order)
        //String data tiplerini alfabetik siralar (alphabetical order)
        //ascending order + alphabetical order = natural order
        //sort() methodu Array elemanlarini natural order'a gore siralar

        //1.yol:
        int [] ages=new int[4];
        ages[0]=43;
        ages[1]=57;
        ages[2]=12;
        ages[3]=78;
        System.out.println(Arrays.toString(ages));//[43, 57, 12, 78]
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));//[12, 43, 57, 78]

        System.out.println(ages[0] + ages[ages.length-1]); //59

        //------------------
        //2.yol: Math.max() ve Math.min() ile yapacagiz
        int min=ages[0];//ilk elemani minimum varsaydik, baska bir elemani da secebilirdik farketmez
        int max=ages[0];
        for (int w: ages){
           min= Math.min(min, w);
           max=Math.max(max, w);
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println("Toplam: "+(min+max));

        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        //           [12, 3, -3, 5, 23] ==> 3, -3
        int [] nums= {12, 3, -3, 5, 23};
        for (int w: nums){
            if (w<5){
                System.out.print(w+" ");
            }
        }
        //sirali bir sekilde 5den kucukleri yazdirin
        Arrays.sort(nums);
        for (int w: nums){
            if (w<5){
                System.out.print(w+" ");
            }
        }


    }
}
