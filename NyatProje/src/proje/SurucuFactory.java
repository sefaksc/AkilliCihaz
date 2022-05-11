package proje;

public class SurucuFactory
{
    public static IVeritabaniArayuz create(String isim) {
        IVeritabaniArayuz database;
        if(isim.equals("PostgreSQL")){
            database = new PostgreSurucu();
            return database;
        }
        else{
            throw new RuntimeException(isim+" sürücüsü desteklenmemektedir.");
        }
    }
}
