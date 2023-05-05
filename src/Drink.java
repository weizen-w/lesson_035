public class Drink extends Food {

  private boolean still;

  public Drink(String name, boolean still) {
    super(name);
    this.still = still;
  }

  public boolean isStill() {
    return still;
  }

  public void setStill(boolean still) {
    this.still = still;
  }

  public String openDrink() {
    if (still) {
      return "скр";
    }
    return "пшш";
  }
}
