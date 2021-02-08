import java.util.Scanner;

public class AreaPerimRetang {
    public static void main(String[] args) throws Exception {
        // Declara��o de vari�veis do programa
        double lado1, lado2, perim, area;

        // Para utilizar a leitura de dados pelo teclado
        Scanner entrada = new Scanner(System.in);

        // {Entrada de dados}
        System.out.print("Digite o valor do primeiro lado: ");
        lado1 = Math.abs(entrada.nextDouble()); //garante Lado1 com valor positivo

        System.out.print("Digite o valor do segundo lado: ");
        lado2 = Math.abs(entrada.nextDouble()); //garante Lado2 com valor positivo

        System.out.println(); // Salta uma linha

        // {Processamento de dados}
        perim = 2 * lado1 + 2 * lado2; //f�rmula do per�metro do ret�ngulo
        area = lado1 * lado2;

        // {Sa�da de dados}
        System.out.println("Per�metro: " + perim);
        System.out.println("�rea.....: " + area);

        entrada.close();
    }
}
