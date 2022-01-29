import java.awt.Point;

public class Square extends Form implements rotationInterface {
	
	// Attributs
	private Point[] tab_point;

/************************************************************************/
	
	// Constructeur
	public Square(Point point, int side){

		super(point, side);

		this.tab_point = new Point[4];
		tab_point[0] = point;
		tab_point[1] = new Point(tab_point[0].x, tab_point[0].y+side);
		tab_point[2] = new Point(tab_point[1].x+side, tab_point[1].y);
		tab_point[3] = new Point(tab_point[2].x, tab_point[2].y-side);
	}

/************************************************************************/
	
	// Méthodes
	public Square clone(int x, int y){
		return new Square(new Point(x, y), this.side);
	}

	public void translation(int dx, int dy){	// ajouter x et y aux cordonnees (Valeurs negatives sont acceptees).
		
	    tab_point[0].x = tab_point[0].x + dx;   tab_point[0].y = tab_point[0].y + dy;
	    tab_point[1].x = tab_point[1].x + dx;   tab_point[1].y = tab_point[1].y + dy;
	    tab_point[2].x = tab_point[2].x + dx;   tab_point[2].y = tab_point[2].y + dy;
	    tab_point[3].x = tab_point[3].x + dx;   tab_point[3].y = tab_point[3].y + dy;
	}

	public void setAtPosition(int x, int y){
	// Initialiser le point en bas à gauche du carée à la nouvelle coordonnée.
		
	    this.tab_point[0].x = x;
	    this.tab_point[0].y = y;

	    this.tab_point[1].x = x;
	    this.tab_point[1].y = this.tab_point[0].y+this.side;

	    this.tab_point[2].x = this.tab_point[1].x+this.side;
	    this.tab_point[1].y = y;

	    this.tab_point[3].x = this.tab_point[2].x;
	    this.tab_point[3].y = this.tab_point[1].y-this.side;
	}

 	public void rotation(){
 		
 	    for (int i=0; i<=32; i++){ 
 	       for (int j=0; j<4; j++){
 	         this.tab_point[j].x = (int) (this.tab_point[j].x*Math.cos(i*Math.PI/16));
 	         this.tab_point[j].y = (int) (this.tab_point[j].y*Math.sin(i*Math.PI/16));
 	       }
 	     }
	}
 	
/************************************************************************/
 	
	// Getters
 	public Point getPoint1(){ return this.tab_point[0]; }
	public Point getPoint2(){ return this.tab_point[1]; }
	public Point getPoint3(){ return this.tab_point[2]; }
	public Point getPoint4(){ return this.tab_point[3]; }

	public Point[] getSquare(){ 
    
		Point[] s = new Point[4];

		s[0] = this.tab_point[0];
		s[1] = this.tab_point[1];
		s[2] = this.tab_point[2];
		s[3] = this.tab_point[3];

		return s;
	}
  
}