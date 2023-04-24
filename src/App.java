import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double n1, n2;
        double soma, subtracao, multiplicacao, divisao;
        int op;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        n1 = entrada.nextDouble();
        System.out.println("Digite outro valor: ");
        n2 = entrada.nextDouble();

        System.out.println("### SELECIONE UMA OPERAÇÃO ###");
        System.out.println("[1] - SOMAR");
        System.out.println("[2] - SUBITRAIR");
        System.out.println("[3] - MULTIPLICAR");
        System.out.println("[4] - DIVIDIR");
        System.out.println(">>>>> Digite sua opção: ");
        op = entrada.nextInt();

        switch(op) {
            case 1:
                soma = n1 + n2;
                System.out.println("A soma é : " + soma);
                break;
            case 2:
                subtracao = n1 - n2;
                System.out.println("A subitração é : " + subtracao);
                break;
            case 3:
                multiplicacao = n1 * n2;
                System.out.println("A multiplicação é : " + multiplicacao);
                break;
            case 4:
                if(n1 < n2) {
                    System.out.println("Impossivel realizar o calculo");
                }else{
                    divisao = n1 / n2;
                    System.out.println("A divisão é : " + divisao); 
                }
                break;
            default:
                System.out.println("Operação inválida! ");         
        }

    }
}
