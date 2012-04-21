/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package StrategyAndDecorator;

/**
 *
 * @author diegotxr
 */
public class Espada implements IArma{

    int dano;

    public Espada(){
        this.dano = 10;
    }

    public int getDano(){
        return dano;
    }

    public void Ataque(Guerreiro g){
        g.energia-= getDano();
        System.out.println("Ataque com espada em: ");

    }
}
