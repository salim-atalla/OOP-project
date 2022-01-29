import java.awt.Graphics;
import java.awt.Point;


public class Circle extends Form implements Drawable {
	
	// Attributs
	
/************************************************************************/
	
	// Constructeur
	public Circle(Point center, int radius){
		
		super (center, radius);

	}

/************************************************************************/
	// Méthodes
	
	public void draw(Graphics g) {

		g.drawOval(this.point.x, this.point.y, this.side, this.side);
	}
 	


 	
 	
} // fin class Circle.