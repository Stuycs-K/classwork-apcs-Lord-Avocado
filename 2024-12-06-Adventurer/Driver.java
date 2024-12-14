import java.util.Random;

public class Driver {
  public static void main(String[] args) {
    //
    // System.out.println("..");
    Adventurer A = new Warrior("A", 10);
    Adventurer B = new Warrior("B", 10);
    System.out.println(A.getSpecialName());
    System.out.println("Durability for A: " + A.getSpecial());
    System.out.println("Durability for B: " + B.getSpecial());
    A.setSpecial(15);
    System.out.println("Durability for A: " + A.getSpecial()); // should be 15 now
    System.out.println("Durability Max for A: " + A.getSpecialMax()); // should be 100d
    System.out.println(A.attack(B));
    System.out.println("HP for A: " + A.getHP()); // should be 10
    System.out.println("HP for B: " + B.getHP()); // should be 5
    System.out.println(B.support(A));
    System.out.println("HP for A: " + A.getHP()); // should be 15
    System.out.println("HP for B: " + B.getHP()); // should still be 5
    System.out.println(B.support());
    System.out.println("HP for A: " + A.getHP()); // should be 15
    System.out.println("Durability for A: " + A.getSpecial()); // should be 15
    System.out.println("HP for B: " + B.getHP()); // should be 10
    System.out.println("Durability for B: " + B.getSpecial()); // should be 12
    System.out.println(B.specialAttack(A));
    // end of testing
    System.out.println();
    System.out.println("HP for A: " + A.getHP()); // should be 5
    System.out.println("Durability for A: " + A.getSpecial()); // should be 15
    System.out.println("HP for B: " + B.getHP()); // should be 10
    System.out.println("Durability for B: " + B.getSpecial()); // should be 11
  }
}
