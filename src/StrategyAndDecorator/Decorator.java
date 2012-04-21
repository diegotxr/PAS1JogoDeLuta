/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyAndDecorator;

/**
 *
 * @author GilmarJr and diegotxr
 */
public class Decorator implements IArma {

    IArma references = null;

    public Decorator(IArma references) {
        this.references = references;

    }


    @Override
    public void Ataque(Guerreiro g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
