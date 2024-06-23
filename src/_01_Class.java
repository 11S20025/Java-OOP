class _01_Class {

    //Field / Atribut
    //Harus dideklarasikan terlebih dahulu didalam class jika ingin dipakai didalam objek
    String name;
    String address;
    final String country = "Indonesia";

    //Method
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", my name is " + name);
    }
}
