import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a + b;
        //return 0;
    }

    public int mayorDeTresNumeros(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];

        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }

        return tabla;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual a 0.");
        }

        int resultado = 1;

        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false; // Si se encuentra un divisor, no es primo
            }
        }

        return true;
    }

    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número de elementos n no puede ser negativo.");
        }

        if (n == 0) {
            return new int[0];
        }

        int[] fibonacci = new int[n];

        fibonacci[0] = 0;

        if (n > 1) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }

    public int sumaElementos(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            return 0;
        }

        int suma = 0;

        for (int num : arreglo) {
            suma += num;
        }

        return suma;
    }

    public double promedioElementos(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            return 0.0;
        }

        return (double) sumaElementos(arreglo) / arreglo.length;
    }

    public int encontrarElementoMayor(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo ni estar vacío.");
        }

        int mayor = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i]; // Actualizar si encontramos uno más grande
            }
        }

        return mayor;
    }

    public int encontrarElementoMenor(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo ni estar vacío.");
        }

        int menor = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i]; // Actualizar si se encuentra un número más pequeño
            }
        }

        return menor;
    }

    public boolean buscarElemento(int[] arreglo, int elemento) {
        if (arreglo == null) {
            return false;
        }

        for (int num : arreglo) {
            if (num == elemento) {
                return true;
            }
        }

        return false;
    }

    public int[] invertirArreglo(int[] arreglo) {
        if (arreglo == null) {
            return new int[0];
        }

        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }

        return invertido;
    }

    public int[] ordenarArreglo(int[] arreglo) {
        if (arreglo == null) {
            return new int[0];
        }

        int[] ordenado = arreglo.clone();

        for (int i = 0; i < ordenado.length - 1; i++) {
            for (int j = 0; j < ordenado.length - 1 - i; j++) {
                if (ordenado[j] > ordenado[j + 1]) {
                    int temp = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = temp;
                }
            }
        }

        return ordenado;
    }

    public int[] eliminarDuplicados(int[] arreglo) {
        if (arreglo == null) {
            return new int[0];
        }

        int n = arreglo.length;
        int[] temporal = new int[n];
        int tamanoUnicos = 0;

        for (int i = 0; i < n; i++) {
            boolean esDuplicado = false;
            for (int j = 0; j < tamanoUnicos; j++) {
                if (arreglo[i] == temporal[j]) {
                    esDuplicado = true;
                    break;
                }
            }
            if (!esDuplicado) {
                temporal[tamanoUnicos] = arreglo[i];
                tamanoUnicos++;
            }
        }

        int[] resultado = new int[tamanoUnicos];
        for (int i = 0; i < tamanoUnicos; i++) {
            resultado[i] = temporal[i];
        }

        return resultado;
    }

    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        if (arreglo1 == null && arreglo2 == null) {
            return new int[0];
        }
        if (arreglo1 == null) {
            return arreglo2.clone();
        }
        if (arreglo2 == null) {
            return arreglo1.clone();
        }

        int[] combinado = new int[arreglo1.length + arreglo2.length];

        for (int i = 0; i < arreglo1.length; i++) {
            combinado[i] = arreglo1[i];
        }

        for (int i = 0; i < arreglo2.length; i++) {
            combinado[arreglo1.length + i] = arreglo2[i];
        }

        return combinado;
    }

    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        if (arreglo == null || arreglo.length == 0) {
            return new int[0];
        }

        int n = arreglo.length;
        int shift = ((posiciones % n) + n) % n;

        int[] rotado = new int[n];
        for (int i = 0; i < n; i++) {
            rotado[(i + shift) % n] = arreglo[i];
        }

        return rotado;
    }

    public int contarCaracteres(String cadena) {
        if (cadena == null) {
            return 0;
        }

        return cadena.length();
    }

    public String invertirCadena(String cadena) {
        if (cadena == null) {
            return "";
        }

        char[] caracteres = cadena.toCharArray();
        String resultado = "";

        for (int i = caracteres.length - 1; i >= 0; i--) {
            resultado += caracteres[i];
        }

        return resultado;
    }

    public boolean esPalindromo(String cadena) {
        if (cadena == null) {
            return false;
        }

        String limpio = cadena.toLowerCase()
                .replace('á', 'a')
                .replace('é', 'e')
                .replace('í', 'i')
                .replace('ó', 'o')
                .replace('ú', 'u')
                .replaceAll("[^a-z0-9]", "");

        int izquierda = 0;
        int derecha = limpio.length() - 1;

        while (izquierda < derecha) {
            if (limpio.charAt(izquierda) != limpio.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }

        return true;
    }

    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }

        String[] palabras = cadena.trim().split("\\s+");
        return palabras.length;
    }

// Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        if (cadena == null) {
            return null; // o return ""; según lo que requieran tus pruebas
        }
        return cadena.toUpperCase();
    }

// Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        if (cadena == null) {
            return null;
        }
        return cadena.toLowerCase();
    }

// Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        if (cadena == null || antiguaSubcadena == null || nuevaSubcadena == null) {
            return cadena;
        }
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

// Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        if (cadena == null || subcadena == null) {
            return -1;
        }
        return cadena.indexOf(subcadena);
    }


// Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        if (correo == null) {
            return false;
        }

        // Limpia espacios invisibles (\u00A0) y espacios de los extremos
        String correoLimpio = correo.replace('\u00A0', ' ').trim();

        // Expresión regular estándar para la validación de correos electrónicos
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        return correoLimpio.matches(regex);
    }

// Método que calcula el promedio de una lista de números
    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        if (lista == null || lista.isEmpty()) {
            return 0.0;
        }

        double suma = 0.0;
        for (Integer num : lista) {
            if (num != null) {
                suma += num;
            }
        }

        return suma / lista.size();
    }

// Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }
// Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        if (numero < 0) {
            return "-" + Integer.toHexString(-numero).toUpperCase();
        }
        return Integer.toHexString(numero).toUpperCase();
    }

// Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        if (eleccionUsuario == null) {
            return "Opción inválida";
        }

        String usuario = eleccionUsuario.trim().toLowerCase();
        
        // Opciones válidas en el juego
        String[] opciones = {"piedra", "papel", "tijera", "lagarto", "spock"};
        
        boolean valida = false;
        for (String op : opciones) {
            if (op.equals(usuario)) {
                valida = true;
                break;
            }
        }

        if (!valida) {
            return "Opción inválida";
        }

        // Elección de la computadora
        String eleccionComputadora = opciones[(int) (Math.random() * opciones.length)];

        if (usuario.equals(eleccionComputadora)) {
            return "Empate";
        }

        // Reglas de victoria para el usuario
        boolean ganaUsuario = false;
        switch (usuario) {
            case "piedra":
                ganaUsuario = eleccionComputadora.equals("tijera") || eleccionComputadora.equals("lagarto");
                break;
            case "papel":
                ganaUsuario = eleccionComputadora.equals("piedra") || eleccionComputadora.equals("spock");
                break;
            case "tijera":
                ganaUsuario = eleccionComputadora.equals("papel") || eleccionComputadora.equals("lagarto");
                break;
            case "lagarto":
                ganaUsuario = eleccionComputadora.equals("spock") || eleccionComputadora.equals("papel");
                break;
            case "spock":
                ganaUsuario = eleccionComputadora.equals("tijera") || eleccionComputadora.equals("piedra");
                break;
        }

        return ganaUsuario ? "Ganaste" : "Perdiste";
    }
public String pptls2(String game[]) {
        if (game == null || game.length < 2 || game[0] == null || game[1] == null) {
            return "Empate";
        }

        String p1 = game[0].trim().toUpperCase();
        String p2 = game[1].trim().toUpperCase();

        if (p1.equals(p2)) {
            return "Empate";
        }

        // Reglas: la clave es el movimiento y el valor contiene las opciones a las que vence
        // R (Rock) vence a S, L
        // P (Paper) vence a R, V
        // S (Scissors) vence a P, L
        // L (Lizard) vence a V, P
        // V (Spock) vence a S, R
        boolean p1Gana = false;

        switch (p1) {
            case "R":
                p1Gana = p2.equals("S") || p2.equals("L");
                break;
            case "P":
                p1Gana = p2.equals("R") || p2.equals("V");
                break;
            case "S":
                p1Gana = p2.equals("P") || p2.equals("L");
                break;
            case "L":
                p1Gana = p2.equals("V") || p2.equals("P");
                break;
            case "V":
                p1Gana = p2.equals("S") || p2.equals("R");
                break;
        }

        return p1Gana ? "Player 1" : "Player 2";
    }

public double areaCirculo(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        return Math.PI * Math.pow(radio, 2);
    }

    public String zoodiac(int day, int month) {
        return "";
    }
}

