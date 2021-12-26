public class Arrays {
    private int iVector[] = new int[5];
    private String sVector[] = {"Zé", "João", "Tonho"};

    public void loadVectorInt(int min){
        int iAux=0;       
        while (iAux < 5){
            iVector[iAux] = min+iAux++;
        }   
    }

    public void getVectorInt(int min){
        loadVectorInt(min);
        for (int i=0; i<5; i++){
            System.out.println(iVector[i]);
        }
    }

    public void setVectorString(String oldValue, String newValue){
        for (int i=0; i<3; i++){
            if (sVector[i].equals(oldValue)){
                sVector[i] = newValue;
                break;
            }
        }
    }

    public void getVectorString(){
        for (int i=0; i<3; i++){
            System.out.println(sVector[i]);
        }
    }

    public void Run(int n){
        getVectorInt(n);
        getVectorString();
        setVectorString("Zé", "Maria");
        getVectorString();
    }

}
