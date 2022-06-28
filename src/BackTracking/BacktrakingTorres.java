package BackTracking;

public class BacktrakingTorres {

    public static void repartirAux(int[] lingotes /*int[] cantidades*/, int cantP, int cantM, int nivel, Booleano exito, int cantidad){

        if(nivel== lingotes.length)
            if(cantP==cantM)
                exito.setValor(true);
        else{
            int c=0;

            while (c<2 && !exito.getValor()){



                if(c==0 && lingotes[nivel]<cantM){
                    //if(cantM + lingotes[nivel]<cantidad)
                        cantM += lingotes[nivel];
                    //else cantP += lingotes[nivel];
                }
                else {

                    //if(cantP + lingotes[nivel]<cantidad)
                        cantP += lingotes[nivel];
                    //else cantM += lingotes[nivel];
                }



                /*
                if(cantidades[c]+ lingotes[nivel] < cantidad)
                    cantidades[c] += lingotes[nivel];
                else if((cantidades[(c+1)%2]+ lingotes[nivel] < cantidad))
                    cantidades[(c+1)%2] += lingotes[nivel];

                 */


                nivel++;
                repartirAux(lingotes, /*cantidades,*/ cantP, cantM, nivel, exito, cantidad);
                if(!exito.getValor()){
                    nivel --;
                    /*
                    if(cantidades[c]+ lingotes[nivel] < cantidad)
                        cantidades[c] -= lingotes[nivel];
                    else if((cantidades[(c+1)%2]+ lingotes[nivel] < cantidad))
                        cantidades[(c+1)%2] -= lingotes[nivel];

                     */

                    if(c==0 && lingotes[nivel]<cantM){
                        //if(cantM + lingotes[nivel]<cantidad)
                            cantM -= lingotes[nivel];
                        //else cantP -= lingotes[nivel];
                    }
                    else {

                        //if(cantP + lingotes[nivel]<cantidad)
                            cantP -= lingotes[nivel];
                        //else cantM -= lingotes[nivel];
                    }


                }
                c++;
            }
        }

        System.out.println("cantidad P: " +cantP);
        System.out.println("cantidad M: " +cantM);
        System.out.println(" ");

        //return cantP==cantM;

    }

    public static Booleano repartir(int[] v) {


        int cantP =0;
        int cantM =0;


        /*
         int cantidades[]= new int[2];
         cantidades[0]=0;
        cantidades[1]=0;

         */

        int nivel=0;
        Booleano exito = new Booleano(false);

        int cantidad = 0;

        for (int i = 0; i < v.length; i++) {

            cantidad += v[i];
        }

        if(cantidad%2==0 ) {
            cantP=cantM= cantidad/2;
            repartirAux(v, /* cantidades*/ cantP, cantM, nivel, exito, cantidad / 2);
            return exito;
        }
        else return exito;



    }

    public static void main(String[] args) {

        int[] vector = {4, 7, 4, 6, 1, 5, 7};



        System.out.println(repartir(vector).getValor());


    }
}
