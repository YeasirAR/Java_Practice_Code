package exam;

class Vehicle {
    int wheels;
    int seats;
    public static int instances;
    Vehicle(int wheels,int seats){
        this.wheels = wheels;
        this.seats = seats;
        instances++;
    }
    Vehicle(){
        instances++;
    }
}

class MotorVehicle extends Vehicle{
    double hp;

    MotorVehicle(int wheels, int seats) {
        super(wheels, seats);
    }
    MotorVehicle(int hp) {
        super();
        this.hp = hp;
    }
    MotorVehicle() {
        super();
    }
}