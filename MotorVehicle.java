abstract class MotorVehicle{
String modelName;
String modelNumber;
double modelPrice;
MotorVehicle(String modelName,String modelNumber,double modelPrice){
    this.modelName = modelName;
    this.modelNumber = modelNumber;
    this.modelPrice =  modelPrice;
    } 
void display(){
    System.out.println("Model Name: " + modelName);
    System.out.println("Model Number: " + modelNumber);
    System.out.println("Base Price: " + modelPrice);
}
}

class Car extends MotorVehicle{
    double discountrate;
    Car(String modelName,String modelNumber,double modelPrice, double dr){
        super(modelName,modelNumber,modelPrice);
        this.discountrate=dr;
    }
    
    void display(){
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Base Price: " + modelPrice);
        System.out.println("Discount rate: " + discountrate);
    }
    void discount(){
        double d = 0.05*modelPrice;
        System.out.println("Discount given: " + d);
        System.out.println("Final Price: " + (modelPrice-d));
    }


}

class Main{
    public static void main(String[] args){
        Car c = new Car("ABC","101",1000000, 0.05);
        c.display();
        c.discount();
    }
}
