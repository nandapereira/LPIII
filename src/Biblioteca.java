import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	private	ArrayList<Aluno> alunos = new ArrayList<Aluno>(); 
	private ArrayList<ItemAcervo> itensAcervo = new ArrayList<ItemAcervo>();
	private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	public void cadastrarAluno(){
		
		Aluno aluno = new Aluno();
		
		Scanner eMatricula = new Scanner(System.in);
		Scanner bNome= new Scanner(System.in);
		Scanner cTelefone = new Scanner(System.in);
		Scanner dEndereco= new Scanner(System.in);
		
		
		System.out.println("Informe a matricula do Aluno: ");
		aluno.setMatricula(eMatricula.next());
		
		System.out.println("Informe o nome do Aluno: ");
		aluno.setNome(bNome.nextLine());
		
		System.out.println("Informe o numero do Telefone: ");
		aluno.setTelefone(cTelefone.next());
		
		System.out.println("Informe o Seu Endereço: ");
		aluno.setEndereco(dEndereco.nextLine());
		
		alunos.add(aluno);   
	}
	
	public void cadastrarLivro(){
		Livro livro = new Livro();
		
		Scanner etitulo = new Scanner(System.in);
		Scanner bautor= new Scanner(System.in);
		Scanner cISBN = new Scanner(System.in);
		Scanner deditora= new Scanner(System.in);
		
		
		System.out.println("Digite o nome do titulo: ");
		livro.setTitulo(etitulo.nextLine());
		
		System.out.println("Informe o Nome do Autor do Livro: ");
		livro.setAutor(bautor.nextLine());
		
		System.out.println("Informe o numero do ISBN: ");
		livro.setISBN(cISBN.next());
		
		System.out.println("Informe o nome da Editora: ");
		livro.setEditora(deditora.nextLine());
		
		itensAcervo.add(livro);                           
			
	}
	
	public void listarAlunos(){ 
		System.out.println("Lista de Alunos");
		for(int i=0; i<alunos.size(); i++){	                       
			System.out.println((i+1)+ "," + alunos.get(i));
		}
	}
	
	public void listarArcevo(){ 
		System.out.println("Lista de Itens");
		for(int i=0; i<itensAcervo.size(); i++){	                       
			System.out.println((i+1)+ "," + itensAcervo.get(i));
		}
	}
	public void emprestarItem(){	
		listarAlunos();
		listarArcevo();
		
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Emprestimo emp = new Emprestimo();
		
		System.out.println("Informe o id do Aluno: ");
		emp.setAluno(alunos.get(a.nextInt()-1));
		System.out.println("Informe o id do Item: ");
		emp.setItemAcervo(itensAcervo.get(a.nextInt()-1));
		System.out.println("Informe a data de emprestimos: ");
		emp.setDataEmprestimo(b.next());
		emp.setStatus(Emprestimo.EMPRESTADO);
		

		emprestimos.add(emp);
		
	}
	
	public void listaremprestimo(){ 
		System.out.println("Lista de emprestimos");
		for(int i=0; i<emprestimos.size(); i++){	                       
			System.out.println((i+1)+ "," + emprestimos.get(i));
			
		}
	}
	
	public void devolver(){ 
		listaremprestimo();
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		
		System.out.println("Digite a id do Item que deseja devolver");
		Emprestimo emp = emprestimos.get(a.nextInt()-1);
		
		System.out.println("Informe a data de devolução");
		emp.setDataDevoluca(b.next());
		emp.setStatus(Emprestimo.DEVOLVIDO);
	}
	public void cadastrarRevista(){
		Revista revista = new Revista();
		
		Scanner enumero = new Scanner(System.in);
		Scanner bano= new Scanner(System.in);
		Scanner cpublicacao = new Scanner(System.in);
		Scanner dnome = new Scanner(System.in);
		Scanner ftitulo = new Scanner(System.in);
		Scanner teditora = new Scanner(System.in);
		
		
		System.out.println("Digite o Numero: ");
		revista.setNumero(enumero.nextLine());
		
		System.out.println("Informe o Ano da revista: ");
		revista.setAno(bano.nextLine());
		
		System.out.println("Informe a Publicação: ");
		revista.setPublicacao(cpublicacao.next());
		
		System.out.println("Informe o Nome da revista: ");
		revista.setNome(dnome.nextLine());
		
		System.out.println("Informe o Titulo : ");
		revista.setTitulo(ftitulo.nextLine());
		
		System.out.println("Informe a Editora : ");
		revista.setEditora(teditora.nextLine());
		
		itensAcervo.add(revista);                           
			
	}
	
	public void cadastrarDVD(){
		DVD dvd = new DVD();
		
		Scanner ltitulo = new Scanner(System.in);
		Scanner tsinopse = new Scanner(System.in);
		Scanner satores = new Scanner(System.in);
		Scanner rdiretor = new Scanner(System.in);
		
	
		System.out.println("Informe o Titulo : ");
		dvd.setTitulo(ltitulo.nextLine());
		
		System.out.println("Informe a Sinopse : ");
		dvd.setSinopse(tsinopse.nextLine());
		
		System.out.println("Informe os Atores : ");
		dvd.setAtores(satores.nextLine());
		
		System.out.println("Informe o Diretor : ");
		dvd.setDiretor(rdiretor.nextLine());
		
		itensAcervo.add(dvd);      
	
	}
	
	public void cadastrarCD(){
		CD cd = new CD();
		
		Scanner atitulo = new Scanner(System.in);
		Scanner tartista = new Scanner(System.in);
		Scanner scategoria = new Scanner(System.in);
		
	
		System.out.println("Informe o Titulo : ");
		cd.setTitulo(atitulo.nextLine());
		
		System.out.println("Informe o Artista : ");
		cd.setArtista(tartista.nextLine());
		
		System.out.println("Informe a Categoria : ");
		cd.setCategoria(scategoria.nextLine());
	
		
		itensAcervo.add(cd);      
	
	}
	
	public void cadastrarArtigo(){
		Artigo artigo = new Artigo();
		
		Scanner mtitulo = new Scanner(System.in);
		Scanner dautor = new Scanner(System.in);
		Scanner pano = new Scanner(System.in);
		Scanner tperiodo = new Scanner(System.in);
		
	
		System.out.println("Informe o Titulo : ");
		artigo.setTitulo(mtitulo.nextLine());
		
		System.out.println("Informe o Autor : ");
		artigo.setAutor(dautor.nextLine());
		
		System.out.println("Informe o Ano : ");
		artigo.setAno(pano.nextLine());
		
		System.out.println("Informe o Periodo : ");
		artigo.setPeriodo(tperiodo.nextLine());
		
		itensAcervo.add(artigo);      
	
	}
}
	
	
	
	


