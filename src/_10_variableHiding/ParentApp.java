package _10_variableHiding;

public class ParentApp {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Anton";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        // bisa juga langsung tanpa (Parent) karena dalam kelas child
        parent.doIt();
        System.out.println(parent.name);
    }
}
