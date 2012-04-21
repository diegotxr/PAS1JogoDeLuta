/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package StrategyAndDecorator;

/**
 *
 * @author diegotxr and GilmarJr
 */
public class ArmaduraDeMetal implements IArmadura{

    int resistencia;

    public ArmaduraDeMetal(){
        this.resistencia = 5;
    }

    public int getResistencia(){
        return resistencia;
    }

    public void Defende(Guerreiro g){

        g.energia+=getResistencia();
        System.out.println("Guerreiro adicionou +5 de energia com a Armadura de Metal");
    }

}
