import java.util.Scanner;

public class exercicio_ler_alunos{

	public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int cod; //cria variave para apresentar RA
	double n1,n2,n3; //cria variavel para poder ler notas
	System.out.printf("Ola, digite seu RA: "); //pede para o usuario digitar RA
	cod = sc.nextInt(); //armazena infomcao na variavel cod
		
	System.out.printf("Digite sua nota na prova 1: "); //le nota digitada
	n1 = sc.nextDouble(); //armazena informacao na variave n1
	System.out.printf("Digite sua nota na prova 2: "); //le nota digitada
	n2 = sc.nextDouble(); //armazena informacao na variave n2
	System.out.printf("Digite sua nota na prova 3: "); //le nota digitada
	n3 = sc.nextDouble(); //armazena informacao na variave n3
			
	
	
	double media = (n1+n2+n3)/3; //calcula media aritmetica das notas
	System.out.printf("Sua media e:%f",media); //exibe media
		
	if(media >= 8) //condicao se media for maior ou igual a 8 ira imprimir a mensagem a seguir na tela
	{
		System.out.printf("Voce foi aprovado!"); //exibe mensagem a partir da condicao acima
	}
	else if(media <8 && media >6) //se media for menor que 8 e maior que 6 exibira a mensagem a seguir
	{
		System.out.printf("Voce esta na recuperacao!"); //exibe mensagem a partir da condicao acima

	}
	else //se nao for nenhuma das outras condicoes sera esta 
		System.out.printf("Voce foi reprovado"); //exibe mensagem a partir da condicao acima

}
}
