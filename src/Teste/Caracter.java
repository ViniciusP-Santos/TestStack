package Teste;

public class Caracter {

    char conteudo;

    public char getConteudo() {
        return conteudo;
    }

    public void setConteudo(char conteudo) {
        this.conteudo = conteudo;
    }

    public String getTipoCaracter(Caracter c){
        String tipo = null;
        if(c.getConteudo()=='{'||c.getConteudo()=='}'){
            tipo = "chaves";
        }else
        if(c.getConteudo()=='['||c.getConteudo()==']'){
            tipo = "colchetes";
        }else
        if(c.getConteudo()=='('||c.getConteudo()==')'){
            tipo = "parenteses";
        }
        return tipo;
    }

    public boolean eAbertura(Caracter c){
        if(c.getConteudo()=='{'||c.getConteudo()=='['||c.getConteudo()=='(')
            return true;
        else
            return false;
    }

    public boolean eFechamento(Caracter c){
        if(c.getConteudo()=='}'||c.getConteudo()==']'||c.getConteudo()==')')
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return String.valueOf(conteudo);
    }
}
