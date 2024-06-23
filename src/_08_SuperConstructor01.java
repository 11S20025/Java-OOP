class _08_SuperConstructor01 {
    String name;
    _08_SuperConstructor01(String name){
        this.name = name;
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", my name is Manager " + this.name);
    }
}
