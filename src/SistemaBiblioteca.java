import java.util.Scanner;

public class SistemaBiblioteca {

	public static void main(String[] args) {
		
	
		
		int opção;
		Biblioteca biblioteca = new Biblioteca();
		Scanner e = new Scanner(System.in);
		do{
			System.out.println("\nSistema de Biblioteca:\n");
			System.out.println("1-Cadastrar aluno \n2-Listar Aluno \n3-Cadastrar Livro  \n4-Listar Arcevo \n5-Emprestar Item \n6-Listar Emprestimo \n7-Devolver Item \n8-Cadastrar Revista \n9-Cadastrar DVD \n10-Cadastrar CD \n11-Cadastrar Artigo");
			System.out.print("\nDigite sua Opção:");
			opção =e.nextInt();
			switch( opção )
			{
			    case 1:
			    	biblioteca.cadastrarAluno();  
			            break;
			    
			    case 2:
			    	biblioteca.listarAlunos();
			            break;
			    
			    case 3:
			    	biblioteca.cadastrarLivro();
			            break;
			    case 4:
			    	biblioteca.listarArcevo();
		            	break;
			    case 5:
			    	biblioteca.emprestarItem();
		            	break;
			    case 6:
			    	biblioteca.listaremprestimo();
		            	break;
			    case 7:
			    	biblioteca.devolver();
		            	break;
			    case 8:
			    	biblioteca.cadastrarRevista();
		            	break;
			    case 9:
			    	biblioteca.cadastrarDVD();
		            	break;
			    case 10:
			    	biblioteca.cadastrarCD();
		            	break;
			    case 11:
			    	biblioteca.cadastrarArtigo();
		            	break;
			    default:
			           
			}
		
		}while(opção<12);
	}

}


