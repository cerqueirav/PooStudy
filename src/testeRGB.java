public class testeRGB {
	public static void main(String[] args) {
		
		// Teste unitário do metódo representar RGB em Hexa
		  
		RGB novo = new RGB(37, 150, 190);
		
		RGB novo2 = new RGB(33, 135, 171);
		
		
		System.out.println(novo.intToHex(novo));
		
		System.out.println(novo2.intToHex(novo2));
	}
}
