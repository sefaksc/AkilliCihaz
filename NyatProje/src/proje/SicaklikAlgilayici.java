package proje;



public class SicaklikAlgilayici implements ISicaklikAlgilayici
{
    int sicaklik;

    @Override
    public int sicaklikOku() {
        sicaklik = (int) (10 + (Math.random() * 40));
        System.out.println("Cihazın sıcaklık değeri :" + sicaklik);
        return sicaklik;
    }
}
