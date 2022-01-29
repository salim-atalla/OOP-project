import java.awt.Graphics;
import java.awt.Point;


public class Square extends Form implements Drawable {
	
/*			
 * 		  point  __________
 				|    	   |			Ici "center" n'est pas le centre mais le point haut_gauch du carr�.
 				|		   |
 				|		   |
 				|__________|
 			   			
	
*/	
	
	// Attributs
	
/************************************************************************/
	
	// Constructeur
	public Square(Point point, int side){

		super(point, side);
	}

/************************************************************************/
	
	// M�thodes

	public void draw(Graphics g) {

		g.drawRect(this.point.x, this.point.y, this.side, this.side);
	}



  
} // fin class Square.