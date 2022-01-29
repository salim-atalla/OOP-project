
import java.awt.Point;

public class Form { 
	// Class "Form" r�sponsable de d�finire les formes.

	
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
	// M�thodes

	// Changer les coordonn�es d'un objet d'une valeur des x et des y donn�s.
	public void translation(int dx, int dy){	// ajouter x et y aux cordonnees (Valeurs negatives sont acceptees).

		this.point.x = this.point.x + dx;
		this.point.y = this.point.y + dy;
	}
	
	
//------------------------------------------------------------------------
	
	// Initialiser l'objet � la nouvelle coordonn�e.
	public void setAtPosition(int x, int y){
		// Initialiser le cercle � la nouvelles coordonn�es.

		this.point.x = x;
		this.point.y = y;
	}
	
//------------------------------------------------------------------------	

	
	
	

} // fin interface Form.