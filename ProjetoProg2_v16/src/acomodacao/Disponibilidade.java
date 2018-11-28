package acomodacao;

import projetoprog2.Data;

/**
 * @author Felipe Lopes Zem
 */
public class Disponibilidade
{
    private Data data;
    private int[] quartos;
    private byte[] statusS;

    public Disponibilidade(int quantidades){
        this.quartos = new int[quantidades];
        this.statusS = new byte[quantidades];
    }

    public String getData(){
        return data.getData_AAAAMMDD();
    }
    public int getQuarto(int posicao){return quartos[posicao];}
    public int[] getTodosQuartos(){return quartos;}
    public byte getStatus(int posicao){return statusS[posicao];}
    public byte[] getTodosStatus(){return statusS;}
    public void setData(byte ano, byte mes, byte dia){
        data.setAno(ano);
        data.setMes(mes);
        data.setDia(dia);
    }
    public void setData(String data){
        int slash1 = data.indexOf("/", 0);
        String ano = data.substring(0, slash1);
        this.data.setAno((byte) Integer.parseInt(ano));
        int slash2 = data.indexOf("/", slash1);
        String mes = data.substring(slash1+1, slash2);
        this.data.setMes((byte) Integer.parseInt(mes));
        String dia = data.substring(slash2+1);
        this.data.setDia((byte) Integer.parseInt(dia));
    }
    public void setQuarto(int posicao, int numeracao){quartos[posicao] = numeracao;}
    public void setTodosQuartos(int[] numeracao){quartos = numeracao;}
    public void setStatus(int posicao, byte valor){statusS[posicao] = valor;}
    public void setTodosStatus(byte[] valores){statusS = valores;}
}
