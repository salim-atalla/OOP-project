

//Class "Spiral" est un class de type path, il est résponsable de faire un dessin de forme spirale. 
public class Spiral implements Path {
	
	
	// Attribut
	private double r=0; // 'r' c'est un double qui fait la différence du rayon du circle de la spirale.  
	private double Theta; 
	
	private int i = 0; // 'i' est un compteur nécessaire pour changer Theta pour chaque tour, (si 'i' est négatif alors le chemin va se dessiner au côté opposé).
	private int x, y; // x et y sont des coordonées temporaire, on les utilise ici pour organiser plus le code.
	

/****************************************************************************************/	
	
	// Constructeur
	public Spiral() {
		super();
	}
	
	
/****************************************************************************************/
	
	
	// Méthodes

	
	public void drawPath(Form form) {
		

		// présser les limites du tableau de dessin.
		if(form.point.x + form.side < 800 
		&& form.point.y + form.side < 800 
		&& form.point.x + form.side > 200 
		&& form.point.y + form.side > 50) {
		
			
			r = r + 0.1 ;	// augmenter la différance 0.1 chaque fois.
			Theta = i * 3.14/32;
			
			x = (int) (r*Math.cos(Theta)) + form.point.x;
			y = (int) (r*Math.sin(Theta)) + form.point.y;
			
			form.setAtPosition(x, y);
				
				
		    i++;
		
		}
		
	} // fin drawPathForSquare.
	
	
} // fin class Spiral.
	
