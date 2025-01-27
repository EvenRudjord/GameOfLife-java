public class Rutenett {

    int antRader;
    int antKolonner; 

    Celle[][] rutene;

    Rutenett(int aR, int aK) {
        antRader = aR;
        antKolonner = aK;

        rutene = new Celle[antRader][antKolonner];
    }

    void lagCelle(int rad, int kolonne) {
        Celle tempCelle = new Celle();
        rutene[rad][kolonne] = tempCelle;
        
        if (Math.random() <= 1f/3) 
            tempCelle.settLevende();
    }

    void fyllMedTilfeldigeCeller() {
        for(int i = 0; i < antRader; i++) 
            for (int j = 0; j < antKolonner; j++)
                lagCelle(i, j);
    }

    Celle hentCelle(int r, int k) {
        if (r >= 0 && r < antRader && k >= 0 && k < antKolonner)
            return rutene[r][k];
        else
            return null;
    }

    void tegnRutenett() {
        System.out.println("");
        for (int i = 0; i < antRader; i++) {
            System.out.println("");
            for (int j = 0; j < antKolonner; j++) 
                System.out.print(rutene[i][j].hentStatusTegn());
        }
    }

    void settNaboer(int r, int k) {
        Celle cellen = hentCelle(r, k);

        if(cellen != null) {
            for(int i = -1; i <= 1; i++) 
                for(int j = -1; j <= 1; j++) {
                    Celle tempCelle = hentCelle(r + i, k + j);
                    if (tempCelle != null && tempCelle != cellen) 
                        cellen.leggTilNabo(tempCelle);
                    }              
        }
    }

    void kobleAlleCeller() {
        for(int i = 0; i < antRader; i++)
            for(int j = 0; j < antKolonner; j++)
                settNaboer(i, j);
    }

    int antallLevende() {
        int teller = 0;
        for(int i = 0; i < antRader; i++)
            for(int j = 0; j < antKolonner; j++)
                if(hentCelle(i, j).erLevende())
                    teller++;
        return teller;
    }
}
