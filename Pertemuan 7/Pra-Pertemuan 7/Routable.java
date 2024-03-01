public interface Routable{
    public void findShortestRoute(Location start, Location end);
}

/**
* CarRoute
 */
class CarRoute implements Routable{
    @Override
    public void findShortestRoute(Location start, Location end){
        System.out.println("Ini rute untuk mobil");
    }
}

/**
* MotorcycleRoute
 */
class MotorcycleRoute implements Routable{
    @Override
    public void findShortestRoute(Location start, Location end){
        System.out.println("Ini rute untuk motor");
    }
}

/**
* PedestrianRoute
 */
class PedestrianRoute implements Routable{
    @Override
    public void findShortestRoute(Location start, Location end){
        System.out.println("Ini rute untuk pejalan kaki/pedestrian");
    }
}