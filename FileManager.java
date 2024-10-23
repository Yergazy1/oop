import java.io.*;
import java.util.ArrayList;
import java.util.List;

class FileManager {

    public static void saveVehiclesToFile(List<Vehicle> vehicles, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Vehicle vehicle : vehicles) {
                writer.write(vehicle.toString());
                writer.newLine();   
            }
        } catch (IOException e) {
            System.out.println("Error saving vehicles to file: " + e.getMessage());
        }
    }

    public static List<Vehicle> loadVehiclesFromFile(String filename) {
        List<Vehicle> vehicles = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // В этом месте можно добавить парсинг строки и создание объекта
            }
        } catch (IOException e) {
            System.out.println("Error loading vehicles from file: " + e.getMessage());
        }
        return vehicles;
    }
}
