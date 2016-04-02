class Foo {
  int x = 12;

  public void go(final int y) {
    System.out.println(x);
  }

  public static void main(String[] args) {
    Foo one = new Foo();
    one.go(5);
  }
}
