package Voraces;

import java.util.ArrayList;
import java.util.Arrays;


public class Voraces1 {

    public static void distribuyeCarga(ArrayList<Producto> productos, ArrayList<Producto> n1, ArrayList<Producto> n2, ArrayList<Producto> n3 ){
        int cantidad_n1=0;
        int cantidad_n2=0;
        int cantidad_n3=0;

        Producto c;

        while (!productos.isEmpty()){
            c= seleccionarCandidato(productos);
            productos.remove(c);

            if(cantidad_n1 < cantidad_n2 ){
                if(cantidad_n1 < cantidad_n3){
                    cantidad_n1 += c.getPeso();
                    n1.add(c);
                }
                else {
                    cantidad_n3 += c.getPeso();
                    n3.add(c);
                }

            }
            else
                if(cantidad_n2 < cantidad_n3){
                    cantidad_n2 += c.getPeso();
                    n2.add(c);
                }
                else {
                    cantidad_n3 += c.getPeso();
                    n3.add(c);
                }
        }
    }

    public static Producto seleccionarCandidato(ArrayList<Producto> list){
        Producto max = list.get(0);
        for(int i=1; i<list.size();i++)
            if(list.get(i).getPeso()>max.getPeso())
                max= list.get(i);

        return max;
    }

    public static void main(String[] args) {

        //8, 7, 6, 3, 2
        ArrayList<Producto> listaProductos = new ArrayList<>() {{
            add(new Producto(3, 3));
            add(new Producto(7, 7));
            add(new Producto(8, 8));
            add(new Producto(2, 2));
            add(new Producto(6, 6));
        }

        } ;

        ArrayList<Producto> n1= new ArrayList<>();
        ArrayList<Producto> n2= new ArrayList<>();
        ArrayList<Producto> n3= new ArrayList<>();


        distribuyeCarga(listaProductos, n1, n2, n3);

        //System.out.println("terminado...");


        System.out.print("Nave 1: ");
        for(Producto producto: n1){
            System.out.print(producto.getPeso()+ " ");
        }
        System.out.println("");
        System.out.print("Nave 2: ");
        for(Producto producto: n2){
            System.out.print(producto.getPeso()+ " ");
        }
        System.out.println("");
        System.out.print("Nave 3: ");
        for(Producto producto: n3){
            System.out.print(producto.getPeso()+ " ");
        }






    }


}
