package org.example;
public class Tabla {
    Empleado[] T;

    public Tabla(){
        this.T=new Empleado[1000];
    }

    public void insertar(Empleado empleado){
        T[pleg(empleado.id)]=empleado;
    }

    public int pleg(int x ){
        String claveS,primS,ultS;
        int primI,ultI,suma;
        claveS=String.valueOf(x);
        //agarro un sub string que tenga los primeros 3
        primS=claveS.substring(0,3);
        //agarro un substring que agarre los ultimos 3
        ultS=claveS.substring(claveS.length() -3);
        primI=Integer.parseInt(primS);
        ultI=Integer.parseInt(ultS);
        suma=(primI+ultI)%1000;  //le hago mod 1000 para que siempre tome los ultimos 3 en caso de que de +999.
        return suma;
    }

    public void muestra(){
        System.out.println("             -- E M P L E A D O S --");
        for (int i=0;i<T.length;i++){
            if(T[i]!=null)
            {
                System.out.println("El empleado se ubico en la posicion: "+i+ " y su clave era: "+T[i].getId());
            }
        }
    }


}