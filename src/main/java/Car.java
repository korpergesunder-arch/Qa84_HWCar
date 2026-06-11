public class Car {
        private String model;
        private int year;
        private String regNumber;
        private String code;
        private String serviceType; // не в конструкторі

        public Car(String model, int year, String regNumber, String code) {
            this.model = model;
            this.year = year;
            this.regNumber = regNumber;
            this.code = code;
        }

        public String getRegNumber() {
            return regNumber;
        }

        public String getServiceType() {
            return serviceType;
        }

        public void setServiceType(String serviceType) {
            this.serviceType = serviceType;
        }

        @Override
        public String toString() {
            return model + " (" + regNumber + ")";
        }

}