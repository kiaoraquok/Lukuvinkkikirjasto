
package database;

import domain.Kirja;
import domain.Lukuvinkki;
import java.util.ArrayList;

public interface Tietokanta {
    
    public void lisaaKirja(Lukuvinkki lukuvinkki);
    
    public void lisaaBlogi(Lukuvinkki lukuvinkki);
    
    public void muokkaaKirjaa(Lukuvinkki lukuvinkki);
    
    public void muokkaaBlogia(Lukuvinkki lukuvinkki);
    
    public void poistaLukuvinkki(Lukuvinkki lukuvinkki);
    
    public ArrayList<Lukuvinkki> haeLukuvinkit();
    
}
