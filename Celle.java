public class Celle {
    boolean levende;
    Celle[] naboer;
    int antNaboer;
    int antLevendeNaboer;
    
    Celle() {
        levende = false;
        naboer = new Celle[8];
        antNaboer = 0;
        antLevendeNaboer = 0;
    }

    void settDoed() {
        levende = false;
    }

    void settLevende() {
        levende = true;
    }

    boolean erLevende() {
        return levende;
    }

    char hentStatusTegn() {
        if (levende) 
           return 'O';
        else
            return '.';
    }

    void leggTilNabo(Celle nabo) {
        naboer[antNaboer] = nabo;
        antNaboer++;
    }

    void tellLevendeNaboer() {
        int teller = 0;
        for(Celle nabo : naboer)  
            if(nabo != null)
                if(nabo.erLevende())
                    teller++;       
        
        antLevendeNaboer = teller;
    }

    void oppdaterStatus() {
        if(levende) {
            if(antLevendeNaboer == 2 || antLevendeNaboer == 3)
                settLevende();
            else 
                settDoed();
        }else if(!levende) {
            if(antLevendeNaboer == 3)
                settLevende();
        }
    }
}
