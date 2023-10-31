package com.example.emre;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* int[] sayılar = new int [3];
        sayılar[0] = 5;
        sayılar[1] = 6;
        sayılar[2] = 7;
        System.out.println("1.indexde yer alan sayım...:" + sayılar[1]);
int[] sayi2 ={1,2,3,7,9};
System.out.println(sayi2[3]);
        System.out.println("-----------------------------------------------");
       ArrayList<String> sozcuk = new ArrayList<>();
       sozcuk.add("emre16");
       sozcuk.add("emre02");
        sozcuk.add("emre23");
       System.out.println(sozcuk.get(0));
       System.out.println(sozcuk.get(2));
       System.out.println(sozcuk.size());
        System.out.println("--------------------------------------------------");


        HashSet<String> kelime3 = new HashSet<String>();
        kelime3.add("emre");
        kelime3.add("emre1");
        kelime3.add("emre2");
        kelime3.add("emre3");
        System.out.println(kelime3.size());

        System.out.println("---------------------------------------------------");

        HashMap<Integer,String> kullaniciBilgisi = new HashMap<Integer,String>();
        kullaniciBilgisi.put(1, "Emre");
        kullaniciBilgisi.put(2,"Saygı");
        kullaniciBilgisi.put(3,"emresaygix@gmail.com");
        System.out.println(kullaniciBilgisi.get(1));
        System.out.println(kullaniciBilgisi.get(2));
        System.out.println(kullaniciBilgisi.get(3));

        System.out.println("-----------------------------------------------------");
        /*int vizenotu = 45, finalnotu = 51;
        int ortalama = (vizenotu+finalnotu)/2;
        System.out.println(ortalama);
        if(ortalama>= 55) {// şart,durum
            System.out.println("Başarılı");
        }else{
            System.out.println("Başarısız");*/

        /*   System.out.println("---------------------------------------------------");
        Scanner kullanici = new Scanner(System.in);
            //VücutKitleEndeksi
        System.out.println("kilonuzu giriniz");
            int agirlik = kullanici.nextInt();
        System.out.println("boyunuzu giriniz");
            double boy = kullanici.nextInt();
            boy = boy/100;
            double indeks = agirlik/(boy*boy);
            System.out.println(indeks);
            if(indeks<18.5) {
                System.out.println("ideal kilo altında");
            }else if (indeks>=18.5 && indeks<24.9){
                System.out.println("ideal kilo");
            } else if (indeks>=24.9 && indeks<29.9) {
                System.out.println("ideal kilo üstünde");
            } else if (indeks>=29.9 && indeks<30.9) {
                System.out.println("obez");
            }else {
            System.out.println("çok obez");
            }*/

/*        System.out.println("-------------------------------------------------------------");
            // önce tanımlama
          int sayi = 981233;
            // karşılaştırma
        if (sayi%2==0){
            System.out.println("sayı çift çok büyük yazmaaaaa");
        }else if  (sayi %2 !=0){
            System.out.println("sayı tek afferimm");

        }
        double a,b,c;
        a=5;b=2;c=8;
        double diskiriminant=b*b-4*a*c;
        if(diskiriminant>0) {

        }else if(diskiriminant==0);*/

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("işleminizi seçiniz");
        Scanner kullanici = new Scanner(System.in);
        int islem = kullanici.nextInt();
        System.out.println("ilk değeri giriniz");
       double ilksayi = kullanici.nextInt();
        System.out.println("ikinci değeri giriniz");
       double ikincisayi = kullanici.nextInt();

        switch (islem){
            case 1:
                System.out.println(ilksayi+ikincisayi);
                break;
            case 2:
                System.out.println(ilksayi-ikincisayi);
                break;
            case 3:
                System.out.println(ilksayi*ikincisayi);
                break;
            case 4:
                System.out.println(ilksayi/ikincisayi);
                break;
        }


    }
    }

