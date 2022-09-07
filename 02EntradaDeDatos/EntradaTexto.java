//esto es un comentario

/**
 * Todo programa en java de de tener el nombre de la clase tal cual como el
 * archivo
 */

class EntradaTexto {
    // los limites de la clase

    // toda clase debe de tener un metodo principal
    /**
     * vamos a realizar un programa mediante el cual podamos introducir texto a
     * nuestra conveniencia
     */

    // metodo principal
    public static void main(String[] args) {
        // tipo de dato (varible)
        String nombre;
        // es el fin de linea
        // instancia
        System.out.println("Por favor introduce tu nombre asi bien kawaii");

        // vamos a obtener el nombre del usuario

        nombre = System.console().readLine();

        System.out.println("Hola " + nombre + " bienvenido a tu programita");

    }
}