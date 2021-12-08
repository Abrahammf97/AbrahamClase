package psp.actividad3;

public class Productor extends Thread {

	Almacen almacen;
	
	public Productor(Almacen almacen) {
		this.almacen = almacen;
	}
	
	@Override
	public void run() {
		int producto = 1;
		while (!almacen.finProduccion()) {
			almacen.setProducto("producto " + producto);
			System.out.println("Producido producto " + producto++);
		}
	}
	
}
