
import javax.swing.*;


@SuppressWarnings("serial")
public class View extends JFrame {
	
	// Attributs
	private GUI gui = new GUI();	// GUI: Graphical User Interface.
	
	
/*****************************************************************************************/	

	// Constructeur
	public View(String title) {
		super(title);
		ContentFrame();
	}
	
	
	
/*****************************************************************************************/	

	// Méthodes
	private void ContentFrame() {
		
		this.setSize(850, 700);
		this.setResizable(false); 
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(gui);	// ajouter la partie graphique.

	}
	


} // fin class View.
