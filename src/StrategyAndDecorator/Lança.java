/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyAndDecorator;

/**
 *
 * @author GilmarJr
 */
public class Lança implements IArma {

    int dano;

    public Lança(){
        this.dano = 20;
    }

    public int getDano(){
        return dano;
    }

    public void Ataque(Guerreiro g) {

        g.energia-=getDano();
        System.out.println("Ataque com lança em: ");

    }



}
