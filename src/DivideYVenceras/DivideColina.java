package DivideYVenceras;

public class DivideColina {

    public static  int maxArrayColinaAux(int[] vector, int i0, int in){
        if(i0==in)
            return vector[0];
        else if(in==i0+1)
            return Math.max(vector[i0], vector[in]);

        else{
            int k= (i0+in)/2;

            if(vector[k]<vector[k-1])
                return maxArrayColinaAux(vector, i0, k);
            else if(vector[k]>vector[k+1] && vector[k]>vector[k-1])
                 return  vector[k];
            else
                return maxArrayColinaAux(vector, k+1, in);
        }

    }

    public static int maxArrayColina(int[] vector){
        return maxArrayColinaAux(vector, 0, vector.length-1);
    }

    public static void main(String[] args) {

        int[] vector = {0,2, 3,4,7, 10, -7, -14 };
        //int[] vector = {4, 12};

        int colina = maxArrayColina(vector);

        System.out.println("Mi colina es: " + colina );


    }

    //T(N/2)+ O(1) = log base 2 de 1 = 0= a; Segundo caso:  O(N^log2(1)*ln(n)), como N^log2(1) es 1, 1*ln(n) es => ln(n)

}
