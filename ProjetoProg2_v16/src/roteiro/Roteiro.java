package roteiro;

import java.util.ArrayList;
import projetoprog2.Data;

/**
 *
 * @author Alfredo, Felipe
 */
public class Roteiro 
{
    private Data dataInicio;
    private Data dataFim;
    private byte tipo;
    private double valorMaximo;
    private byte qtdDeAtividades;
    private ArrayList<Integer> listaDeAtividades;
    private byte qtdRegistrosAcomodacoes;
    private ArrayList<Integer> registroAcomodacoes;
    private byte qtdDeOutrosServicos;
    private ArrayList<Integer> listaDeOutrosServicos;
    private byte qtdDeDescontos;
    private ArrayList<Integer> listaDeDescontos;
    
    public String getDataInicio(){
        return dataInicio.getData_AAAAMMDD();
    }
    public String getDataFim(){
        return dataFim.getData_AAAAMMDD();
    }
    public byte getTipo(){return tipo;}
    public double getValorMaximo(){return valorMaximo;}
    public byte getQtdDeAtividades(){ return qtdDeAtividades; }
    public byte getQtdRegistroAcomodacoes(){return qtdRegistrosAcomodacoes;}
    public byte getQtdDeOutrosServicos(){ return qtdDeOutrosServicos; }
    public byte getQtdDeDescontos(){ return qtdDeDescontos; }
    
    public ArrayList getAtividades(){return listaDeAtividades;}
    public ArrayList getRegistroAcomodacoes(){ return registroAcomodacoes; }
    public ArrayList getOutrosServicos(){ return listaDeOutrosServicos; }
    public ArrayList getDescontos(){ return listaDeDescontos; }

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
    public void setTipo(byte t) { tipo = t; }
    public void setValorMaximo(double vM){ valorMaximo = vM; }

    public void addAtividade(int numero){this.listaDeAtividades.add(numero);}
    public void addRegistroAcomodacao(int numero){this.registroAcomodacoes.add(numero);}
    public void addOutroServico(int numero){this.listaDeOutrosServicos.add(numero);}
    public void addDesconto(int numero){this.listaDeDescontos.add(numero);}
    public void removeAtividade(int numero)
    {
        for(int i = 0; i < listaDeAtividades.size(); i++){
            if (listaDeAtividades.get(i) == numero){
                listaDeAtividades.remove(listaDeAtividades.get(i));
                listaDeAtividades.trimToSize();
                break;
            }
        }
    }
    public void removeRegistroAcomodacao(int numero)
    {
        for(int i = 0; i < registroAcomodacoes.size(); i++){
            if (registroAcomodacoes.get(i) == numero){
                registroAcomodacoes.remove(registroAcomodacoes.get(i));
                registroAcomodacoes.trimToSize();
                break;
            }
        }
    }
    public void removeOutroServico(int numero)
    {
        for(int i = 0; i < listaDeOutrosServicos.size(); i++){
            if (listaDeOutrosServicos.get(i) == numero){
                listaDeOutrosServicos.remove(listaDeOutrosServicos.get(i));
                listaDeOutrosServicos.trimToSize();
                break;
            }
        }
    }
    public void removeDesconto(int numero)
    {
        for(int i = 0; i < listaDeDescontos.size(); i++){
            if (listaDeDescontos.get(i) == numero){
                listaDeDescontos.remove(listaDeDescontos.get(i));
                listaDeDescontos.trimToSize();
                break;
            }
        }
    }
}
