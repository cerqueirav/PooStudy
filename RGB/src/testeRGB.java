public class testeRGB {
	public static void main(String[] args) {
		
		// Teste unit�rio do met�do representar RGB em Hexa
		  
		RGB novo = new RGB(37, 150, 190);
		
		System.out.println(novo.intToHex(novo));
		
		novo.escurecer(0.1);
		
		System.out.println(novo.intToHex(novo));
		
	}
}
