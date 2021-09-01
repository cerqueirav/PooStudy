public class testeRGB {
	public static void main(String[] args) {
		
		RGB novo = new RGB(1, 2, 3);
		
		System.out.println(novo.getRed());
		
		novo.setRed(7);
		
		novo.setBlue(11);
			
		System.out.println(novo.getRed());
		System.out.println(novo.getBlue());
		
	}

}
