public class _04_ObjectConstructorOverloading {
    public static void main(String[] args) {

        var person1 = new _04_ConstructorOverloading("Anton", "Butar");
        var person2 = new _04_ConstructorOverloading("Anton");
        var person3 = new _04_ConstructorOverloading();

        System.out.println("Nama saya " + person1.name + ", alamat " + person1.address);
        System.out.println("Nama saya " + person2.name);
        System.out.println("Nama saya " + person3.name);

    }
}
