import java.awt.Graphics;
import java.applet.Applet;

/**
 * Simple Applet 
 * @author Munib Emre Sevilgen
 * @version 1.00 2017-10-10
 */ 
public class Lab02b extends Applet 
{
    
   public void paint( Graphics g)
   {
      g.drawString( "Hello...", 50, 50);
      g.drawRect( 25, 25, 100, 50);
   }
    
}