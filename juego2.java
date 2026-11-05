import java.util.Scanner;
import java.util.Random;
public class juego2{
//public final int apuestaMax (199);
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		baraja();
		bienvenida();
		int dineroPerdido = 0, jugador1 = 100, jugador2 = 100, contador1 = 0, contador2 = 0, numRonda = 1, dineroApostado=0;
		boolean flag1 = false;
		while(jugador1 != 0 || jugador2 != 0){
			ronda(jugador1, jugador2, numRonda);
			if(flag1 == false){ //Empieza el turno del jugador 1 cuandon la bandera esta bajada
				System.out.println("Cuanto dinero quieres apostar?");
				dineroApostado = sc.nextInt();
				if(apuesta(dineroApostado, jugador1)){
					System.out.println("La carta es: " + baraja());

				}//Cierro el If
				else{
					System.out.println("Dinero máximo superado");//Marisol me ha hecho poner la tilde.
				}//Cierro el else
			}
		}
	}

	public static String baraja(){
		Random generarCarta= new Random();
		String [] numeros={"As", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "sota", "caballo", "rey"};
		String [] palos= {"Picas", "Trebol", "Corazones", "Rombos"};
		String cartaGenerada = numeros[generarCarta.nextInt(13)];
		String paloGenerado = palos[generarCarta.nextInt(4)];
		String texto = cartaGenerada + " de " + paloGenerado;
		return texto;

	}
/*	public static boolean comprobacionNumeros(String carta){

	}
	public static boolean comprobacionPalo(String carta){

	}*/
	public static void ronda(int dinero1, int dinero2, int jugada){
		System.out.println("El dinero que le queda al jugador 1 es: " + dinero1);
		System.out.println("El dinero que le queda al jugador 2 es: " + dinero2);
		System.out.println("Vamos por la ronda: " + jugada);
	}//Terminado

	public static boolean apuesta(int apostado, int din1){
		if(apostado > din1 || apostado < 0)
			return false;
		else
			return true;
	}//Terminado

	public static void bienvenida(){
		System.out.println("===================================");
		System.out.println("BIENVENIDOS AL CASINO DE MONTEPINAR");
		System.out.println("===================================\n");
		System.out.println("Que comiencen las apuestas\n");
	}//Terminado
}

