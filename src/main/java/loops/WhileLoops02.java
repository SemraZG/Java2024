package loops;

public class WhileLoops02 {
    public static void main(String[] args) {
        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın. interview sorusu
        //           Palindrome: 121 <==> 121        123321 <==> 123321
        int k=121;
        String stringK=String.valueOf(k);
        String reserved="";
        int lastIndex=stringK.length()-1;

        while (lastIndex>=0){
           reserved=reserved+ stringK.charAt(lastIndex);
           lastIndex--;
        }
        System.out.println(reserved);

        if (stringK.equals(reserved)){
            System.out.println("Palindromdur");
        }else{
            System.out.println("Palindrom degildir");
        }


    }
}
