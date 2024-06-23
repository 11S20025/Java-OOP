public class _02_Object {
    public static void main(String[] args) {

        var person1 = new _01_Class();
        _01_Class person2 = new _01_Class();
        _01_Class person3;
        person3 = new _01_Class();

        // Manipulasi Field
        // Country tidak bisa diubah karena sudah di beri tanda final
        person1.name = "Anton";
        person1.address = "Siborongborong";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        // Memanggil method yang ada di dalam class
        person1.sayHello("Budi");

        // Mengakses objek
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);

    }
}
