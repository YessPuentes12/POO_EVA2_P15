/*

 */
package Productos;

import SuperClases.Electronica;


public class Computadora extends Electronica{

    private double tama;
    private int memoria;
    private String procesador;
    private String disco;

    public double getTama() {
        return tama;
    }

    public void setTama(double tama) {
        this.tama = tama;
    }
//------------------------------------------------------------------------------
    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
//------------------------------------------------------------------------------
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
//------------------------------------------------------------------------------
    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

//------------------------------------------------------------------------------

    public Computadora(double tama, int memoria, String procesador, String disco, String fabricante, String modelo, int garantía, double precio, String nombre, String unidad) {
        super(fabricante, modelo, garantía, precio, nombre, unidad);
        this.tama = tama;
        this.memoria = memoria;
        this.procesador = procesador;
        this.disco = disco;
    }
    
//------------------------------------------------------------------------------
    public Computadora() {
        super();
        this.tama = 0;
        this.memoria = 0;
        this.procesador = "---";
        this.disco = "---";
    }
    
 //------------------------------------------------------------------------------   
    
    
    @Override
    public double precioVenta(int cant) {
      if(cant<10){
         return getPrecio()*cant;
     }else{
          return (getPrecio()*0.8)*cant;
        }
    }
    

    
    
    
    









    
}
