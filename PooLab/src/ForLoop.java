public class ForLoop {
    public void loopHello(int n){
        for (int i=0; i<n; i++){
            System.out.println("Oi");
        }
    }

    public int incrementaLoop(){
        int soma = 0;
        for (int i=4; i<7; i++){
            for (int j=1; j<4; j++)
            soma = i * j;
        }
        return soma;
    }

    public void Run(int n){
        loopHello(n);
        System.out.println(incrementaLoop());
    }    
}
