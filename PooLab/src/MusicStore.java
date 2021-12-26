import java.util.Calendar;
import java.util.Date;

public class MusicStore {
    private String hoursOfOperation;
    private String owner;
    private int openTime;
    private int closeTime;

    public MusicStore(){
        setHoursOfOperation("Diariamente das 9:00 - 21:00");
        setOwner("sem dono.");
        setOpenTime(9);
        setCloseTime(21);
    }

    public void setHoursOfOperation(String hours){
        this.hoursOfOperation = hours;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public void setOpenTime(int openTime){
        this.openTime = openTime;
    }

    public void setCloseTime(int closeTime){
        this.closeTime = closeTime;
    }

    public String getOwner(){
        return this.owner;
    }

    public int getOpenTime(){
        return this.openTime;
    }

    public int getCloseTime(){
        return this.closeTime;
    }

    public void displayHoursOfOperation(){
        System.out.println("Período: \n" + "Diariamente das: " + this.getOpenTime() 
        + ":00 - " + this.getCloseTime() + ":00");
    }

    public void displayOwner(){
        System.out.println(getOwner() + ", Proprietário \n");
    }

    public int getHourInt() {
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.HOUR_OF_DAY);
    }

    public boolean isOpen(){
        if (getHourInt() >= getOpenTime() && getHourInt() <= getCloseTime())
            return true;
        else 
            return false;
    }

    public void getOpenClosedMessage(){
        if (isOpen())
            System.out.println("Estamos Abertos!");
        else
            System.out.println("Estamos Fechados!");
    }

    public void Run(){
        displayHoursOfOperation();
        getOpenClosedMessage();
        setOwner("Roberto");
        displayOwner();

        
    }    
}
