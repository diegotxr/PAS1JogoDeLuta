/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyAndDecorator;

/**
 *
 * @author diegotxr and GilmarJr
 */

public class Main {

    public static void main(String[] args) {

        Guerreiro g1 = new Guerreiro("Diêgo", 100);
        Guerreiro g2 = new Guerreiro("Gilmar", 100);

        IArma faca = new Faca();
        IArma espada = new Espada();
        IArma lança = new Lança();

        IArmadura couro = new ArmaduraDeCouro();
        IArmadura metal = new ArmaduraDeMetal();
        IArmadura completa = new ArmaduraCompleta();

        Faca f = new Faca();
        Espada e = new Espada();
        Lança l = new Lança();


        g1.setArma(faca);
        g1.setAtaque(g2);
        System.out.println(g2.nome + "\nDano = " + f.dano + "\nEnergia restante = " + g2.energia + "\n\n");

        g2.setArma(lança);
        g1.setArmadura(completa);
        g1.setDefende(g1);
        g2.setAtaque(g1);
        System.out.println(g1.nome + "\nDano = " + l.dano + "\nEnergia restante = " + g1.energia + "\n\n");

        g1.setArma(espada);
        g2.setArmadura(couro);
        g2.setDefende(g2);
        g1.setAtaque(g2);
        System.out.println(g2.nome + "\nDano = " + e.dano + "\nEnergia Restante = " + g2.energia);

    }
}
