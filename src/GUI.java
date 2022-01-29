
import java.awt.*;


@SuppressWarnings("serial")
public class GUI extends Setup {
	
/*****************************************	L'espace du dessin	********************************************/
	
	// Attributs
	
	
	
	// Initialiser le forme et le chemin qu'on va les utiliser.
	private Square square = new Square(new Point(180+this.xAnswer, this.yAnswer), this.sideAnswer);
	private Circle circle = new Circle(new Point(180+this.xAnswer, this.yAnswer), this.sideAnswer);
	private Spiral spiral = new Spiral();
	private squareSpiral squarespiral = new squareSpiral();
	
	

/**********************************************************************************/	
	
	// Constructeur
	
	public GUI() {
		
		super();
	}

/**************************************		L'espace du dessin	 ******************************************/

//	Initialiser l'arrière-plan. 
	public void paintComponent(Graphics g) {
		
		
		// Initialiser un Cadre pour l'espace du dessin, et une arrière-plan pour menuPanel.
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 170, 700);
		g.setColor(Color.black);
		g.drawRect(175, 5, 650, 650);
		g.drawRect(180, 10, 640, 640);
		
		square.side = sideAnswer;
		circle.side = sideAnswer;
	
		
			
		if (runAnswer == true) {	// si le bouton 'Run' est clické.
			if(squareButton.isSelected()) {		// utiliser un carré.
				if (spiralButton.isSelected()) {
					
					
					this.spiral.drawPath(this.square);
					this.square.draw(g);
					
				}else if (squareSpiralButton.isSelected()) {

					this.squarespiral.drawPath(this.square);
					this.square.draw(g);	
				}
				
			}else if (circleButton.isSelected()) {		// utiliser un cercle.
				if (spiralButton.isSelected()) {
						
					this.spiral.drawPath(this.circle);
					this.circle.draw(g);
					
				} else if (squareSpiralButton.isSelected()) {

					this.squarespiral.drawPath(this.circle);
					this.circle.draw(g);
				}
			}
			
			
			// Blocker les boutons après clicker Run.
			circleButton.setEnabled(false);
			squareButton.setEnabled(false);
			squareSpiralButton.setEnabled(false);
			spiralButton.setEnabled(false);
			runButton.setEnabled(false);
			XText.setEnabled(false);
			YText.setEnabled(false);
			SideText.setEnabled(false);
	
		}

	} // fin paintComponenet.


	
//---------------------------------------------------------------

} // fin class GUI.
