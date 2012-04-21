/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package StrategyAndDecorator;

/**
 *
 * @author GilmarJr
 */
public class Faca implements IArma{

    int dano;

    public Faca(){
        this.dano = 5;
    }

    public int getDano(){
        return dano;
    }

    public void Ataque(Guerreiro g){

        g.energia-=getDano();
        System.out.println("Ataque com faca em: ");

    }

}
