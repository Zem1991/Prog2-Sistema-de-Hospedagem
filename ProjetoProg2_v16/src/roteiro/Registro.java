package roteiro;

import projetoprog2.Data;

/**
 *
 * @author Alfredo, Felipe
 */
public class Registro
{
    private int nuAcomodacao;
    private Data dataInicio;
    private Data dataFim;
    private int nuQuartoOcupado;

    public int getNumeroAcomodacao(){return nuAcomodacao;}
        public String getDataInicio(){
        return dataInicio.getData_AAAAMMDD();
    }
        public String getDataFim(){
        return dataFim.getData_AAAAMMDD();
    }
    public int getNumeroQuartoOcupado(){return nuQuartoOcupado;}

    public void setNumeroAcomodacao(int n){nuAcomodacao = n;}
    public void setDataInciio(byte ano, byte mes, byte dia){
        dataInicio.setAno(ano);
        dataInicio.setMes(mes);
        dataInicio.setDia(dia);
    }
    public void setDataInicio(String data){
        int slash1 = data.indexOf("/", 0);
        String ano = data.substring(0, slash1);
        this.dataInicio.setAno((byte) Integer.parseInt(ano));
        int slash2 = data.indexOf("/", slash1);
        String mes = data.substring(slash1+1, slash2);
        this.dataInicio.setMes((byte) Integer.parseInt(mes));
        String dia = data.substring(slash2+1);
        this.dataInicio.setDia((byte) Integer.parseInt(dia));
    }
    public void setDataFim(byte ano, byte mes, byte dia){
        dataFim.setAno(ano);
        dataFim.setMes(mes);
        dataFim.setDia(dia);
    }
    public void setDataFim(String data){
        int slash1 = data.indexOf("/", 0);
        String ano = data.substring(0, slash1);
        this.dataFim.setAno((byte) Integer.parseInt(ano));
        int slash2 = data.indexOf("/", slash1);
        String mes = data.substring(slash1+1, slash2);
        this.dataFim.setMes((byte) Integer.parseInt(mes));
        String dia = data.substring(slash2+1);
        this.dataFim.setDia((byte) Integer.parseInt(dia));
    }
    public void setNumeroQuartoOcupado(int n){nuQuartoOcupado = n;}
}
