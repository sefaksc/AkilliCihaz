package proje;

import java.util.Scanner;

public class Arayuz implements IArayuz
{
    Scanner input = new Scanner(System.in);
    @Override
    public boolean girisYap() {
        IVeritabaniArayuz postgreDatabase = SurucuFactory.create("PostgreSQL");
        IBilgiSistemi bilgiSistem = new BilgiSistemi(postgreDatabase);
        User kullanici = new User();
        System.out.println("Akıllı Cihaz Uygulaması");
        System.out.println("");
        System.out.println("Kullanıcı adınızı giriniz:");
        kullanici.set_username(input.next());
        System.out.println("Şifrenizi giriniz:");
        kullanici.set_password(input.next());
        boolean dogruMu = bilgiSistem.kullaniciDogrula(kullanici.get_username(), kullanici.get_password());
        return dogruMu;
    }

    @Override
    public int islemSec() {
        int secim;
        System.out.println("1-Soğutucu Aç");
        System.out.println("2-Soğutucu Kapat");
        System.out.println("3-Sıcaklık Göster");
        System.out.println("");
        System.out.println("Seçiminiz:");
        secim = input.nextInt();
        return secim;
    }
}
