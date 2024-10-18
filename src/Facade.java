public class Facade {


    public interface gamers {
        void play();
    }


    public class Pcgamers implements gamers {
        @Override
        public void play() {
            System.out.println("I am PC gamer");
        }

        public void framerate() {
            System.out.println("I can reach 180fps");
        }

    }

    public class Playstationgamers implements gamers {
        @Override
        public void play() {
            System.out.println("I am playstation gamer");
        }

        public void output() {
            System.out.println("i can reach 120FPS");
        }
    }

    public class Esport {
        Pcgamers pcgamers;
        Playstationgamers psgamers;

        public Esport() {
            pcgamers = new Pcgamers();
            psgamers=  new Playstationgamers();
        }

        public void pcgame() {
            pcgamers.play();
            pcgamers.framerate();
        }

        public void psgame() {
            psgamers.play();
            psgamers.output();

        }

    }


    public static void main(String[] args) {
        Facade fac = new Facade();

        Esport e = fac.new Esport();
        e.psgame();

        System.out.println(" ");

        e.pcgame();
    }

}
