package atividadeTuristica;

/**
 * @author Felipe Lopes Zem
 */
public class Passeio extends AtividadeTuristica
{
    private String restricoes;  //300 caracteres

    public Passeio(String nome, int numero){
        super(nome, numero, (byte) 3);
    }

    public String getRestricoes(){return restricoes;}
    public void setRestricoes(String s){
        if (s.length() > 300) s = s.substring(0, 300);
        restricoes = s;
    }
}
