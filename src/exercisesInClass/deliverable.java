package exercisesInClass;
import java.util.Scanner;

public class deliverable{

    // VARIABLES PUBLICAS
    static Scanner entrada = new Scanner(System.in);

    static String[] titulos;
    static String[] autores;
    static String[] codigos;
    static int[] anios;
    static int[] estados;
    static String[][] informacion;
    static int cantidadLibros;


    // METODO PRINCIAL DE LA CLASE
    public static void main(String[] args) {

        // INGRESO DE CANTIDAD DE LIBROS PARA QUE ESE SEA EL TAMANO
        // DE TODAS MIS VARIABLES TIPO LISTAS
        System.out.print("Ingrese la cantidad de libros: ");
        cantidadLibros = entrada.nextInt();
        entrada.nextLine(); // LIMPIAR EL BOOFER

        // SE LLAMAN LAS VARIABLES GLOBALES Y SE LE ASIGNA UN TAMANO
        titulos = new String[cantidadLibros];
        autores = new String[cantidadLibros];
        codigos = new String[cantidadLibros];
        anios = new int[cantidadLibros];
        estados = new int[cantidadLibros];
        informacion = new String[cantidadLibros][3];

        // LLAMO MI METODO "registrarLibros" SIN UN OBJETO INSTANCIADO YA
        // QUE ES UN METODO ESTATICO
        registrarLibros();

        // MENU
        int opcion = 0;
        while (opcion != 15) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Mostrar todos los libros");
            System.out.println("2. Buscar por titulo");
            System.out.println("3. Buscar por autor");
            System.out.println("4. Buscar por codigo");
            System.out.println("5. Mostrar disponibles");
            System.out.println("6. Mostrar prestados");
            System.out.println("7. Mostrar en mantenimiento");
            System.out.println("8. Contar disponibles");
            System.out.println("9. Contar prestados");
            System.out.println("10. Libro mas antiguo");
            System.out.println("11. Libro mas reciente");
            System.out.println("12. Porcentaje prestados");
            System.out.println("13. Cambiar estado");
            System.out.println("14. Reporte general");
            System.out.println("15. Salir");

            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            // ESTRUCTURA CONDICIONA SWITCH - CASE PARA IDENTIFICAR
            // LA OPCION INGRESADA POR EL USUARIO Y LLAMAR AL METODO
            // ESTATICO CORRESPONDIENTE
            switch (opcion) {
                case 1:
                    mostrarLibros();
                    break;
                case 2:
                    buscarTitulo();
                    break;
                case 3:
                    buscarAutor();
                    break;
                case 4:
                    buscarCodigo();
                    break;
                case 5:
                    mostrarPorEstado(0);
                    break;
                case 6:
                    mostrarPorEstado(1);
                    break;
                case 7:
                    mostrarPorEstado(2);
                    break;
                case 8:
                    contarDisponibles();
                    break;
                case 9:
                    contarPrestados();
                    break;
                case 10:
                    libroMasAntiguo();
                    break;
                case 11:
                    libroMasReciente();
                    break;
                case 12:
                    porcentajePrestados();
                    break;
                case 13:
                    cambiarEstado();
                    break;
                case 14:
                    reporteGeneral();
                    break;
                case 15:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    // METODO CORRESPONDIENTE AL INGRESO DE LIBROS TENIENDO COMO LIMITE
    // LA CANTIDAD DE LIBROS QUE DESEA INGRESAR EL USUARIO
    public static void registrarLibros() {

        // BUCLE QUE ITERA PREGUNTANDO LA INFORMACION DEL LIBRO
        for (int i = 0; i < cantidadLibros; i++) {

            System.out.println("\nLibro " + (i + 1));

            System.out.print("Titulo: ");
            titulos[i] = entrada.nextLine();

            System.out.print("Autor: ");
            autores[i] = entrada.nextLine();

            System.out.print("Codigo: ");
            codigos[i] = entrada.nextLine();

            System.out.print("Año de publicacion: ");
            anios[i] = entrada.nextInt();

            System.out.print("Estado (0 Disponible, 1 Prestado, 2 Mantenimiento): ");
            estados[i] = entrada.nextInt();
            entrada.nextLine();

            informacion[i][0] = titulos[i];
            informacion[i][1] = autores[i];
            informacion[i][2] = codigos[i];
        }
    }

    // ESTE METODO ITERA CADA POSICION DE LOS ARREGLOS MOSTRANDO LA INFORMACION CORRESPONDIENTE
    // PARA CADA LIBRO INGRESADO
    public static void mostrarLibros() {
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println("\nLibro " + (i + 1));
            System.out.println("Titulo: " + titulos[i]);
            System.out.println("Autor: " + autores[i]);
            System.out.println("Codigo: " + codigos[i]);
            System.out.println("Año: " + anios[i]);
            System.out.println("Estado: " + estados[i]);
        }
    }

    // ESTE METODO PIDE POR TECLADO EL TITULO CORRESPONDIENTE A UNO DE LOS LIBROS
    // E ITERA LA CANTIDAD DE LIBROS INGRESADOS PARA BUSCAR EN EL ARREGLO TITULOS
    // POR POSICION SI CON EL METODO equalsIgnoreCase ES IGUAL AL VALOR INGRESADO
    // IGNORANDO LAS MAYUSCULAS Y SI ESTE SE ENCUENTRA LO MUESTRA POR PANTALLAI
    public static void buscarTitulo() {
        System.out.print("Ingrese el titulo: ");
        String buscar = entrada.nextLine();
        for (int i = 0; i < cantidadLibros; i++) {
            if (titulos[i].equalsIgnoreCase(buscar)) {
                System.out.println("Encontrado: " + titulos[i]);
            }
        }
    }

    // ESTE METODO PIDE POR TECLADO EL AUTOR DE UN LIBRO E ITERA LA CANTIDAD DE
    // LIBROS INGRESADOS PARA BUSCAR EN EL ARREGLO AUTORES SI CON EL METODO
    // equalsIgnoreCase ES IGUAL AL VALOR INGRESADO Y MUESTRA LOS TITULOS ASOCIADOS
    public static void buscarAutor() {

        System.out.print("Ingrese el autor: ");
        String buscar = entrada.nextLine();

        for (int i = 0; i < cantidadLibros; i++) {

            if (autores[i].equalsIgnoreCase(buscar)) {
                System.out.println("Libro: " + titulos[i]);
            }
        }
    }

    // ESTE METODO PIDE POR TECLADO EL CODIGO DE UN LIBRO E ITERA LA CANTIDAD DE
    // LIBROS INGRESADOS PARA BUSCAR EN EL ARREGLO CODIGOS SI COINCIDE CON EL
    // VALOR INGRESADO IGNORANDO MAYUSCULAS Y MUESTRA EL LIBRO ENCONTRADO
    public static void buscarCodigo() {
        System.out.print("Ingrese el codigo: ");
        String buscar = entrada.nextLine();
        for (int i = 0; i < cantidadLibros; i++) {
            if (codigos[i].equalsIgnoreCase(buscar)) {
                System.out.println("Libro encontrado: " + titulos[i]);
            }
        }
    }

    // ESTE METODO RECIBE COMO PARAMETRO UN ESTADO NUMERICO E ITERA EL ARREGLO
    // ESTADOS COMPARANDO CADA POSICION PARA MOSTRAR UNICAMENTE LOS TITULOS
    // DE LOS LIBROS QUE COINCIDAN CON DICHO ESTADO
    public static void mostrarPorEstado(int estado) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (estados[i] == estado) {
                System.out.println(titulos[i]);
            }
        }
    }

    // ESTE METODO RECORRE EL ARREGLO ESTADOS CONTANDO CUANTOS LIBROS TIENEN
    // EL ESTADO 0 (DISPONIBLE) Y MUESTRA EL TOTAL ACUMULADO POR PANTALLA
    public static void contarDisponibles() {
        int contador = 0;
        for (int i = 0; i < cantidadLibros; i++) {
            if (estados[i] == 0) {
                contador++;
            }
        }
        System.out.println("Disponibles: " + contador);
    }

    // ESTE METODO RECORRE EL ARREGLO ESTADOS CONTANDO CUANTOS LIBROS TIENEN
    // EL ESTADO 1 (PRESTADO) Y MUESTRA EL TOTAL ACUMULADO POR PANTALLA
    public static void contarPrestados() {
        int contador = 0;
        for (int i = 0; i < cantidadLibros; i++) {
            if (estados[i] == 1) {
                contador++;
            }
        }
        System.out.println("Prestados: " + contador);
    }

    // ESTE METODO RECORRE EL ARREGLO ANIOS COMPARANDO CADA ELEMENTO PARA
    // ENCONTRAR LA POSICION DEL VALOR MENOR Y IMPRIME EL TITULO DEL LIBRO MAS ANTIGUO
    public static void libroMasAntiguo() {
        int posicion = 0;
        for (int i = 1; i < cantidadLibros; i++) {
            if (anios[i] < anios[posicion]) {
                posicion = i;
            }
        }

        System.out.println("Libro mas antiguo: " + titulos[posicion]);
    }

    // ESTE METODO RECORRE EL ARREGLO ANIOS COMPARANDO CADA ELEMENTO PARA
    // ENCONTRAR LA POSICION DEL VALOR MAYOR Y IMPRIME EL TITULO DEL LIBRO MAS RECIENTE
    public static void libroMasReciente() {
        int posicion = 0;
        for (int i = 1; i < cantidadLibros; i++) {
            if (anios[i] > anios[posicion]) {
                posicion = i;
            }
        }
        System.out.println("Libro mas reciente: " + titulos[posicion]);
    }

    // ESTE METODO CUENTA LOS LIBROS CON ESTADO PRESTADO (1) Y CALCULA EL
    // PORCENTAJE QUE REPRESENTAN RESPECTO AL TOTAL DE LIBROS REGISTRADOS
    public static void porcentajePrestados() {
        int contador = 0;
        for (int i = 0; i < cantidadLibros; i++) {
            if (estados[i] == 1) {
                contador++;
            }
        }
        double porcentaje = (contador * 100.0) / cantidadLibros;
        System.out.println("Porcentaje prestados: " + porcentaje + "%");
    }

    // ESTE METODO SOLICITA UN CODIGO POR TECLADO, BUSCA SU POSICION EN EL
    // ARREGLO CODIGOS Y PERMITE INGRESAR UN NUEVO VALOR PARA ACTUALIZAR SU ESTADO
    public static void cambiarEstado() {
        System.out.print("Ingrese codigo del libro: ");
        String codigo = entrada.nextLine();

        for (int i = 0; i < cantidadLibros; i++) {
            if (codigos[i].equalsIgnoreCase(codigo)) {
                System.out.print("Nuevo estado: ");
                estados[i] = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Estado actualizado");
            }
        }
    }

    // ESTE METODO RECORRE TODOS LOS ARREGLOS DESDE LA PRIMERA HASTA LA ULTIMA
    // POSICION IMPRIMIENDO LA INFORMACION COMPLETA Y DETALLADA DE CADA LIBRO
    public static void reporteGeneral() {
        System.out.println("\n===== REPORTE GENERAL =====");

        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println("Titulo: " + titulos[i]);
            System.out.println("Autor: " + autores[i]);
            System.out.println("Codigo: " + codigos[i]);
            System.out.println("Año: " + anios[i]);
            System.out.println("Estado: " + estados[i]);
            System.out.println("---------------------");
        }
    }
}
