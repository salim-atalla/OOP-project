
public class squareSpiral implements Path {
	
	
/*
  
	Un squareSpiral est de la forme:
	o� p0 est le point minimal, et pf est le point final/maximal.
		
			
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
	private int x = 230,  y = 50;	// initialiser les coordonn�es du d�but.
	private int i = 0;
	private final int d = 75;
	private int val;	// val = d*i;
	
/************************************************************************/
	// Constructeur
	public squareSpiral() {
		super();
	}

/************************************************************************/
	
	// M�thodes

	public void drawPath(Form form){  
		
			val = d*i;
		
			if(x==230+val && y<=575-val) {		// d�cendre.
				form.setAtPosition(x, y);
				y+=5;
			}
			
			if(y==575-val && x<=755-val) {		// � droite.
				form.setAtPosition(x, y);
				x+=5;
			}
			
			
			if(x==755-val && y>=125+val) {		// monter.
				form.setAtPosition(x, y);
				y-=5;
			}
			
			if(y==125+val && x>=305+val) {		// � gauche.
				form.setAtPosition(x, y);
				x-=5;
			}
			
			if(y==125+val && x==305+val) {		// augmenter la diff�rance val = d*i.
				i++;
			}
	}
	
	
} // fin class squareSpiral.
