package projetoprog2;

/**
 * @author Felipe Lopes Zem
 */
public class DataHorario extends Data
{
    private byte hora, min;

    public DataHorario(byte ano, byte mes, byte dia, byte hora, byte min){
        super(ano, mes, dia);
        this.hora = hora;
        this.min = min;
    }

    public byte getHora(){return hora;}
    public byte getMin(){return min;}
    public boolean setHora(byte b){
        if ((b >= 0) && (b <= 23)){
            hora = b;
            return true;
        }else return false;
    }
    public boolean setMin(byte b){
        if ((b >= 0) && (b <= 59)){
            min = b;
            return true;
        }else return false;
    }

    public String getHorario_HHMM(){
        StringBuilder sb = new StringBuilder();
        sb.append(hora);sb.append(":");
        sb.append(min);
        return sb.toString();
    }
}
