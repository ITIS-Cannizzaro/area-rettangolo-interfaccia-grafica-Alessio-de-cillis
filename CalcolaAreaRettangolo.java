
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CalcolaAreaRettangolo extends JFrame implements ActionListener {
	JLabel labelBase = new JLabel ("Inserisci la base: ");
	JPanel panel = new JPanel();
	JTextArea textBase = new JTextArea();
	JLabel labeLAltezza = new  JLabel("inserisci l'altezza: ");
	JTextArea textAltezza = new JTextArea();
	JLabel labelArea = new JLabel ("misura dell'area");
	
	JButton buttonCalcola = new JButton ("calcola");
	JButton buttonCancella = new JButton ("cancella");
	
	publlc CalcolaAreaRettangolo() {
		Container c = this.getContentPane();
		
		
	}
	
	
		
		
		
		
		
		
		private void jButtonCalcolaActionPerformed(ActionEvent e) {
			double base, altezza, area;
			base = Double.parseDouble(textBase.getText());
			altezza = Double.parseDouble(textBase.getText());
			area= base *  altezza; 
			textArea.setText(Double.toString(area));
			
		}
		private void JButtonCancellaActionPerformed(ActionEvent e) {
			textBase.setText("");
			textAltezza.setText("");
			textArea.setText("");
			
			
		}








		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	}


	
		

