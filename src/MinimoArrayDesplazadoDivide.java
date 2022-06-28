public class MinimoArrayDesplazadoDivide {

    public static  int minArrayRotadoAux(int[] vector, int i0, int iN) {
        if (i0 == iN)
            return vector[i0];
        else {
            int k = (i0 + iN) / 2; //k=4

            //int[] vector = {32,2,3,4,7,10,15,23};
                             //10 15 23 32 2 3 4 7
                            //15 23 32 2 3 4 7 10

            if(vector[0]>vector[iN] && vector[k]>vector[iN]){
                if(vector[k]<k)
                    return minArrayRotadoAux(vector, k , iN);
                else
                    return minArrayRotadoAux(vector, i0, k-1);
            }
            else
                return vector[0];

             //1,1,5,5,5,5
            //int[] vector = {5,5,5,5 ,1,1,1};


            //int[] vector = {32,2,3,4,7,10,15,23};
            //10 15 23 32 2 3 4 7
            //15 23 32 2 3 4 7 10
            //23 32 2 3 4 7 10 15
            //10
            /*
            if ((vector[i0] <= vector[k]) && (vector[k] < vector[iN]))
                return vector[i0];
            else if (vector[i0] > vector[k])
                return minArrayRotadoAux(vector, i0, k);
            return minArrayRotadoAux(vector, k + 1, iN);

             */




        }


    }

    public static int minArrayRotado(int[] vector){
        return minArrayRotadoAux(vector, 0, vector.length - 1);

    }

    public static void main(String[] args) {

        // int[] vector = {10, 15, 23, 32, 1, 2, 3, 4, 7};
        int[] vector = {32,2,3,4,7,10,15,23};
        //int[] vector = {1,1,1,5,5,5,5};

        //int[] vector = {4, 12};

        int minimo = minArrayRotado(vector);

        System.out.println("Mi minimo es: " + minimo );


    }
}
