package exercisesInClass;
// Se importan todas las librerias de la clase .util "*"
import java.util.*;

// Clase principal Main
public class Main {
    // Se instancia el objeto Scanner fuera de los metodos para poder usarlo en toda la clase
    Scanner sc = new Scanner(System.in);

    // Se crean las estructuras de datos de manera global para usarlas en los metodos sin la
    // necesidad de pasarlas como parametro en el menu
    ArrayList<Main> listaSolicitudes = new ArrayList<>();
    Queue<Main> colaAtencion = new LinkedList<>();
    Stack<Main> pilaSolicitudAtendidas = new Stack<>();

    // Atribitos de la clase
    int numSolicitud;
    String nombreCliente;
    String tipoProblema;
    String prioridad;
    boolean estadoSolicitud;

    // Se crea un constructor vacio, con el fin de poder instanciar un objeto sin ningun parametro,
    // acceder a el metodo menu y dentro, instanciar otro objeto con los datos ingresados por el USER
    public Main() {
    }

    // Luego de que el usuario pase por teclado los datos creamos el objeto con los parametros
    // correspondientes a los atributos que tengo en la clase y asi poder asignarselos en el constructor
    public Main(int parametroNumSolicitud,
                String parametroNombreCliente,
                String parametroTipoProblema,
                String parametroPrioridad,
                boolean parametroEstadoSolicitud) {

        // Los datos recibidos por parametro son los que se le asignan a los atributos de clase
        numSolicitud = parametroNumSolicitud;
        nombreCliente = parametroNombreCliente;
        tipoProblema = parametroTipoProblema;
        prioridad = parametroPrioridad;
        estadoSolicitud = parametroEstadoSolicitud;
    }

    // ========== REGISTRAR SOLICITUD ============
    public void registrarSolicitud() {
        System.out.println("\n====== REGISTRAR SOLICITUD ======");

        // Ingreso de datos
        System.out.print("Ingrese el número de solicitud: ");
        int numSolicitud = sc.nextInt();
        sc.nextLine(); // Limpia el Boofer

        System.out.print("Ingrese el nombre del cliente: ");
        String nomCliente = sc.nextLine();

        System.out.print("Ingrese el tipo de problema: ");
        String problema = sc.nextLine();

        System.out.print("Ingrese la prioridad (Alta, Media, Baja): ");
        String prioridad = sc.nextLine();

        // Se intancia el objeto con parametros para asignarselos a los atributos de clase
        Main objetoParametros = new Main(numSolicitud,
                nomCliente,
                problema,
                prioridad,
                false);

        // El objeto instanciado se guarda en el ArrayList con el metodo add
        listaSolicitudes.add(objetoParametros);
        System.out.println("Solicitud registrada");
    }

    // ========== LISTAR TODAS LAS SOLICITUDES ============
    public void listarSolicitudes() {
        System.out.println("\n====== LISTA DE TODAS LAS SOLICITUDES ======");

        // Los registros guardados en la lista "listaSolicitudes" son objetos de la clase Main
        for (Main objetoLista : listaSolicitudes) {
            System.out.println("Numero de la solicitud " + objetoLista.numSolicitud);
            System.out.println("Nombre del cliente " + objetoLista.nombreCliente);
            System.out.println("Tipo del problema " + objetoLista.tipoProblema);
            System.out.println("Prioridad de la solicitud " + objetoLista.prioridad.toUpperCase());
            System.out.println("Estado de la solicitud " + objetoLista.estadoSolicitud);
            System.out.println("\n===========================================\n");
        }
    }

