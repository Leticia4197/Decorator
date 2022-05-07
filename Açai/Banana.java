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
public class Banana extends BaseDecorator {
    
    public Banana(Adicional ad) {
        super(ad);
    }
    @Override
    public String getDescricao(){
        return super.getDescricao()+ " Banana ";
    }
    @Override
    public double custo(){
        return super.custo() + 1.50;
    }
    
}