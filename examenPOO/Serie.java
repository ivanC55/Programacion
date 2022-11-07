public class Serie{

private String nombre;
private int temporadas;
private int capitulos;
protected Posicion voyPor;
public Serie(String nombre, int temporadas, int capitulos,Posicion voyPor){
	this.nombre=nombre;
	this.temporadas=temporadas;
	this.capitulos=capitulos;
	this.voyPor=voyPor;

}
@Override
public String toString(){
	return "La serie "+nombre+" tiene "+temporadas+" temporadas y "+capitulos+" capitulos cada temporada y "+voyPor;
}
}
