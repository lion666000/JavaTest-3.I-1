public class CloudCompute implements ICloudService{
    private String nazev;
    private double cenaZaHodinu;
    private double cena;

    public CloudCompute(String nazev, double cenaZaHodinu) {
        this.nazev = nazev;
        this.cenaZaHodinu = cenaZaHodinu;
    }

    public void spustSluzbu(){
        System.out.println("Výpočetní služba byla spuštěna");
    }

    public void zastavSluzbu(){
        System.out.println("Výpočetní služba byla zastavena");
    }

    public double vypocitejNaklady(int hodiny){
        cena = cenaZaHodinu * hodiny;
        return cena;
    }

    public void vypisCenu(){
        System.out.println("Celková cena služby " + nazev + ": " + cena);
    }

    public String toString(){
        return "Výpočetní služba: " + nazev + " Cena za hodinu: " + cenaZaHodinu + " Celková cena: " + cena;
    }
}
