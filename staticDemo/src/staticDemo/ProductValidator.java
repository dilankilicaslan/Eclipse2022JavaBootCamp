package staticDemo;

public class ProductValidator {
	// methodu static yaptığında class ismi ile direkt çağrılır.
	// ana class static olamıyor.
	static {
		System.out.println("static Yapıcı blok çalıştı");
		
	}
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	public static boolean isValid(Product product){
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
			
		}
		
	}
	public void bisey() {
		
	}
	
	/*inner class
	public static class baskaClass() {
		public static void sil() {
			
		}
	}
	*/
}
