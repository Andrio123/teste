import java.util.Scanner;

public class Calculando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int ler;
double v1;
double v2;
double total;

		System.out.println("Menu");
		System.out.println("1-Adicao;\n2-Subtracao;\n3-Divisao;\n4-Multiplicacao\n");
		Scanner opcao =new Scanner(System.in);
		ler=opcao.nextInt();
				
		System.out.println("Digite o primeiro valor:");
		Scanner valor1 = new Scanner(System.in);
		v1=valor1.nextDouble();
		
		System.out.println("Digite o segundo valor:");
		Scanner valor2 = new Scanner(System.in);
		v2=valor2.nextDouble();
		
		
		switch (ler) {
		
		case 1:
			total = v1 * v2;
			System.out.println(total);
			break;
			
		case 2:
			total=v1-v2;
			System.out.println(total);
			break;
			case 3:
			total=v1/v2;
			System.out.println(total);
			break;
		case 4:
			total=v1*v2;
			System.out.println(total);
			break;
		default:
			break;
		}
		
		
		
	}
	
	
}
