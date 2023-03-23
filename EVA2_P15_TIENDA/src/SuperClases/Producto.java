/*

 */
package SuperClases;


public abstract class Producto {
 
private double precio;    
private String nombre;    
private String unidad;    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
//------------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//------------------------------------------------------------------------------
    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
 //------------------------------------------------------------------------------

    public Producto(double precio, String nombre, String unidad) {
        this.precio = precio;
        this.nombre = nombre;
        this.unidad = unidad;
    }
//------------------------------------------------------------------------------    
    
     public Producto(){
        this.precio = 0;
        this.nombre = "---";
        this.unidad= "---";
    }
//------------------------------------------------------------------------------    
    
     public abstract double precioVenta(int cant);
    
}
    
    
 
    
    
    
    
    
    
    
    

