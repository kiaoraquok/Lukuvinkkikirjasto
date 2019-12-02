
package database;

import domain.Kirja;
import domain.Lukuvinkki;
import java.util.ArrayList;

public interface Tietokanta {
    
    public void lisaaKirja(Lukuvinkki lukuvinkki);
    
    public void lisaaBlogi(Lukuvinkki lukuvinkki);
    
    public void muokkaaLukuvinkkia(Lukuvinkki lukuvinkki);
    
    public void poistaLukuvinkki(Lukuvinkki lukuvinkki);
    
    public Lukuvinkki haeLukuvinkki(int id);
    
    public ArrayList<Lukuvinkki> haeLukuvinkit();
    
}
