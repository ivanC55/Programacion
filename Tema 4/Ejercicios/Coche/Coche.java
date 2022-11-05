public class Coche{

private int velocidad=0;
private int direccion=0;
private String color="default";
private int ruedas=4;

public Coche(){}

public String verDatosGenerales(){
	return "El coche va a una velocidad de "+velocidad+", con una direccion de "+
	direccion+", es de color "+color+" y tiene "+ruedas+" ruedas.";
}

public void acelerar(int cantidad){
	this.velocidad+=cantidad;
}
public void frenar(int cantidad){
	this.velocidad-=cantidad;
}
public void girar(int angulo){
	this.direccion+=angulo;
}
public void parar(){
	this.velocidad=0;
	this.direccion=0;
}
public void repintar(String color){
	this.color=color;
}
public int verVelocidad(){
	return this.velocidad;
}
public int verDireccion(){
	return this.direccion;
}
public String verColor(){
	return this.color;
}
public int verNumeroDeRuedas(){
	return this.ruedas;
}
}
