class _06_Inheritance01 {
    String name;

    void sayHello(String name){
        System.out.println("Hi " + name  + ", My name is " + this.name);
    }

    static class _06_Inheritance02 extends _06_Inheritance01 {
    }
}
