import java.util.Random;

public class Warrior extends Adventurer {
  //
  private int durability;
  private int maxDurability;
  public Warrior(String name){
      super(name, 10);
      durability = 10;
      maxDurability = 100;
  }

  public Warrior(String name, int hp){
      super(name, hp);
      durability = 10;
      maxDurability = 100;
  }
  public String getSpecialName() {
    //
    return "durability";
  }
  public int getSpecial() {
    //
    return durability;
  }
  public void setSpecial(int n) {
    //
    durability = n;
  }
  public int getSpecialMax() {
    //
    return maxDurability;
  }
  public String attack(Adventurer other) {
    //
    other.setHP(other.getHP - 5);
    return "You attacked someone and they lost 5 HP!";
  }
  public String support(Adventurer other) {
    //
    other.setHP(other.getHP + 5);
    return "You supported someone else and they gained 5 HP!";
  }
  public String support() {
    //
    setHP(getHP() + 5);
    durability += 2;
    if (durablity > maxDurability) {
      durability = maxDurability;
    }
    return "You healed yourself and gained 5 HP and 2 durability!";
  }
  public String specialAttack(Adventurer other) {
    //
    other.setHP(other.getHP() - 10);
    durability -= 1;
    return "You special attacked someone and they lost 10 HP!";
  }
}
