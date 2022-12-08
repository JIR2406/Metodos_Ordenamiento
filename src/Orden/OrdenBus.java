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
            }
        } while (i <= j);//i a fin es la derecha
        if (inicio < j) {
            quickS(a, inicio, j);
        }
        if (i < fin) {
            quickS(a, i, fin);
        }

    }

    public void radix(int a[], int conteo) {
        int uni = 0;
        ColaCir cola[] = new ColaCir[10];
        for (int j = 0; j < cola.length; j++) {
            cola[j] = new ColaCir(a.length);
        }
        for (int i = 0; i < a.length; i++) {
            int aux = (int) a[i];
            if (conteo == 0) {
                uni = aux % 10;
            } else if (conteo == 1) {
                uni = (aux % 100 - aux % 10) / 10;
            } else if (conteo == 2) {
                uni = aux / 100;
            }
            cola[uni].insert(aux);
        }
        conteo++;
        System.out.println(conteo + "la Distribucion");
        int x = 0;
        for (int j = 0; j < cola.length; j++) {
            while (!cola[j].empty()) {
                a[x] = (int) cola[j].remove();
                System.out.print("[" + a[x] + "]");
                x++;
            }
        }
        System.out.println("");
        if (conteo != 3) {
            radix(a, conteo);
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

    public int busquedaBin(int a[], int bus) {
        int ini = 0;
        int fin = a.length - 1;
        int c = (ini + fin) / 2;
        do {
            if (a[c] < bus) {
                fin = c - 1;
                c = (ini + fin) / 2;
            } else if (a[c] > bus) {
                ini = c + 1;
                c = (ini + fin) / 2;
            }
            if (ini > a.length - 1 || fin < 0) {
                return -1;
            }
        } while (a[c] != bus);
        return c;
    }

    public int plegamiento(String clave) {
        int a = Integer.parseInt(clave.substring(0, 3));
        int b = Integer.parseInt(clave.substring(3, 6));
        int c = Integer.parseInt(clave.substring(6, 8));
        String claveN=Integer.toString(a+b+c); 
        return Integer.parseInt(claveN.substring(1, 4));
    }

}
