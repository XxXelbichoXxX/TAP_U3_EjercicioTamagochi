
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author black
 */
public class HiloTamagochi extends Thread {

    int contador = 10;
    int c = 0;
    boolean ejecutar = true;
    boolean despausado = true;
    Ventana puntero;

    public HiloTamagochi(Ventana p) {
        puntero = p;
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        dibujarImagen("Training");
        while (ejecutar) {
            try {
                contador--;
                c++;
                if(c == 10){
                    dibujarImagen("Training");
                    c=0;
                }
                puntero.lblContador.setText("" + contador);
                if (contador < 0) {
                    dibujarImagen("Cansado");
                }
                sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloTamagochi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void dibujarImagen(String tit) {
        URL url = Ventana.class.getResource("/Imagenes/"+tit+".gif");
        ImageIcon imageIcon = new ImageIcon(url);
        puntero.lblImagen.setIcon(imageIcon);
    }
}
