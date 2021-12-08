package psp.actividad3;

public class Consumidor extends Thread {

	Almacen almacen;
	int contador;

	public Consumidor(Almacen almacen, String nombre) {
		super(nombre);
		this.almacen = almacen;
	}
	
	@Override
	public void run() {
		while (!almacen.vacio()) {
			String producto = almacen.getProducto();
			
			if (producto != null) {
				contador++;
				System.out.println("Consumido por " + getName() + ": " + producto);
			}
		}
		System.out.println(getName() + " ha consumido " + contador + " productos");
	}
	
	public int getContador() {
		return contador;
	}
	
}
