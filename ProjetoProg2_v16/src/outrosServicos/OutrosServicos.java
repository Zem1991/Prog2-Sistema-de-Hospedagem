package outrosServicos;

/**
 * 
 * @author Alfredo, Felipe
 */
import projetoprog2.DataHorario;

public class OutrosServicos 
{
    private String nome;
    private int numero;
    private byte subTipo;
    private DataHorario dataHorario;
    private byte duracaoHora;
    private byte vagas;
    private double preco;
    private String descricao;   //300 caracteres

    public OutrosServicos(String nome, int numero, byte subTipo){
        this.nome = nome;
        this.numero = numero;
        this.subTipo = subTipo;
    }

    public String getNome(){return nome;}
    public int getNumero(){ return numero; }
    public byte getSubTipo(){ return subTipo; }
    public DataHorario getDataHorario(){return dataHorario;}
    public String getHorario(){
        return dataHorario.getHorario_HHMM();
    }
    public byte getDuracaoHora(){ return duracaoHora; }
    public byte getVagas(){return vagas; }
    public double getPreco(){ return preco; }
    public String getDescricao() { return descricao;}
    
    public void setNumero(int n ){this.numero = n;}
    public void setSubTipo(byte sT){this.subTipo = sT; }
    public void setDataHorario(DataHorario dh){dataHorario = dh;}
    public void setData(byte ano, byte mes, byte dia){
        this.dataHorario.setAno(ano);
        this.dataHorario.setMes(mes);
        this.dataHorario.setDia(dia);
    }
    public void setData(String data){
        int slash1 = data.indexOf("/", 0);
        String ano = data.substring(0, slash1);
        this.dataHorario.setAno((byte) Integer.parseInt(ano));
        int slash2 = data.indexOf("/", slash1);
        String mes = data.substring(slash1+1, slash2);
        this.dataHorario.setMes((byte) Integer.parseInt(mes));
        String dia = data.substring(slash2+1);
        this.dataHorario.setDia((byte) Integer.parseInt(dia));
    }
    public void setHorario(byte hora, byte min){
        this.dataHorario.setHora(hora);
        this.dataHorario.setMin(min);
    }
    public void setHorario(String horario){
        int separator = horario.indexOf(":", 0);
        String hora = horario.substring(0, separator);
        this.dataHorario.setHora((byte) Integer.parseInt(hora));
        String min = horario.substring(separator+1);
        this.dataHorario.setMin((byte) Integer.parseInt(min));
    }
    public void setDuracaoHora(byte dHora){this.duracaoHora = dHora; }
    public void setVagas(byte vagas){this.vagas = vagas; }
    public void setPreco(double preco){ this.preco = preco; }
    public void setDescricao(String s){
        if (s.length() > 300) s = s.substring(0, 300);
        this.descricao = s;
    }
}
