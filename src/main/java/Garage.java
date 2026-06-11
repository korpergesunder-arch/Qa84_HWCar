 import java.util.TreeMap;

    public class Garage {
        private String name;
        private String address;
        private String phone;

        private TreeMap<String, Owner> cars = new TreeMap<>();
        private TreeMap<String, Car> carObjects = new TreeMap<>();

        public Garage(String name, String address, String phone) {
            this.name = name;
            this.address = address;
            this.phone = phone;
        }

        public void addCar(Car c, Owner ow) {
            cars.put(c.getRegNumber(), ow);
            carObjects.put(c.getRegNumber(), c);
        }

        public void addCar(Car c, Owner ow, String service) {
            c.setServiceType(service);
            addCar(c, ow);
        }

        public void printCarsInProcess() {
            for (String reg : carObjects.keySet()) {
                Car c = carObjects.get(reg);
                System.out.println(c + " -> " + c.getServiceType());
            }
        }

        public void returnCarToOwner(String regNumber) {
            if (carObjects.containsKey(regNumber)) {
                carObjects.remove(regNumber);
                cars.remove(regNumber);
                System.out.println("Car returned to owner.");
            } else {
                System.out.println("Car not found.");
            }
        }
    }

