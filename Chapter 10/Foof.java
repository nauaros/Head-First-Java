class Foof {
  final int size = 3;
  final int whuffie;

  Foof() {
    whuffie = 42; // whuffie can't be changed
  }

  void doStuff(final int x) {
    // can't change x
  }

  void doMore() {
    final int z = 7;
    // can't change z
  }

  final void calcWhuffie() {
    // This method cannot be overrriden by any other subclass
  }
}

final class MyMostPerfectClass() {
  // this class cannot be extended
}
