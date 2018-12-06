import com.sun.scenario.effect.impl.prism.PrImage;
import org.omg.CORBA.PRIVATE_MEMBER;

public class WheeledVehicle extends Vehicle implements Engine {

        private int maxSpeed;
        private int maxSpeed1;
        private int getMaxSpeed2;

        public int newSpeed(int maxSpeed3){
        System.out.println( "The new Max speed is: " );
        return 4*maxSpeed3;
    }

       public int newSpeed(int maxSpeed1, int maxSpeed2){
            System.out.println( "The new Max second speed is: " );
            return 4*(maxSpeed1+maxSpeed2);
    }


    public void drive() {
        System.out.println( "This is drive" );
    }

    public void test() {
        System.out.println( "This is test" );
    }


        public void start() {
            System.out.println( "This is Wheeled Vehicle" );
        }


    public void startEngine() {

    }


    public void move() {

    }

    public void burn() {

    }
}

