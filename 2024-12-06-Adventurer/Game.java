import java.util.Random;
import java.util.Scanner;

public class Game {
  //
  public static void main(String[] args) {
    //
    boolean gameOn = true;
    Adventurer A = new CodeWarrior();
    Adventurer B = new Warrior("B");
    Scanner input = new Scanner(System.in);
    boolean valid = false;
    while (gameOn) {
      // game loop
      printStats(A, B);
      valid = false;
      while (!valid) {
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / (q)uit");
        String response = input.nextLine();
        if (response.equals("q") || response.equals("quit")) {
          gameOn = false;
          valid = true;
        } else if (response.equals("attack") || response.equals("a")) {
          // do something
          System.out.println(B.attack(A));
          valid = true;
        } else if (response.equals("special") || response.equals("sp")) {
          // do something part 2
          System.out.println(B.specialAttack(A));
          valid = true;
        } else if (response.equals("support") || response.equals("su")) {
          // do something part 3
          System.out.println(B.support());
          valid = true;
        } else {
          // invalid
          valid = false;
          System.out.println("Invalid response. Enter one of the following: (a)ttack / (sp)ecial / (su)pport / (q)uit");
        }
      }
      if (A.getHP() >= 0 && gameOn) {
        //
        int choice =(int)( Math.random() * 3);
        if (choice == 0) {
          System.out.println(A.attack(B));
        } if (choice == 1) {
          System.out.println(A.specialAttack(B));
        } if (choice == 2) {
          System.out.println(A.support());
        }
      } else {
        if (gameOn) {
          System.out.println("Not too bad...you won...");
        }
        gameOn = false;
      }
      if (B.getHP() <= 0) {
        //
        System.out.println("L bozo, you lost");
        gameOn = false;
      }
    }
  }
  public static void printStats(Adventurer A, Adventurer B) {
    //
    System.out.println(A.getName() + ", " + A.getHP()+"/" + A.getmaxHP() + " HP, " +  A.getSpecial()+"/" + A.getSpecialMax() + " " + A.getSpecialName());
    System.out.println(B.getName() + ", " + B.getHP()+"/" + B.getmaxHP() + " HP, " +  B.getSpecial()+"/" + B.getSpecialMax() + " " + B.getSpecialName());
  }
}
