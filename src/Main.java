public class Main {

  public static void main(String[] args) {
    Food food = new Food("гамбургер");
    System.out.println("Текущее название еды: " + food.getName());
    food.setName("бутерброд");
    System.out.println("Измененное имя еды: " + food.getName());
    System.out.println("Человек ест " + food.getName() + " - \"" + Food.useFood() + "\"");
    Drink drink = new Drink("Кола", false);
    System.out.println("Открываем " + drink.getName() + " - " + Drink.openDrink(drink));
    drink.setName("Вода");
    System.out.println("Измененное имя напитка: " + drink.getName());
    (drink).setStill(true);
    System.out.println("Открываем " + drink.getName() + " - " + Drink.openDrink(drink));
    System.out.println("Человек пьет " + drink.getName() + " - \"" + Drink.useFood() + "\"");
  }
}
