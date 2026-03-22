import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        
        try {
            // Calling the method with the counting logic
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException e) {  // Added the exception variable name
            System.out.println("Erro: " + e.getMessage());  // Using the exception message
        } finally {
            terminal.close();  // Good practice to close the Scanner
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validate if parametroUm is GREATER than parametroDois and throw exception
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        // Calculate the difference and print numbers
        int contagem = parametroDois - parametroUm;
        
        // Fixed: starting from 1 to match the difference count
        for(int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
