// Java program for checking
// balanced brackets
import java.util.*;

public class BalancedBrackets {

    // função para verificar se os colchetes estão balanceados
    static boolean areBracketsBalanced(String expr)
    {
        // Usar ArrayDeque é mais rápido que usar a classe Stack
        Deque<Character> stack = new ArrayDeque<Character>();

        // Atravessando a expressão
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                // Empurre o elemento na pilha
                stack.push(x);
                continue;
            }

            // Se o caractere atual não estiver abrindo
            // colchete, então deve estar fechando. Então empilhe
            // não pode estar vazio neste ponto.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Verifique a pilha vazia
        return (stack.isEmpty());
    }

    // Código do motorista
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String expr = "{A+B(J*5[2³]4*5)}";
        System.out.println("Digite uma expressão: ");
        expr = input.next();


        // Chamada de função
        if (areBracketsBalanced(expr))
            System.out.println("A Função é Valida ");
        else
            System.out.println("A Função é Invalida ");
    }
}