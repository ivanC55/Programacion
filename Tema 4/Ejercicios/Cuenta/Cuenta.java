public class Cuenta{
private float saldo;
private float limiteDescubierto;
private float rentabilidad;
private String titular;

public Cuenta(float saldo,float limiteDescubierto, float rentabilidad, String titular){
	this.saldo=saldo;
	this.limiteDescubierto=limiteDescubierto;
	this.rentabilidad=rentabilidad;
	this.titular=titular;
}

public void ingresar(float euros){saldo+=euros;}
public void sacar(float euros){
	if (saldo > euros){
		saldo-=euros;
	}else{avisarSaldoInsuficiente(this.saldo,euros);}
}

public String avisarDescubierto(float saldo){
	if(saldo < this.limiteDescubierto){
		return "Estas en descubierto.";
	}
	else{return "No estas en descubierto";}
}
public String avisarSaldoInsuficiente(float saldo, float seQuiereSacar){
	if (saldo < seQuiereSacar){
		return "No puedes sacar la cantidad de "+seQuiereSacar+" tienes "+saldo;
	}
	else{return "ok";}
}
public float calcularIntereses(float saldo, float rentabilidad){
	float interes=saldo*rentabilidad;
	return interes;
}
public String verSaldo(){return "El usuario "+titular+" tiene "+saldo+" EUR en la cuenta.";}
}
