public class Verden {

    Rutenett rutenett;
    int genNr;
    int antallLevendeCeller;
    int rader, kolonner;

    Verden(int r, int k) {
        genNr = 0;
        rader = r;
        kolonner = k;
        rutenett = new Rutenett(rader, kolonner);
        rutenett.fyllMedTilfeldigeCeller();
        rutenett.kobleAlleCeller();
    }

    void tegn() {
        rutenett.tegnRutenett();
        System.out.println("\n\nGenerasjons Nr. " + genNr);
        System.out.println("Antall levende Celler: " + antallLevendeCeller);
    }

    void oppdatering() {
        for(int i = 0; i < rader; i++)
            for(int j = 0; j < kolonner; j++) 
                rutenett.hentCelle(i, j).tellLevendeNaboer();
                   
        for(int i = 0; i < rader; i++)
            for(int j = 0; j < kolonner; j++)
                rutenett.hentCelle(i, j).oppdaterStatus();

        genNr++;
        antallLevendeCeller = rutenett.antallLevende();
    }
}
