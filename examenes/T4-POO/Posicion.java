public class Posicion{
private int temporada, capitulo, posicion;
public Posicion(){}
public Posicion(int temporada, int capitulo, int posicion){
	this.temporada=temporada;
	this.capitulo=capitulo;
	this.posicion=posicion;
}
//SETTERS
public void setTemporada(int temporada){this.temporada=temporada;}
public void setCapitulo(int capitulo){this.capitulo=capitulo;}
public void setPosicion(int posicion){this.posicion=posicion;}
//GETTERS
public int getTemporada(){return temporada;}
public int getCapitulo(){return capitulo;}
public int getPosicion(){return posicion;}
//toString
@Override
public String toString(){
	return "vas por el capitulo "+capitulo+" de la temporada "+temporada+" por el minuto "+posicion;
}

}
