public class UsoLibro{

public static void main(String [] args){

Libro harry = new Libro ("Harry Potter","JK",2,1);
Libro juegoTronos = new Libro ("Cancion de hielo y fuego",3);
Libro op = new Libro ();

//Harry
System.out.println(harry.toString());
System.out.println(harry.prestamo());
System.out.println(harry.prestamo());
System.out.println(harry.prestamo());

System.out.println(harry.devolucion());
System.out.println(harry.devolucion());
System.out.println(harry.devolucion());

System.out.println(harry.toString());

//Juego de Tronos
juegoTronos.setTitulo("George R.R Martin");
System.out.println(juegoTronos.getTitulo());

juegoTronos.setNEjemplares(5);
System.out.println(juegoTronos.getNEjemplares());

juegoTronos.setNEjemplaresPrestados(1);
System.out.println(juegoTronos.getNEjemplaresPrestados());

System.out.println(juegoTronos.toString());
//One Piece

op.setTitulo("One Piece");
op.setAutor("Eiichiro Oda");
op.setNEjemplares(4);
op.setNEjemplaresPrestados(3);
System.out.println(op.toString());
}
}
