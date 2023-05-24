package telcel.curso.bolsasSuper.dominio;

import java.util.*;

public class BolsaSuperMercado <T> {
	
	private List<T> productos;
	
	private int indiceProductos; 
	
	private int max = 2;

	public BolsaSuperMercado() {		
		this.productos =  new ArrayList();
	}
	
	public List<T> getProductos(){
		return productos;
	}
	
	public void addProductos(T p) {
		if(this.productos.size() <= max) {
			this.productos.add(p);
		}else {
			throw new RuntimeException("No hay más espacio");
		}
	}

}
