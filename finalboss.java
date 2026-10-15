import java.util.Scanner;
import java.util.Random;

public class finalboss {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random gen = new Random();

        // Declaración de variables
        int butacasl = 20;
        int edad = 0;
        int precioMayor = 8;
        int precioMenor = 6;
        int precioTotal = 0;
        int entradasVendidas = 0;
        int clientesAtt = 0;
        String nombre = "";
        int opcion;
        int entradas;
        String mayor = "";
        int cantMayor =0;
        int cantMenor=0;
        int calculo = 0;
	String menu = "Menu: 1: Compra de entradas  2: Comprobar sitios libres  3: Editar butacas  4: Salir";
	String pass ="";

        // Mostrar menú
        do {
            System.out.println(menu);
            opcion = sc.nextInt();

            switch (opcion) {
		case 0:
		    System.out.println(menu);
		    opcion = sc.nextInt();
                case 1:
                    System.out.println("Compra de entradas");
                    System.out.println("Las entradas disponibles son: " + butacasl);
                    System.out.println("Entradas a vender:");

                    entradas = sc.nextInt();

                    while (entradas > butacasl || entradas < 1) {
                        System.out.println("Error, número de entradas no válido.");
                        System.out.println("Introduce otro número de entradas:");
                        entradas = sc.nextInt();
                    }

                    for(int i=0; i<entradas; i++){
                        //i es un contador
                        System.out.println("Es mayor de edad?  (S/N)");
                        mayor = sc.next();
			while(!mayor.equals("S")&&!mayor.equals("N")){
				System.out.println("Ha ocurrido un error, vuelve a intentarlo");
				System.out.println("Es mayor de edad?  (S/N)");
                        	mayor = sc.next();
			}
			if(mayor.equals("S")){
				cantMayor++;
			}else{
				cantMenor++;
			}

                    }

                    calculo = cantMayor*precioMayor+cantMenor*precioMenor;
                    System.out.println("Tu precio total es: " + calculo);
                    butacasl = butacasl - entradas;
                    entradasVendidas = entradasVendidas + entradas;

                    System.out.println("Compra realizada correctamente.");
                    System.out.println("Entradas restantes: " + butacasl);
                    opcion = 0;
		    break;

                case 2:
                    System.out.println("Sitios libres: " + butacasl);
		    opcion = 0;
		    break;

                case 3:
		    System.out.println("Introduzca la contraseña ");
		    pass = sc.next();
		    if(pass.equals("sudo")){
			System.out.println("La contraseña es correcta");
			System.out.println("Las butacas disponibles son: " + butacasl);
			System.out.println("Escriba el numero ACTUAL de butacas libres");
			butacasl = sc.nextInt();

		    }
		    opcion = 0;
		    break;
		case 4:
		    System.out.println("Saliendo...");
		    break;

                default:
                    System.out.println("Error, el número " + opcion + " no entra dentro de las posibilidades.");
            }

        } while (opcion < 1 || opcion >3);
	
    }
}

