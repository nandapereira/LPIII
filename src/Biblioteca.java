import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca {
	
	ArrayList<Aluno> alunos = new ArrayList<Aluno>(); 
	
	public void cadastrarAluno(){
		//TODO
		Scanner matricula = new Scanner(System.in);
		Scanner nome= new Scanner(System.in);
		Scanner telefone= new Scanner(System.in);
		Scanner endereco= new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informde a matricula do Aluno: ");
		aluno.setMatricula(eMatricula.next());
		
		System.out.println("Informe o nome do Aluno: ");
		aluno.setNome(bNome.nextLine());
		
		alunos.add(aluno);       
	}
	public void cadastrarLivro(){
		//TODO
	}
	public void listarAlunos(){
		//TODO
	}
	public void listarLivros(){
		//TODO
		Scanner f = new Scanner(System.in);
		int i=0;
		//Aluno a=alunos.get(i);listar somente um elemento
		alunos.size();
		
		for(i=0; i<alunos.size(); i++){
			System.out.println(i+"-"+ alunos.get(i));
			//System.out.print(i+" - Matricula: " +alunos.get(i).getMatricula() + " ");
			//System.out.println("Nome: " +alunos.get(i).getNome());
		}
	}
	public void emprestarLivro(){
		//TODO
		Aluno a = new Aluno();
		Livro l = new Livro();
		Emprestimo e = new Emprestimo();
		
		a.setMatricula("12345");
		a.setNome("Fernanda Pereira");
		a.setTelefone("9999-99999");
		
		l.setTitulo("Banco de Dados");
		l.setAutor("Aguiar");
		
		e.setAluno(a);
		e.setLivro(l);
		e.setDataEmprestimo("11/09/2018");
		e.setStatus(Emprestimo.EMPRESTADO);
		
		
		System.out.println(a);
		System.out.println(l);
		System.out.println(e);
		
	}
	public void devolverLivro(){

		Scanner e = new Scanner(System.in);
		listarAlunos();
		
		System.out.println("Informe o Indice que deseja remover: ");
		//int i= e.nextInt();
		alunos.remove(e.nextInt());
		
	}
}
