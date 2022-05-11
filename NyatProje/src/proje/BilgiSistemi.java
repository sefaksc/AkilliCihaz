package proje;

public class BilgiSistemi implements IBilgiSistemi
{
    private IVeritabaniArayuz veritabani;
    public BilgiSistemi(IVeritabaniArayuz veritabani){
        this.veritabani = veritabani;
    }
    @Override
    public boolean kullaniciDogrula(String username, String password) {
        return veritabani.dogrulama(username,password);
    }
}
