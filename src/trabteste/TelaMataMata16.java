/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabteste;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author guilu
 */
public class TelaMataMata16 extends javax.swing.JFrame {

    /**
     * Creates new form TelaMataMata16
     */
    public TelaMataMata16() {
        initComponents();
        this.setSize(710, 420);
        this.setNome();
    }

    public static ArrayList<String> classificados = new ArrayList();
    public int counter = 0;
    public static String ultimosColocados1, ultimosColocados2, ultimosColocados3, ultimosColocados4, ultimosColocados5, ultimosColocados6, ultimosColocados7, ultimosColocados8;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ja4 = new javax.swing.JLabel();
        ja2 = new javax.swing.JLabel();
        ja1 = new javax.swing.JLabel();
        jb1 = new javax.swing.JLabel();
        ja3 = new javax.swing.JLabel();
        jb2 = new javax.swing.JLabel();
        fa2 = new javax.swing.JTextField();
        fa4 = new javax.swing.JTextField();
        fa1 = new javax.swing.JTextField();
        fa3 = new javax.swing.JTextField();
        ja5 = new javax.swing.JLabel();
        ja6 = new javax.swing.JLabel();
        ja7 = new javax.swing.JLabel();
        ja8 = new javax.swing.JLabel();
        fa5 = new javax.swing.JTextField();
        fa6 = new javax.swing.JTextField();
        fb1 = new javax.swing.JTextField();
        fa8 = new javax.swing.JTextField();
        jb3 = new javax.swing.JLabel();
        jb4 = new javax.swing.JLabel();
        fa9 = new javax.swing.JTextField();
        fb2 = new javax.swing.JTextField();
        fb3 = new javax.swing.JTextField();
        fb4 = new javax.swing.JTextField();
        fb5 = new javax.swing.JTextField();
        fb6 = new javax.swing.JTextField();
        fb7 = new javax.swing.JTextField();
        fb8 = new javax.swing.JTextField();
        jb5 = new javax.swing.JLabel();
        jb6 = new javax.swing.JLabel();
        jb7 = new javax.swing.JLabel();
        jb8 = new javax.swing.JLabel();
        fa7 = new javax.swing.JTextField();
        fa10 = new javax.swing.JTextField();
        fa11 = new javax.swing.JTextField();
        fa13 = new javax.swing.JTextField();
        fa12 = new javax.swing.JTextField();
        fa14 = new javax.swing.JTextField();
        fa15 = new javax.swing.JTextField();
        fa16 = new javax.swing.JTextField();
        ja9 = new javax.swing.JLabel();
        ja10 = new javax.swing.JLabel();
        ja11 = new javax.swing.JLabel();
        ja13 = new javax.swing.JLabel();
        ja12 = new javax.swing.JLabel();
        ja15 = new javax.swing.JLabel();
        ja14 = new javax.swing.JLabel();
        ja16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("OITAVAS E QUARTAS ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 10, 260, 40);

        ja4.setForeground(new java.awt.Color(255, 255, 255));
        ja4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(ja4);
        ja4.setBounds(10, 180, 90, 30);

        ja2.setForeground(new java.awt.Color(255, 255, 255));
        ja2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(ja2);
        ja2.setBounds(10, 90, 90, 30);

        ja1.setForeground(new java.awt.Color(255, 255, 255));
        ja1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(ja1);
        ja1.setBounds(10, 60, 90, 30);

        jb1.setForeground(new java.awt.Color(255, 255, 255));
        jb1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jb1);
        jb1.setBounds(170, 130, 90, 30);

        ja3.setForeground(new java.awt.Color(255, 255, 255));
        ja3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(ja3);
        ja3.setBounds(10, 150, 90, 30);

