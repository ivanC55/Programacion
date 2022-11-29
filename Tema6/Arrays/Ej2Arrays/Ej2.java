import java.util.Scanner;
public class Ej2{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
int cantidadMesas,cantidadSillas,cantidadLamparas;
int precioMesa,precioSilla,precioLampara;
int totalMesas,totalSillas,totalLamparas;
//precios
precioMesa = 101;
precioSilla = 45;
precioLampara = 11;
//cantidades
System.out.println("Dime el numero de mesas :");
cantidadMesas = sc.nextInt();
System.out.println("Dime el numero de sillas :");
cantidadSillas = sc.nextInt();
System.out.println("Dime el numero de lamparas :");
cantidadLamparas = sc.nextInt();
//totales
totalMesas = precioMesa * cantidadMesas;
totalSillas = precioSilla * cantidadSillas;
totalLamparas = precioLampara * cantidadSillas;
System.out.println("Producto -- Unidades -- Precio/Unidad -- Total");
System.out.println("Mesa ---- "+cantidadMesas+" ---- "+precioMesa+" ---- "+totalMesas);
System.out.println("Silla ---- "+cantidadSillas+" ---- "+precioSilla+" ---- "+totalSillas);
System.out.println("Lampara ---- "+cantidadLamparas+" ---- "+precioLampara+" ---- "+totalLamparas);
}
}
