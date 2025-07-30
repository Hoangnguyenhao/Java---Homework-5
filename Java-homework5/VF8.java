public class VF8 implements ICar {
    private String licensePlate;
    private final int numberOfSeats = 7;

    public VF8(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public void brake() {
        System.out.println("VF8 is braking...");
    }

    @Override
    public void accelerate() {
        System.out.println("VF8 is accelerating...");
    }

    @Override
    public int getNumberOfWheels() {
        return 4;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void showInfo() {
        System.out.println("===== VF8 =====");
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Wheels: " + getNumberOfWheels());
        System.out.println("Seats: " + numberOfSeats);
    }
}