        jb2.setForeground(new java.awt.Color(255, 255, 255));
        jb2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jb2);
        jb2.setBounds(170, 160, 90, 30);
        getContentPane().add(fa2);
        fa2.setBounds(100, 90, 50, 30);
        getContentPane().add(fa4);
        fa4.setBounds(100, 180, 50, 30);
        getContentPane().add(fa1);
        fa1.setBounds(100, 60, 50, 30);
        getContentPane().add(fa3);
        fa3.setBounds(100, 150, 50, 30);

        ja5.setForeground(new java.awt.Color(255, 255, 255));
        ja5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(ja5);
        ja5.setBounds(10, 260, 90, 30);

        ja6.setForeground(new java.awt.Color(255, 255, 255));
        ja6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(ja6);
        ja6.setBounds(10, 290, 90, 30);

        ja7.setForeground(new java.awt.Color(255, 255, 255));
        ja7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(ja7);
        ja7.setBounds(10, 330, 90, 30);

        ja8.setForeground(new java.awt.Color(255, 255, 255));
        ja8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(ja8);
        ja8.setBounds(10, 360, 90, 30);
        getContentPane().add(fa5);
        fa5.setBounds(100, 260, 50, 30);
        getContentPane().add(fa6);
        fa6.setBounds(100, 290, 50, 30);

        fb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb1ActionPerformed(evt);
            }
        });
        getContentPane().add(fb1);
        fb1.setBounds(260, 130, 50, 30);
        getContentPane().add(fa8);
        fa8.setBounds(100, 360, 50, 30);

        jb3.setForeground(new java.awt.Color(255, 255, 255));
        jb3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jb3);
        jb3.setBounds(170, 240, 90, 30);

        jb4.setForeground(new java.awt.Color(255, 255, 255));
        jb4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jb4);
        jb4.setBounds(170, 270, 90, 30);
        getContentPane().add(fa9);
        fa9.setBounds(480, 60, 50, 30);

        fb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb2ActionPerformed(evt);
            }
        });
        getContentPane().add(fb2);
        fb2.setBounds(260, 160, 50, 30);

        fb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb3ActionPerformed(evt);
            }
        });
        getContentPane().add(fb3);
        fb3.setBounds(260, 240, 50, 30);

        fb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb4ActionPerformed(evt);
            }
        });
        getContentPane().add(fb4);
        fb4.setBounds(260, 270, 50, 30);

        fb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb5ActionPerformed(evt);
            }
        });
        getContentPane().add(fb5);
        fb5.setBounds(340, 130, 50, 30);

        fb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb6ActionPerformed(evt);
            }
        });
        getContentPane().add(fb6);
        fb6.setBounds(340, 160, 50, 30);

        fb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb7ActionPerformed(evt);
            }
        });
        getContentPane().add(fb7);
        fb7.setBounds(340, 240, 50, 30);

        fb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fb8ActionPerformed(evt);
            }
        });
        getContentPane().add(fb8);
        fb8.setBounds(340, 270, 50, 30);

        jb5.setForeground(new java.awt.Color(255, 255, 255));
        jb5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jb5);
        jb5.setBounds(390, 130, 90, 30);

        jb6.setForeground(new java.awt.Color(255, 255, 255));
        jb6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jb6);
        jb6.setBounds(390, 160, 90, 30);

        jb7.setForeground(new java.awt.Color(255, 255, 255));
        jb7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jb7);
        jb7.setBounds(390, 240, 90, 30);

        jb8.setForeground(new java.awt.Color(255, 255, 255));
        jb8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jb8);
        jb8.setBounds(390, 270, 90, 30);
        getContentPane().add(fa7);
        fa7.setBounds(100, 330, 50, 30);
        getContentPane().add(fa10);
        fa10.setBounds(480, 90, 50, 30);
        getContentPane().add(fa11);
        fa11.setBounds(480, 150, 50, 30);

        fa13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fa13ActionPerformed(evt);
            }
        });
        getContentPane().add(fa13);
        fa13.setBounds(480, 260, 50, 30);

        fa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fa12ActionPerformed(evt);
            }
        });
        getContentPane().add(fa12);
        fa12.setBounds(480, 180, 50, 30);

        fa14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fa14ActionPerformed(evt);
            }
        });
        getContentPane().add(fa14);
        fa14.setBounds(480, 290, 50, 30);

        fa15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fa15ActionPerformed(evt);
            }
        });
        getContentPane().add(fa15);
        fa15.setBounds(480, 330, 50, 30);

        fa16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fa16ActionPerformed(evt);
            }
        });
        getContentPane().add(fa16);
        fa16.setBounds(480, 360, 50, 30);

        ja9.setForeground(new java.awt.Color(255, 255, 255));
        ja9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(ja9);
        ja9.setBounds(530, 60, 90, 30);

        ja10.setForeground(new java.awt.Color(255, 255, 255));
        ja10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(ja10);
        ja10.setBounds(530, 90, 90, 30);

        ja11.setForeground(new java.awt.Color(255, 255, 255));
        ja11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(ja11);
        ja11.setBounds(530, 150, 90, 30);

        ja13.setForeground(new java.awt.Color(255, 255, 255));
        ja13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(ja13);
        ja13.setBounds(530, 260, 90, 30);

        ja12.setForeground(new java.awt.Color(255, 255, 255));
        ja12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(ja12);
        ja12.setBounds(530, 180, 90, 30);

        ja15.setForeground(new java.awt.Color(255, 255, 255));
        ja15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(ja15);
        ja15.setBounds(530, 330, 90, 30);

        ja14.setForeground(new java.awt.Color(255, 255, 255));
        ja14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(ja14);
        ja14.setBounds(530, 290, 90, 30);

        ja16.setForeground(new java.awt.Color(255, 255, 255));
        ja16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(ja16);
        ja16.setBounds(530, 360, 90, 30);

        jButton1.setText("ATUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 60, 100, 30);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabteste/WhatsApp Image 2017-11-03 at 9.33.29 PM.jpeg"))); // NOI18N
        fundo.setText("jLabel1");
        getContentPane().add(fundo);
        fundo.setBounds(10, 0, 700, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fb1ActionPerformed

    private void fb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fb2ActionPerformed

    private void fb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fb3ActionPerformed

    private void fb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fb4ActionPerformed

    private void fb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fb5ActionPerformed

    private void fb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fb6ActionPerformed

    private void fb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fb7ActionPerformed

    private void fb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fb8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fb8ActionPerformed

    private void fa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fa12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fa12ActionPerformed

    private void fa13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fa13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fa13ActionPerformed

    private void fa14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fa14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fa14ActionPerformed

    private void fa15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fa15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fa15ActionPerformed

    private void fa16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fa16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fa16ActionPerformed
    public void setNome() {
        if (Tela2.Participantes.size() == 13) {
            ja1.setText("BOT");
            ja3.setText("BOT");
            ja5.setText("BOT");
            Sorteio s = new Sorteio();
            s.Sortear();
            ja2.setText(Tela2.Participantes.get(0));
            ja4.setText(Tela2.Participantes.get(1));
            ja6.setText(Tela2.Participantes.get(2));
            ja7.setText(Tela2.Participantes.get(3));
            ja8.setText(Tela2.Participantes.get(4));
            ja9.setText(Tela2.Participantes.get(5));
            ja10.setText(Tela2.Participantes.get(6));
            ja11.setText(Tela2.Participantes.get(7));
            ja12.setText(Tela2.Participantes.get(8));
            ja13.setText(Tela2.Participantes.get(9));
            ja14.setText(Tela2.Participantes.get(10));
            ja15.setText(Tela2.Participantes.get(11));
            ja16.setText(Tela2.Participantes.get(12));
        }
        if (Tela2.Participantes.size() == 14) {
            ja3.setText("BOT");
            ja5.setText("BOT");
            Sorteio s = new Sorteio();
            s.Sortear();
            ja1.setText(Tela2.Participantes.get(0));
            ja2.setText(Tela2.Participantes.get(1));
            ja4.setText(Tela2.Participantes.get(2));
            ja6.setText(Tela2.Participantes.get(3));
            ja7.setText(Tela2.Participantes.get(4));
            ja8.setText(Tela2.Participantes.get(5));
            ja9.setText(Tela2.Participantes.get(6));
            ja10.setText(Tela2.Participantes.get(7));
            ja11.setText(Tela2.Participantes.get(8));
            ja12.setText(Tela2.Participantes.get(9));
            ja13.setText(Tela2.Participantes.get(10));
            ja14.setText(Tela2.Participantes.get(11));
            ja15.setText(Tela2.Participantes.get(12));
            ja16.setText(Tela2.Participantes.get(13));
        }
        
        if (Tela2.Participantes.size() == 15) {
            ja3.setText("BOT");
            Sorteio s = new Sorteio();
            s.Sortear();
            ja1.setText(Tela2.Participantes.get(0));
            ja2.setText(Tela2.Participantes.get(1));
            ja4.setText(Tela2.Participantes.get(2));
            ja5.setText(Tela2.Participantes.get(3));
            ja6.setText(Tela2.Participantes.get(4));
            ja7.setText(Tela2.Participantes.get(5));
            ja8.setText(Tela2.Participantes.get(6));
            ja9.setText(Tela2.Participantes.get(7));
            ja10.setText(Tela2.Participantes.get(8));
            ja11.setText(Tela2.Participantes.get(9));
            ja12.setText(Tela2.Participantes.get(10));
            ja13.setText(Tela2.Participantes.get(11));
            ja14.setText(Tela2.Participantes.get(12));
            ja15.setText(Tela2.Participantes.get(13));
            ja16.setText(Tela2.Participantes.get(14));
        }

        if (Tela2.Participantes.size() == 16) {
            Sorteio s = new Sorteio();
            s.Sortear();
            ja1.setText(Tela2.Participantes.get(0));
            ja2.setText(Tela2.Participantes.get(1));
            ja3.setText(Tela2.Participantes.get(2));
            ja4.setText(Tela2.Participantes.get(3));
            ja5.setText(Tela2.Participantes.get(4));
            ja6.setText(Tela2.Participantes.get(5));
            ja7.setText(Tela2.Participantes.get(6));
            ja8.setText(Tela2.Participantes.get(7));
            ja9.setText(Tela2.Participantes.get(8));
            ja10.setText(Tela2.Participantes.get(9));
            ja11.setText(Tela2.Participantes.get(10));
            ja12.setText(Tela2.Participantes.get(11));
            ja13.setText(Tela2.Participantes.get(12));
            ja14.setText(Tela2.Participantes.get(13));
            ja15.setText(Tela2.Participantes.get(14));
            ja16.setText(Tela2.Participantes.get(15));
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
        if (!fa7.getText().equals("") && !fa8.getText().equals("")) {
            int a7 = Integer.parseInt(fa7.getText());
            int a8 = Integer.parseInt(fa8.getText());
            if (a7 > a8) {
                jb4.setText(ja7.getText());
            } else if (a8 > a7) {
                jb4.setText(ja8.getText());
            }
        }

        //par5
        if (!fa9.getText().equals("") && !fa10.getText().equals("")) {
            int a9 = Integer.parseInt(fa9.getText());
            int a10 = Integer.parseInt(fa10.getText());
            if (a9 > a10) {
                jb5.setText(ja9.getText());
            } else if (a10 > a9) {
                jb5.setText(ja10.getText());
            }
        }
        //part6 
        if (!fa11.getText().equals("") && !fa12.getText().equals("")) {
            int a11 = Integer.parseInt(fa11.getText());
            int a12 = Integer.parseInt(fa12.getText());
            if (a11 > a12) {
                jb6.setText(ja11.getText());
            } else if (a12 > a11) {
                jb6.setText(ja12.getText());
            }
        }
        //part7
        if (!fa13.getText().equals("") && !fa14.getText().equals("")) {
            int a13 = Integer.parseInt(fa13.getText());
            int a14 = Integer.parseInt(fa14.getText());
            if (a13 > a14) {
                jb7.setText(ja13.getText());
            } else if (a14 > a13) {
                jb7.setText(ja14.getText());
            }
        }
        //part8
        if (!fa15.getText().equals("") && !fa16.getText().equals("")) {
            int a15 = Integer.parseInt(fa15.getText());
            int a16 = Integer.parseInt(fa16.getText());
            if (a15 > a16) {
                jb8.setText(ja15.getText());
            } else if (a16 > a15) {
                jb8.setText(ja16.getText());
            }
        }
        Pilha pilha = new Pilha();

        int p1 = Integer.parseInt(fa1.getText());
        int p2 = Integer.parseInt(fa2.getText());
        if (p1 < p2) {
            pilha.empilhar(ja1.getText());
        } else if (p2 < p1) {
            pilha.empilhar(ja2.getText());
        }
        int p3 = Integer.parseInt(fa3.getText());
        int p4 = Integer.parseInt(fa4.getText());
        if (p3 < p4) {
            pilha.empilhar(ja3.getText());
        } else if (p4 < p3) {
            pilha.empilhar(ja4.getText());
        }
        int p5 = Integer.parseInt(fa5.getText());
        int p6 = Integer.parseInt(fa6.getText());
        if (p5 < p6) {
            pilha.empilhar(ja5.getText());
        } else if (p6 < p5) {
            pilha.empilhar(ja6.getText());
        }
        int p7 = Integer.parseInt(fa7.getText());
        int p8 = Integer.parseInt(fa8.getText());
        if (p7 < p8) {
            pilha.empilhar(ja7.getText());
        } else if (p8 < p7) {
            pilha.empilhar(ja8.getText());
        }
        int p9 = Integer.parseInt(fa9.getText());
        int p10 = Integer.parseInt(fa10.getText());
        if (p9 < p10) {
            pilha.empilhar(ja9.getText());
        } else if (p10 < p9) {
            pilha.empilhar(ja10.getText());
        }
        int p11 = Integer.parseInt(fa11.getText());
        int p12 = Integer.parseInt(fa12.getText());
        if (p11 < p12) {
            pilha.empilhar(ja11.getText());
        } else if (p12 < p11) {
            pilha.empilhar(ja12.getText());
        }
        int p13 = Integer.parseInt(fa13.getText());
        int p14 = Integer.parseInt(fa14.getText());
        if (p13 < p14) {
            pilha.empilhar(ja13.getText());
        } else if (p14 < p13) {
            pilha.empilhar(ja14.getText());
        }
        int p15 = Integer.parseInt(fa15.getText());
        int p16 = Integer.parseInt(fa16.getText());
        if (p15 < p16) {
            pilha.empilhar(ja15.getText());
        } else if (p16 < p15) {
            pilha.empilhar(ja16.getText());
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
        try {
            ultimosColocados6 = (String) pilha.desempilhar();
        } catch (PilhaVaziaException ex) {
            Logger.getLogger(TelaMataMata6.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ultimosColocados7 = (String) pilha.desempilhar();
        } catch (PilhaVaziaException ex) {
            Logger.getLogger(TelaMataMata6.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ultimosColocados8 = (String) pilha.desempilhar();
        } catch (PilhaVaziaException ex) {
            Logger.getLogger(TelaMataMata6.class.getName()).log(Level.SEVERE, null, ex);
        }

        //==========================QUARTAS===================
         if (!fb1.getText().equals("") && !fb2.getText().equals("")) {
            int b1 = Integer.parseInt(fb1.getText());
            int b2 = Integer.parseInt(fb2.getText());
            if (b1 > b2) {
                classificados.add(jb1.getText());
            } else if (b2 > b1) {
                classificados.add(jb2.getText());
            }
            counter += 1;
        }

        //part2
        if (!fb3.getText().equals("") && !fb4.getText().equals("")) {
            int b3 = Integer.parseInt(fb3.getText());
            int b4 = Integer.parseInt(fb4.getText());
            if (b3 > b4) {
                classificados.add(jb3.getText());
            } else if (b4 > b3) {
                classificados.add(jb4.getText());
            }
            counter += 1;
        }
        //part3
        if (!fb5.getText().equals("") && !fb6.getText().equals("")) {
            int b5 = Integer.parseInt(fb5.getText());
            int b6 = Integer.parseInt(fb6.getText());
            if (b5 > b6) {
                classificados.add(jb5.getText());
            } else if (b6 > b5) {
                classificados.add(jb6.getText());
            }
            counter += 1;
        }

        //part4
        if (!fb7.getText().equals("") && !fb8.getText().equals("")) {
            int b7 = Integer.parseInt(fb7.getText());
            int b8 = Integer.parseInt(fb8.getText());
            if (b7 > b8) {
                classificados.add(jb7.getText());
            } else if (b8 > b7) {
                classificados.add(jb8.getText());
            }
            counter += 1;
            if (counter == 4) {
                TelaMataMata16p2 tm16p2 = new TelaMataMata16p2();
                tm16p2.setVisible(true);
            } else if(counter != 4){
                JOptionPane.showMessageDialog(this, "Digite o resultado de todos os jogos antes de prosseguir");
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMataMata16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMataMata16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMataMata16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMataMata16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaMataMata16().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fa1;
    private javax.swing.JTextField fa10;
    private javax.swing.JTextField fa11;
    private javax.swing.JTextField fa12;
    private javax.swing.JTextField fa13;
    private javax.swing.JTextField fa14;
    private javax.swing.JTextField fa15;
    private javax.swing.JTextField fa16;
    private javax.swing.JTextField fa2;
    private javax.swing.JTextField fa3;
    private javax.swing.JTextField fa4;
    private javax.swing.JTextField fa5;
    private javax.swing.JTextField fa6;
    private javax.swing.JTextField fa7;
    private javax.swing.JTextField fa8;
    private javax.swing.JTextField fa9;
    private javax.swing.JTextField fb1;
    private javax.swing.JTextField fb2;
    private javax.swing.JTextField fb3;
    private javax.swing.JTextField fb4;
    private javax.swing.JTextField fb5;
    private javax.swing.JTextField fb6;
    private javax.swing.JTextField fb7;
    private javax.swing.JTextField fb8;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel ja1;
    private javax.swing.JLabel ja10;
    private javax.swing.JLabel ja11;
    private javax.swing.JLabel ja12;
    private javax.swing.JLabel ja13;
    private javax.swing.JLabel ja14;
    private javax.swing.JLabel ja15;
    private javax.swing.JLabel ja16;
    private javax.swing.JLabel ja2;
    private javax.swing.JLabel ja3;
    private javax.swing.JLabel ja4;
    private javax.swing.JLabel ja5;
    private javax.swing.JLabel ja6;
    private javax.swing.JLabel ja7;
    private javax.swing.JLabel ja8;
    private javax.swing.JLabel ja9;
    private javax.swing.JLabel jb1;
    private javax.swing.JLabel jb2;
    private javax.swing.JLabel jb3;
    private javax.swing.JLabel jb4;
    private javax.swing.JLabel jb5;
    private javax.swing.JLabel jb6;
    private javax.swing.JLabel jb7;
    private javax.swing.JLabel jb8;
    // End of variables declaration//GEN-END:variables
}