public class Ej02{
public static void main (String [] args){
	LeerEntrada en = new LeerEntrada();
	ListaProductos li = new ListaProductos();
	System.out.println(li.dimeCantidad());
	li.total();
	System.out.println(en.cabecera());
	System.out.println(li.listado());
}
}
