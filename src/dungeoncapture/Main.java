/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dungeoncapture;

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

/**
 *
 * @author thyme
 */


public class Main {
    
    // Permet de ne pas copier coller 5 fois le meme code utile a la ligne 70 pour archer ...
    public static boolean confirmerClasse(Scanner saisie, Classe choisie) { 
        System.out.println("Voulez-vous choisir " + choisie.getNom() + " ?\n"
                + "Stats : " + choisie.toString() + "\n"
                + "----------------------\n"
                + "1 : oui\n"
                + "2 : non\n"
                + "----------------------");

        int choix = Integer.parseInt(saisie.nextLine());
        // Avec la reponse et l'accord selection de la bonne classe
        if (choix == 1) {
            System.out.println("Vous avez choisis : "+ choisie.getNom());
            return true;  // utilisateur confirme
        } else {
            System.out.println("Choisissez une autre classe\n");
            return false; // utilisateur refuse
        }
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Definition des variables
        Boolean bonneclasse = false;
        Boolean enVie = true;
        Boolean enjeu = true;
        Scanner saisie = new Scanner(System.in);
        int pv = 0;
        int energie = 0;        
        Classe classeChoisie = null;
        String pseudo = null;
        Personnage unPersonnage = null;

        
            // 1er menu 
            System.out.println("Bienvenue dans Dongeon Capture\n"
                    + "1 : Nouvelle partie\n"
                    + "2 : Continuer\n"
                    + "3 : Quitter\n"
                    + "------------------------------");
            int var1 = saisie.nextInt();
            saisie.nextLine();
            
            while(enjeu == true){
                // Noyau centrale du jeu
                switch (var1){
                    case 1:
                        System.out.println("Quelle est votre pseudo ?");
                        pseudo = saisie.nextLine();
                        System.out.println("----------------------");
                            while(!bonneclasse){
                                // Choix de la classe
                                System.out.println("Quelle est votre classe ?\n"
                                        + "1 : Archer\n"+"2 : Chevalier\n"+"3 : Assassin\n"+"4 : Mage\n"+"5 : Sorcier");
                                int var2 = Integer.parseInt(saisie.nextLine());
                                System.out.println("----------------------");

                                switch (var2) {
                                    case 1:
                                        Classe Archer = new Classe("Archer","Description",1,2,2,20);
                                        bonneclasse = confirmerClasse(saisie,Archer);
                                        if (bonneclasse) classeChoisie = Archer;
                                        pv = 20; energie = 20;
                                        break;
                                    case 2:
                                        Classe Chevalier = new Classe("Chevalier","Description",2,1,1,40);
                                        bonneclasse = confirmerClasse(saisie,Chevalier);
                                        if (bonneclasse) classeChoisie = Chevalier;
                                        pv = 40; energie = 30;
                                        break;
                                    case 3:
                                        Classe Assassin = new Classe("Assassin","Description",3,1,3,10);
                                        bonneclasse = confirmerClasse(saisie,Assassin);
                                        if (bonneclasse) classeChoisie = Assassin;
                                        pv = 10; energie = 40;
                                        break;
                                    case 4:
                                        Classe Mage = new Classe("Mage","Description",4,3,2,10);
                                        bonneclasse = confirmerClasse(saisie,Mage);
                                        if (bonneclasse) classeChoisie = Mage;
                                        pv = 20; energie = 40;
                                        break;
                                    case 5:
                                        Classe Sorcier = new Classe("Sorcier","Description",5,4,2,0);
                                        bonneclasse = confirmerClasse(saisie,Sorcier);
                                        if (bonneclasse) classeChoisie = Sorcier;
                                        pv = 30; energie = 50;
                                        break;

                                    default:
                                        throw new AssertionError();
                                }
                                    // A la fin des choix creation du personnage
                                    System.out.println("\n----------------------\n"
                                            + "Resumé du personnage :\n");
                                    unPersonnage = new Personnage(pseudo,pv,energie,classeChoisie,1,0);  
                                    System.out.println(unPersonnage.toString());
                                    
                            }
                        break;
                    case 2 :
                        System.out.println("C'est le menu continuer");
                        break;
                        
                    // Choix quitter le jeu
                    case 3:
                        System.out.println("Aurevoir");
                        enjeu = false;
                        break;
                    default:
                        throw new AssertionError();
                }
                // Debut du jeu
                while(enjeu == true){
                    int nbrR = new Random().nextInt(10-1+1);
                    System.out.println("Que voulez vous faire ?\n"
                            + "1 : Combattre\n"
                            + "2 : fuir\n"
                            + "3 : Quitter\n"
                            + "----------------------");
                    int choix = saisie.nextInt();
                    saisie.nextLine();
                    int nbpv = unPersonnage.getPv();
                    switch(choix){
                        case 1:
                            System.out.println("Votre nombre de PV : "+nbpv);
                            System.out.println("Debut du combat");
                            System.out.println("Vous perdez "+ nbrR +" PV");
                            System.out.println("Votre nombre de PV : "+unPersonnage.setPv(nbpv-nbrR));
                            
                            break;
                        case 2: 
                            if (nbrR >=8){
                                System.out.println("Vous avez reussis a fuir");
                                enjeu = false;
                                
                            }
                            else{
                                nbrR = new Random().nextInt(10-1+1);
                                System.out.println("Vous n'avez pas fuit");
                                System.out.println("Vous perdez "+ nbrR +" PV");
                                System.out.println("Votre nombre de PV : "+unPersonnage.setPv(nbpv-nbrR));
                                
                            }
                            break; 

                            
                        case 3:
                            enjeu = false;
                            break;
                    }
                    if (unPersonnage.getPv() <= 1){
                        enVie = false;
                        enjeu = false;
                        System.out.println("Vous etes mort");
                        }
                    else{
                        System.out.println("nbrR : "+nbrR);
                    }
                }                
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }  
}
