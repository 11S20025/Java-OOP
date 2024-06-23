class _08_SuperConstructor02 extends _08_SuperConstructor01{
    _08_SuperConstructor02(String name){
        //Constructor harus diakses jika ada parameter
            super(name);
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", my name is VP " + this.name);
    }
}
