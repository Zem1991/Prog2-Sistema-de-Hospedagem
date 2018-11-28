package atividadeTuristica;

import projetoprog2.DataHorario;

/**
 * @author Felipe Lopes Zem
 */
public class AtividadeTuristica
{
    private String nome;
    
    private int numero;
    private final byte subTipo;
    private String descricao;   //500 caracteres
    private DataHorario dataHorario;
    private byte duracaoHora;
    private double preco;
    private String local;   //100 caracteres
    private int vagas;

    public AtividadeTuristica(String nome, int numero, byte subTipo){
        this.nome = nome;
        this.numero = numero;
        this.subTipo = subTipo;
    }

    public String getNome(){return nome;}
    public int getNumero(){return numero;}
    public byte getSubTipo(){return subTipo;}
    public String getDescricao(){return descricao;}
    public DataHorario getDataHorario(){return dataHorario;}
    public byte getDuracaoHora(){return duracaoHora;}
    public double getPreco(){return preco;}
    public String getLocal(){return local;}
    public int getVagas(){return vagas;}
    public void setNumero(int i){numero = i;}
    public void setDescricao(String s){
        if (s.length() > 500) s = s.substring(0, 500);
        descricao = s;
    }
    public void setDataHorario(DataHorario dh){dataHorario = dh;}
    public void setDuracaoHora(byte b){duracaoHora = b;}
    public void setPreco(double d){preco = d;}
    public void setLocal(String s){
        if (s.length() > 100) s = s.substring(0, 100);
        local = s;
    }
    public void setVagas(int i){vagas = i;}
}
