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
public class BaseDecorator implements Adicional{
    
    Adicional wrappee;

    BaseDecorator (Adicional ad){
      this.wrappee = ad ;
    }
    @Override
    public String getDescricao(){
        return wrappee.getDescricao()  ;
    }
    @Override
    public double custo() {
        return wrappee.custo() ;
    }
 
}