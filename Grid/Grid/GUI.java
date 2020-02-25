package grid;


import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Object;



public class GUI extends JFrame implements ActionListener{

	//Dimension de la grille (20x20,hgap,vgap) 
	GridLayout grid = new GridLayout(20,20,3,4);
	//Creation de la fenetre (frame)
	JFrame frame = new JFrame();

	//Creation du Panel
    JPanel panel_menu = new JPanel(new GridLayout());
    JPanel panel_supp = new JPanel();

    JPanel panel_buttons= new JPanel(new GridLayout());
    JPanel panel_buttons_supp= new JPanel();
    
    //Compteur
    private int compteur;
    
	// La fenetre
	public GUI(){

		



		frame.setTitle("Solveur"); // Titre de la Fenetre
		frame.setSize(1500,1000); // Taille de la fenetre (Longueur, Hauteur)
		frame.setMinimumSize(new Dimension(1286,829)); // Taille Minimum de la fenetre

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Lorsque on clique sur fermer, la fenetre se ferme
		frame.setVisible(true); //permet que la fenetre soit visible
		frame.setResizable(true); // Permet de resize la fenetre

		frame.setLayout(new BorderLayout()); // Fonction qui permet de choisir la position elements N,W,E,S
				
    
    
    
        //Creation du Panel du Menu
        panel_menu.setBackground(Color.blue); //Couleur 
	    frame.add(panel_menu,BorderLayout.WEST);  // Placer le Panel a l'Ouest de la fenetre , 
     	panel_menu.setLayout(new BoxLayout(panel_menu,BoxLayout.PAGE_AXIS)); // ?????

     	
        //Panel supp
        
        Component rigidareaW = Box.createRigidArea(new Dimension(200,100));// "Mur invisible" Situé au OUEST

        panel_supp.setBackground(Color.red); //Couleur 
	    frame.add(panel_supp,BorderLayout.WEST);  // Placer le Panel a l'Ouest de la fenetre , 
     	panel_supp.setLayout(new FlowLayout()); // ?????
        panel_supp.add(rigidareaW,BorderLayout.WEST);
        
        




        //Panel buttons
        panel_buttons.setBackground(Color.pink); //Couleur

        frame.add(panel_buttons,BorderLayout.NORTH);  // Placer le Panel a l'Ouest de la fenetre , 
        panel_buttons.setLayout(new BoxLayout(panel_buttons,BoxLayout.LINE_AXIS)); // ?????

         //Panel buttons supp
        
        Component rigidareaN = Box.createRigidArea(new Dimension(50,50));// "Mur invisible" Situé au OUEST

        panel_buttons_supp.setBackground(Color.green); //Couleur 
        frame.add(panel_buttons_supp,BorderLayout.NORTH);  // Placer le Panel a l'Ouest de la fenetre , 
        panel_buttons_supp.setLayout(new FlowLayout()); // ?????
        panel_buttons_supp.add(rigidareaN,BorderLayout.NORTH);
        panel_buttons_supp.add(panel_buttons,FlowLayout.LEFT);

		/// Les Boutons

		JButton b1 = new JButton("Solve game"); // Creation du bouton et son titre
        panel_buttons.add(b1); // placer le bouton au Nord de la fenetre
        panel_buttons.add(Box.createRigidArea(new Dimension(15,0)));
        //b1.setBounds(500,50,200,100); // Dimension du bouton 
        b1.setVisible(true); // permet que le bouton soit visible


        
        /// Bouton avec Action listener
        JButton b2 = new JButton("Menu"); // Creation du bouton et son titre
       // b2.setBounds(1000,50,200,100); //Dimension du bouton 
        b2.addActionListener(this); //appel a la methode actionlistener
        panel_buttons.add(b2); // placer le bouton au Nord de la fenetre
        b2.setVisible(true); // permet que le bouton soit visible



		// Les boutons du Menu
		JButton bgen = new JButton("Generation"); //Creation du bouton et son titre
        JButton bclean = new JButton("Clean"); //Creation du bouton et son titre
        JButton bclose = new JButton("Close"); // Creation du bouton et son titre
        panel_menu.add(bgen); // Ajout du bouton au panel du menu, positioner a gauche

        panel_menu.add(Box.createRigidArea(new Dimension(0,5)));

        panel_menu.add(bclean);// Ajout du bouton au panel du menu, positioner a gauche


		panel_menu.add(bclose); // Ajout du bouton au panel du menu, positioner a gauche  



        bgen.setVisible(false);  // Bouton qui n'est pas visible        
        bclean.setVisible(false);   // Bouton qui n'est pas visible
        bclose.setVisible(false);  // Bouton qui n'est pas visible


  		// Creation du panel pour la Grille

		JPanel panel = new JPanel();
		frame.add(panel,BorderLayout.CENTER); // Panel de la grille centré
     		panel.setLayout(grid);  


     	// Creation des "Mur invisible"

	//	Component rigidareaN = Box.createRigidArea(new Dimension(200,200)); // "Mur invisible" Situé au Nord
		//Component rigidareaS = Box.createRigidArea(new Dimension(10,10));// "Mur invisible" Situé au Sud
		Component rigidareaE = Box.createRigidArea(new Dimension(300,30));// "Mur invisible" Situé au EST
		//Component rigidareaW = Box.createRigidArea(new Dimension(400,100));// "Mur invisible" Situé au OUEST
        //rigidareaE.setForeground(Color.cyan); 

     

		//Ajout des "Mur Invisible" 
		frame.add(rigidareaN, BorderLayout.NORTH);  // Ajout des "Mur Invisible" au Nord
		//frame.add(rigidareaS, BorderLayout.SOUTH); // Ajout des "Mur Invisible" au Sud
		frame.add(rigidareaE, BorderLayout.EAST); // Ajout des "Mur Invisible" EST
		//frame.add(rigidareaW,BorderLayout.WEST);

		
		
		// Boucle permettant de creer les cases
		for (int i =0; i<400; i++){ 
				JLabel label1 = new JLabel();  // Commentaire dans la box
				label1.setMaximumSize(new Dimension(30,50)); // Taille des cases
				label1.setOpaque( true ); // Background du label
				label1.setBackground( Color.GRAY ); // couleur du background du label
				label1.setForeground( Color.BLACK ); // couleur du texte
		
				Box box = Box.createHorizontalBox();  // Creation de la box
				box.add(label1); // Ajout du texte sur la case
				panel.add(box); // Ajout des case sur la grille

               

			}
        
         

	}

