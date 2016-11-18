package Presentation;
	import javax.swing.JButton;

	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
	import java.awt.Rectangle;
	import javax.swing.JPanel;


	@SuppressWarnings({ "serial", "unused" })
	public class Accueil extends JFrame implements ActionListener  { 
			Inscription im;
			Connexion  con;
			static String nom;
		    JPanel PAcceuil ;   
	        JButton inscription = new JButton("Inscription");
	        JButton connexion = new JButton("Connexion");
	        

		    public Accueil() throws Exception { 
		    	inscription.addActionListener(this);
		    	connexion.addActionListener(this);
		    	PAcceuil= new JPanel(new FlowLayout());
		    	PAcceuil.setOpaque(true);
		    	PAcceuil.setLayout(null);

		    	PAcceuil.setBackground(Color.LIGHT_GRAY);	
		    	inscription.setSize(150,25);
		    	inscription.setLocation(60,110);
		    	connexion.setSize(150,25);
		    	connexion.setLocation(260,110);
		    	PAcceuil .add(connexion);
		    	PAcceuil .add(inscription);
		        this.setSize(500,500);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		        this.setContentPane(PAcceuil);
		        //this.pack();
		        this.setVisible(true);
		    }; 
		    
		   
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Inscription"))
					try {
						im= new Inscription();
						Accueil.this.setVisible(false);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			
				if (e.getActionCommand().equals("Connexion"))
					try {
						con= new Connexion();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					}
		    }
			
		


