import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        /********************************* Tipos de variables *********************************/
        /* 
        Variable: Es un espacio de memoria que tiene un valor cambiante y se utiliza para almacenar      un valor.
        */
        // variables primitivas: Almacenan valores basicos
        int numero = 5;
        double decimales = 3.14;
        char letra = 'a';
        boolean verdadero = true;
        boolean falso = false;
    
        // Variables de referencia: Almacenan direcciones de memoria que apuntan a objetos
        String cadena = "Hola";
        
        system.out.println(numero);
        system.out.println(decimales);
        system.out.println(letra);
        system.out.println(verdadero);
        system.out.println(falso);

        // Cadena de Strings
        String texto = "Esto es un texto asignado a una variable";
        System.out.println(texto);

        int longitud = texto.length();
        System.out.println(longitud);

        char character = texto.charAt(0);
        System.out.println(character);

        String subString = texto.substring(0, 4);
        System.out.println(subString);
        
        String minuscula = texto.toLowerCase();
        System.out.println(minuscula);

        String mayuscula = texto.toUpperCase();
        System.out.println(mayuscula);

        int index = texto.indexOf("variable");
        System.out.println(index);

        String replace = texto.replace("variable", "palabra");
        System.out.println(replace);

        boolean startsWith = texto.startsWith("Esto");
        boolean contiene = texto.contains("asignado");
        System.out.println(startsWith);
        System.out.println(contiene);

        /********************************* Operadores *********************************/
        // Aritmeticos
        int a = 10;
        int b = 10;
        int c = a + b;
        System.out.println(c);

        // Logicos
        int d = 5;
        int e = 10;

        boolean esMayor = 5 > 10;
        boolean esMenor = 5 < 10;
        boolean esIgual = 5 == 10;

        /********************************* Estructuras de control *********************************/
        // if, else if, else
        int edad = 70;

        if (edad > 18 && edad <= 60) {
        System.out.println("Puedes entrar");
        } else if (edad > 60) {
        System.out.println("No puedes entrar porque no es para mayores de 60");
        } else if (edad == 18) {
        System.out.println("Tienes la edad justa para entrar");
        } else {
        System.out.println("No puedes entrar ya que eres menor de edad");
        }

        /********************************* Switch *********************************/
        String bebida = "Mate";
        switch (bebida) {
        case "Cafe":
            System.out.println("Es una bebida caliente");
            break;
        case "Agua":
            System.out.println("Es una bebida fria");
            break;
        default:
            System.out.println("Disfruta de tu bebida");
            break;
        }

        /********************************* Primer programa en java *********************************/
        Scanner scanner = new Scanner(System.in); // Ingresar valores por consola

        System.out.println("Bienvenido a la maquina de bebidas");
        System.out.println("Elige una opcion");

        System.out.println("1. Cafe");
        System.out.println("2. Mate");
        System.out.println("3. Gaseosa");
        System.out.println("4. Vino");

        int opcion = scanner.nextInt();
        switch(opcion) {
        case 1:
            System.out.println("Elegiste cafe");
            break;
        case 2:
            System.out.println("Elegiste Mate");
            break;
        case 3:
            System.out.println("Elegiste gaseosa");
            break;
        case 4:
            System.out.println("Elegiste Vino");
            break;
        default:
            System.out.println("Elegiste otra bebida");
            break;
        }
        scanner.close();

        /********************************* Bucle For *********************************/
        // for(inicializacion; condicion; incremento)
        for(int i = 0; i <= 3; i++) {
            for(int j = 0; j <= 3; j++) {
                System.out.println("i: " + i);
                System.out.println("j: " + j);
            }
        }

        /********************************* Bucle While *********************************/
        // while()
        int contador = 1;
        while (contador <= 5) {
        System.out.println(contador);
        contador++;
        }

        /********************************* Do while() *********************************/
        // Siempre va a entrar la primera vez y si la condicion se cumple vuelve
        // a entrar de lo contrario no entrara mas en la condicion
        int contador = 7;

        do {
        System.out.println("Esto sucede antes de la condicion");
        contador ++;
        }while(contador <= 5);

        System.out.println(contador);

        /********************************* Controles de flujo (brake, continue) *********************************/
        int i;
            for (i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                System.out.println("Se detuvo");
                // break; // nos sirve para romper el ciclo
                // continue; // no corta el bucle, saltea las lineas que continuan el scope
                return; // igual que el brake pero retorna los valores
            }
        }
        System.out.println(i);

        /********************************* Arreglos, matrices, vectores *********************************/
        // Estructura de datos que tienen valores del mismo tipo bajo un mismo nombre,
        // estos valores se distribuyen secuencialmente en la memoria y se pueden
        // acceder a ellos mediante un indice
        // Los arreglos son tambien llamados vectores o matrices
        // Dato importante: El indice se comienza a contar por cero y no por uno

        // tipo - dato = 0 1 2 3 4
        int[] numeros = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < numeros.length; i++) {
        System.out.println(numeros[i]);
        System.out.println(i);
        }

        /********************************* Ahorcado *********************************/
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control iterativa(bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control iterativa(bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {
        System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " " + palabraSecreta.length() + " letras");

        System.out.println("Introduce una letra: ");

        // Usamos la clase Scanner para leer la entrada del usuario
        char letra = Character.toLowerCase(scanner.next().charAt(0));

        boolean letraCorrecta = false;

        // Estructura de control iterativa(bucle)
        for (int i = 0; i < palabraSecreta.length(); i++) {
            // Estructura de control condicional
            if (palabraSecreta.charAt(i) == letra) {
                letrasAdivinadas[i] = letra;
                letraCorrecta = true;
            }

        }

        if (!letraCorrecta) {
            intentos++;
            System.out.println("Incorrecto te quedan " + (intentosMaximos - intentos) + " intentos");
        }

        if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
            palabraAdivinada = true;
            System.out.println("Felicidades has adivinado la palabra: " + palabraSecreta);
        }

        }

        if (!palabraAdivinada) {
            System.out.println("Te has quedado sin intentos. La palabra era: " + palabraSecreta);
        }

        scanner.close();

        /********************************* *********************************/

    }
}
