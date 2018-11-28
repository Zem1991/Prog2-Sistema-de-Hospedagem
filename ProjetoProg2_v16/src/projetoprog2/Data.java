package projetoprog2;

/**
 * @author Felipe Lopes Zem
 */
public class Data
{
    private static final byte[] diasPorMes =
    {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private byte ano, mes, dia;

    public Data(byte ano, byte mes, byte dia){
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public byte getAno(){return ano;}
    public byte getMes(){return mes;}
    public byte getDia(){return dia;}
    public boolean setAno(byte b){
        if ((b >= 0)){
            ano = b;
            return true;
        }else return false;
    }
    public boolean setMes(byte b){
        if ((b >= 1) && (b <= 12)){
            mes = b;
            return true;
        }
        else return false;
    }
    public boolean setDia(byte b){
        if ((b >= 1) && (b <= diasPorMes[getMes()-1])){
            dia = b;
            return true;
        }else return false;
    }

    public String getData_AAAAMMDD(){
        StringBuilder sb = new StringBuilder();
        sb.append(ano);sb.append("/");
        sb.append(mes);sb.append("/");
        sb.append(dia);
        return sb.toString();
    }
}
