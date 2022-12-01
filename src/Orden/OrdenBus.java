package Orden;

import packColas.ColaCir;

public class OrdenBus {

    public void burbuja(int a[]) {
        for (int j = 1; j < a.length; j++) {
            for (int i = 0; i < a.length - j; i++) {
                if (a[i] < a[i + 1]) {
                    int aux = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = aux;
                }
            }
        }
    }

    public void quickS(int a[], int inicio, int fin) {
        int c = (inicio + fin) / 2;
        int piv = a[c];
        int i = inicio;
        int j = fin;
        do {
            while (a[i] < piv) {
                i++;
            }
            while (a[j] > piv) {
                j--;
            }

            if (i <= j) {
                int aux = a[i];
                a[i] = a[j];
                a[j] = aux;
                i++;
                j--;
            }//Inicio a j es la izquierda
        } while (i <= j);//i a fin es la derecha
        if (inicio < j) {
            quickS(a, inicio, j);
        }
        if (i < fin) {
            quickS(a, i, fin);
        }

    }
    public void radix(ColaCir a, int t){
        ColaCir cola[]=new ColaCir[10];
        for (int i = 0; i < cola.length-1; i++) {
            cola[i]=new ColaCir(t);
        }
        while(!a.empty()){
            int aux=(int)a.remove();
            int resul=aux/10;
            if (resul==0) {
                cola[0].insert(aux);
            }
        }
    }
    public void desplegar(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (i != 0) {
                System.out.print("|");
            }
            System.out.print(a[i]);
        }
        System.out.println("");
    }

}
