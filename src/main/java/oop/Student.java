package oop;

public class Student {
   public String name="Ali Can";
   private int age=12;
   private boolean isSuccesfull=true;

   //age ve isSuccesfull variablarinin okunabilir yapalim

    public int getAge() {
        return age;//this.age'de yazabilirdik. islevsel olarak hicbir fark yok.
    }

    public boolean isSuccesfull() { //is soru anlami katar.true veya false
        return isSuccesfull;
    }

    //2-age ve successful datalarini degistirilebilir yapalim. set method yeni data uretmez, var olan
    //data'yi degistirir. Bu yuzden return type'lari hep void olur


    public void setAge(int age) {//setter parametre alir cunku mantigi zaten degiisklik gerektirmesi
        this.age = age;
    }

    public void setSuccesfull(boolean succesfull) {
        isSuccesfull = succesfull;
    }
}
