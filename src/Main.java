public class Main {
    public static void main(String[] args) {
        System.out.println("═══ EMPLOYEE MANAGEMENT SYSTEM ═══\n");

        Manager manager = new Manager("Alice Smith", 2001, 80000, "Engineering", 15000, 8);
        Developer developer = new Developer("Bob Johnson", 2002, 70000, "Engineering", "Java", 5);
        Intern intern = new Intern("Charlie Brown", 2003, 30000, "Engineering", "Tech University", true);


        System.out.println();
        manager.displayInfo();
        manager.work();
        System.out.println("Total Salary: $" + manager.calculateSalary());


        System.out.println();
        developer.displayInfo();
        developer.work();
        System.out.println("Total Salary: $" + developer.calculateSalary());


        System.out.println();
        intern.displayInfo();
        intern.work();
        System.out.println("Total Salary: $" + intern.calculateSalary());
    }
}