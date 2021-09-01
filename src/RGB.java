public class RGB{
    private int red;
    private int green;
    private int blue;
    
    // Constructs 
    public RGB(int red_, int green_, int blue_){
    	this.red = red_;
    	this.green = green_;
    	this.blue = blue_;
    }
    

    // Getters 
    public int getRed(){
        return this.red;
    }

    public int getGreen(){
        return this.green;
    }

    public int getBlue(){
        return this.blue;
    }
    
    // Setters
    public void setRed(int newRed){
        this.red = newRed;
    }

    public void setGreen(int newGreen){
        this.green = newGreen;
    }

    public void setBlue(int newBlue){
        this.blue = newBlue;
    }
    
    public int getLuminosidade (int red, int green, int blue) {
    	return (int) ((red*0.3) + (green*0.59) + (blue*0.11));
    }
    
    public int isValidColor(int color){
    	if (color < 0 || color > 255)
    		return -1;
   
    	return 1;
    }
}