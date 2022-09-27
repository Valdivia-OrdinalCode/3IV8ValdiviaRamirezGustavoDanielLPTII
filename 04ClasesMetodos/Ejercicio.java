import java.util.Scanner;

public class Ejercicio {

    /*
     * Vamos a hacer un programa mediante el cual vamos a tener 4 opciones que son
     * 1 Otra calculadora
     * 2 Conversion de unidades
     * 3 Creacion de un cuadrito magico
     * 4 Movimiento de un cuadro
     */

    // objetos
    Scanner entrada = new Scanner(System.in);

    // metodos o comportamientos de la clase
    // vamos a crear un metodo para el menu
    /*
     * public: es el acceso a el tipo de dato, clase o metodo cualquier elemento del
     * programa puede acceder a el.
     * private: es de acceso restringido solo mediante reglas se puede acceder a el.
     * protected: se puede tener acceso solo desde la misma clase y aplicando la
     * erencia de POO entre los hijos y padres
     * 
     * Un metodo tambien es un tipo de dato aplicado
     */
    // la variable puede ser global
    char op;

    public void menu(/* Aquí van los parametrso */ ) {
        System.out.println("Bienvenid@ a los metodos");
        System.out.println("Elije una de las siguientes opciones");
        System.out.println("a. Calculadora");
        System.out.println("b. Conversion de unidades");
        System.out.println("c. Creacion de cuadros");
        System.out.println("d. Movimiento de un cuadro");
        op = entrada.next().charAt(0);

        switch (op) {
            case 'a':
                // vamos a hacer un metodo
                Ejercicio1();
                break;
            case 'b':
                // vamos a hacer un metodo
                Ejercicio2();
                break;
            case 'c':
                // vamos a hacer un metodo
                Ejercicio3();
                break;
            case 'd':
                // vamos a hacer un metodo
                Ejercicio4();
                break;
            default:
                System.out.println("Gracias por estar aqui, pero hay que mimir n_n/ opcion no valida");
        }
    }

    // metodo 1
    public void Ejercicio1() {
        System.out.println("Ayuda soy un niño explotado de Shein");
    }

    // metodo 2
    public void Ejercicio2() {

    }

    // metodo 3
    public void Ejercicio3() {

    }

    // metodo 4
    public void Ejercicio4() {

    }

}
