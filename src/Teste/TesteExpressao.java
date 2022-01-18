package Teste;

import java.util.ArrayList;
import java.util.List;
public class TesteExpressao {

    public static void main(String[] args) {
        Pilha pilha = null;
        List<Caracter> cars = null;
        Caracter car = null;
        String expressao = "{l+9+[c+d]*[a/b]}";
        //String expressao = "{a+b*[x+y+(z*p)+(c/d)])";
        cars = new ArrayList<Caracter>(expressao.length());

        for (int i = 0; i < expressao.length(); i++) {
            car = new Caracter();
            car.setConteudo(expressao.charAt(i));
            cars.add(car);
        }
        pilha = new Pilha();
        if(pilha.valida(pilha,cars))
            System.out.println("Teste.Pilha Válida!");
        else
            System.out.println("Teste.Pilha Inválida!");
    }

}