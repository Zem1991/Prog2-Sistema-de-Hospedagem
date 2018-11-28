package atividadeTuristica;

/**
 * @author Felipe Lopes Zem
 */
public class Aventura extends AtividadeTuristica
{
    private byte dificuldade;
    private String restricoes;  //300 caracteres

    public Aventura(String nome, int numero, byte dificuldade){
        super(nome, numero, (byte) 1);
        this.dificuldade = dificuldade;
    }

    public byte getDificuldade(){return dificuldade;}
    public String getRestricoes(){return restricoes;}
    public void setDificuldade(byte b){dificuldade = b;}
    public void setRestricoes(String s){
        if (s.length() > 300) s = s.substring(0, 300);
        restricoes = s;
    }
}
