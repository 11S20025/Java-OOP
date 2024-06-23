public class _06_InheritanceObject {
    public static void main(String[] args) {

        var manager = new _06_Inheritance01();
        manager.name = "Anton";
        manager.sayHello("Bos");

        var vicePresident = new _06_Inheritance01._06_Inheritance02();
        vicePresident.name = "Roycar";
        vicePresident.sayHello("Bro");
    }
}
