package proje;

import java.util.Scanner;

public class AnaIslemPlatformu implements IAnaIslemPlatformu
{
    // Observer uygulama
    Publisher p = new Publisher();
    Subscriber subscriber = new Subscriber();
    String secenek;

    @Override
    public void baslat() {
        p.attach(subscriber);
        IArayuz arayuz = new Arayuz();
        IEyleyici eyleyici = new Eyleyici();
        ISicaklikAlgilayici algilayici = new SicaklikAlgilayici();
        if (arayuz.girisYap()) {
            do {
                int secilenIslem = arayuz.islemSec();
                if (secilenIslem == 1) {
                    eyleyici.sogutucuAc();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (secilenIslem == 2) {
                    eyleyici.sogutucuKapat();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (secilenIslem == 3) {
                    p.notify(String.valueOf(algilayici.sicaklikOku()));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Hatali Islem");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Baska Bir Islem Yapmak Istiyor Musunuz?(e/h)");
                Scanner input = new Scanner(System.in);
                secenek = input.next();


            } while (secenek.equalsIgnoreCase("e"));
        }
    }
}
