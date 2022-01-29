

//Class "Spiral" est un class de type path, il est r�sponsable de faire un dessin de forme spirale. 
public class Spiral implements Path {
	
	
	// Attribut
	private double r=0; // 'r' c'est un double qui fait la diff�rence du rayon du circle de la spirale.  
	private double Theta; 
	
	private int i = 0; // 'i' est un compteur n�cessaire pour changer Theta pour chaque tour, (si 'i' est n�gatif alors le chemin va se dessiner au c�t� oppos�).
	private int x, y; // x et y sont des coordon�es temporaire, on les utilise ici pour organiser plus le code.
	

/****************************************************************************************/	
	
	// Constructeur
	public Spiral() {
		super();
	}
	
	
/****************************************************************************************/
	
	
	// M�thodes

	
	public void drawPath(Form form) {
		

		// pr�sser les limites du tableau de dessin.
		if(form.point.x + form.side < 800 
		&& form.point.y + form.side < 800 
		&& form.point.x + form.side > 200 
		&& form.point.y + form.side > 50) {
		
			
			r = r + 0.1 ;	// augmenter la diff�rance 0.1 chaque fois.
			Theta = i * 3.14/32;
			
			x = (int) (r*Math.cos(Theta)) + form.point.x;
			y = (int) (r*Math.sin(Theta)) + form.point.y;
			
			form.setAtPosition(x, y);
				
				
		    i++;
		
		}
		
	} // fin drawPathForSquare.
	
	
} // fin class Spiral.
	
