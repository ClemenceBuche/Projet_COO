package Presentation;


import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
	import java.awt.Rectangle;
	import javax.swing.JPanel;


	public class Connexion extends JFrame implements ActionListener  { 
		    JLabel nom1;
		    JLabel motdepasse1;
		    JPanel PConnexion; 
		    JTextField nom;
		    JPasswordField motdepasse;
	        JButton connexion = new JButton("connexion");
	        

		    public Connexion() throws Exception {
		    	connexion.addActionListener(this);
		    	PConnexion= new JPanel(new FlowLayout());
		    	PConnexion.setOpaque(true);
		    	PConnexion.setLayout(null);
		    	PConnexion.setBackground(Color.LIGHT_GRAY);	
		    	nom1 = new JLabel("Nom ",JLabel.CENTER);
		    	nom1.setSize(100,100);
		    	nom1.setLocation(30,10);
		    	nom = new JTextField(); 
		    	nom.setColumns(20);
		    	nom.setSize(150,25);
		    	nom.setLocation(200,47);
		    	motdepasse1 = new JLabel("Mot de passe ",JLabel.CENTER);
		    	motdepasse1.setSize(170,100);
		    	motdepasse1.setLocation(22,50);
		    	motdepasse = new JPasswordField(); 
		    	motdepasse.setColumns(20);
		    	motdepasse.setSize(150,25);
		    	motdepasse.setLocation(200,87);
		    	connexion.setSize(150,25);
		    	connexion.setLocation(200,150);
		    	PConnexion.add(nom1);
		    	PConnexion.add(nom);
		    	PConnexion.add(motdepasse1);
		    	PConnexion.add(motdepasse);
		    	PConnexion.add(connexion);
		        this.setSize(500,500);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		        this.setContentPane(PConnexion);
		        //this.pack();
		        this.setVisible(true);
		    }; 
		  


			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("connexion"))
					System.out.println(nom.getText());
					System.out.println(motdepasse.getText());
			}

			
		}





