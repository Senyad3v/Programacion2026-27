import java.util.Scanner;

public class boss{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		titulo();
		int codigo = 0;
		int intentos = 3;
		while(intentos>=0){

			codigo = sc.nextInt();
			if(comprobar(codigo) == false){
				System.out.println("CODIGO INCORRECTO, INTENTE DE NUEVO");
				System.out.println("INTENTOS RESTANTES: " + (intentos-1));
			if(comprobar(codigo) == true){
				System.out.println("[ OK ]: ACCESS GRANTED");
			}
			intentos--;
		}
		if(intentos == 0)
			System.out.println("Sin intentos restantes, cerrando programa");

	}



	public static boolean esCodigoValido(int numero){
		if(numero >=1000 && numero <=9999)
			return true;
		else
			return false;
	}//Funciona


	public static int sumarCifras(int num){
		if(num<10)
			return num;
		return num%10 + sumarCifras(num/10);
	}//Funciona

	public static long factorial(int fact){
		if(fact==0)
			return 1;
		if(fact==1)
			return fact;
		long output = fact*factorial(fact-1);
		return output;
	}

	public static boolean comprobar(int code){
		if(esCodigoValido(code) ==true && sumarcifras(code) == 22 && factorial(code%10) == 362880)
			return true;
		else
			return false;
	}



	public static void titulo(){
		System.out.println("==================================");
		System.out.println("       SECURITY SYSTEM v3.0       ");
		System.out.println("==================================\n");
		System.out.println("INICIANDO SISTEMA....\n");
		System.out.println("CAMARA 07 DETECTADA");
		System.out.println("ACCESO RESTRINGIDO\n");
		System.out.println("INTRODUCE EL CODIGO DE ACCESO");
		System.out.println("INTENTOS RESTANTES: 3");
	}//Funciona

}
