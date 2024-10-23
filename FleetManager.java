import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FleetManager {
    private List<Vehicle> vehicles;

    public FleetManager() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void saveVehicles(String filename) {
        FileManager.saveVehiclesToFile(vehicles, filename);
    }

    public void loadVehicles(String filename) {
        vehicles = FileManager.loadVehiclesFromFile(filename);
    }

    public void displayVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public static void main(String[] args) {
        FleetManager manager = new FleetManager();
        Scanner scanner = new Scanner(System.in);

        // Добавление транспортных средств вручную
        manager.addVehicle(new Car("Toyota", "Camry", 2020, 24000));
        manager.addVehicle(new Truck("Ford", "F-150", 2019, 32000));
        manager.addVehicle(new Motorcycle("Yamaha", "YZF-R1", 2021, 18000));

        // Сохранение в файл
        manager.saveVehicles("vehicles.txt");

        // Загрузка из файла и вывод на экран
        manager.loadVehicles("vehicles.txt");
        manager.displayVehicles();
    }
}
