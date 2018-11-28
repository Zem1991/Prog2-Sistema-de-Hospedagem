package atividadeTuristica;

/**
 * @author Felipe Lopes Zem
 */
public class Alimentacao extends AtividadeTuristica
{
    private String cardapio;    //300 caracteres
    private byte classificacao;

    public Alimentacao(String nome, int numero, byte classificacao){
        super(nome, numero, (byte) 4);
        this.classificacao = classificacao;
    }

    public String getCardapio(){return cardapio;}
    public byte getClassificacao(){return classificacao;}
    public void setCardapio(String s){
        if (s.length() > 300) s = s.substring(0, 300);
        cardapio = s;
    }
    public void setClassificacao(byte b){classificacao = b;}
}
