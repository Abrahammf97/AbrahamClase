package psp.actividad3;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Almacen almacen = new Almacen(100);
		Productor p = new Productor(almacen);
                
		Consumidor c1 = new Consumidor(almacen, "c1");
		Consumidor c2 = new Consumidor(almacen, "c2");
		p.start();
		c1.start();
		c2.start();
		p.join();
              
	}
	
}
