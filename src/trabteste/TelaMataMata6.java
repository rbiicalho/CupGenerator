/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabteste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author solange
 */
public class TelaMataMata6 extends javax.swing.JFrame {

    public static String penultimoColocado, ultimoColocado;
    public int counter = 0;

    /**
     * Creates new form TelaMataMata
     *
     */
    public TelaMataMata6() {
        initComponents();
        this.setSize(500, 320);
        this.setNome();

    }
    
     public TelaMataMata6(String a, String a1) {
        initComponents();
        this.setSize(500, 320);
        this.setNome(a, a1);

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ja4 = new javax.swing.JLabel();
        ja1 = new javax.swing.JLabel();
        fa4 = new javax.swing.JTextField();
        fb2 = new javax.swing.JTextField();
        ja2 = new javax.swing.JLabel();
        fa2 = new javax.swing.JTextField();
        fa3 = new javax.swing.JTextField();
        jb2 = new javax.swing.JLabel();
        ja3 = new javax.swing.JLabel();
        jc2 = new javax.swing.JLabel();
        fa1 = new javax.swing.JTextField();
        fb1 = new javax.swing.JTextField();
        jb1 = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        jc1 = new javax.swing.JLabel();
        fc2 = new javax.swing.JTextField();
        fc1 = new javax.swing.JTextField();
        fb3 = new javax.swing.JTextField();
        jb3 = new javax.swing.JLabel();
        fb4 = new javax.swing.JTextField();
        jb4 = new javax.swing.JLabel();
        botao = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ja4.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ja4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ja4);
        ja4.setBounds(0, 250, 90, 20);

