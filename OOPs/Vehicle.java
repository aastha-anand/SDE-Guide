package OOPs;

public class Vehicle {
    
    final String name;
    final double price;

    public Vehicle(String name,double price){
        this.name=name;
        this.price=price;
    }

    public void show(){
        System.out.println("Name of the vehicle: "+name);
        System.out.println("Price of the vehicle: "+price);
    }

    public static class Electric extends Vehicle{
         String type;
         public  Electric(String name,double price,String type){
            super(name,price);
            this.type=type;
         }

         public void show(){
            System.out.println("Name of the vehicle: "+name);
            System.out.println("Price of the vehicle: "+price);
            System.out.println("Type of the vehicle: "+type);
         }
    }
    public static void main(String[]args){
         Vehicle car=new Vehicle("Range Rover", 3000000.0);
         car.show();

         Electric car1=new Electric("Tesla",7000000,"electic");
         car1.show();

    }
}
