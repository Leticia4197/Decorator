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
public class LeiteCondensado extends BaseDecorator {
    
    public LeiteCondensado(Adicional ad) {
        super(ad);
    }
     @Override
    public String getDescricao(){
        return super.getDescricao()+" Leite Condensado ";
    }
    @Override
    public double custo(){
        return super.custo() + 2.50;
    }
    
}
