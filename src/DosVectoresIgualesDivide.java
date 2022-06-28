public class DosVectoresIgualesDivide {

    public static int elementoDistintoAux (int[] vector1, int [] vector2, int i0, int in){

        if(i0==in){
            if(vector1[i0]==vector2[i0])
                return -1;
            else return i0;
        }
        else{
            int k= (i0+in)/2;

            //-4 2 0 1 1 2 3 4 -9
            //-4 2 0 5 6 9 9 4 4
            if(vector1[k]==vector2[k])
                return elementoDistintoAux(vector1,vector2, k+1, in);
            else return elementoDistintoAux(vector1,vector2, i0, k);

            }
        }




    public static int elementoDistinto(int[] vector1, int [] vector2) {
        return elementoDistintoAux(vector1,vector2,0,vector1.length-1);
    }



    public static void main(String[] args) {

        int[] vector1 = {-4, -2, 0,1,1,2,3,4,-9};
        int[] vector2 = {-4, -2, 0,1,1,2, 7, 10,-6};

        int elemento = elementoDistinto(vector1,vector2);

        System.out.println("Mi elemento es: " + elemento );


    }

}
