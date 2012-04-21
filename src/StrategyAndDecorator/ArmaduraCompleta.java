/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package StrategyAndDecorator;

/**
 *
 * @author diegotxr
 */
public class ArmaduraCompleta implements IArmadura{

    int resistencia;

    public ArmaduraCompleta(){
        this.resistencia = 10;
    }

    public int getResistencia(){
        return resistencia;
    }

    public void Defende(Guerreiro g){

        g.energia+=getResistencia();
        System.out.println("Guerreiro adicionou +10 de energia com a Armadura Completa");
    }
}
