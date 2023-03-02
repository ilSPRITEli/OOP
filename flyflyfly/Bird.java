
public abstract class Bird implements Flyable{
    private double  wingSize;
    private double weight;
    private double height;
    
    public double getWingSize(){
        return this.wingSize;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWeight(){
        return this.weight;
    }
    
    public void setWingSize(double wingSize){
        this.wingSize = wingSize;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setHeight(double height){
        this.height = height;
    }
    
    
    
    
    public Bird(){
        this(0.0, 0.0, 0.0);
    }
    public Bird(double wingSize, double weight, double height){
        this.setWingSize(wingSize);
        this.setWeight(weight);
        this.setHeight(height);
    }
    public void eat(double food){
        if(food > 0){
            this.setWeight(this.weight + food);
        }else{
            System.out.println("Input cannot be negative number.");
        }
    }
}
