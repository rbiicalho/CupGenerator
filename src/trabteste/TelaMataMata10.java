/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabteste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author solange
 */
public class TelaMataMata10 extends javax.swing.JFrame {

    /**
     * Creates new form TelaMataMata
     */
    public TelaMataMata10() {
        initComponents();
        this.setSize(510, 345);
        this.setNome();
    }
    public static String ultimosColocados1, ultimosColocados2, ultimosColocados3, ultimosColocados4, ultimosColocados5;

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
        jLabel2 = new javax.swing.JLabel();
        fa4 = new javax.swing.JTextField();
        fb2 = new javax.swing.JTextField();
        ja2 = new javax.swing.JLabel();
        ja6 = new javax.swing.JLabel();
        fa2 = new javax.swing.JTextField();
        fa3 = new javax.swing.JTextField();
        jb2 = new javax.swing.JLabel();
        ja3 = new javax.swing.JLabel();
        je2 = new javax.swing.JLabel();
        jc2 = new javax.swing.JLabel();
        fa1 = new javax.swing.JTextField();
        fa7 = new javax.swing.JTextField();
        fa6 = new javax.swing.JTextField();
        fb1 = new javax.swing.JTextField();
        jb1 = new javax.swing.JLabel();
        fe2 = new javax.swing.JTextField();
        fa8 = new javax.swing.JTextField();
        ja7 = new javax.swing.JLabel();
        jc1 = new javax.swing.JLabel();
        ja8 = new javax.swing.JLabel();
        fc2 = new javax.swing.JTextField();
        fc1 = new javax.swing.JTextField();
        fb3 = new javax.swing.JTextField();
        jb3 = new javax.swing.JLabel();
        fb4 = new javax.swing.JTextField();
        jb4 = new javax.swing.JLabel();
        fa5 = new javax.swing.JTextField();
        fe1 = new javax.swing.JTextField();
        je1 = new javax.swing.JLabel();
        ja5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        j = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ja4.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ja4.setForeground(new java.awt.Color(255, 255, 255));
        ja4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(ja4);
        ja4.setBounds(20, 210, 70, 20);

