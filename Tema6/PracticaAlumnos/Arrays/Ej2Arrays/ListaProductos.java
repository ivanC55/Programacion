public class ListaProductos{
int cMesa;
int cSilla;
int cLampara;
int pMesa = 101;
int pSilla = 45;
int pLampara = 11;
int tMesa;
int tSilla;
int tLampara;
int total;
public String dimeCantidad(){
	LeerEntrada en = new LeerEntrada();
	System.out.println("Mesas: ");
	cMesa = en.leerE();
	System.out.println("Sillas: ");
	cSilla = en.leerE();
	System.out.println("Lamparas: ");
	cLampara = en.leerE();
	return " Mesas: "+cMesa+"\n Sillas:"+cSilla+"\n Lamparas: "+cLampara;
}
public void total(){
	tMesa=cMesa*pMesa;
	tSilla=cSilla*pSilla;
	tLampara=cLampara*pLampara;
}

public String listado(){
	return " Mesa--"+cMesa+"--"+pMesa+"--"+tMesa+"\n Silla--"+cSilla+"--"+pSilla+"--"+tSilla+"\n Lampara--"+cLampara+"--"+pLampara+"--"+tLampara+"\n ----------------------------------------------";
	}
public String footer(){
	total = tMesa+tSilla+tLampara;
	return " Total : "+total;
	}
}
