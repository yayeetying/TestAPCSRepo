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
      for (int j = 0; j < arr[i].length; j++) {
        str += Integer.toString(arr[i][j]);
        if (j < arr[i].length-1) str += ", ";
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
        arr[i][j] = (int)(Math.random() * (maxValue+1));
      }
    }
    return arr;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][];
    for (int i = 0; i < rows; i++) {
      int j = (int)(Math.random() * (cols+1));
      arr[i] = new int[j];
      for (int x = 0; x < j; x++) {
        arr[i][x] = (int)(Math.random() * (maxValue+1));
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int num = 5;
    if (args.length != 0) num = Integer.parseInt(args[0]);
    printLoop(num);

    // System.out.println();
    //
    // int[] a = new int[5];
    // System.out.println(arrToString(a));
    // System.out.println();
    //
    // int[][] b = new int[3][4];
    // //System.out.println(arrayDeepToString(b));
    // System.out.println(arrayDeepToString(b).replace("}, ", "},\n"));
    // System.out.println();
    //
    // System.out.println(arrayDeepToString(create2DArray(5,4,4)).replace("}, ", "},\n"));
    // System.out.println();
    // System.out.println(arrayDeepToString(create2DArray(6,2,3)).replace("}, ", "},\n"));
    // System.out.println();
    //
    // System.out.println(arrayDeepToString(create2DArrayRandomized(6,4,4)).replace("}, ", "},\n"));
    // System.out.println();
    // System.out.println(arrayDeepToString(create2DArrayRandomized(4,10,100)).replace("}, ", "},\n"));
  }
}
