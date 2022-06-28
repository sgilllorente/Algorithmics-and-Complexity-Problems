package DivideYVenceras;

public class Session4 {

    public static boolean check2posAux(int posi, int[] vector2, int v, int i0, int in){

        //-5 -2 -9 -4 1 5 7 0 -3
        //-2 -1  0  1 1 2 2 4  8


        // 8 -1  2  4 2-2 1 0 1
        if(in==i0)
            return posi+vector2[i0]==v;
        else{
            int k=(i0+in)/2;
            if(posi+vector2[k]>v)
                return check2posAux(posi, vector2, v, i0, k);
            else if(posi+vector2[k]<v)
                return check2posAux(posi, vector2, v, k+1, in);
            else return true;
        }

    }

    public static boolean check2pos(int[] vector1, int[] vector2, int v){
        boolean stop=false, aux=false;
        int i=0;
         //MezclarMergeSort(v2);
        while(!stop){
            aux =  check2posAux(vector1[i], vector2, v, 0, vector2.length-1);
            if(i==vector2.length-1 || aux)
                    stop=true;
            i++;
        }

        return aux;
    }

    public static void main(String[] args) {

        int[] vector1 = {-5, -2,-9,-4,1,5,7,0,-3};
        int[] vector2 = {-2,-1,0,1,1,2,2,4,8};

        boolean elemento = check2pos(vector1,vector2, -11);

        System.out.println("Mi elemento es: " + elemento );


    }
}
