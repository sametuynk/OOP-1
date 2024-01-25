package com.example.oop;

public class OkulOrnekMain {
    public static void main(String[] args) {
        Mudur m=new Mudur();


        Personel ogretmen=new Ogretmen();
        Personel isci=new Isci();

        m.iseAl(ogretmen);
        m.iseAl(isci);

        m.terfiEttir(ogretmen);
        m.terfiEttir(isci);
    }
}
