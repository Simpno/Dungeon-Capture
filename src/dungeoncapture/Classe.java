/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeoncapture;

/**
 *
 * @author thyme
 */
public class Classe {

    private String nom;
    private String description;
    
    /*STATS
    Force MAX 100 = nb de degats  
    Intelligence MAX 10 = mutiplicateur d'XP   
    Chance MAX 10 = probabilité de meilleur loots, moins d'ennemi, proba critique ( = 150% de dgt)
    Defence Max 100 = nb de degats protegé
    Stress Max 100 = + haut  = + de debuff
    */
    private int force;
    private int intelligence;
    private int chance;
    private int defence;
    //private int stress;

    public Classe(String nom, String description, int force, int intelligence, int chance, int defence) {
        this.nom = nom;
        this.description = description;
        this.force = force;
        this.intelligence = intelligence;
        this.chance = chance;
        this.defence = defence;
        //this.stress = 1;

    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public int getForce() {
        return force;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getChance() {
        return chance;
    }

    public int getDefence() {
        return defence;
    }

    /*public int getStress() {
        return stress;
    }*/

    public void setForce(int force) {
        this.force = force;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    /*public void setStress(int stress) {
        this.stress = stress;
    }*/

    @Override
    public String toString() {
        return "nom = " + nom + "\n description = " + description + "\n force = " + force + "\n intelligence = " + intelligence + "\n chance = " + chance + "\n defence = " + defence; /*"\n stress = " + stress;*/
    }
    
}
