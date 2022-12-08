package Orden;

import java.util.Scanner;

public class prbTema5 {

    public static void main(String[] args) {
        OrdenBus ord = new OrdenBus();
        Scanner s = new Scanner(System.in);
        int i;
        int a[] = null;
        int op;
        System.out.println("Ingresar tamaño:");
        i = s.nextInt();
        a = new int[i];
        do {

            for (int j = 0; j < a.length; j++) {
                a[j] = getRandom();
            }
            System.out.println("Menu");
            System.out.println("1.- Metodo ordenamiento Burbuja");
            System.out.println("2.- Metodo ordenamiento QuickSquirt");
            System.out.println("3.- Metodo ordenamiento Radix");
            System.out.println("4- Busqueda dato");
            System.out.println("5- Tabla Hash");
            System.out.println("0.- Salir");
            op = s.nextInt();
            s.nextLine();
            switch (op) {
                case 1: {
                    ord.desplegar(a);
                    ord.burbuja(a);
                    ord.desplegar(a);
                    break;
                }
                case 2: {
                    ord.desplegar(a);
                    ord.quickS(a, 0, a.length - 1);
                    ord.desplegar(a);
                    break;
                }
                case 3: {
                    ord.desplegar(a);
                    ord.radix(a, 0);
                    ord.desplegar(a);
                    break;
                }
                case 4: {
                    ord.quickS(a, 0, a.length - 1);
                    ord.desplegar(a);
                    System.out.print("Ingresa el dato a buscar:\t");
                    int dato = s.nextInt();
                    s.nextLine();
                    if (ord.busquedaBin(a, dato) == -1) {
                        System.out.println("Dato no encontrado");
                    } else {
                        System.out.println("La posicion en la que se encuentra es: " + ord.busquedaBin(a, dato));
                    }
                    break;
                }
                case 5: {
                    String cadena = "";
                    do {
                        System.out.print("Ingrese numero control mayor a 8 digitos:\t");
                        cadena = s.nextLine();
                    } while (cadena.length() != 8);
                    System.out.println(ord.plegamiento(cadena));
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

    public static int getRandom() {
        return (int) (Math.random() * ((999 + 1) - 0)) + 1;
    }
}
