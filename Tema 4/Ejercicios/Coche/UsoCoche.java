public class UsoCoche{
public static void main (String[] args){
	Coche Nissan = new Coche();
	System.out.println(Nissan.verDatosGenerales());

	Nissan.repintar("Morado");
	Nissan.acelerar(100);
	Nissan.frenar(30);
	Nissan.girar(-30);

	System.out.println(Nissan.verDatosGenerales());

	Nissan.acelerar(40);
	Nissan.frenar(70);
	Nissan.girar(40);

	System.out.println(Nissan.verDatosGenerales());
	Nissan.parar();
	System.out.println(Nissan.verDatosGenerales());

}
}
