import java.util.ArrayList;

public class CloudManager {
    private ArrayList<ICloudService> sluzby = new ArrayList();

    public void pridejSluzbu(ICloudService sluzba){
        if (sluzby.contains(sluzba)){
            System.out.println("Služba už byla přidaná dříve");
        }
        else {
            sluzby.add(sluzba);
        }
    }

    public void spustVsechnySluzby(){
        for (ICloudService sluzba : sluzby) {
            sluzba.spustSluzbu();
        }
    }

    public void zastavVsechnySluzby(){
        for (ICloudService sluzba : sluzby) {
            sluzba.zastavSluzbu();
        }
    }

    public void vypisNaklady(int hodiny){  // tady by se spíš hodil místo hodiny počet, protože to pužíváme na oboje (pocetGB, hodiny)
        for (ICloudService sluzba : sluzby) {
            sluzba.vypocitejNaklady(hodiny);
            sluzba.vypisCenu();
        }
    }

    public void vypisInformace(){
        for (ICloudService sluzba : sluzby) {
            System.out.println(sluzba.toString());
        }
    }
}
