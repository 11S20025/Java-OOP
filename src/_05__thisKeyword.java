public class _05_thisKeyword {
    String name;
    String address;

    _05_thisKeyword(String name, String address){
        this.name = name;
        this.address = address;
    }

    void sayHello(){
        this.sayHello("Bos");
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}
