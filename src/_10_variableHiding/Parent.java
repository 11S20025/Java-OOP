package _10_variableHiding;

class Parent {
    String name;
    void doIt(){
        System.out.println("Do it in parent.");
    }
}

class Child extends Parent{
    //tidak perlu menginisialisasi variabel kembali karena sudah berdiri sendiri jika diiniliasasi lagi, bukan turunan dari class parent
//    String name;
    void doIt(){
        System.out.println("Do it in child.");
    }
}