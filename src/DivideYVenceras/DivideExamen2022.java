package DivideYVenceras;

public class DivideExamen2022 {

    public static int checkParesAux(int[] v, int i0, int in){
        if(i0==in)
            return i0;
        else{
            int k=(i0+in)/2;


            if((v[k]-k)%2==0)
                return checkParesAux(v, k+1, in);
            else return checkParesAux(v, i0, k);


            /*
            if (esPar(v[k]) && esPar(k) || !esPar(v[k]) && !esPar(k))
                return checkParesAux(v, k+1, in);
            else
                return checkParesAux(v, i0, k);


             */


        }

    }

    public static boolean esPar(int n)
    {
        return n%2 == 0;
    }
    public static int checkPares(int[] v){
        return checkParesAux(v, 0, v.length-1);
    }
    public static void main(String[] args) {

        int[] vector = {2, 3,4,5,6,9,12,13,21};


        int posicion = checkPares(vector);

        System.out.println("Mi posicion es: " + posicion );


    }

}
