public class Main_Test {
    public static void main (String args[]){
        Location STIS = new Location(
            "POLSTAT STIS",
            new Coordinates(-6.231d, 106.867)
        );
        Location STAN = new Location(
            "PKN STAN",
            new Coordinates(-6.267d, 106.732)
        );

        Route drivingRoute = new Driving(STIS, STAN);
        drivingRoute.printRoute();

        Route ridingRoute = new Riding(STIS, STAN);
        ridingRoute.printRoute();

        Route walkingRoute = new Walking(STIS, STAN);
        walkingRoute.printRoute();
  }
}
