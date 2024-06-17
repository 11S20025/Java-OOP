public class _05_thisKeywordObject {
    public static void main(String[] args) {
        var person = new _05_thisKeyword("Anton", "Siborongborong");
        System.out.println("My name is " + person.name + ", I come from " + person.address );
        person.sayHello();
    }
}
