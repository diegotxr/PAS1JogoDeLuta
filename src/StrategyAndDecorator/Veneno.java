/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyAndDecorator;

/**
 *
 * @author diegotxr
 */
public class Veneno extends Decorator {

    int dano = 3;

    public Veneno(IArma references) {
        super(references);
    }
}
