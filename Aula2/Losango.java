import java.util.Scanner;

public class Losango {

	static void losango(int n){

		int crescente = (n-1)/2;
		for (int i = 0;i < crescente ;i++ ){
			pontos(crescente-i);
			cardinal(2*i+1);
			pontos(crescente-i);
			System.out.println("");
		}
		cardinal(n);
		System.out.println("");
		int i = crescente-1;
		for(int decrescente = n; decrescente - 1 > crescente; decrescente--){

			pontos(crescente-i);
			cardinal(2*i+1);
			pontos(crescente-i);
			System.out.println("");
			i--;
		}
	}

	static void cardinal(int x){
		if( x == 0){
			System.out.print("");
		} else {
			for(int i = 0; i < x; i++)
				System.out.print("#");
		}
	}

	static void pontos(int z){
		if( z == 0){
			System.out.print("");
		} else {
			for(int i = 0; i < z; i++)
				System.out.print(".");
		}
	}
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		int tamanho = stdin.nextInt();
		losango(tamanho);

	}
}