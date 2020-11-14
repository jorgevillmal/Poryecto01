package menu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
public class Mercancia extends AdaptadorMercancia{
    private String nombre;
    private String tipo;
    private double precio;
    private String color;
    private String material;
    
    public Mercancia(String nombre, String tipo, double precio, String color, String material){
   
        this.nombre = nombre;
        this.material = material;
        this.color = color;
        this.tipo = tipo;
        this.precio = precio;
        
    }
    
    @Override
    public void print(){
        
        System.out.println(" " + getNombre());
        System.out.println(", " + getTipo());
        System.out.println(", " + getColor());
        System.out.println(", " + getTipo());
        System.out.println(", " + getMaterial());
        System.out.println("   -- " + getprecio());
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public double getprecio() {
        return precio;
    }
    public String getColor() {
        return color;
    }

    public String getMaterial(){
        return material;
    }

    
    
}
