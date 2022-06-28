import java.lang.constant.Constable;
import java.util.ArrayList;

public class Voraces4  {

    public static boolean hayDivision(int[] valores){

        int[]suma={0,0};
        int[]contadores = {0,0};



        ArrayList<Integer>  lista = new ArrayList<>();

        for(int i=0; i< valores.length; i++)
            lista.add(valores[i]);

        if(lista.size()%2!=0){
            return false;
        }
        else{
            int candidato=0;

            while(!lista.isEmpty()){
                candidato = seleccionarCandidato(lista);
                //Integer c = Integer.valueOf(candidato);
                lista.remove(Integer.valueOf(candidato));
                if(suma[0]<=suma[1]) {
                    suma[0] += candidato;
                    contadores[0] += 1;
                }
                else {
                    suma[1] += candidato;
                    contadores[1] +=1;
                }
            }
        }

        return ((suma[0]==suma[1])&& (contadores[0]==contadores[1]));

    }


    public static int seleccionarCandidato(ArrayList<Integer> lista){
        int max=0;
        for(int i=0; i<lista.size();i++ )
            if(max<lista.get(i))
                max= lista.get(i);
        return max;
    }

    public static void main(String[] args) {

        int[] listaProductos = {5, 8, 7, 1, 3, 3};

        System.out.println(hayDivision(listaProductos));


    }

}
