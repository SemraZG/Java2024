package oop;

public abstract class Honda {//bu class artik abstract oldugu icin bu classdan object uretemem.
    public void music(){
        System.out.println("Pro");
    }

    public abstract void engine();//abstract method olustiurduk, bodysi yok,
    // bir clasin icinde abstract method varsa o calss da abstract olmak zorunda oldugu icin classi da abstract yaptik
    //bu method abtract oldugu icin tum child classlar bu methodu override etmeli
}
