import java.util.Scanner;

public class exercicio_ler_alunos{

	public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int cod;
	double n1,n2,n3;
	System.out.printf("Ola, digite seu RA: ");
	cod = sc.nextInt();
	System.out.printf("Digite sua nota na prova 1: ");
	n1 = sc.nextDouble();
	System.out.printf("Digite sua nota na prova 2: ");
	n2 = sc.nextDouble();
	System.out.printf("Digite sua nota na prova 3: ");
	n3 = sc.nextDouble();
			
	
	
	double media = (n1+n2+n3)/3;
	System.out.printf("Sua media e:%f",media);
		
	if(media >= 8)
	{
		System.out.printf("Voce foi aprovado!");
	}
	else if(media <8 && media >6)
	{
		System.out.printf("Voce esta na recuperacao!");

	}
	else
		System.out.printf("Voce foi reprovado");

}
}