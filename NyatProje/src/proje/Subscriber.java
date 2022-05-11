package proje;

public class Subscriber implements IObserver
{
    @Override
    public void update(String s) {
        System.out.println("Abone'ye gelen mesaj: Sıcaklık algılayıcı çalıştı ve " + s + " sıcaklık değeri başarıyla kaydedildi.");
    }
}