    /// Methode qui est censé faire "pousser" la grille vers la droite
	public void actionPerformed(ActionEvent e){

                


				Component rigidareaW = Box.createRigidArea(new Dimension(500,100));// "Mur invisible" Situé au OUEST
                
				//panel_menu.add(rigidareaW, BorderLayout.WEST); // Ajout des "Mur Invisible" OUESt

			if(compteur==0){
                
             	  

				JButton bgen = new JButton("Generation");
        		panel_menu.add(bgen);
        		panel_menu.add(Box.createRigidArea(new Dimension(0,15)));
        		//bgen.setBounds(8,50,100,100);         		
        		//bgen.setVisible(true);

        		JButton bclean = new JButton("Clean");
        		panel_menu.add(bclean);
        		panel_menu.add(Box.createRigidArea(new Dimension(0,15)));
        		bclean.setBounds(8,100,100,100);        		
        		//bclean.setVisible(true);

                JButton bclose = new JButton("Close");
        		panel_menu.add(bclose);
        		bclose.setBounds(8,150,100,100);
        		//bclose.setVisible(true); 
    



        		
        		//panel_menu.setVisible(true);
                
                panel_supp.add(panel_menu,FlowLayout.LEFT);        	
        	

        		bgen.setVisible(true);
        		bclean.setVisible(true);
        		bclose.setVisible(true);
        		panel_menu.setVisible(true);

                
			        	

        	
        	

        		bclose.addActionListener(new ActionListener()
        		{     		
        		
        		
        		public void actionPerformed(ActionEvent event)
        		{
        			panel_menu.setVisible(false);
        			bgen.setVisible(false);
        			bclean.setVisible(false);
        			bclose.setVisible(false);

                 //   frame.add(rigidareaW,BorderLayout.WEST);

                   
                  



        			compteur=0;
        		}
        	});

        	
     		compteur=1;
        	}


        		





		}

}


// Pour le menu:
    // pour fermer le menu
    // Boutton:generation
    //bouton: clean (mise a zero de la grille)
    // 


// MVC
//Modele = la grille, nb de robots, mur
//Vue = les graphic (les details)
//Controlleur = la gestion , rajouter des murs, robots... et lancer le jeu
