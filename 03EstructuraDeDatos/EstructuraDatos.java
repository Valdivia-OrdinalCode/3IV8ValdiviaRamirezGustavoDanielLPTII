
/**
 * Vamos a crear un programa que se encargue de realizar las siguientes operaciones
 * 
 * 1.- Bono o descuento por la edad
 * 2.- Convertir numeros decimales a binarios
 * 3.- Convertir temperaturas celcius, kelvine y rankie
 * 4.- Numero de positivos y negativos deacuerdo a una lista de numeros
 * 5.- Tienda peke
 * 6.- Area y perimetro de figuritas
 * 7.- Tabla
 * 8.- Factorial
 * 9.- Dibujito
 * 10.- Figuras  huecas de codigo
 * 11.- Patrones
 * 12.- Diamante (no llega en lol)
 * 13.- Calculadora
 * 14.- Salir
 */

import java.util.Scanner;

public class EstructuraDatos {
    // Programa 1
    public static void main(String[] args) {
        // declaro mi objeto
        Scanner entrada = new Scanner(System.in);

        // variables
        int edad, opcion, socio, numbinario, total, numerototal, n, a, b;
        int positivos = 0;
        int negativos = 0;
        double precio, bono;
        char letras, operacion;
        float precios = 0;
        float resultado = 0;
        int cantidad = 0;
        String binario = "";

        // vamoa a crear un bucle para que se repita el programa
        do {
            // Vamops a crear nuestro menu
            System.out.println("Bienvenido a la tareita que tenian que hacer wiiiii n_n/");
            System.out.println("Por favor elija la opcion deseada: ");
            System.out.println("1..- Descuento por edad");
            System.out.println("2.- Convertir numero decimal a binario");
            System.out.println("3.- Conversiones de temperatura");
            System.out.println("4.- Numero positivos y negativos");
            System.out.println("5.- La tiendita");
            System.out.println("6.- Area y Perimetro");
            System.out.println("7.- Tabla");
            System.out.println("8.- Factorial");
            System.out.println("9.- Dibujitos");
            System.out.println("10.- Figura hueca");
            System.out.println("11.- Patrones ");
            System.out.println("12.- Diamante");
            System.out.println("13.- Calculadora");
            System.out.println("14.- SALIR");

            opcion = entrada.nextInt();

            // nuestro switch
            switch (opcion) {
                case 1: // Ahi lo hacen
                    break;
                case 2:
                    System.out.println("Ingrese el numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    binario = "";

                    /* Tengo que comprobar que sea un entero positivo */
                    if (numbinario > 0) {
                        // Debo de aplicar el algoritmo
                        while (numbinario > 0) {
                            if (numbinario % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" + binario;
                            }
                            numbinario = (int) numbinario / 2; // Casteo de la variable
                        }
                    } else if (numbinario == 0) {
                        binario = "0";
                    } else {
                        binario = "\n No se pudo convertir el numero, ingrese solo positivos uwu";
                    }
                    System.out.println("El numero binario es: " + binario);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    // vamo a ver un for uwu
                    for (n = 1; n <= 10; n++) {
                        System.out.println(n + "  " + (n * 10) + "  " + (n * 100) + "  " + (n * 1000));
                    }
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println(
                            "Cuadrado MAgico, asi bien kawaii :3 bien hueco como tu kokoro despues de el/ella");
                    System.out.println("Inserta el numero de unidades entre el 1 y 20");
                    n = entrada.nextInt();
                    // linea superior
                    if (n >= 1 && n <= 20) {
                        for (int i = 0; i < n; i++) {
                            System.out.print(" * ");

                        }
                        System.out.println("");
                        // cuadrado interno
                        for (int j = 0; j < n - 2; j++) {
                            // fila
                            System.out.print(" * ");
                            for (int k = 0; k < n - 2; k++) {
                                // columna
                                System.out.print("   ");
                            }
                            System.out.println(" * ");
                        }
                        for (int i = 0; i < n; i++) {
                            System.out.print(" * ");

                        }
                        System.out.println("");

                    } else {
                        System.out.println("Error, solo entre 1 y 20, llegale");
                    }
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    // calculadora
                    System.out.println("Bienvenid@ a la calculadora maizsoro");
                    System.out.println("Ingresa el primer numero:");
                    a = entrada.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    b = entrada.nextInt();
                    System.out.println("Ingresa el tipo de operacion (+ - * /)");
                    char ope = entrada.next().charAt(0);
                    switch (ope) {
                        case '+':
                            resultado = a + b;
                            System.out.println("La suma es: " + resultado);
                            break;
                        case '-':
                            resultado = a - b;
                            System.out.println("La resta es: " + resultado);
                            break;
                        case '*':
                            resultado = a * b;
                            System.out.println("La multiplicacion es: " + resultado);
                            break;
                        case '/':
                            if (b != 0) {
                                resultado = a / b;
                                System.out.println("La division es: " + resultado);
                            } else {
                                System.out.println(
                                        "El señor de sistema web con php y bd distribuidora lo va a resolver y comprobar por que dijo que daba igual");
                            }
                            break;
                        default:
                            System.out.println("Operador no admitida solo sabemos + - * / unu");
                            break;
                    }

                    break;
                case 14:
                    break;
                    default:
                        System.out.println("Valor no valido T_T");

            }

            // Debo preguntar
            System.out.println("¿Deseas repetir el programa? Si lo desea escriba s");
            letras = entrada.next().charAt(0);

        } while (letras == 's' || letras == 'S');

    }

}
