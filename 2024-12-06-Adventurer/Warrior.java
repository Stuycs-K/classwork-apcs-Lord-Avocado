import java.util.Random;

public class Warrior extends Adventurer {
  //
  private int durability;
  public Warrior(String name){
      super(name, 10);
      durability = 10;
  }

  public Warrior(String name, int hp){
      super(name, hp);
      durability = 10;
  }
  public String getSpecialName() {
    //
    return "durability";
  }
}
