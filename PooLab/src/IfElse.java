public class IfElse {
    private int QUENTE = 40;
    private int FRIO = 10;
    private int tempAtual;

    public void setTemperatura(int temp){
        this.tempAtual = temp;
    }

    public int getTemperatura(){
        return this.tempAtual;
    }

    public void exibirTemperatura(){
        if (this.tempAtual == FRIO)
            System.out.println(getTemperatura() + " - Frio");
        else if (this.tempAtual == QUENTE)
            System.out.println(getTemperatura() + " - Quente");
        else if (this.tempAtual < FRIO || this.tempAtual > QUENTE)  
            System.out.println(getTemperatura() + " - Temperatura Extrema");
        else 
            System.out.println(getTemperatura() + " - Normal");
    }

    public void Run(){
        setTemperatura(9);
        exibirTemperatura();
    }

}
