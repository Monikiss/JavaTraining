package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainWindow 
	extends JFrame 
	implements ActionListener 
{
	// Objekt Variablen
	public JPanel panelOben = new JPanel();
	public JPanel panelUnten = new JPanel();
	
	public JTextField textField = new JTextField(10);
	public JButton buttonAdd = new JButton("add");
	public JButton buttonRem = new JButton("remove");
	public JLabel label = new JLabel();
	
	
	public ArrayList<JLabel> list = new ArrayList<JLabel>();	
	
	// Methoden:
		
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("actionPerformed called");
		
		Object quelle = e.getSource();
		if(quelle instanceof JButton )
		{
			JButton button = (JButton) quelle;
			
			if(button.getText().equals("add"))
			{
				Random r = new Random();
				Color c = new Color(r.nextInt(256), r.nextInt(256),
						r.nextInt(256));
				
				this.panelOben.setBackground(c);
				String eingabe = textField.getText();
				System.out.println(eingabe);
				label.setText(label.getText()+ " " + eingabe);
				
				// das hier macht das gleiche, aber ohne eine Variable
				//label.setText(label.getText()+ " " + textField.getText());
			}
			
			if(button.getText().equals("remove"))
			{
				Random r = new Random();
				Color c = new Color(r.nextInt(256), r.nextInt(256),
						r.nextInt(256));
				
				this.panelUnten.setBackground(c);
				
				label.setText("");
			}
		}  
	}
		
	private void init()
	{
		// buttons und Textfeld bereits als Objektvariable angelegt
		buttonAdd.addActionListener(this);
		buttonRem.addActionListener(this);
		
		// PANEL OBEN
		panelOben.setLayout(new FlowLayout(FlowLayout.CENTER));	
		panelOben.add( textField );
		panelOben.add( buttonAdd );
		panelOben.add( buttonRem );
		panelOben.setBackground(Color.YELLOW);
		
		// PANEL UNTEN
		panelUnten.add(label);
		label.setOpaque(true);
		label.setBackground(Color.CYAN);
		label.setText("Hallo");
		
		// Layout manager (ersetzt content)
		// alle Panels in das Fenster legen
		setLayout(new BorderLayout());
		add(panelOben, BorderLayout.CENTER);
		add(panelUnten, BorderLayout.SOUTH);
		pack();
	}

	public MainWindow() 
	{
		// erzeugen des Fenster mit
		// - titel 
		// - hintergrund 
		// - verhalten beim schliessen
		super();
		this.setTitle("Elemente hinzufügen");
		this.getContentPane().setBackground(Color.WHITE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// buttons und alles andere erstellen
		this.init();
		
		// größe und position des Fensters einstellen, und sichtbar machen
		this.setSize(400,100);
		this.setLocation(200, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		// baue ein neues Fenster:
		new MainWindow();
	}
}


