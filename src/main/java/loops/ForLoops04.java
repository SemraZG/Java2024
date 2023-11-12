package loops;

public class ForLoops04 {
    public static void main(String[] args) {

         /*
        ornek 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....    */

//        for (int i=1; i<53; i++){
//            System.out.println("Week: "+i);
//            for (int k=1; k<8; k++){
//                System.out.println("  Day: "+k);
//            }
//        }


        /* Ornek 2:
        Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz

              X X X X X
              X X X X X
              X X X X X    */
        System.out.println("--------------");
        for(int i=1; i<4; i++){
            for (int k=1; k<6; k++){
                System.out.print("X ");
            }
            System.out.println();
        }

             /*

         *
         * *
         * * *
         * * * *

         */
        int x=4;
        for (int i=1; i<=x; i++){
            for (int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
