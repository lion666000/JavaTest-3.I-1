public class Main {
    public static void main(String[] args) {
        CloudManager cloudManager = new CloudManager();

        CloudStorage cs1 = new CloudStorage("Cloudik",5);
        CloudStorage cs2 = new CloudStorage("Koko",21);

        CloudCompute cc1 = new CloudCompute("Computor",69.67);
        CloudCompute cc2 = new CloudCompute("Calculator",41);

        cloudManager.pridejSluzbu(cs1);
        cloudManager.pridejSluzbu(cs2);
        cloudManager.pridejSluzbu(cc1);
        cloudManager.pridejSluzbu(cc2);

        System.out.println("\nSpuštění všech služeb:\n");

        cloudManager.spustVsechnySluzby();

        System.out.println("\nZastavení všech služeb:\n");

        cloudManager.zastavVsechnySluzby();

        System.out.println("\nVypsání nákladů:\n");

        cloudManager.vypisNaklady(55);

        System.out.println("\nVypsání informací:\n");

        cloudManager.vypisInformace(); // toto ani neni v zadání, že to máme otestovat :(

        System.out.println("\nSpuštění všech služeb:\n");

        cloudManager.spustVsechnySluzby();

        System.out.println("\nVypsání informací:\n");

        cloudManager.vypisInformace();

        /*
        😣🤑😲😩🤯😨🥵😭🥶😳🤪😵😱🤬👿😈🤓👽👾👽👻🐱‍🐉🐸🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦅🦅🕊🕊🦢🦢🦜🦜🦃🦅🐓🦉🐧🐦🐥🐤🐣🍳🍙🍘🍑🥒🛺🚥🚦☢
         */
    }
}