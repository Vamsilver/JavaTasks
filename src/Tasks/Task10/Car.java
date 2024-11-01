package Tasks.Task10;

import Helpers.Mth;

public class Car {
    private String carBrand;
    private double speed;
    private double weight;

    public Car(String carBrand, double speed, double weight) {
        this.carBrand = carBrand;
        this.speed = speed;
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void startCar()
    {
        Engine engine = new Engine();
        FuelTank fuelTank = new FuelTank();

        engine.start();
        fuelTank.showFuelCapacity();

        System.out.println("Машина весом " + weight + " кг " + "стремится к скорости " + speed + " км/ч");
    }

    private class Engine {
        private void start() {
            System.out.println("Двигатель машины марки " + carBrand + " запущен");

            class Piston {
                private double efficiency;

                public Piston(double efficiency) {
                    this.efficiency = efficiency;
                }

                public void showPistonEfficiency() {
                    System.out.println("Кпд поршня = " + efficiency);
                }
            }

            Piston piston = new Piston( Mth.randomWithRound(50,100, 2));
            piston.showPistonEfficiency();
        }
    }

    private class FuelTank {
        private double capacity;
        private double fuelRemaining;

        public FuelTank() {
            capacity = Mth.randomWithRound(80.3,120, 2);
            fuelRemaining = Mth.randomWithRound(5,capacity, 2);
        }

        public double getCapacity() {
            return capacity;
        }

        public double getFuelRemaining() {
            return fuelRemaining;
        }

        private class Fuel {
            private int OCTANE_NUMBER = 95;

            public Fuel(int OCTANE_NUMBER) {
                this.OCTANE_NUMBER = OCTANE_NUMBER;
            }

            public Fuel() {}

            public void showOctaneNumber() {
                System.out.println("Октановое число бензина " + OCTANE_NUMBER);
            }
        }

        private void showFuelCapacity() {
            System.out.println("Бензина в машине " + fuelRemaining + "/" + capacity + " л");
            Fuel fuel = new Fuel(98);
            fuel.showOctaneNumber();
        }
    }
}
