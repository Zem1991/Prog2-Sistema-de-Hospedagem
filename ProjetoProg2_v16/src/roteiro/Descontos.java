package roteiro;

/**
 *
 * @author Alfredo, Felipe
 */
public class Descontos 
{
    private int numero;
    private byte qtdDeAtividades;
    private int[] listaDeAtividades;
    private byte qtdMinimaPessoas;
    private double valorPorPessoa;

    public Descontos(byte qtdDeAtividades){
        this.qtdDeAtividades = qtdDeAtividades;
        this.listaDeAtividades = new int[qtdDeAtividades];
    }
    
    public int getNumero(){ return numero; }
    public byte getQtdDeAtividades(){ return qtdDeAtividades; }
    public int[] getListaDeAtividades(){ return listaDeAtividades; }
    public byte getQtdMinimaPessoas(){ return qtdMinimaPessoas; }
    public double getValorPorPessoa(){ return valorPorPessoa; }
    
    public void setNumero(int num){numero = num;}
    public void setQtdDeAtividades(byte qAtividades){qtdDeAtividades = qAtividades;}
    public void setListaDeAtividades(int[] lista){listaDeAtividades = lista;}
    public void setQtdMinimaPessoas(byte minPe){qtdMinimaPessoas = minPe;}
    public void setValorPorPessoa(double valPorPessoa){valorPorPessoa = valPorPessoa;}
}
