public class Template {




    public abstract class Videogames {

        abstract void initialize();
        abstract void startPlay();

        abstract void endPlay();

        void preparation(){

            initialize();
            startPlay();
            endPlay();

        }

    }



    public class Codwarzone extends Videogames{

        @Override
        void initialize() {
            System.out.println("WZ game initialize.");
        }

        @Override
        void startPlay() {
            System.out.println("wz game started");
        }

        @Override
        void endPlay() {
            System.out.println("wz match over");
        }
    }


    public class Fortnite extends Videogames{
        @Override
        void initialize() {
            System.out.println("Fortnite game initialize.");
        }

        @Override
        void startPlay() {
            System.out.println("Fortnite game started");
        }

        @Override
        void endPlay() {
            System.out.println("Fortnite match over");
        }
    }



    public static void main(String[] args) {

        Template t = new Template();
        Videogames  warzone = t.new Codwarzone();
        warzone.preparation();

        System.out.println("");
        Videogames fortnite =t.new Fortnite();
        fortnite.preparation();
    }






}