class Aluno{
	public static int contador = 0;
	String nome;
	int numero;

	Aluno(){
		nome = "indefinido";
		numero = -1;
		contador++;
	}
//4
	Aluno(String n, int mec){
		nome = n;
		numero = mec;
		contador++;
	}
//3b
	public String toString(){
		return "(" + nome + "," + numero + ")";
	}

	int ano(){
		return numero / 100000;
	}
}



public class TestAluno{
	public static void main(String[] args) {

	Aluno a = new Aluno();
	Aluno b = new Aluno();
	Aluno c = b;
	b.nome = "modificado";
	Aluno d = new Aluno("Joao", 201577223); //acrescentei joao só porque me apeteceu 
	Aluno e = new Aluno("Manuel", 201506234);
	Aluno g = new Aluno("Ana", 201408762);
	Aluno h = new Aluno("Bruno", 201508145);

	System.out.println("b = " + b);
	System.out.println("c = " + c);
	System.out.println("a.nome = " + a.nome);
	System.out.println("a.numero = " + a.numero);
	System.out.println("a = " + a);	
	System.out.println("d = " + d);
	System.out.println("e = " + e);
	System.out.println(g.ano() + " " + h.ano());

	int n = 3;
	Aluno[] v = new Aluno[n];
	for(int i=0; i<n; i++){
		v[i] = new Aluno();
		System.out.println("v[" + i + "] = " + v[i]);
	}
	v[0].nome = "Pedro";

	System.out.println("contador = " + Aluno.contador);
	}
}