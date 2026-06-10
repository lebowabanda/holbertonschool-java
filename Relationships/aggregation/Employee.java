public class Employee {

    private String name;
    private int code;
    private Address address;

    public Employee(String name, int code, Address address) {
        this.name = name;
        this.code = code;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public Address getAddress() {
        return address;
    }

    public void introduce() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("District: " + address.getDistrict());
        System.out.println("City: " + address.getCity());
        System.out.println("Country: " + address.getCountry());
    }
}