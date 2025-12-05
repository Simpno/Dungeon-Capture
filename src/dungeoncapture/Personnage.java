/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeoncapture;

/**
 *
 * @author thyme
 */
public class Personnage {
    private String Pseudo;
    private int pv;
    private int energie;
    private Classe classe;
    private int niveau;
    private int nbPrestige;

    public Personnage(String Pseudo, int pv, int energie, Classe classe, int niveau, int nbPrestige) {
        this.Pseudo = Pseudo;
        this.pv = pv;
        this.energie = energie;
        this.classe = classe;
        this.niveau = niveau;
        this.nbPrestige = nbPrestige;
    }

    @Override
    public String toString() {
        return "Personnage{" + "Pseudo=" + Pseudo + ", pv=" + pv + ", energie=" + energie + ", classe=" + classe + ", niveau=" + niveau + ", nbPrestige=" + nbPrestige + '}';
    }

    public int setPv(int pv) {
        this.pv = pv;
        return pv;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setNbPrestige(int nbPrestige) {
        this.nbPrestige = nbPrestige;
    }

    public String getPseudo() {
        return Pseudo;
    }

    public int getPv() {
        return pv;
    }

    public int getEnergie() {
        return energie;
    }

    public Classe getClasse() {
        return classe;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getNbPrestige() {
        return nbPrestige;
    }

    public int pvCombat(int pv){
        pv = pv - 2;
        return pv;
    }
    

    
    
    
    
}
