
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
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
public class contornoTamal extends Canvas{
        public void paint(Graphics g){
        Dimension tam = getSize();
        
        ImageIcon fondo = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/Marco.jpg")).getImage());
        g.drawImage(fondo.getImage(), 0, 0, tam.width, tam.height, this);
        }
}
