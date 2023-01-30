import java.util.Scanner;

public class LeerEntrada {
	Scanner sc = new Scanner(System.in);
	TrabajarArrays t = new TrabajarArrays();
	public boolean continua;

	public String leerS() {
		String s;
		System.out.println("Dime string :");
		s = sc.next();
		return s;
	}

	public int leerE() {
		int e;
		System.out.println("Dime un numero :");
		e = sc.nextInt();
		return e;
	}

	public boolean continuar() {
		continua = true;
		do {
			System.out.println("¿Quieres continuar?");
			String r = sc.next();
			switch (r) {
				case "y":
					continua = true;
					t.buscarRepeticiones();t.imprimirArray();
					break;
				case "Y":
					continua = true;
					t.buscarRepeticiones();t.imprimirArray();
					break;
				case "yes":
					t.buscarRepeticiones();t.imprimirArray();
					continua = true;
					break;
				case "YES":
					t.buscarRepeticiones();t.imprimirArray();
					continua = true;
					break;
				case "Yes":
					continua = true;
					t.buscarRepeticiones();t.imprimirArray();
					break;
				case "S":
					continua = true;
					t.buscarRepeticiones();t.imprimirArray();
					break;
				case "Si":
					continua = true;
					t.buscarRepeticiones();t.imprimirArray();
					break;
				case "s":
					t.buscarRepeticiones();t.imprimirArray();
					continua = true;
					break;
				case "si":
					t.buscarRepeticiones();t.imprimirArray();
					continua = true;
					break;
				case "SI":
					t.buscarRepeticiones();t.imprimirArray();
					continua = true;
					break;
				case "n":
					continua = false;
					break;
				case "N":
					continua = false;
					break;
				case "no":
					continua = false;
					break;
				case "No":
					continua = false;
					break;
				case "NO":
					continua = false;
					break;
				default:
					System.out.println("ERROR");
			}

		} while (continua);
		return continua;
	}

	/*
	 * if(respuesta=="y" || respuesta=="Y" || respuesta=="yes" ||
	 * respuesta=="YES" || respuesta=="Yes" || respuesta=="S" ||
	 * respuesta=="Si" || respuesta=="s" || respuesta=="si" ||
	 * respuesta=="S" || respuesta=="SI" || respuesta=="S" || respuesta=="s"){
	 * return continua;
	 * }else if(respuesta=="n" || respuesta=="N" || respuesta=="no" ||
	 * respuesta=="No" || respuesta=="NO"){
	 * continua=false;
	 * return continua;
	 * }
	 * return continua;
	 */
}
