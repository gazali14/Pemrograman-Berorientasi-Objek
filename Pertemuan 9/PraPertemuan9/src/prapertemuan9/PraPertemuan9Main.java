package prapertemuan9;

import javax.swing.SwingUtilities;

/**
 *
 * @author Gazali
 */
public class PraPertemuan9Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
        {
           MahasiswaView view = new MahasiswaView(); 
        });
    }   
}
