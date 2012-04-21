/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package StrategyAndDecorator;

/**
 *
 * @author GilmarJr
 */
public class ArmaduraDeCouro implements IArmadura{

    int resistencia;

    public ArmaduraDeCouro(){
        this.resistencia = 2;
    }

    public int getResistencia(){
        return resistencia;
    }

    public void Defende(Guerreiro g){

        g.energia+=getResistencia();
        System.out.println("Guerreiro adicionou +2 de energia com a Armadura de Couro");
    }

}
