/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFramePrincipal.java
 *
 * Created on 16/06/2011, 23:10:13
 */

package projetoprog2;

import acomodacao.JFrameAcomodacao;
import atividadeTuristica.JFrameAtividadeTur;
import outrosServicos.JFrameOutrosServ;

/**
 *
 * @author Felipe Lopes Zem
 */
public class JFramePrincipal extends javax.swing.JFrame 
{
    JFrameAtividadeTur  jAtividadeTur = new JFrameAtividadeTur();
    JFrameAcomodacao jAcomodacao = new JFrameAcomodacao();
    JFrameOutrosServ jOutrosServ = new JFrameOutrosServ();
    JFramePorts jPort = new JFramePorts();
    Adicionar JAdicionar = new Adicionar();
    String item = "teste";
    int linha,coluna;
    
    public void AddTabela()
    {     
        
        System.out.println(item);
         
        
    }
    /** Creates new form JFramePrincipal */
    public JFramePrincipal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneItensDoRoteiro = new javax.swing.JScrollPane();
        jTableItensDoRoteiro = new javax.swing.JTable();
        jLabelCliente = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jButtonRemoverTudo = new javax.swing.JButton();
        jButtonAdicionarItem = new javax.swing.JButton();
        jLabelDataInicio = new javax.swing.JLabel();
        jTextDiaInicio = new javax.swing.JTextField();
        jTextMesInicio = new javax.swing.JTextField();
        jTextAnoInicio = new javax.swing.JTextField();
        jLabelDataFim = new javax.swing.JLabel();
        jTextDiaFim = new javax.swing.JTextField();
        jTextMesFim = new javax.swing.JTextField();
        jTextAnoFim = new javax.swing.JTextField();
        jLabelValorTotal = new javax.swing.JLabel();
        jTextValorTotal = new javax.swing.JTextField();
        jButtonRemoverItem = new javax.swing.JButton();
        jButtonVisualizarItem = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jmItemNovoRoteiro = new javax.swing.JMenuItem();
        jmItemAbrirRoteiro = new javax.swing.JMenuItem();
        jmItemSalvarRoteiro = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmItemSair = new javax.swing.JMenuItem();
        jMenuExibir = new javax.swing.JMenu();
        jMenuCadastro = new javax.swing.JMenu();
        jMAtividadeTur = new javax.swing.JMenuItem();
        jMAcomodacao = new javax.swing.JMenuItem();
        jMOutrosServicos = new javax.swing.JMenuItem();
        jMenuOpcoes = new javax.swing.JMenu();
        jMPorts = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Roteiro de Viagens Turísticas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTableItensDoRoteiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ítem", "Tipo", "Data", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneItensDoRoteiro.setViewportView(jTableItensDoRoteiro);

        jLabelCliente.setText("Cliente:");

