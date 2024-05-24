package classwork_29;

// внешний класс
public class Transport {
    private String model;
    private String goal;
    private Engine engine;

    public void go() {
        System.out.println("Transport is going");
        this.engine.turnOn();
    }

    public void stop() {
        System.out.println("Transport stopped");
        this.engine.turnOff();
    }

    public void handleAnimalOnWay() {
        System.out.println("Animal is on the way");
        this.engine.criticalTurnOff();
    }

    public Transport(String model, String goal, double engineVolume) {
        this.model = model;
        this.goal = goal;
        this.engine = this.new Engine(engineVolume);
    }

    class Engine {
        private boolean isEnabled = false;
        private double volume;

        public void criticalTurnOff() {
            System.out.println("Critical situation");
            this.isEnabled = false;
            Transport.this.stop();
        }

        public void turnOn() {
            if (!this.isEnabled) {
                this.isEnabled = true;
                System.out.println("The engine is turned on");
            }
        }

        public void turnOff() {
            if (this.isEnabled) {
                this.isEnabled = false;
                System.out.println("The engine is turned off");
            }
        }

        private Engine(double volume) {
            this.volume = volume;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "isEnabled=" + isEnabled +
                    ", volume=" + volume +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", goal='" + goal + '\'' +
                ", engine=" + engine +
                '}';
    }
}