        ja1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ja1.setForeground(new java.awt.Color(255, 255, 255));
        ja1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(ja1);
        ja1.setBounds(10, 60, 90, 20);

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Confrontos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 150, 30);
        getContentPane().add(fa4);
        fa4.setBounds(90, 210, 40, 20);

        fb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb2ActionPerformed(evt);
            }
        });
        getContentPane().add(fb2);
        fb2.setBounds(160, 160, 40, 20);

        ja2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ja2.setForeground(new java.awt.Color(255, 255, 255));
        ja2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(ja2);
        ja2.setBounds(10, 80, 90, 20);

        ja6.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ja6.setForeground(new java.awt.Color(255, 255, 255));
        ja6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(ja6);
        ja6.setBounds(400, 80, 100, 20);

        fa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fa2ActionPerformed(evt);
            }
        });
        getContentPane().add(fa2);
        fa2.setBounds(100, 80, 40, 20);
        getContentPane().add(fa3);
        fa3.setBounds(90, 190, 40, 20);

        jb2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jb2.setForeground(new java.awt.Color(0, 204, 204));
        jb2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jb2);
        jb2.setBounds(60, 160, 100, 20);

        ja3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ja3.setForeground(new java.awt.Color(255, 255, 255));
        ja3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(ja3);
        ja3.setBounds(20, 190, 70, 20);

        je2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        je2.setForeground(new java.awt.Color(255, 0, 204));
        je2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(je2);
        je2.setBounds(360, 40, 90, 20);

        jc2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jc2.setForeground(new java.awt.Color(255, 0, 0));
        jc2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jc2);
        jc2.setBounds(290, 240, 130, 20);
        getContentPane().add(fa1);
        fa1.setBounds(100, 60, 40, 20);
        getContentPane().add(fa7);
        fa7.setBounds(360, 190, 40, 20);

        fa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fa6ActionPerformed(evt);
            }
        });
        getContentPane().add(fa6);
        fa6.setBounds(360, 80, 40, 20);
        getContentPane().add(fb1);
        fb1.setBounds(160, 140, 40, 20);

        jb1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jb1.setForeground(new java.awt.Color(0, 255, 255));
        jb1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jb1);
        jb1.setBounds(60, 140, 100, 20);

        fe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fe2ActionPerformed(evt);
            }
        });
        getContentPane().add(fe2);
        fe2.setBounds(450, 40, 40, 20);
        getContentPane().add(fa8);
        fa8.setBounds(360, 210, 40, 20);

        ja7.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ja7.setForeground(new java.awt.Color(255, 255, 255));
        ja7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(ja7);
        ja7.setBounds(400, 190, 90, 20);

        jc1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jc1.setForeground(new java.awt.Color(255, 0, 0));
        jc1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jc1);
        jc1.setBounds(60, 240, 130, 20);

        ja8.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ja8.setForeground(new java.awt.Color(255, 255, 255));
        ja8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(ja8);
        ja8.setBounds(400, 210, 100, 20);

        fc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc2ActionPerformed(evt);
            }
        });
        getContentPane().add(fc2);
        fc2.setBounds(250, 240, 40, 20);
        getContentPane().add(fc1);
        fc1.setBounds(190, 240, 40, 20);
        getContentPane().add(fb3);
        fb3.setBounds(270, 140, 40, 20);

        jb3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jb3.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jb3);
        jb3.setBounds(320, 140, 120, 20);

        fb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb4ActionPerformed(evt);
            }
        });
        getContentPane().add(fb4);
        fb4.setBounds(270, 160, 40, 20);

        jb4.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jb4.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jb4);
        jb4.setBounds(310, 160, 120, 20);

        fa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fa5ActionPerformed(evt);
            }
        });
        getContentPane().add(fa5);
        fa5.setBounds(360, 60, 40, 20);
        getContentPane().add(fe1);
        fe1.setBounds(450, 20, 40, 20);

        je1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        je1.setForeground(new java.awt.Color(255, 0, 204));
        je1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(je1);
        je1.setBounds(360, 20, 90, 20);

        ja5.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ja5.setForeground(new java.awt.Color(255, 255, 255));
        ja5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(ja5);
        ja5.setBounds(400, 60, 90, 20);

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 20, 130, 40);

        j.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        j.setForeground(new java.awt.Color(204, 204, 0));
        j.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(j);
        j.setBounds(180, 260, 120, 30);

        fundo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        fundo.setForeground(new java.awt.Color(255, 255, 255));
        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabteste/WhatsApp Image 2017-09-12 at 23.25.53.jpeg"))); // NOI18N
        fundo.setText("GERAR");
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

    private void fb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fb4ActionPerformed

    private void fa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fa6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fa6ActionPerformed

    private void fe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fe2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fe2ActionPerformed

    private void fc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fc2ActionPerformed
    private void setNome() {

        if (Tela2.Participantes.size() == 9) {
            Sorteio s = new Sorteio();
            s.Sortear();
            ja1.setText(Tela2.Participantes.get(0));
            ja3.setText(Tela2.Participantes.get(1));
            ja4.setText(Tela2.Participantes.get(2));
            ja2.setText(Tela2.Participantes.get(3));
            ja6.setText(Tela2.Participantes.get(4));
            ja7.setText(Tela2.Participantes.get(5));
            ja8.setText(Tela2.Participantes.get(6));
            je1.setText(Tela2.Participantes.get(7));
            je2.setText(Tela2.Participantes.get(8));
        }

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //----------------------QUALIFIER----------------------
        if (!fe1.getText().equals("") && !fe2.getText().equals("")) {
            int e1 = Integer.parseInt(fe1.getText());
            int e2 = Integer.parseInt(fe2.getText());
            if (e1 > e2) {
                ja5.setText(je1.getText());
            } else if (e2 > e1) {
                ja5.setText(je2.getText());
            }
        }
        //----------------------QUARTAS DE FINAIS----------------------

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
                jb2.setText(ja3.getText());
            } else if (a4 > a3) {
                jb2.setText(ja4.getText());
            }
        }
        //part 3
        if (!fa5.getText().equals("") && !fa6.getText().equals("")) {
            int a5 = Integer.parseInt(fa5.getText());
            int a6 = Integer.parseInt(fa6.getText());
            if (a5 > a6) {
                jb3.setText(ja5.getText());
            } else if (a6 > a5) {
                jb3.setText(ja6.getText());
            }
        }
        //part4
        if (!fa7.getText().equals("") && !fa4.getText().equals("")) {
            int a7 = Integer.parseInt(fa3.getText());
            int a8 = Integer.parseInt(fa4.getText());
            if (a7 > a8) {
                jb4.setText(ja7.getText());
            } else if (a8 > a7) {
                jb4.setText(ja8.getText());
            }
        }
        //----------------------SEMI FINAIS----------------------
        //part1
        if (!fb1.getText().equals("") && !fb2.getText().equals("")) {
            int b1 = Integer.parseInt(fb1.getText());
            int b2 = Integer.parseInt(fb2.getText());
            if (b1 > b2) {
                jc1.setText(jb1.getText());
            } else if (b2 > b1) {
                jc1.setText(jb2.getText());
            }
        }

        //part2
        if (!fb3.getText().equals("") && !fb4.getText().equals("")) {
            int b3 = Integer.parseInt(fb3.getText());
            int b4 = Integer.parseInt(fb4.getText());
            if (b3 > b4) {
                jc2.setText(jb3.getText());
            } else if (b4 > b3) {
                jc2.setText(jb4.getText());
            }
        }
        //-------------------PILHA------------------------
        Pilha pilha = new Pilha();
        int p1 = Integer.parseInt(fe1.getText());
        int p2 = Integer.parseInt(fe2.getText());

        if (p1 < p2) {
            pilha.empilhar(je1.getText());
        } else if (p2 < p1) {
            pilha.empilhar(je2.getText());
        }
        int p3 = Integer.parseInt(fa1.getText());
        int p4 = Integer.parseInt(fa2.getText());
        if (p3 < p4) {
            pilha.empilhar(ja1.getText());
        } else if (p4 < p3) {
            pilha.empilhar(ja2.getText());
        }
        int p5 = Integer.parseInt(fa3.getText());
        int p6 = Integer.parseInt(fa4.getText());
        if (p5 < p6) {
            pilha.empilhar(ja3.getText());
        } else if (p6 < p5) {
            pilha.empilhar(ja4.getText());
        }
        int p7 = Integer.parseInt(fa5.getText());
        int p8 = Integer.parseInt(fa6.getText());
        if (p7 < p8) {
            pilha.empilhar(ja5.getText());
        } else if (p8 < p7) {
            pilha.empilhar(ja6.getText());
        }
        int p9 = Integer.parseInt(fa7.getText());
        int p10 = Integer.parseInt(fa8.getText());
        if (p9 < p10) {
            pilha.empilhar(ja7.getText());
        } else if (p10 < p9) {
            pilha.empilhar(ja8.getText());
        }
        try {
            ultimosColocados1 = (String) pilha.desempilhar();
        } catch (PilhaVaziaException ex) {
            Logger.getLogger(TelaMataMata6.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ultimosColocados2 = (String) pilha.desempilhar();
        } catch (PilhaVaziaException ex) {
            Logger.getLogger(TelaMataMata6.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ultimosColocados3 = (String) pilha.desempilhar();
        } catch (PilhaVaziaException ex) {
            Logger.getLogger(TelaMataMata6.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ultimosColocados4 = (String) pilha.desempilhar();
        } catch (PilhaVaziaException ex) {
            Logger.getLogger(TelaMataMata6.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            ultimosColocados5 = (String) pilha.desempilhar();
        } catch (PilhaVaziaException ex) {
            Logger.getLogger(TelaMataMata6.class.getName()).log(Level.SEVERE, null, ex);
        }
        //----------------------FINAL----------------------
        if (!fc1.getText().equals("") && !fc2.getText().equals("")) {
            int c1 = Integer.parseInt(fc1.getText());
            int c2 = Integer.parseInt(fc2.getText());
            if (c1 > c2) {
                j.setText(jc1.getText());
                String caminhoArquivo1 = Tela2.diretorio;
                String txt = "O campeão do torneio foi: " + j.getText() + "\r\n  Ultimos Colocados - "
                        + ultimosColocados1 + ",  " + ultimosColocados2 + ",  " + ultimosColocados3 + ",  " + ultimosColocados4 + ",  " + ultimosColocados5;
                try {
                    //manipulação do arquivo
                    FileWriter fw = new FileWriter(caminhoArquivo1);
                    BufferedWriter fwriter = new BufferedWriter(fw);
                    fwriter.write(txt);
                    fwriter.close();
                } catch (IOException e) {

                }
            } else if (c2 > c1) {
                j.setText(jc2.getText());
                String caminhoArquivo1 = Tela2.diretorio;
                String txt = "O campeão do torneio foi: " + j.getText() + "\r\n  Ultimos Colocados - "
                        + ultimosColocados1 + ",  " + ultimosColocados2 + ",  " + ultimosColocados3 + ",  " + ultimosColocados4 + ",  " + ultimosColocados5;
                try {
                    //manipulação do arquivo
                    FileWriter fw = new FileWriter(caminhoArquivo1);
                    BufferedWriter fwriter = new BufferedWriter(fw);
                    fwriter.write(txt);
                    fwriter.close();
                } catch (IOException e) {

                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fa5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fa5ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMataMata10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMataMata10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMataMata10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMataMata10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMataMata10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fa1;
    private javax.swing.JTextField fa2;
    private javax.swing.JTextField fa3;
    private javax.swing.JTextField fa4;
    private javax.swing.JTextField fa5;
    private javax.swing.JTextField fa6;
    private javax.swing.JTextField fa7;
    private javax.swing.JTextField fa8;
    private javax.swing.JTextField fb1;
    private javax.swing.JTextField fb2;
    private javax.swing.JTextField fb3;
    private javax.swing.JTextField fb4;
    private javax.swing.JTextField fc1;
    private javax.swing.JTextField fc2;
    private javax.swing.JTextField fe1;
    private javax.swing.JTextField fe2;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel j;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel ja1;
    private javax.swing.JLabel ja2;
    private javax.swing.JLabel ja3;
    private javax.swing.JLabel ja4;
    private javax.swing.JLabel ja5;
    private javax.swing.JLabel ja6;
    private javax.swing.JLabel ja7;
    private javax.swing.JLabel ja8;
    private javax.swing.JLabel jb1;
    private javax.swing.JLabel jb2;
    private javax.swing.JLabel jb3;
    private javax.swing.JLabel jb4;
    private javax.swing.JLabel jc1;
    private javax.swing.JLabel jc2;
    private javax.swing.JLabel je1;
    private javax.swing.JLabel je2;
    // End of variables declaration//GEN-END:variables
}