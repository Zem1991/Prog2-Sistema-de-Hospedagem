package conexaoUDP;

import acomodacao.Acomodacao;
import atividadeTuristica.AtividadeTuristica;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import javax.swing.JOptionPane;

/**
 * @author Felipe Lopes Zem
 */
public class ClientePesquisa
{
    private InetAddress serverIP;
    private int serverPort;
    private DatagramSocket ds;

    public ClientePesquisa(int clientPort, InetAddress serverIP, int serverPort){
        //Cria o socket UDP para receber dados.
        try {
            ds = new DatagramSocket(clientPort);
            ds.setSoTimeout(5000);  //Timeout em ms. Previne que a busca nunca termine.
        } catch (SocketException ex) {
            JOptionPane.showMessageDialog(null, "Socket CLIENTE não pode ser configurado!");
        }

        //Configura os dados para se conectar ao servidor.
        this.serverIP = serverIP;
        this.serverPort = serverPort;
    }

    public int getClientPort(){return ds.getPort();}
    public InetAddress getServerIP(){return serverIP;}
    public int getServerPort(){return serverPort;}
    public void setServerIP(InetAddress ip){serverIP = ip;}
    public void setServerPort(int i){serverPort = i;}

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

    public AtividadeTuristica requestAtividadeTuristica
            (String local, double precoMin, double precoMax)
    {
        //Manipula a String local para ser entendida como byte[].
        byte[] byteString = new byte[local.length()];
        for (int i = 0; i < local.length(); i++){
            byteString[i] = (byte) local.toString().toCharArray()[i];
        }

        //O tamanho de bufferSend é definido por:
        //  +1 para determinar o tipo do dado sendo pesquisado
        //  +1 para determinar o tamanho da String local
        //  +valor de local.length
        //  +8 para o tamanho em bytes de precoMin (double)
        //  +8 para o tamanho em bytes de precoMax (double)
        byte[] bufferSend = new byte[1 + 1 + byteString.length + 8 + 8];
        bufferSend[0] = 1;  //TIPO DE DADO = 1
        bufferSend[1] = (byte) local.length();
        for (int i = 2; i < byteString.length+2; i++){
            bufferSend[i] = byteString[i-2];
        }
        bufferSend[1 + 1 + byteString.length] = (byte) precoMin;
        bufferSend[1 + 1 + byteString.length + 8] = (byte) precoMax;

        //Cria o datagrama que será enviado contendo os dados da procura.
        DatagramPacket packageSent = new DatagramPacket(bufferSend, bufferSend.length,
                this.serverIP, this.serverPort);
        try {
            ds.send(packageSent);

            //Cria o datagrama que será recebido.
            byte[] bufferReceive = new byte[1000];
            DatagramPacket packageReceived =
                    new DatagramPacket(bufferReceive, bufferReceive.length);

            System.out.println("Cliente (SOCKET: "+ds.getPort()+
                        ") aguardando datagrama do servidor...");
            //Fica em wait até receber request.

            try {
                ds.receive(packageReceived);


                JOptionPane.showMessageDialog(null, 
                        "FAZER O FLUXO PRA IDENTIFICAR ATIVIDADE TURÍSTICA!");



                return null;    //Retorna um objeto DERIVADO da classe AtividadeTuristica.

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,
                        "Erro ao retornar Atividade Turística! Datagrama não foi recebido.");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao procurar Atividade Turística! Datagrama não foi enviado.");
        }
        return null;
    }

////////////////////////////////////////////////////////////////////////////////
    /*
     * Métodos para manipular dados tipo 2 -> ACOMODAÇÃO
     */
    
    public Acomodacao requestAcomodacao(String local, double precoMin, double precoMax)
    {
        //Manipula a String local para ser entendida como byte[].
        byte[] byteString = new byte[local.length()];
        for (int i = 0; i < local.length(); i++){
            byteString[i] = (byte) local.toString().toCharArray()[i];
        }

        //O tamanho de bufferSend é definido por:
        //  +1 para determinar o tipo do dado sendo pesquisado
        //  +1 para determinar o tamanho da String local
        //  +valor de local.length
        //  +8 para o tamanho em bytes de precoMin (double)
        //  +8 para o tamanho em bytes de precoMax (double)
        byte[] bufferSend = new byte[1 + 1 + byteString.length + 8 + 8];
        bufferSend[0] = 2;  //TIPO DE DADO = 2
        bufferSend[1] = (byte) local.length();
        for (int i = 2; i < byteString.length+2; i++){
            bufferSend[i] = byteString[i-2];
        }
        bufferSend[1 + 1 + byteString.length] = (byte) precoMin;
        bufferSend[1 + 1 + byteString.length + 8] = (byte) precoMax;

        //Cria o datagrama que será enviado contendo os dados da procura.
        DatagramPacket packageSent = new DatagramPacket(bufferSend, bufferSend.length,
                this.serverIP, this.serverPort);
        try {
            ds.send(packageSent);

            //Cria o datagrama que será recebido.
            byte[] bufferReceive = new byte[1000];
            DatagramPacket packageReceived =
                    new DatagramPacket(bufferReceive, bufferReceive.length);

            System.out.println("Cliente (SOCKET: "+ds.getPort()+
                        ") aguardando datagrama do servidor...");
            //Fica em wait até receber request.
            
            try {
                ds.receive(packageReceived);


                JOptionPane.showMessageDialog(null, "FAZER O FLUXO PRA IDENTIFICAR ACOMODAÇÃO!");



                return null;    //Retorna um objeto DERIVADO da classe Acomodacao.

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,
                        "Erro ao retornar Acomodação! Datagrama não foi recebido.");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao procurar Acomodação! Datagrama não foi enviado.");
        }
        return null;
    }
}
