import java.util.ArrayList;
import java.util.Scanner;

public class CancionMenu {

	static ArrayList<Cancion> listaCanciones;
	static final int OP_LISTAR = 1;
	static final int OP_ELIMINAR = 2;
	static final int OP_CREAR = 3;
	static final int OP_DETALLE = 4;
	static final int OP_SALIR = 5;
	static int opcionSeleccionada = 1;
	static Scanner sc;
	

	public static void main(String[] args) {

		inicializarCanciones();

		mostrarMenu();
		
		
		do {
			pedirOpcion();
			switch (opcionSeleccionada) {
			case OP_LISTAR:
				listar();
				mostrarMenu();
				break;

			case OP_ELIMINAR:
				eliminar();
				listar();
				mostrarMenu();
				break;
				
			case OP_CREAR:
				crear();
				break;
			
			case OP_DETALLE:
				mostrarMenu();
				detalle();
				break;

			case OP_SALIR:
				break;

			default:
				System.out.println("Por favor, introduce un numero del 1 al 5");
				break;
			}
		} while (opcionSeleccionada != OP_SALIR);
		sc.close();
		
	}

	private static void crear() {
		sc = new Scanner(System.in);
		System.out.println("Introduce la cancion que deseas añadir:");
		String titulo = sc.nextLine();
		System.out.println("Introduce la cancion que deseas añadir:");
		String artista = sc.nextLine();
		System.out.println("Introduce la cancion:");
		String duracion = sc.nextLine();
		Cancion canciones = new Cancion (titulo, artista, duracion) ;
		listaCanciones.add(canciones);		
	}

	private static void listar() {

		for (int i = 0; i < listaCanciones.size(); i++) {
			System.out.println((i+1)+ "" +"La cancion es: " + listaCanciones.get(i).getTitulo());
		}

	}

	private static void eliminar() {
		sc = new Scanner(System.in);
		System.out.println("Introduce la posicion de la cancion que deseas eliminar:");
		int cancPosEliminar = sc.nextInt();
		listaCanciones.remove((cancPosEliminar-1));

	}

	private static void pedirOpcion() {
		// TODO gestion de Excepcion
		sc = new Scanner(System.in);
		opcionSeleccionada = 1;
		System.out.print("Seleccione la opcion que desee: ");
		opcionSeleccionada = sc.nextInt();
	}

	private static void detalle() {
		sc = new Scanner(System.in);
		System.out.println("Introduce la posicion de la cancion que deseas detallar:");
		int canPosicion = sc.nextInt();
		Cancion canciones= listaCanciones.get(canPosicion) ;
		System.out.println( "Titulo: " + canciones.getTitulo());
		System.out.println( "Artista: " + canciones.getArtista());
		System.out.println( "Duracion" + canciones.getDuracion());

	}

	private static void mostrarMenu() {

		System.out.println("Gestor Canciones");
		System.out.println("---------------------------");
		System.out.println(" 1. Listar ");
		System.out.println(" 2. Eliminar ");
		System.out.println(" 3. Crear ");
		System.out.println(" 4. Detalle ");
		System.out.println(" 5. Salir ");
		System.out.println("---------------------------");
		System.out.println("Selecciona una opcion del 1 al 5");

	}

	private static void inicializarCanciones() {

		listaCanciones = new ArrayList<Cancion>();

		listaCanciones.add(new Cancion("a", "a", "a"));
		listaCanciones.add(new Cancion("a", "a", "a"));
		listaCanciones.add(new Cancion("a", "a", "a"));
		listaCanciones.add(new Cancion("a", "a", "a"));
		listaCanciones.add(new Cancion("a", "a", "a"));
		listaCanciones.add(new Cancion("a", "a", "a"));
		listaCanciones.add(new Cancion("a", "a", "a"));
		listaCanciones.add(new Cancion("a", "a", "a"));
		listaCanciones.add(new Cancion("a", "a", "a"));
		listaCanciones.add(new Cancion("a", "a", "a"));
		listaCanciones.add(new Cancion("a", "a", "a"));
	}
}