        ja1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ja1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ja1);
        ja1.setBounds(0, 50, 90, 20);

        fa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fa4ActionPerformed(evt);
            }
        });
        getContentPane().add(fa4);
        fa4.setBounds(90, 250, 40, 20);

        fb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb2ActionPerformed(evt);
            }
        });
        getContentPane().add(fb2);
        fb2.setBounds(200, 130, 40, 20);

        ja2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ja2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ja2);
        ja2.setBounds(0, 70, 90, 20);

        fa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fa2ActionPerformed(evt);
            }
        });
        getContentPane().add(fa2);
        fa2.setBounds(90, 70, 40, 20);
        getContentPane().add(fa3);
        fa3.setBounds(90, 230, 40, 20);

        jb2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jb2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jb2);
        jb2.setBounds(100, 130, 100, 20);

        ja3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ja3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ja3);
        ja3.setBounds(0, 230, 90, 20);

        jc2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jc2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jc2);
        jc2.setBounds(300, 170, 130, 20);

        fa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fa1ActionPerformed(evt);
            }
        });
        getContentPane().add(fa1);
        fa1.setBounds(90, 50, 40, 20);
        getContentPane().add(fb1);
        fb1.setBounds(200, 110, 40, 20);

        jb1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jb1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jb1);
        jb1.setBounds(100, 110, 100, 20);

        j.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        j.setForeground(new java.awt.Color(204, 204, 0));
        getContentPane().add(j);
        j.setBounds(270, 200, 220, 40);

        jc1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jc1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jc1);
        jc1.setBounds(300, 140, 130, 20);

        fc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc2ActionPerformed(evt);
            }
        });
        getContentPane().add(fc2);
        fc2.setBounds(430, 170, 40, 20);

        fc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc1ActionPerformed(evt);
            }
        });
        getContentPane().add(fc1);
        fc1.setBounds(430, 140, 40, 20);

        fb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb3ActionPerformed(evt);
            }
        });
        getContentPane().add(fb3);
        fb3.setBounds(200, 180, 40, 20);

        jb3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jb3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jb3);
        jb3.setBounds(100, 180, 100, 20);

        fb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb4ActionPerformed(evt);
            }
        });
        getContentPane().add(fb4);
        fb4.setBounds(200, 200, 40, 20);

        jb4.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jb4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jb4);
        jb4.setBounds(100, 200, 100, 20);

        botao.setText("Atualizar");
        botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoActionPerformed(evt);
            }
        });
        getContentPane().add(botao);
        botao.setBounds(350, 40, 90, 23);

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Confrontos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 10, 150, 30);

        fundo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        fundo.setForeground(new java.awt.Color(255, 255, 255));
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabteste/WhatsApp Image 2017-09-12 at 23.25.53.jpeg"))); // NOI18N
        fundo.setText("jLabel1");
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 500, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fa2ActionPerformed

    private void fb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fb2ActionPerformed

    private void fb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fb3ActionPerformed
    public void setNome() {

        Sorteio s = new Sorteio();
        s.Sortear();

        ja1.setText(Tela2.Participantes.get(0));
        ja2.setText(Tela2.Participantes.get(1));
        ja3.setText(Tela2.Participantes.get(2));
        ja4.setText(Tela2.Participantes.get(3));
        jb2.setText(Tela2.Participantes.get(4));
        jb4.setText(Tela2.Participantes.get(5));

    }
    public void setNome(String a1, String a2) {
        jb2.setText(a1);
        jb4.setText(a2);
        Tela2.Participantes.remove(jb2.getText());
        Tela2.Participantes.remove(jb4.getText());
        Sorteio s = new Sorteio();
        s.Sortear();

        ja1.setText(Tela2.Participantes.get(0));
        ja2.setText(Tela2.Participantes.get(1));
        ja3.setText(Tela2.Participantes.get(2));
        ja4.setText(Tela2.Participantes.get(3));

    }
    
    private void botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoActionPerformed
        // TODO add your handling code here:

        //part1
        if (!fa1.getText().equals("") && !fa2.getText().equals("")) {
            int a1 = Integer.parseInt(fa1.getText());
            int a2 = Integer.parseInt(fa2.getText());
            if (a1 > a2) {
                jb1.setText(ja1.getText());
            } else if (a2 > a1) {
                jb1.setText(ja2.getText());
            }
        }

        //part2   
        if (!fa3.getText().equals("") && !fa4.getText().equals("")) {
            int a3 = Integer.parseInt(fa3.getText());
            int a4 = Integer.parseInt(fa4.getText());
            if (a3 > a4) {
                jb3.setText(ja3.getText());
            } else if (a4 > a3) {
                jb3.setText(ja4.getText());
            }
        }

        //part3
    
            
        
        if (!fb1.getText().equals("") && !fb2.getText().equals("")) {
            int b1 = Integer.parseInt(fb1.getText());
            int b2 = Integer.parseInt(fb2.getText());
            if (b1 > b2) {
                jc1.setText(jb1.getText());
            } else if (b2 > b1) {
                jc1.setText(jb2.getText());
            }
        }

        //part4
        if (!fb3.getText().equals("") && !fb4.getText().equals("")) {
            int b3 = Integer.parseInt(fb3.getText());
            int b4 = Integer.parseInt(fb4.getText());
            if (b3 > b4) {
                jc2.setText(jb3.getText());
            } else if (b4 > b3) {
                jc2.setText(jb4.getText());
            }
        }
        //part5
        Pilha pilha = new Pilha();
        int p1 = Integer.parseInt(fa1.getText());
        int p2 = Integer.parseInt(fa2.getText());
        int p3 = Integer.parseInt(fa3.getText());
        int p4 = Integer.parseInt(fa4.getText());

        if (p1 < p2) {
            pilha.empilhar(ja1.getText());
        } else if (p2 < p1) {
            pilha.empilhar(ja2.getText());
        }
        if (p3 < p4) {
            pilha.empilhar(ja3.getText());
        } else if (p4 < p3) {
            pilha.empilhar(ja4.getText());
        }
        try {
            penultimoColocado = (String) pilha.desempilhar();
        } catch (PilhaVaziaException ex) {
            Logger.getLogger(TelaMataMata6.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ultimoColocado = (String) pilha.desempilhar();
        } catch (PilhaVaziaException ex) {
            Logger.getLogger(TelaMataMata6.class.getName()).log(Level.SEVERE, null, ex);
        }

        //part6
        if (!fc1.getText().equals("") && !fc2.getText().equals("")) {
            int c1 = Integer.parseInt(fc1.getText());
            int c2 = Integer.parseInt(fc2.getText());
            if (c1 > c2) {
                j.setText(jc1.getText());
                String caminhoArquivo1 = Tela2.diretorio;
                String txt = "O campeão do torneio foi: " + j.getText() + "\r\n  Ultimos Colocados - " + ultimoColocado + "  " + penultimoColocado;
                try {
                    //manipulação do arquivo
                    FileWriter fw = new FileWriter(caminhoArquivo1);
                    try (BufferedWriter fwriter = new BufferedWriter(fw)) {
                        fwriter.write(txt);
                    }
                } catch (IOException e) {

                }
            } else if (c2 > c1) {
                j.setText(jc2.getText());
                String caminhoArquivo1 = Tela2.diretorio;
                String txt = "O campeão do torneio foi: " + j.getText() + " \r\n  Ultimos Colocados - " + ultimoColocado + ", " + penultimoColocado;
                try {
                    //manipulação do arquivo
                    FileWriter fw = new FileWriter(caminhoArquivo1);
                    try (BufferedWriter fwriter = new BufferedWriter(fw)) {
                        fwriter.write(txt);
                    }
                } catch (IOException e) {

                }
            }
        }


    }//GEN-LAST:event_botaoActionPerformed

    private void fa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fa1ActionPerformed

    private void fb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fb4ActionPerformed

    private void fc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fc1ActionPerformed

    private void fa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fa4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fa4ActionPerformed

    private void fc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fc2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMataMata6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMataMata6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMataMata6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMataMata6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaMataMata6().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao;
    private javax.swing.JTextField fa1;
    private javax.swing.JTextField fa2;
    private javax.swing.JTextField fa3;
    private javax.swing.JTextField fa4;
    private javax.swing.JTextField fb1;
    private javax.swing.JTextField fb2;
    private javax.swing.JTextField fb3;
    private javax.swing.JTextField fb4;
    private javax.swing.JTextField fc1;
    private javax.swing.JTextField fc2;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel j;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel ja1;
    private javax.swing.JLabel ja2;
    private javax.swing.JLabel ja3;
    private javax.swing.JLabel ja4;
    private javax.swing.JLabel jb1;
    private javax.swing.JLabel jb2;
    private javax.swing.JLabel jb3;
    private javax.swing.JLabel jb4;
    private javax.swing.JLabel jc1;
    private javax.swing.JLabel jc2;
    // End of variables declaration//GEN-END:variables
}