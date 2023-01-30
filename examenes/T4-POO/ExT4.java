public class ExT4{
public static void main (String [] args){
//Serie1
Posicion posSerie1=new Posicion(3,2,15);
Serie theWire=new Serie("The Wire",5,10,posSerie1);
//Serie2
Posicion posSerie2=new Posicion();
posSerie2.setTemporada(4);
posSerie2.setCapitulo(6);
posSerie2.setPosicion(27);
Serie itCrew=new Serie("It Crew",4,6,posSerie2);

//Salidas
System.out.println("The Wire:");
System.out.println(theWire.toString());

System.out.println("");
System.out.println("It Crew:");
System.out.println(itCrew.toString());

}
}
