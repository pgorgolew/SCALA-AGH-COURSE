public class JavaAppl {
  public static void main(String[] args) {
    Person janek = new Person("Jan", "Kowalski", "1234567890");
    // dostęp do id() jest chroniony (protected)!
    System.out.println(janek.id());
  }
}