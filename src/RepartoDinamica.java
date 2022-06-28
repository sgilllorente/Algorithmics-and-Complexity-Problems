public class RepartoDinamica {

    static boolean[][] hayReparto(int[] valores){
        int i=0;
        int j=0;



        int reparto=0;

        for(i=0; i<valores.length; i++)
            reparto+=valores[i];

        boolean mat[][] = new boolean[2][(reparto/2)+1];

        mat[0][0]=true;

        for(i=0, j=1; j<= reparto/2 ; j++){

            /*
            if (j == valores[i]) {
                mat[0][j] = true;
            }
            else mat[0][j] = false;

             */
            mat[i][j]= (valores[0]==j);

        }

        for(i=1; i<valores.length; i++)
            for(j=0; j<=reparto/2; j++){

                if(mat[(i-1)%2][j])
                    mat[i%2][j] = true;

                else if((valores[i] <= j)&&(mat[(i-1)%2][j-valores[i]])) //elese if (valores[i]<=j && mat[j-valores[i]][
                    mat[i%2][j] = true;



                else
                    mat[i%2][j] = false;

            }


        //return mat[(valores.length-1)%2][(reparto/2)] ;// para la "i" como no se si es par o no, entonces no se si mi valor va a estar en i=0; i=1;
        return mat;
    }

    public static void main(String[] args) {

        int[] vector = {4, 5, 6, 7, 8};

        //System.out.println("Mi valor es: "+ hayReparto(vector));
        boolean[][] mangelito = hayReparto(vector);

        for(int i=0; i<2; i++) {
            for (int j = 0; j <= 15; j++) {

                System.out.print(mangelito[i][j] + " ");
            }
            System.out.println("");
        }




    }
}
