import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



@SuppressWarnings("serial")
public class Setup extends JPanel implements ActionListener {
	
	
	// Attributs
	private JPanel menuPanel = new JPanel(); // Contient les labels et boutons des formes et chemins et le bouton du lancement 'Run'.
	private JLabel formLabel = new JLabel();
	private JLabel pathLabel = new JLabel();
	
	// Déclaration pour les RadioButtons.
	protected JRadioButton circleButton = new JRadioButton("Circle");
	protected JRadioButton squareButton = new JRadioButton("Square");
	protected JRadioButton squareSpiralButton = new JRadioButton("Square Spiral");
	protected JRadioButton spiralButton = new JRadioButton("Spiral");
	
	// Déclaration pour les groupes des boutons.
	private ButtonGroup formGroup = new ButtonGroup();
	private ButtonGroup pathGroup = new ButtonGroup();
	
	// JTextField
	protected JTextField XText = new JTextField("320");
	protected JTextField YText = new JTextField("320");
	protected JTextField SideText = new JTextField("35");
	
	protected int xAnswer = Integer.parseInt(this.XText.getText());
	protected int yAnswer = Integer.parseInt(this.YText.getText());
	protected int sideAnswer = Integer.parseInt(this.SideText.getText());
	
	protected JLabel XLabel = new JLabel("X : ");
	protected JLabel YLabel = new JLabel("Y : ");
	protected JLabel SideLabel = new JLabel("Side : ");
	
	
	protected JButton runButton = new JButton("RUN");
	protected boolean runAnswer = false; // booléen utilisé pour empêcher le dessin si le 'runButton' n'est pas clické.
	
	private Timer chrono = new Timer(10, this); // pause 10ms, principalement utilisé pour gérer la vitesse.


/*****************************************************************************************/	

	
	// Constructeur
	public Setup() {
		super();
		
		this.SetupContent();
	}
	
/*****************************************************************************************/	
	
	
	// Méthodes
	private void SetupContent() {
		
		this.setLayout(null);
		this.add(menuPanel);
		
		this.menuPane();
		
	}

//----------------------------------------------------------------------------------------	
	
	private void menuPane() {
		
		this.menuPanel.setLayout(null);
		this.menuPanel.setBounds(10, 0, 150, 700);
		this.menuPanel.setBackground(Color.LIGHT_GRAY);
		
		this.formPane();
		this.pathPane();
		this.TextPane();
		this.runPane();
		
	}
	
//----------------------------------------------------------------------------------------	
	
	private void formPane() {
		
		this.formLabel.setBounds(60, 0, 150, 75);
		this.formLabel.setText("Form");
		this.menuPanel.add(formLabel);
		
		this.circleButton.setBounds(0, 75, 150, 50);
		this.circleButton.setSelected(true);
		this.menuPanel.add(circleButton);
		
		this.squareButton.setBounds(0, 130, 150, 50);
		this.menuPanel.add(squareButton);
		
		
		this.formGroup.add(circleButton);
		this.formGroup.add(squareButton);
		
	}
	
//----------------------------------------------------------------------------------------	
	
	private void pathPane() {
		
		this.pathLabel.setBounds(60, 180, 150, 75);
		this.pathLabel.setText("Path");
		this.menuPanel.add(pathLabel);
		
		this.spiralButton.setBounds(0, 255, 150, 50);
		this.spiralButton.setSelected(true);
		this.menuPanel.add(spiralButton);
		
		this.squareSpiralButton.setBounds(0, 310, 150, 50);
		this.menuPanel.add(squareSpiralButton);
		
		
		this.pathGroup.add(spiralButton);
		this.pathGroup.add(squareSpiralButton);
		
	}
	
//--------------------------------------------------------------------------------------------------------	

	private void runPane(){
		
		this.runButton.setBounds(0, 550, 150, 100);
		this.menuPanel.add(runButton);
		this.runButton.addActionListener(this);
	}
	
	
//---------------------------------------------------------------------------------------------------------	
	
	private void TextPane() {
		
		
		this.XText.setBounds(50, 380, 100, 50);
		this.XLabel.setBounds(15, 380, 50, 50);
		this.menuPanel.add(XText);
		this.menuPanel.add(XLabel);
		this.XText.setEditable(false);	// A Compléter.
		
		this.YText.setBounds(50, 430, 100, 50);
		this.YLabel.setBounds(15, 430, 50, 50);
		this.menuPanel.add(YText);
		this.menuPanel.add(YLabel);
		this.YText.setEditable(false);	// A Compléter.
		
		this.SideText.setBounds(50, 480, 100, 50);
		this.SideLabel.setBounds(10, 480, 50, 50);
		this.menuPanel.add(SideText);
		this.menuPanel.add(SideLabel);
		

	}
	
//---------------------------------------------------------------------------------------------------------	
	
/**************************************		Action Listener	 ******************************************/
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==runButton) {
			
			// Vérifier si la valeur d'entrée est bien un entier.
	        try {
	        	xAnswer = Integer.parseInt(this.XText.getText());
	            yAnswer = Integer.parseInt(this.YText.getText());
				sideAnswer = Integer.parseInt(this.SideText.getText());
				
				runAnswer = true;
				chrono.start();
				
	        } catch(NumberFormatException nb) {
	        	
	        	
	        	JOptionPane.showMessageDialog(this, "Please try again!", "Erreur: Only Integers!", JOptionPane.ERROR_MESSAGE);
	        	
				// Déblocker les boutons.
	        	SideText.setEnabled(true);
				circleButton.setEnabled(true);
				squareButton.setEnabled(true);
				squareSpiralButton.setEnabled(true);
				spiralButton.setEnabled(true);
				runButton.setEnabled(true);
				XText.setEnabled(true);
				YText.setEnabled(true);
				SideText.setEnabled(true);
				
	        }
		}
		
		repaint();
	}

	



} // fin class Setup.