    // ========== AGREGAR UNA SOLICITUD INGRESADA POR EL USUARIO A LA COLA ============
    public void agregarSolicitudCola() {
        System.out.println("\n====== AGREGAR UNA SOLICITUD A LA COLA ======");

        System.out.print("Ingrese el número de la solicitud que desea ingresar a la cola: ");
        int buscarNumSolicitud = sc.nextInt();
        sc.nextLine(); // Limpiar el Boofer

        // La variable objetoEncontrado guardara datos de tipo objeto, con inicializacion de null
        // para entender que esta vacia y que no se ha encontrado ningun valor
        Main objetoEncontrado = null;

        // Este bucle itera cada objeto del array "listaSolicitudes" y por medio de una estructura
        // condicional simple accede al objeto en el campo numSolicitud para validar si es la misma
        // que ingreso el usuario, si es asi se le asigna al objeto que estaba en null el objeto encontrado
        for (Main objetoLista : listaSolicitudes) {
            if (objetoLista.numSolicitud == buscarNumSolicitud) {
                objetoEncontrado = objetoLista;
                break;
            }
        }

        // En esta estructura condicional doble se valida si la variable que almacena el objeto encontrado
        // es diferente de null, siendo asi se ingresa a la cola "colaAtencion" para mantener un orden de
        // solicitudes por orden de llegada
        if (objetoEncontrado != null) {
            colaAtencion.add(objetoEncontrado);
            System.out.println("el numero de la solicitud " + buscarNumSolicitud + " se agrego a la cola.");
        } else {
            System.out.println("No se encontró ninguna solicitud con ese número.");
        }
    }

    // ========== ATENDER LAS SOLICITADAS QUE SE ENCUENTRAN EN LA COLA ============
    public void atenderSolicitud(){
        System.out.println("\n====== ATENDER SIGUIENTE SOLICITUD ======");

        // Se guarda el primer registro que fue el primero en entrar para ser atendido
        Main solicitudAtendida = colaAtencion.poll();

        // Se accede al objeto en el atributo estado para cambiarlo a true
        solicitudAtendida.estadoSolicitud = true;

        // Ya atendida el estado lo metemos a la pila
        pilaSolicitudAtendidas.push(solicitudAtendida);
        System.out.println("Numero de la solicitud atendida: " + solicitudAtendida.numSolicitud);
    }

    // ========== CONSULTAR EL ULTIMO REGISTRO QUE FUE EL PRIMERO QUE ENTRO A LA PILA ============
    public void consultarUltimaSolicitudAtendida(){
        System.out.println("\n====== ÚLTIMA SOLICITUD ATENDIDA ======");

        // Consultar el ultimo registro de la pila
        Main objetoPila = pilaSolicitudAtendidas.peek();

        // Mostrar cada registro de mi objeto accediendo a cada atributo del mismo, si no se hace asi
        // mostraria la direccion de memoria
        System.out.println("Numero de la solicitud " + objetoPila.numSolicitud);
        System.out.println("Nombre del cliente " + objetoPila.nombreCliente);
        System.out.println("Tipo del problema " + objetoPila.tipoProblema);
        System.out.println("Prioridad de la solicitud " + objetoPila.prioridad.toUpperCase());
        System.out.println("Estado de la solicitud " + objetoPila.estadoSolicitud);
        System.out.println("\n===========================================");
    }

    // Metodo desplegarMenu permite mostrar el menu y la entrada de datos
    public void desplegarMenu() {
        int opcionMenu = 0;

        while(opcionMenu != 6) {
            System.out.println("\n====== MENU DE OPCIONES ======");
            System.out.println("1. Registrar una solicitud.");
            System.out.println("2. Listar todas las solicitudes.");
            System.out.println("3. Agregar una solicitud a la cola.");
            System.out.println("4. Atender la siguiente solicitud.");
            System.out.println("5. Consultar la última solicitud atendida.");
            System.out.println("6. Salir.");

            System.out.print("Ingrese la opcion que desea: ");

            opcionMenu = sc.nextInt();
            sc.nextLine(); // Limpia el Boofer

            switch (opcionMenu) {
                case 1:
                    registrarSolicitud();
                    break;

                case 2:
                    listarSolicitudes();
                    break;

                case 3:
                    agregarSolicitudCola();
                    break;

                case 4:
                    atenderSolicitud();
                    break;

                case 5:
                    consultarUltimaSolicitudAtendida();
                    break;

                case 6:
                    System.out.println("Saliste del sistema. ");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    public static void main(String [] args) {
        Main objetoSinParametro = new Main();
        objetoSinParametro.desplegarMenu();
    }
}
