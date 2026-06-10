public class Program {
        public static void main(String[] args) {
            Address address = new Address("Pennsylvania Avenue",
                    "1600",
                    "",
                    "NW",
                    "Washington",
                    "DC",
                    "USA");

            Employee employee = new Employee("Jane Doe", 1, address);

            employee.introduce();

            System.out.println();
        }
    }