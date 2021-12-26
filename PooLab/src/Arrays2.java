import java.util.Scanner;

public class Arrays2 {
    private int size = 10;
    private int iVector[] = new int[size];
    

    public void setOnVector(){
        int iAux=0;       
        while (iAux < this.size){
            Scanner cap = new Scanner(System.in);
            iVector[iAux++] = cap.nextInt();
        }   
    }

    public void getVector(){
        int iAux=0; 
        while (iAux < this.size){
            System.out.print(iVector[iAux++] + " ");
        }

        System.out.println();
    }

    public void orderVector(){
        int aux;
        for (int j=0; j<this.size; j++){
            for (int i=0; i<this.size-1; i++){
                if (this.iVector[i] > this.iVector[i+1]){
                    aux = this.iVector[i];
                    this.iVector[i] = this.iVector[i+1];
                    this.iVector[i+1] = aux;
                }
            }
        }   
    }

    public void orderVectorTernario(){
        int aux;
        for (int j=0; j<this.size; j++){
            for (int i=0; i<this.size-1; i++){
                int comp = (this.iVector[i] > this.iVector[i+1]) 
                ? (aux = this.iVector[i]) 
                & (this.iVector[i] = this.iVector[i+1])
                & (this.iVector[i+1] = aux) : 0;
            }
        }   
    }

    public void Run(){
        setOnVector();
        orderVectorTernario();
        getVector();
    }

}
