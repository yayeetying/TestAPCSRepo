public class Demo {

  public static void printLoop(int n) {
    for (int x = 1; x <= n; x++) {
      for (int y = n; y >= x; y -= 1) {
        System.out.print(x);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int num = 5;
    if (args.length != 0) num = Integer.parseInt(args[0]);
    printLoop(num);
  }
}
