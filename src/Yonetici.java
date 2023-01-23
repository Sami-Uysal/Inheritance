
public class Yonetici extends Calisan { // Subclass
    
    private int sorumlu_kisi; 
    
    public Yonetici(String isim, int maas,String departman,int sorumlu_kisi) {
        
        super(isim,maas,departman);
        
        this.sorumlu_kisi = sorumlu_kisi;
        
    }
    public void zam_yap(int zam_miktarı) {
        
        System.out.println("Çalışanlara " + zam_miktarı + " tl zam yapıldı");
    }
    public void bilgilerigoster() {
        
        
        super.bilgilerigoster();
        
        
        System.out.println("Sorumlu Kişi Sayısı: " + this.sorumlu_kisi);
      
    }
    
}
