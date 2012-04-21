/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyAndDecorator;

/**
 *
 * @author diegotxr and GilmarJr
 */
public class Guerreiro {

    public String nome;
    public int energia;
    public IArma arma;
    public IArmadura armadura;


    public Guerreiro(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
        this.arma = null;
        this.armadura = null;
        
    }

    

  /*  public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Arma getArma() {
        return this.arma;
    }
    */
    public void setArma(IArma arma) {
        this.arma = arma;
    }

    public void setArmadura(IArmadura armadura){
        this.armadura = armadura;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }


    public void setAtaque(Guerreiro g){
        arma.Ataque(g);
    }

    public void setDefende(Guerreiro g){
        armadura.Defende(g);
    }

}

   

