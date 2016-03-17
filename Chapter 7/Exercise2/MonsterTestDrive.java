public class MonsterTestDrive {
  public static void main(String[] args) {
    Monster[] ma = new Monster[3];
    ma[0] = new Vampire();
    ma[1] = new Dragon();
    ma[2] = new Monster();

    for (int i = 0; i < 3; i++) {
      ma[i].frighten(i);
    }
  }
}
