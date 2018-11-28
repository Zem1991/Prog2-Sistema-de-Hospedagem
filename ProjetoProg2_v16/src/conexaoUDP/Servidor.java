package conexaoUDP;

import acomodacao.Acomodacao;
import atividadeTuristica.AtividadeTuristica;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import javax.swing.JOptionPane;

/**
 * @author Felipe Lopes Zem
 */
public class Servidor
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int serverPort = 1000;  //Definido como 1000 por padrão.
        DatagramSocket ds;

        //Cria o socket UDP para receber dados.
        try {
            ds = new DatagramSocket(serverPort);

            //Cria o datagrama que será recebido contendo os dados da procura.
            byte[] bufferReceive = new byte[1000];
            DatagramPacket packageReceived =
                    new DatagramPacket(bufferReceive, bufferReceive.length);

            System.out.println("Servidor (SOCKET: "+ds.getPort()+
                        ") aguardando datagrama do cliente...");
            //Fica em wait até receber request.
            
            try {
                ds.receive(packageReceived);

                //Demonstra no console o conteúdo de packageReceived.
                System.out.println("Request recebido de: " + packageReceived.getAddress());
                StringBuilder sb = new StringBuilder(new String(packageReceived.getData()));
                System.out.println("Cliente: " + sb.toString());

                //Separa os dados contidos em packageReceived.
                ByteBuffer buffer = ByteBuffer.allocate(100);
                buffer.put(bufferReceive);
                byte tipoDeDadoDaProcura = buffer.get(0);

                //O conteúdo de bufferReceive é definido por:
                //  +1 para determinar o tipo do dado sendo pesquisado
                //  +1 para determinar o tamanho da String local
                //  +valor de local.length
                //  +8 para o tamanho em bytes de precoMin (double)
                //  +8 para o tamanho em bytes de precoMax (double)
                
                //Usa-se apenas a parte interessante dos dados:
                //  -1 para ignorar o tipo de dado sendo pesquisado.
                //  -8 para ignorar o tamanho em bytes de precoMin (double)
                //  -8 para ignorar o tamanho em bytes de precoMax (double)
                byte[] dadosDaProcura = new byte[buffer.array().length - 8 - 8];
                for (int i = 1; i < buffer.array().length-16; i++){
                    dadosDaProcura[i-1] = buffer.get(i);
                }

                byte[] bufferSend = null;
                System.out.println("TIPO DE DADO A SER PESQUSADO: " + tipoDeDadoDaProcura);
                switch(tipoDeDadoDaProcura){
                    case 1:
                        bufferSend = consultaAtividadeTuristica(dadosDaProcura);
                        break;
                    case 2:
                        bufferSend = consultaAcomodacao(dadosDaProcura);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,
                            "IMPLEMENTAR TIPO DE DADO 3!");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,
                            "IMPLEMENTAR TIPO DE DADO 4!");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,
                            "IMPLEMENTAR TIPO DE DADO 5!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,
                            "Não foi possível identificar o tipo de dado a ser pesquisado.");
                        break;
                }

                //Cria o datagrama que será enviado contendo os resultados  da procura.
                DatagramPacket packageSent = new DatagramPacket(bufferSend, bufferSend.length,
                        packageReceived.getAddress(), packageReceived.getPort());
                try {
                    ds.send(packageSent);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Erro ao enviar datagrama! Cliente sem resposta.");
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,
                        "Erro ao receber datagrama! Cliente sem resposta.");
            }
        } catch (SocketException ex) {
            JOptionPane.showMessageDialog(null, "Socket SERVIDOR não pode ser configurado!");
        }
    }

////////////////////////////////////////////////////////////////////////////////
    
//    - Tipo do dado sendo inserido/editado: byte
//	1 -> AtivTuristica
//	2 -> Acomodacao
//	3 -> OutrosServicos
//	4 -> DescontosBonus
//	5 -> RoteiroVendido

////////////////////////////////////////////////////////////////////////////////
    /*
     * Métodos para manipular dados tipo 1 -> AtivTuristica
     */

    public static byte[] consultaAtividadeTuristica(byte[] buffer)
    {
        JOptionPane.showMessageDialog(null, "FAZER O FLUXO PRA RETORNAR ATIVIDADE TURÍSTICA!");

        //PROCURA

        //ACHA
        AtividadeTuristica resultado =
                new AtividadeTuristica("Esquenta pro Apocalipse com Burzum", 666, (byte) 2);
        resultado.setPreco(150);      //TESTES

        //NAO ACHA

        //O tamanho de bufferSend é definido por:
        //  +1 para determinar o tamanho do nome do resultado
        //  +valor de nome.length do resultado
        //  +8 para o tamanho em bytes do preço.
        byte[] bufferSend = new byte[1 + resultado.getNome().length() + 8];
        bufferSend[0] = (byte) resultado.getNome().length();
        for (int i = 1; i < resultado.getNome().length()+1; i++){
            bufferSend[i] = (byte) resultado.getNome().charAt(i-1);
        }
        bufferSend[1 + resultado.getNome().length()] = (byte) resultado.getPreco();

        return bufferSend;
    }

////////////////////////////////////////////////////////////////////////////////
    /*
     * Métodos para manipular dados tipo 2 -> ACOMODAÇÃO
     */

    public static byte[] consultaAcomodacao(byte[] buffer)
    {
        JOptionPane.showMessageDialog(null, "FAZER O FLUXO PRA RETORNAR ACOMODAÇÃO!");

        //PROCURA

        //ACHA
        Acomodacao resultado = new Acomodacao("Hotel Tenso", 1, (byte) 1);
        resultado.setPrecoDiaria(150);      //TESTES

        //NAO ACHA
        
        //O tamanho de bufferSend é definido por:
        //  +1 para determinar o tamanho do nome do resultado
        //  +valor de nome.length do resultado
        //  +8 para o tamanho em bytes do preço da diária.
        byte[] bufferSend = new byte[1 + resultado.getNome().length() + 8];
        bufferSend[0] = (byte) resultado.getNome().length();
        for (int i = 1; i < resultado.getNome().length()+1; i++){
            bufferSend[i] = (byte) resultado.getNome().charAt(i-1);
        }
        bufferSend[1 + resultado.getNome().length()] = (byte) resultado.getPrecoDiaria();

        return bufferSend;
    }
}
