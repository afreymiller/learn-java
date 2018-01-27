class Employee extends Person {
 void walk() {
  System.out.println("Running Fast...");
 }

 public static void main(String arg[]) {
  Person p = new Employee(); //upcasting
  p.walk();
 }
}