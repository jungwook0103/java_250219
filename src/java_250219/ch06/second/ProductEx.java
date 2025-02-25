package java_250219.ch06.second;

public class ProductEx {
	
	public static void main(String[] args) {
		
		Product<String, Integer> iphone6 = new Product<>();		
		iphone6.setModel(6);
		
		Product<String, String> iphone6s = new Product<>();
		iphone6s.setModel("6s");
		
		Product<Tv, String> product = new Product<>();
		Tv tv = new Tv();
		product.setProduct(tv);
		
	}

}