        jTextFieldCliente.setText("Nome Sobrenome1 Sobrenome2");
        jTextFieldCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClienteActionPerformed(evt);
            }
        });

        jButtonRemoverTudo.setText("Remover todos");
        jButtonRemoverTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverTudoActionPerformed(evt);
            }
        });

        jButtonAdicionarItem.setText("Adicionar...");
        jButtonAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarItemActionPerformed(evt);
            }
        });

        jLabelDataInicio.setText("Início em (DD/MM/AAAA):");

        jTextDiaInicio.setText("01");
        jTextDiaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDiaInicioActionPerformed(evt);
            }
        });

        jTextMesInicio.setText("02");

        jTextAnoInicio.setText("2012");

        jLabelDataFim.setText("Termina em (DD/MM/AAAA):");

        jTextDiaFim.setText("06");
        jTextDiaFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDiaFimActionPerformed(evt);
            }
        });

        jTextMesFim.setText("02");

        jTextAnoFim.setText("2012");

        jLabelValorTotal.setText("Valor total deste roteiro (R$):");

        jTextValorTotal.setEditable(false);
        jTextValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValorTotalActionPerformed(evt);
            }
        });

        jButtonRemoverItem.setText("Remover...");
        jButtonRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverItemActionPerformed(evt);
            }
        });

        jButtonVisualizarItem.setText("Visualizar...");
        jButtonVisualizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarItemActionPerformed(evt);
            }
        });

        jMenuArquivo.setText("Arquivo");

        jmItemNovoRoteiro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmItemNovoRoteiro.setText("Novo Roteiro");
        jmItemNovoRoteiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemNovoRoteiroActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jmItemNovoRoteiro);

        jmItemAbrirRoteiro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jmItemAbrirRoteiro.setText("Abrir Roteiro");
        jMenuArquivo.add(jmItemAbrirRoteiro);

        jmItemSalvarRoteiro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmItemSalvarRoteiro.setText("Salvar Roteiro");
        jMenuArquivo.add(jmItemSalvarRoteiro);
        jMenuArquivo.add(jSeparator1);

        jmItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmItemSair.setText("Sair");
        jmItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmItemSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jmItemSair);

        jMenuBar1.add(jMenuArquivo);

        jMenuExibir.setText("Exibir");
        jMenuBar1.add(jMenuExibir);

        jMenuCadastro.setText("Cadastrar");

        jMAtividadeTur.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        jMAtividadeTur.setText("Atividade Turistica");
        jMAtividadeTur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAtividadeTurActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMAtividadeTur);

        jMAcomodacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        jMAcomodacao.setText("Acomodação");
        jMAcomodacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAcomodacaoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMAcomodacao);

        jMOutrosServicos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        jMOutrosServicos.setText("Outros Serviços");
        jMOutrosServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMOutrosServicosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMOutrosServicos);

        jMenuBar1.add(jMenuCadastro);

        jMenuOpcoes.setText("Opções");

        jMPorts.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, java.awt.event.InputEvent.CTRL_MASK));
        jMPorts.setText("Alterar portas");
        jMPorts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPortsActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMPorts);

        jMenuBar1.add(jMenuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDataFim)
                                    .addComponent(jLabelDataInicio))
                                .addGap(18, 18, 18))
                            .addComponent(jScrollPaneItensDoRoteiro, 0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextDiaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addGap(7, 7, 7)
                                .addComponent(jTextMesInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextDiaFim, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextMesFim, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonAdicionarItem, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                        .addComponent(jButtonRemoverItem, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .addComponent(jButtonVisualizarItem, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                        .addComponent(jButtonRemoverTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextAnoFim, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextAnoFim, jTextAnoInicio, jTextDiaFim, jTextDiaInicio, jTextMesFim, jTextMesInicio});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCliente)
                            .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDataFim))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextMesFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextAnoFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDiaFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonAdicionarItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVisualizarItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoverItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoverTudo))
                    .addComponent(jScrollPaneItensDoRoteiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorTotal)
                    .addComponent(jTextValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmItemNovoRoteiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemNovoRoteiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmItemNovoRoteiroActionPerformed

    private void jTextFieldClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClienteActionPerformed

    private void jMAcomodacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAcomodacaoActionPerformed
               
               jAcomodacao.setVisible(true);
    }//GEN-LAST:event_jMAcomodacaoActionPerformed

    private void jMAtividadeTurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAtividadeTurActionPerformed
       
       jAtividadeTur.setVisible(true);
    }//GEN-LAST:event_jMAtividadeTurActionPerformed

    private void jMPortsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPortsActionPerformed
        jPort.setVisible(true);
    }//GEN-LAST:event_jMPortsActionPerformed

    private void jmItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmItemSairActionPerformed

    private void jMOutrosServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMOutrosServicosActionPerformed
        jOutrosServ.setVisible(true);
}//GEN-LAST:event_jMOutrosServicosActionPerformed

    private void jButtonRemoverTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverTudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRemoverTudoActionPerformed

    private void jButtonAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarItemActionPerformed
        
        JAdicionar.setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarItemActionPerformed

    private void jTextDiaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDiaInicioActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextDiaInicioActionPerformed

    private void jTextDiaFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDiaFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDiaFimActionPerformed

    private void jTextValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorTotalActionPerformed
        double valor = 0;
        for (int i = 0; i < jTableItensDoRoteiro.getRowCount(); i++){
            //Seleciomna a COLUNA Valor (4).
            valor += Double.parseDouble((String) jTableItensDoRoteiro.getValueAt(i, 4));
        }
    }//GEN-LAST:event_jTextValorTotalActionPerformed

    private void jButtonRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRemoverItemActionPerformed

    private void jButtonVisualizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVisualizarItemActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarItem;
    private javax.swing.JButton jButtonRemoverItem;
    private javax.swing.JButton jButtonRemoverTudo;
    private javax.swing.JButton jButtonVisualizarItem;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelDataFim;
    private javax.swing.JLabel jLabelDataInicio;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JMenuItem jMAcomodacao;
    private javax.swing.JMenuItem jMAtividadeTur;
    private javax.swing.JMenuItem jMOutrosServicos;
    private javax.swing.JMenuItem jMPorts;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuExibir;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JScrollPane jScrollPaneItensDoRoteiro;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTableItensDoRoteiro;
    private javax.swing.JTextField jTextAnoFim;
    private javax.swing.JTextField jTextAnoInicio;
    private javax.swing.JTextField jTextDiaFim;
    private javax.swing.JTextField jTextDiaInicio;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextMesFim;
    private javax.swing.JTextField jTextMesInicio;
    private javax.swing.JTextField jTextValorTotal;
    private javax.swing.JMenuItem jmItemAbrirRoteiro;
    private javax.swing.JMenuItem jmItemNovoRoteiro;
    private javax.swing.JMenuItem jmItemSair;
    private javax.swing.JMenuItem jmItemSalvarRoteiro;
    // End of variables declaration//GEN-END:variables

}
