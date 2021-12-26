public class SwitchCase {
    private final int QUENTE = 40;
    private final int FRIO = 10;
    private final int EXTREMA = 9;
    private int tempAtual;

    public void setTemperatura(int temp){
        this.tempAtual = temp;
    }

    public int getTemperatura(){
        return this.tempAtual;
    }

    public void exibirTemperatura(){
        int temp = ((this.tempAtual < FRIO | this.tempAtual > QUENTE) ? EXTREMA : tempAtual);

        switch(temp){
            case FRIO:
                System.out.println(getTemperatura() + " - Frio");
                break;
            case QUENTE:
                System.out.println(getTemperatura() + " - Quente");
                break;
            case EXTREMA:
                System.out.println(getTemperatura() + " - Temperatura Extrema");
                break;
            default:
                System.out.println(getTemperatura() + " - Normal");
        } 
    }

    public void Run(){
        setTemperatura(9);
        exibirTemperatura();
    }    
}
