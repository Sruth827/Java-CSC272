public class TestBikes {
    public static void main(String[] args) {
        bikeBMX BMXbike = new bikeBMX(1, 2);
        mountainBike MountainBike = new mountainBike(6, 4); 

        BMXbike.braking();
        BMXbike.grinding(); 
        MountainBike.trailRiding();

    }
}
