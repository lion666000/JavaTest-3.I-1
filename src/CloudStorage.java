public class CloudStorage implements ICloudService{
    private String nazev;
    private double cenaZaGB;
    private int pocetSpusteni;
    private double cena;

    public CloudStorage(String nazev, double cenaZaGB) {
        this.nazev = nazev;
        this.cenaZaGB = cenaZaGB;
    }

    public void spustSluzbu(){
        pocetSpusteni++;
        System.out.println("Úložiště bylo spuštěno");
    }

    public void zastavSluzbu(){
        System.out.println("Úložiště bylo zastaveno");
    }

    public double vypocitejNaklady(int pocetGB){
        cena = cenaZaGB * pocetGB;
        if (pocetSpusteni > 100){
            cena = cena * 2;
        } else if (pocetSpusteni < 5) {
            cena = cena - 10;
        }
        return cena;
    }

    public void vypisCenu(){
        System.out.println("Celková cena úložiště " + nazev + ": " + cena);
    }

    public String toString(){
        return "Cloud Storage: " + nazev + " cena za GB: " + cenaZaGB + " pocet Spusteni: " + pocetSpusteni + " Celková cena " + cena;
    }
}
