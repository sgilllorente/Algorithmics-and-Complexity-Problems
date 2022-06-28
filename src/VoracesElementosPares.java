import java.util.ArrayList;

public class VoracesElementosPares {

    public static ArrayList<Integer> numerosPares(int[] vector){
        ArrayList<Integer> solucion = new ArrayList<>();
        //int[] solucion;

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=0; i<vector.length; i++)
            lista.add(vector[i]);

        Integer candidato;
        for(int i =0; i<lista.size();i++)
            System.out.print(lista.get(i));


        while(!lista.isEmpty()){
            candidato = seleccionarCandidato(lista);
            System.out.println("mi candidato: " + candidato);
            lista.remove(candidato);

            if(candidato%2==0)
                solucion.add(candidato);

            //
        }

        return solucion;
    }

    public static Integer seleccionarCandidato(ArrayList<Integer> vector){

        Integer max=0;

        System.out.println(vector.get(0));

        for(int i=0; i<vector.size();i++ ) {
            if (max < vector.get(i)) {

                max = vector.get(i);
            }
        }


        System.out.println("max: "+max);
        return max;




    }

    public static void main(String[] args) {

        //8, 7, 6, 3, 2
        int[] vector = {1, 4, 16, 13, 4, 5};



        ArrayList<Integer> solucion = numerosPares(vector);

        System.out.print("Los pares son: ");
        for(int i =0; i<solucion.size();i++)
            System.out.print(solucion.get(i));





    }







    }
