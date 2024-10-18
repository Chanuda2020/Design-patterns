public class Factory {

    public interface Drone {

        void viewPerformance();
    }
    public class Dji implements  Drone{
        @Override
        public void viewPerformance() {
            System.out.println("This is dji drone,4k 60,38 min");

        }
    }

    public class Potensic implements Drone {

        @Override
        public void viewPerformance() {
            System.out.println("This is Potensic,4k 60 fps ,30 min");
        }
    }
    public class Cfly implements  Drone{
        @Override
        public void viewPerformance() {
            System.out.println("This is Cfly brand , 4k 30fps,28 min");
        }
    }
    public class DroneFactory {
        public Drone getDrone(String str){
            if(str == null){
                return null;
            } if(str.equals("Low price")){
                return new Cfly();
            } else if (str.equals("Middle price")) {
                return new Potensic();

            } else if (str.equals("Expensive")) {
                return new Dji();

            }
            return null;

        }
    }



    public static void main(String[] args) {


        Factory fac = new Factory();
        DroneFactory droneFactory = fac.new DroneFactory();

        Drone myDrone = droneFactory.getDrone("Middle price");
        myDrone.viewPerformance();
    }
}