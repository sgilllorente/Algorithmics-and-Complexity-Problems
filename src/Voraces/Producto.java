package Voraces;

public class Producto {
    private int nombre;
    private int peso;

    Producto(int nombre, int peso){
        this.nombre = nombre;
        this.peso = peso;
    }

    public int getPeso(){
        return this.peso;
    }
}
