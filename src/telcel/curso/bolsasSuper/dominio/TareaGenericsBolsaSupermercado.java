package telcel.curso.bolsasSuper.dominio;

public class TareaGenericsBolsaSupermercado {

	public static void main(String[] args) {
		
		BolsaSuperMercado<Fruta> bolsaFrutas = new BolsaSuperMercado<>();
		BolsaSuperMercado<Lacteo> bolsaLacteo = new BolsaSuperMercado<>();
		BolsaSuperMercado<Limpieza> bolsaLimpieza = new BolsaSuperMercado<>();
		BolsaSuperMercado<NoPerecible> bolsaPerecible = new BolsaSuperMercado<>();
		
		bolsaFrutas.addProductos(new Fruta("Sandia", 15.5, 20, "Rojo"));
		bolsaFrutas.addProductos(new Fruta("Mango", 20.5, 10, "Amarillo"));
		
		bolsaLacteo.addProductos(new Lacteo("Leche", 24, 5, 10));
		bolsaLacteo.addProductos(new Lacteo("Queso", 36, 10, 150));
		
		bolsaLimpieza.addProductos(new Limpieza("Antibacterial", 28, "Fabuloso", 28));
		bolsaLimpieza.addProductos(new Limpieza("Cloro", 15, "Clorales", 1.5));
		
		bolsaPerecible.addProductos(new NoPerecible("Arroz de Grano", 30, 150, 500));
		bolsaPerecible.addProductos(new NoPerecible("Atpun", 30, 180, 400));
		
		System.out.println("============= Frutas =============");
		for(Fruta frutas: bolsaFrutas.getProductos()) {
			System.out.println("============= " + frutas.getNombre());
			System.out.println("Precio: " + frutas.getPrecio());
			System.out.println("Peso(gr): " + frutas.getPeso());
			System.out.println("Color: " + frutas.getColor());
		}
		
		System.out.println("============= Limpieza =============");
		for(Limpieza limpieza: bolsaLimpieza.getProductos()) {
			System.out.println("============= " + limpieza.getNombre());
			System.out.println("Precio: " + limpieza.getPrecio());
			System.out.println("Componentes: " + limpieza.getComponentes());
			System.out.println("Litros: " + limpieza.getLitros());
		}
		
		System.out.println("============= Lacteos =============");
		for(Lacteo lacteo: bolsaLacteo.getProductos()) {
			System.out.println("============= " + lacteo.getNombre());
			System.out.println("Precio: " + lacteo.getPrecio());
			System.out.println("Cantidad: " + lacteo.getCantidad());
			System.out.println("Proteinas: " + lacteo.getProteinas());
		}
		
		System.out.println("============= No Perecible =============");
		for(NoPerecible noPrecible: bolsaPerecible.getProductos()) {
			System.out.println("============= " + noPrecible.getNombre());
			System.out.println("Precio: " + noPrecible.getPrecio());
			System.out.println("Contenido: " + noPrecible.getContenido());
			System.out.println("Calorias: " + noPrecible.getCalorias());
		}
		
	}

}
