public class Bike {
    private final int gear; // Field or State

    public Bike(int gear){
        this.gear = gear;
    }
    //Method or Behavior
    public void braking() {
        System.out.println("The bike is braking"); 
    }
}

class bikeBMX extends Bike {
    private final int pegs; 

    public bikeBMX(int gear, int pegs){
        super(gear);
        this.pegs = pegs; 
    }
    public void grinding(){
        System.out.println("The BMX bike is grinding the rail");
    } 
    
}

class mountainBike extends Bike {
    private final int shocks; 

    public mountainBike(int gear, int shocks){
        super(gear);
        this.shocks = shocks; 
    }
    public void trailRiding(){
        System.out.println("The mountain bike is riding the trail");
    } 
    
}
