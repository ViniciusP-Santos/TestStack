package Teste;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
    LinkedList<Caracter> caracteres = new LinkedList<Caracter>();

    public void empilha(Caracter c) {
        caracteres.push(c);
    }

    public Caracter desempilha(){
        if(eVazia()){
            System.out.println("Teste.Pilha está vazia.");
            return null;
        }
        else{
            Caracter caracterRemovido = this.
                    caracteres.pop();
            return caracterRemovido;
        }
    }

    public boolean eVazia() {
        return caracteres.isEmpty();
    }


    public Caracter primeiroElemento(){
        return this.caracteres.getFirst();
    }

    public boolean valida(Pilha pilha, List<Caracter> caracteres){
        if(pilha.eVazia())
            for (int i = 0; i < caracteres.size(); i++) {
                if(caracteres.get(i).eAbertura(caracteres.get(i)))
                    pilha.empilha(caracteres.get(i));
                else
                if(caracteres.get(i).eFechamento(caracteres.get(i)))
                    if(pilha.eVazia())
                        return false;
                    else
                    if(pilha.primeiroElemento().getTipoCaracter(pilha.primeiroElemento()).equals(caracteres.get(i).getTipoCaracter(caracteres.get(i))))
                        pilha.desempilha();
                if(pilha.eVazia())
                    return true;
            }
        return false;

    }
}
