/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Açai;

/**
 *
 * @author 42114150
 */
public class TestaDecorator {

    public static void main(String[] args) {
        
        Adicional Basico = new Açai();
        System.out.println(Basico.getDescricao());
        System.out.println(Basico.custo());
        
        Adicional add = new Morango(Basico);
        System.out.println(add.getDescricao());
        System.out.println(add.custo());
        
        add = new Banana(add);
        add = new LeiteCondensado(add);
        System.out.println(add.getDescricao());
        System.out.println(add.custo());
    }
    
}
