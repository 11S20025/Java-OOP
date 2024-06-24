package _09_Polymorphism;

public class polymorphismApp {
    public static void main(String[] args) {

//        Employee employee = new Employee("Anton");
//        employee.sayHello("Joko");
//
//        employee = new Manager("Roycar");
//        employee.sayHello("Budi");
//
//        employee = new vicePrecident("Nababan");
//        employee.sayHello("Alex");

        sayHello(new Employee("Anton"));
        sayHello(new Manager("Roycar"));
        sayHello(new vicePrecident("Nababan"));
        }
        static void sayHello(Employee employee){
//            System.out.println("Hello " + employee.name);
            if(employee instanceof vicePrecident){
                vicePrecident vicePrecident = (_09_Polymorphism.vicePrecident) employee;
                System.out.println("Hello vp " + vicePrecident.name);
            } else if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                System.out.println("Hello manager " + manager.name);
            } else {
                System.out.println("Hello employee " + employee.name);
            }
        }
}
