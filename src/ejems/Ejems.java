package ejems;

public class Ejems {

	public static void main(String[] args) {
	
		
		String ejemploString = "no tengo nada";
		System.out.println("Contains sequence 'example': " + ejemploString.contains("example"));
		System.out.println("Contains sequence 'is String': " + ejemploString.contains("nada"));
    
		
		/*
		 * 
		 *Este syso nos va a imprimir detras del + un true o un false, 
		 *asiq cuando lo vayas a poner en e¡otro lado haces asi->
		 */
		
		boolean hayLoKSea = ejemploString.contains("example");
		
		if (hayLoKSea) {
			System.out.println("lo tenemos");
		}else {
			System.out.println("cagadón");
		}
		
		boolean hayLoKSea2 = ejemploString.endsWith("e");
		
		ejemploString.replace("ada", "ado");
		
		System.out.println(ejemploString);
		
	}
}
