package acomodacao;

/**
 * @author Felipe Lopes Zem
 */
public class ApartHotel extends Acomodacao
{
    private String equipamentosExtras;  //500 caracteres

    public ApartHotel(String nome, int numero){
        super(nome, numero, (byte) 7);
    }

    public String getEquipamentosExtras(){return equipamentosExtras;}
    public void setEquipamentosExtras(String s){
        if (s.length() > 500) s = s.substring(0, 500);
        equipamentosExtras = s;
    }
}
