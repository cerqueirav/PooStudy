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
    
    public RGB(RGB color){
    	this.red = color.getRed();
    	this.green = color.getGreen();
    	this.blue = color.getBlue();
    }
    
    public RGB(){
    	this.red = 0;
    	this.green = 0;
    	this.blue = 0;
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
    
    // Methods
    public int getLuminosidade (int red, int green, int blue) {
    	return (int) ((red*0.3) + (green*0.59) + (blue*0.11));
    }
    
    public int getLuminosidade (RGB color) {
    	return (int) ((color.getRed()*0.3) + (color.getGreen()*0.59) + (color.getBlue()*0.11));
    }
    
    public String intToHex(RGB color){
    	String colorHex;
    	
    	colorHex = (Integer.toHexString(color.getRed()));
    	colorHex += (Integer.toHexString(color.getGreen()));
    	colorHex += (Integer.toHexString(color.getBlue()));
    	
    	colorHex = colorHex.toUpperCase();
    	
    	return "#" +  colorHex;
    }
    
    public int isValidColor(int color){
    	if (color < 0 || color > 255)
    		return -1;
   
    	return 1;
    }
}