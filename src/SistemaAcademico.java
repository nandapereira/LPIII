import java.util.Scanner;
public class SistemaAcademico {

	public static void main(String[] args) {
		// TODO 
		int op��o;
		Academico academicos= new Academico();
		Scanner e = new Scanner(System.in);
		do{
			System.out.println("\nSistema de Alunos de uma Instui��o:\n");
			System.out.println("1-Cadastrar aluno \n2-Listar Aluno \n3-Remover Alno \n4-Altarar Aluno");
			System.out.print("\nDigite sua Op��o:");
			op��o =e.nextInt();
			switch( op��o )
			{
			    case 1:
			    	academicos.cadastrarAluno();  
			            break;
			    
			    case 2:
			    	academicos.listarAlunos();
			            break;
			    
			    case 3:
			    	academicos.removerAluno();
			            break;
			    case 4:
			    	academicos.alterarAluno();
		            	break;
		            	
			    default:
			           
			}
		
		}while(op��o<5);
	}

}
