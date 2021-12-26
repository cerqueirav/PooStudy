public class MetodoClass {
    public static void main(String[] args) {
        MetodoClass novo = new MetodoClass();
        novo.Welcome();

        int value = 3;

        value = novo.addTwo(value);

        System.out.println("addTwo(" + (value-2) + ")" + " � " + value);

        value = 19;

        value = novo.addTwo(value);

        System.out.println("addTwo(" + (value-2) + ")" + " � " + value);
    }
    public int addTwo(int value){
        return value + 2;
    }

    public void Welcome(){
        System.out.println("Seja Bem Vindo!!!.");
    }

    public void Run(){
        Welcome();
        
    }
}
