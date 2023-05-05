public class Main {
//  Создать класс Food (еда). В классе должны быть:
//   - поле "название"
//   - конструктор, геттер, сеттер
//   - метод "употребить еду" с каким-нибудь выводом

//  Создать класс Drink (напиток) - наследника класса Food. В классе должны быть дополнительно:
//   - поле "газированный" (да/нет)
//   - метод "открыть", который:
//     для газированного напитка печатает "пшш",
//     для негазированного - "скр"

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
