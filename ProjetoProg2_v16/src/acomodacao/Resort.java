package acomodacao;

/**
 * @author Felipe Lopes Zem
 */
public class Resort extends Acomodacao
{
    private String atividadesExtras;    //500 caracteres

    public Resort(String nome, int numero){
        super(nome, numero, (byte) 3);
    }

    public String getAtividadesExtras(){return atividadesExtras;}
    public void setAtividadesExtras(String s){
        if (s.length() > 500) s = s.substring(0, 500);
        atividadesExtras = s;
    }
}
