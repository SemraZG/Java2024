package oop;

public class Civic extends Honda {

    @Override//parent classsdaki abstract olan methodu override edip kendimize uygun method bodyi yazmaliyiz
    public void engine() {//override dan sonra abstract silindi
        System.out.println("Gas 1.6");//suslu parantez ile method bodysi eklendi
    }
}
