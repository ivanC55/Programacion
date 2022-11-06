public class UsoCuenta{
public static void main(String[] args){
	Cuenta cuenta1=new Cuenta(500,30,0.1f,"Ivan");
	Cuenta cuenta2=new Cuenta(250,30,0.1f,"Tomas");
	//Gestiones :
	cuenta1.sacar(300);
	cuenta2.ingresar(300);
	//Fin mes :
        System.out.println("Fin de mes.\n");

	cuenta1.ingresar(cuenta1.calcularIntereses(200,0.1f));
	cuenta2.ingresar(cuenta2.calcularIntereses(550,0.1f));
	System.out.println(cuenta1.verSaldo());
	System.out.println(cuenta2.verSaldo());
	//Gestiones :
	cuenta1.sacar(300);
	cuenta2.ingresar(300);
	//Fin mes :
        System.out.println("Fin de mes.\n");

	cuenta1.ingresar(cuenta1.calcularIntereses(200,0.1f));
	cuenta2.ingresar(cuenta2.calcularIntereses(850,0.1f));
	System.out.println(cuenta1.verSaldo());
	System.out.println(cuenta2.verSaldo());
}
}
