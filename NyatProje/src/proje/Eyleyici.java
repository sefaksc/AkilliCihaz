package proje;

public class Eyleyici implements IEyleyici
{
    String durum = "kapalı";
    @Override
    public void sogutucuAc()
    {
        if(durum.equals("kapalı"))
        {
            System.out.println("Soğutucu açılıyor ...");
            durum = "açık";
        }
        else
        {
            System.out.println("Soğutucu zaten açık durumda.");
        }
    }

    @Override
    public void sogutucuKapat() {

        if(durum.equals("açık"))
        {
            System.out.println("Soğutucu kapatılıyor ...");
            durum = "kapalı";
        }
        else
        {
            System.out.println("Soğutucu zaten kapalı durumda.");
        }
    }
}
