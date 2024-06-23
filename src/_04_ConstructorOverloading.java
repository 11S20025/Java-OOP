public class _04_ConstructorOverloading {

    String name;
    String address;

    _04_ConstructorOverloading(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    _04_ConstructorOverloading(String paramName){
        // Dengan cara biasa
//        name = paramName;

        // Dengan cara yang lebih efisien
        // Memanggil Constructor dengan menggunakan "this"
        this(paramName, null);
    }

    _04_ConstructorOverloading(){
        // Dengan cara yang lebih efisien
        this(null, null);
    };

}
