public class Owner {
    private String name;
    private String phone;
    private int id;
    private String address;

    public Owner(String name, String phone, int id, String address) {
        this.name = name;
        this.phone = phone;
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + ", phone: " + phone;
    }
}
