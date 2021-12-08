package psp.actividad3;

public class Almacen {

	String producto;
	int totalProductos;
	int producidos;
	int consumidos;

	public Almacen(int totalProductos) {
		this.totalProductos = totalProductos;
	}
	
	public boolean finProduccion() {
		return producidos == totalProductos;
	}
	
	public boolean vacio() {
		return consumidos == totalProductos;
	}
	
	public synchronized String getProducto() {
		while (producto == null && !vacio())
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		
		String producto = this.producto;
		if (producto != null) {
			this.producto = null;
			consumidos++;
		}
		notifyAll();
		return producto;
	}

	public synchronized void setProducto(String producto) {
		if (this.producto != null)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.producto = producto;
		producidos++;
		notifyAll();
	}
	
}
