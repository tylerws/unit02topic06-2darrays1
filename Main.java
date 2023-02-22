import java.util.Arrays;
public class Main {
  
public static double[][] copySquare(double[][] nums) {
  int rowsSq = nums.length;
  int columnsSq = rowsSq;
  double[][] copySq = new double[rowsSq][columnsSq];

  for (int r = 0; r < rowsSq; r++) {
    for (int c = 0; c < columnsSq; c++) {
      copySq[r][c] = nums[r][c];
    }
  }
  return copySq;
}

public static double[][] copyRectangle(double[][] nums) {
  int rowsRe = nums.length;
  int columnsRe = nums[0].length;
  double [][] copyRe = new double[rowsRe][columnsRe];

  for (int r = 0; r < rowsRe; r++) {
    for (int c = 0; c < columnsRe; c++) {
      copyRe[r][c] = nums[r][c];
    }
  }
 return copyRe;
}

public static double[][] copyRagged(double[][] nums) {
  double[][] copyRa = new double[nums.length][];
  for (int r = 0; r < nums.length; r++) {
    copyRa[r] = new double[nums[r].length];
  }
  for (int r = 0; r < nums.length; r++) {
    int numCols = nums[r].length;
    for (int c = 0; c < numCols; c++) {
      copyRa[r][c] = nums[r][c];
    }
  }
  return copyRa;
}

// public static double[][] printTranspose(double[][] nums) {
//   int rows = nums.length;
//   int columns = nums[0].length;
//   double[][] transpose = new double[columns][rows];

// }



  public static void main(String[] args) {
    // double[][] originalSquare = new double[][] {{1.0, 2.0}, {3.0, 4.0}};
    // double[][] copyOfSquare = copySquare(originalSquare);

    // System.out.println("contents of copy: " + Arrays.deepToString(copyOfSquare));
    // System.out.println("original array memory address: " + originalSquare);
    // System.out.println("copy array memory address: " + copyOfSquare);

    // double[][] originalRectangle = new double[][] {{1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0}};
    // double[][] copyOfRectangle = copyRectangle(originalRectangle);

    // System.out.println("contents of copy: " + Arrays.deepToString(copyOfRectangle));
    // System.out.println("original array memory address: " + originalRectangle);
    // System.out.println("copy array memory address: " + copyOfRectangle);

    // double[][] originalRagged = new double[][] {{1.0, 5.0, 2.0}, {3.0, 6.0}, {5.0, 6.0}};
    // double[][] copyOfRagged = copyRagged(originalRagged);

    // System.out.println("contents of copy: " + Arrays.deepToString(copyOfRagged));
    // System.out.println("original array memory address: " + originalRagged);
    // System.out.println("copy array memory address: " + copyOfRagged);

    double[][] originalRagged = new double[][] {{1.0, 5.0, 2.0}, {3.0, 6.0}, {5.0, 6.0}};
    double[][] copyOfRagged = copyRagged(originalRagged);

    System.out.println("contents of copy: " + Arrays.deepToString(copyOfRagged));
    System.out.println("original array memory address: " + originalRagged);
    System.out.println("copy array memory address: " + copyOfRagged);

  }
}