package arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Ornek 2: Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz

        //binarySearch() methodu var olan elemanlar icin size o elemanin indexini verir
        //binarySearch() methodunu sort() kullanmadan kullanmayiniz
        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
        // "-" ==> isaretinin anlami eleman yok demektir

        String names[] = {"A", "T", "K", "E", "B"};
        Arrays.sort(names);
        int resultIndex=Arrays.binarySearch(names, "B");
        System.out.println(resultIndex);//1--> sort() dan sonra B'nin indexini verdi, C yazsaydik -3 verirdi, yani olsaydi hangi sirada olacakti

        int[] arr={2,1,7,6};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 2));//1
        System.out.println(Arrays.binarySearch(arr, 7));//3
        System.out.println(Arrays.binarySearch(arr, 3));//-3
        System.out.println(Arrays.binarySearch(arr, 9));//-5

        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        String s = "Java is easy. Learn Java earn money";
        String [] arrayS=s.split(" ");
        System.out.println(Arrays.toString(arrayS));//[Java, is, easy., Learn, Java, earn, money]
        int numWords= arrayS.length;
        System.out.println(numWords);

        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz.
        //         [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]
        int [] digits={0, 2, 3, 0, 12, 0};
        int [] newDigits= new int[digits.length];
        System.out.println(Arrays.toString(arr)); //[0, 2, 3, 0, 12, 0]
        System.out.println(Arrays.toString(newDigits)); //[0, 0, 0, 0, 0, 0]
        int firstIndex=0;
        for (int w: digits){
            if (w!=0){
                newDigits[firstIndex]=w;
                firstIndex++;
            }
        }
        System.out.println(Arrays.toString(newDigits));//[2, 3, 12, 0, 0, 0]

        //Arraylerin esit olup olmadigi nasil anlasilir?

        int[] a = new int[3];
        a[0] = 2;
        a[1] = 3;
        a[2] = 1;

        int[] b = new int[3];
        b[0] = 2;
        b[1] = 3;
        b[2] = 1;

        //iki arrayin ayni olabilmesi icin, ayni index te ayni elemanlarin bulunmasi gerekir
        boolean result=Arrays.equals(a,b);
        System.out.println(result);


    }
}
