/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyAndDecorator;

/**
 *
 * @author diegotxr
 */

public class Fogo extends Decorator {

    int dano = 5;

    public Fogo(IArma references) {
        super(references);

    }
}
