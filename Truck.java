class Truck extends Vehicle {
    public Truck(String brand, String model, int year, double price) {
        super(brand, model, year, price);
    }

    @Override
    public String getType() {
        return "Truck";
    }
}