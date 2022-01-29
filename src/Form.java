
import java.awt.Point;

public class Form { 
	// Class "Form" résponsable de définire les formes.

	
	// Attributs
	protected Point point;
	protected int side;
	
/***************************************************************************/
	
	// Constructeur
	public Form(Point point, int side) {
		
		this.point = point;
		this.side = side;
	}
	
/***************************************************************************/
	// Méthodes

	// Changer les coordonnées d'un objet d'une valeur des x et des y donnés.
	public void translation(int dx, int dy){	// ajouter x et y aux cordonnees (Valeurs negatives sont acceptees).

		this.point.x = this.point.x + dx;
		this.point.y = this.point.y + dy;
	}
	
	
//------------------------------------------------------------------------
	
	// Initialiser l'objet à la nouvelle coordonnée.
	public void setAtPosition(int x, int y){
		// Initialiser le cercle à la nouvelles coordonnées.

		this.point.x = x;
		this.point.y = y;
	}
	
//------------------------------------------------------------------------	

	
	
	

} // fin interface Form.