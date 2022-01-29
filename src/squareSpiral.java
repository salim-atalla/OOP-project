
public class squareSpiral implements Path {
	
	
/*
  
	Un squareSpiral est de la forme:
	où p0 est le point minimal, et pf est le point final/maximal.
		
			
			p0 
			  |
			  |  d  ______________
			  |<-->|  			  |	
			  |    |    _____     |
			  |    |   |	 |	  |
			  |    |_________|	  |
			  |					  |
			  |___________________|
								pf

*/
	
	// Attributs
	private int x = 230,  y = 50;	// initialiser les coordonnées du début.
	private int i = 0;
	private final int d = 75;
	private int val;	// val = d*i;
	
/************************************************************************/
	// Constructeur
	public squareSpiral() {
		super();
	}

/************************************************************************/
	
	// Méthodes

	public void drawPath(Form form){  
		
			val = d*i;
		
			if(x==230+val && y<=575-val) {		// décendre.
				form.setAtPosition(x, y);
				y+=5;
			}
			
			if(y==575-val && x<=755-val) {		// à droite.
				form.setAtPosition(x, y);
				x+=5;
			}
			
			
			if(x==755-val && y>=125+val) {		// monter.
				form.setAtPosition(x, y);
				y-=5;
			}
			
			if(y==125+val && x>=305+val) {		// à gauche.
				form.setAtPosition(x, y);
				x-=5;
			}
			
			if(y==125+val && x==305+val) {		// augmenter la différance val = d*i.
				i++;
			}
	}
	
	
} // fin class squareSpiral.
