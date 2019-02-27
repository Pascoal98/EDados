import java.util.Scanner;

public class ReadNumbers {

   // Escrever os numeros guardados num array no stdout
   static void writeArray(int v[]) {
      for (int i=0; i<v.length; i++)          
         System.out.println("v[" + i + "] = " + v[i]);      
   }
   //Calcular amplitude entre o maximo e minimo do array
   static void amplitudeArray(int v[]){
      int max = v[0];
      int min = v[0];
      for(int i=1; i<v.length; i++){
         if(v[i] > max)
            max = v[i];
         if(v[i] < min)
            min = v[i];
      }
      int amp = max - min;
      System.out.println(amp);
   }

   static void mediaArray(int v[]){
      double soma = 0;
      for(int i=0; i<v.length; i++){
         soma += v[i];
      }
      double media = soma / (v.length);
      System.out.printf("%.2f\n",media);
   }
   public static void main(String[] args) {

      Scanner stdin = new Scanner(System.in);
          
      int n = stdin.nextInt();   // Ler a quantidade de numeros que se seguem
      int v[] = new int[n]; 

      for (int i=0; i<n; i++)    // Ler os numeros a partir do stdin
         v[i] = stdin.nextInt();
      
      //writeArray(v); 
      //Esta comentado para nao ter output no mooshak   
      mediaArray(v);   
      amplitudeArray(v);  
        
   }
}