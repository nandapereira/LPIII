import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca {
	
	ArrayList<Aluno> alunos = new ArrayList<Aluno>(); 
	ArrayList<Livro> livros = new ArrayList<Livro>();
	ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	public void cadastrarAluno(){
		//TODO
		Scanner matricula = new Scanner(System.in);
		Scanner nome= new Scanner(System.in);
		Scanner telefone= new Scanner(System.in);
		Scanner endereco= new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe a matricula do Aluno: ");
		aluno.setMatricula(matricula.next());
		
		System.out.println("Informe o nome do Aluno: ");
		aluno.setNome(nome.nextLine());
		
		System.out.println("Digite o numero de Telefone: ");
		aluno.setTelefone(telefone.next());
		
		System.out.println("Emforme seu Entereco: ");
		aluno.setEndereco(endereco.next());
		
		alunos.add(aluno);       
	}
	
	public void cadastrarLivro(){
		//TODO
		Scanner titulo = new Scanner(System.in);
		Scanner autor = new Scanner(System.in);
		Scanner ISBN = new Scanner(System.in);
		Scanner editora = new Scanner(System.in);
		
		Livro livro = new Livro();
		
		System.out.println("Emforme o título do Livro");
		livro.setTitulo(titulo.next());
		
		System.out.println("Emforme o autor do Livro");
		livro.setAutor(autor.next());
		
		System.out.println("Digite o ISBN do Livro");
		livro.setIsbn(ISBN.next());
		
		System.out.println("Emforme a editora do Livro");
		livro.setEditora(editora.next());
		
		livros.add(livro);
	}
	
	public void listarAlunos(){
		//TODO
		System.out.println("alunos cadastrados: ");
		for(int i=0; i<alunos.size(); i++){
			System.out.println((i+1)+"-"+ alunos.get(i));
		}
	}
	public void listarLivros(){
		//TODO
		System.out.println("livros cadastrados: ");
		for(int i=0; i<livros.size(); i++){
			System.out.println((i+1)+"-"+ livros.get(i));
			
		}
	}
	public void emprestarLivro(){
		//TODO
		Scanner e = new Scanner(System.in);
		Emprestimo emprestimo = new Emprestimo();
		

		System.out.println("Informe o indice do Aluno: ");
		emprestimo.setAluno(alunos.get(e.nextInt()-1));
		
		System.out.println("Informe o indice do Livro: ");
		emprestimo.setLivro(livros.get(e.nextInt()-1));
		
		System.out.println("Informe a data de emprestimos: ");
		emprestimo.setDataEmprestimo(e.next());
		
		emprestimo.setStatus(1);
		emprestimos.add(emprestimo);
	}
	
	public void listarEmprestimo(){ 
		System.out.println("Listar de emprestimos");
		for(int i=0; i<emprestimos.size(); i++){	                       
			System.out.println((i+1)+ "," + emprestimos.get(i));
			
		}
	}
	
	public void devolverlivro(){ 
		listarEmprestimo();
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		
		System.out.println("Digite a id do Livro que deseja devolver");
		Emprestimo emprestimos = emprestimos.get(a.nextInt()-1);
		
		System.out.println("Informe a data de devolução");
		Emprestimo.setDataDevoluca(b.next());	
		}
	}
	
		
	