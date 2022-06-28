public class Divide {



    private static int sumaPositivosAux(int[]vector, int i0, int in){
        if(i0==in)
            if(i0>0)
                return vector[i0];
            else return 0;
        else{
            int k= (i0+in)/2;

            int x = sumaPositivosAux(vector, i0, k);
            int y = sumaPositivosAux(vector, k+1, in);

            return (x+y);
        }

    }

    public static int sumaPositivos(int[] vector){
        return sumaPositivosAux(vector, 0, vector.length-1);
    }



    public static void main(String[] args) {

        int[] vector = {-1,0,2, 3, 10, 12, -23, -14, -7};

        int suma = sumaPositivos(vector);

        System.out.println("La suma es: " + suma );


    }


}
