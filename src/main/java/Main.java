public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage(
                "Auto Service",
                "Odessa",
                "+380123456789");

        Car car1 = new Car("Toyota", 2020, "AA1234BB", "C001");
        Car car2 = new Car("Honda", 2019, "BC5678DE", "C002");
        Car car3 = new Car("Ford", 2021, "CE9012FG", "C003");
        Car car4 = new Car("BMW", 2022, "DH3456IJ", "C004");
        Car car5 = new Car("Mercedes", 2018, "EK7890KL", "C005");
        Car car6 = new Car("Audi", 2023, "FM1234NO", "C006");
        Car car7 = new Car("Volkswagen", 2020, "GP5678QR", "C007");
        Car car8 = new Car("Nissan", 2017, "HS9012TU", "C008");
        Car car9 = new Car("Hyundai", 2021, "IV3456WX", "C009");
        Car car10 = new Car("Kia", 2022, "JY7890ZA", "C010");
        Owner owner1 = new Owner(
                "Ivan Vasko",
                "+380987654321",
                1,
                "Kyiv");

        garage.addCar(car1, owner1, "Engine repair");

        garage.printCarsInProcess();

        garage.returnCarToOwner("AA1234BB");
    }
}

