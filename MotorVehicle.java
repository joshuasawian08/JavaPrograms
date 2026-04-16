abstract class motorVehicle{
    String ModelName;
    int ModelNumber;
    double ModelPrice;
    abstract void display();
}


class carThat extends motorVehicle{
    double discountRate;
    @Override
    void display(){
        System.out.println("Moderl Name: " + ModelName);
        System.out.println("Model Price: " + ModelPrice);
        System.out.println("Model Number: " + ModelNumber);
        System.out.println("Discount Rate: " + discountRate);
    }

    void discount(){
        double result = (ModelPrice * (100 - discountRate))/100;
        System.out.println("Final Price: " + result);
    }
}

public class MotorVehicle{
    public static void main(String[] args){
        carThat obj = new carThat();
        obj.ModelName = "Mahindra";
        obj.ModelNumber = 2;
        obj.ModelPrice = 2000000;
        obj.discountRate = 20;
        obj.display();
        obj.discount();
    }
}