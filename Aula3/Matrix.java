import java.util.Scanner;

class Matrix {
   int data[][]; // os elementos da matriz em si
   int rows;     // numero de linhas
   int cols;     // numero de colunas

   // construtor padrao de matriz
   Matrix(int r, int c) {
      data = new int[r][c];
      rows = r;
      cols = c;
   }

   // Ler os rows x cols elementos da matriz
   public void read(Scanner in) {
      for (int i=0; i<rows; i++)
         for (int j=0; j<cols; j++)
            data[i][j] = in.nextInt();
   }

   // Representacao em String da matrix
   public String toString() {
      String ans = "";
      for (int i=0; i<rows; i++) {
         for (int j=0; j<cols; j++)
            ans += data[i][j] + " ";
         ans += "\n";
      }
      return ans;
   }
   public static Matrix identity(int n){
      Matrix matrix = new Matrix(n,n);
      for (int i = 0; i < n; i++)
         for (int j = 0; j < n; j++)
            if(i==j)
               matrix.data[i][j]= 1;
            else
               matrix.data[i][j]= 0;
      return matrix;
   }
   public Matrix transpose(){
      Matrix matrix = new Matrix(this.cols, this.rows);
      for(int i = 0; i < this.cols; i++)
         for(int j = 0; j < this.rows; j++)
            matrix.data[i][j] = this.data[j][i];
      return matrix;
   }
   public Matrix sum(Matrix m){ 
    Matrix res = new Matrix(this.rows, this.cols);

    for(int i = 0; i < res.rows; i++)
      for(int j = 0; j < res.cols; j++)
        res.data[i][j] = this.data[i][j] + m.data[i][j];
    return res;
  }
  public Matrix multiply(Matrix m){ 
    Matrix res = new Matrix(this.rows, m.cols);
    
    for(int i = 0; i < res.rows; i++)
      for(int j = 0; j < res.cols; j++)
        for(int k = 0; k < m.rows; k++)
          res.data[i][j] += this.data[i][k] * m.data[k][j];
    return res;
  } 
}