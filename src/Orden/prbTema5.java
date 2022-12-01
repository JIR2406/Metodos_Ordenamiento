package Orden;

import java.util.Scanner;

public class prbTema5 {

    public static void main(String[] args) {
        OrdenBus ord = new OrdenBus();
        Scanner s = new Scanner(System.in);
        int i;
        int a[] = null;
        int op;

        do {
            System.out.println("Menu");
            System.out.println("1.- Determinar tamaño Arreglo");
            System.out.println("2.- Llenar arreglo");
            System.out.println("3.- Metodo ordenamiento Burbuja");
            System.out.println("4.- Metodo ordenamiento QuickSquirt");
            System.out.println("5.- Metodo ordenamiento Radix");
            System.out.println("6- Desplegar arreglo");
            System.out.println("0.- Salir");
            op = s.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Ingresar tamaño:");
                    i = s.nextInt();
                    a = new int[i];
                    break;
                }
                case 2: {
                    for (int j = 0; j < a.length; j++) {
                        a[j] = getRandom(5, 100);
                    }
                    break;
                }
                case 3: {
                    ord.burbuja(a);
                    break;
                }
                case 4: {
                    ord.quickS(a, 0, a.length - 1);
                    break;
                }
                case 5: {
                    ord.radix();
                }
                case 6: {
                    ord.desplegar(a);
                    break;
                }
                case 0: {
                    System.out.println("Cerrando programa... .. . ");
                    break;
                }
                default:
                    System.out.println("Ingresa un valor valido");
            }
        } while (op != 0);

    }

    public static int getRandom(int ini, int fin) {
        return (int) (Math.random() * ((fin + 1) - ini)) + 1;
    }
}
