/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author George
 */
public class AdaptadorMercancia extends MenuItem {
    private Mercancia mercancia;
    
     public AdaptadorMercancia() {
        mercancia = null;
    }
    
    public AdaptadorMercancia(Mercancia mercancia) {
        
        super(mercancia.getName(), mercancia.getDescription(),mercancia.getPrice());
        
        this.mercancia = mercancia;
    }
    
    
}
