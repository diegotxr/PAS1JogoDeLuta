/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package StrategyAndDecorator;

/**
 *
 * @author GilmarJr
 */

public class Raio extends Decorator {

    int dano = 10;

    public Raio(IArma references) {
        super(references);
    }
}
