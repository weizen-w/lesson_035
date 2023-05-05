public class Drink extends Food {

  private boolean still;

  public Drink(String name, boolean still) {
    super(name);
    this.still = still;
  }

  public boolean getStill() {
    return still;
  }

  public void setStill(boolean still) {
    this.still = still;
  }

  static String openDrink(Drink drink) {
    if (drink.getStill()) {
      return "скр";
    }
    return "пшш";
  }
}
