public class Demo {

  public static void printLoop(int n) {
    for (int x = 1; x <= n; x++) {
      for (int y = n; y >= x; y -= 1) {
        System.out.print(x);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[] arr) {
    String str = "{";
    for (int i = 0; i < arr.length; i++) {
      str += Integer.toString(arr[i]);
      if (i < arr.length-1) str += ", ";
    }
    return (str + "}");
  }

  public static String arrayDeepToString(int[][] arr) {
    String str = "{";
    //looks at the length of the rows of the array
    for (int i = 0; i < arr.length; i++) {
      str += "{";
      //looks at the length of the column
      for (int j = 0; j < arr[0].length; j++) {
        str += Integer.toString(arr[i][j]);
        if (j < arr[0].length-1) str += ", ";
      }
      if (i != arr.length-1) str += "}, ";
      else {str += "}";}
    }
    return (str + "}");
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = (round)(Math.random() * maxValue);
      }
    }
  }

  public static void main(String[] args) {
    int num = 5;
    if (args.length != 0) num = Integer.parseInt(args[0]);
    printLoop(num);

    int[] a = new int[5];
    System.out.println(arrToString(a));

    int[][] b = new int[3][4];
    //System.out.println(arrayDeepToString(b));
    System.out.println(arrayDeepToString(b).replace("}, ", "},\n"));
  }
}
