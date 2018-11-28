package acomodacao;

/**
 * @author Felipe Lopes Zem
 */
public class Acomodacao
{
    public String nome;
    private double precoDiaria;

    private int numero;
    private byte subTipo;
    private String local;   //100 caracteres
    private byte classificacao;
    private String observacoes; //500 caracteres
    private int qtdDeDatas;
    private int qtdDeQuartos;
    private Disponibilidade[] disponibilidades;

    public Acomodacao(String nome, int numero, byte subTipo){
        this.nome = nome;
        this.numero = numero;
        this.subTipo = subTipo;
        this.disponibilidades = new Disponibilidade[qtdDeQuartos];
    }

    public String getNome(){return nome;}
    public double getPrecoDiaria(){return precoDiaria;}
    public int getNumero(){return numero;}
    public byte getSubTipo(){return subTipo;}
    public String getLocal(){return local;}
    public byte getClassificacao(){return classificacao;}
    public String getObservacoes(){return observacoes;}
    public int getQtdDeDatas(){return qtdDeDatas;}
    public int getQtdDeQuartos(){return qtdDeQuartos;}
    public void setPrecoDiaria(double d){precoDiaria = d;}
    public void setNumero(int i){numero = i;}
    public void setSubTipo(byte b){subTipo = b;}
    public void setLocal(String s){
        if (s.length() > 100) s = s.substring(0, 100);
        local = s;
    }
    public void setClassificacao(byte b){classificacao = b;}
    public void setObservacoes(String s){
        if (s.length() > 500) s = s.substring(0, 500);
        observacoes = s;
    }
    public void setQtdDeDatas(int i){qtdDeDatas = i;}
    public void setQtdDeQuartos(int i){qtdDeQuartos = i;}

    public String getData(Disponibilidade d)
    {
        for(int i = 0; i < disponibilidades.length; i++){
            if (disponibilidades[i] == d){
                return disponibilidades[i].getData();
            }
        }
        return "*SEM DATA*";
    }
    public int getQuarto(Disponibilidade d, int posicao)
    {
        for(int i = 0; i < disponibilidades.length; i++){
            if (disponibilidades[i] == d){
                return disponibilidades[i].getQuarto(posicao);
            }
        }
        return -1;  //Não encontrou o quarto
    }
    public int[] getTodosQuartos(Disponibilidade d)
    {
        for(int i = 0; i < disponibilidades.length; i++){
            if (disponibilidades[i] == d){
                return disponibilidades[i].getTodosQuartos();
            }
        }
        return null;  //Não encontrou os quartos
    }
    public byte getStatus(Disponibilidade d, int posicao)
    {
        for(int i = 0; i < disponibilidades.length; i++){
            if (disponibilidades[i] == d){
                return disponibilidades[i].getStatus(posicao);
            }
        }
        return -1;  //Não encontrou o status
    }
    public byte[] getTodosStatus(Disponibilidade d)
    {
        for(int i = 0; i < disponibilidades.length; i++){
            if (disponibilidades[i] == d){
                return disponibilidades[i].getTodosStatus();
            }
        }
        return null;  //Não encontrou os statusS
    }
}
