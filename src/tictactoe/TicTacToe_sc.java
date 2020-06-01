/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sjiek
 */
public class TicTacToe_sc extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;

    public TicTacToe_sc() {
        initComponents();
    }

    private void gameScore() {
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayerO.setText(String.valueOf(oCount));
    }

    private void toggle_player() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }

    private void setText(int n, String text) {
        switch (n) {
            case 1:
                jButton1.setText(text);
                break;
            case 2:
                jButton2.setText(text);
                break;
            case 3:
                jButton3.setText(text);
                break;
            case 4:
                jButton4.setText(text);
                break;
            case 5:
                jButton5.setText(text);
                break;
            case 6:
                jButton6.setText(text);
                break;
            case 7:
                jButton7.setText(text);
                break;
            case 8:
                jButton8.setText(text);
                break;
            case 9:
                jButton9.setText(text);
                break;
        }
    }

    private String getText(int n) {
        String text = null;
        switch (n) {
            case 1:
                text = jButton1.getText();
                break;
            case 2:
                text = jButton2.getText();
                break;
            case 3:
                text = jButton3.getText();
                break;
            case 4:
                text = jButton4.getText();
                break;
            case 5:
                text = jButton5.getText();
                break;
            case 6:
                text = jButton6.getText();
                break;
            case 7:
                text = jButton7.getText();
                break;
            case 8:
                text = jButton8.getText();
                break;
            case 9:
                text = jButton9.getText();
                break;
        }
        return text;
    }

    private void reset() {
        for (int count = 1; count <= 9; count++) {
            setText(count, "");
            jButton1.setBackground(Color.white);
            jButton2.setBackground(Color.white);
            jButton3.setBackground(Color.white);
            jButton4.setBackground(Color.white);
            jButton5.setBackground(Color.white);
            jButton6.setBackground(Color.white);
            jButton7.setBackground(Color.white);
            jButton8.setBackground(Color.white);
            jButton9.setBackground(Color.white);
        }
    }

    private void check_win() {
        String text1, text2, text3;
        for (int x = 0; x < 3; x++) {
            text1 = getText(x * 3 + 1);
            text2 = getText(x * 3 + 2);
            text3 = getText(x * 3 + 3);
            if (win_game(text1, text2, text3) != 0) {
                trun_yellow(x * 3 + 1);
                trun_yellow(x * 3 + 2);
                trun_yellow(x * 3 + 3);
                if (win_game(text1, text2, text3) == 1) {
                    JOptionPane.showMessageDialog(this, "玩家 X 贏了!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    xCount++;
                    gameScore();
                    reset();
                } else {
                    JOptionPane.showMessageDialog(this, "玩家 O 贏了!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    oCount++;
                    gameScore();
                    reset();
                }
                break;
            };
            text1 = getText(x + 1);
            text2 = getText(x + 4);
            text3 = getText(x + 7);
            if (win_game(text1, text2, text3) != 0) {
                trun_yellow(x + 1);
                trun_yellow(x + 4);
                trun_yellow(x + 7);
                if (win_game(text1, text2, text3) == 1) {
                    JOptionPane.showMessageDialog(this, "玩家 X 贏了!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    xCount++;
                    gameScore();
                    reset();
                } else {
                    JOptionPane.showMessageDialog(this, "玩家 O 贏了!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    oCount++;
                    gameScore();
                    reset();
                }
                break;
            };
        }
        text1 = getText(1);
        text2 = getText(5);
        text3 = getText(9);
        if (win_game(text1, text2, text3) != 0) {
            trun_yellow(1);
            trun_yellow(5);
            trun_yellow(9);
            if (win_game(text1, text2, text3) == 1) {
                JOptionPane.showMessageDialog(this, "玩家 X 贏了!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xCount++;
                gameScore();
                reset();
            } else {
                JOptionPane.showMessageDialog(this, "玩家 O 贏了!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                oCount++;
                gameScore();
                reset();
            }
        };
        text1 = getText(3);
        text2 = getText(5);
        text3 = getText(7);
        if (win_game(text1, text2, text3) != 0) {
            trun_yellow(3);
            trun_yellow(5);
            trun_yellow(7);
            if (win_game(text1, text2, text3) == 1) {
                JOptionPane.showMessageDialog(this, "玩家 X 贏了!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xCount++;
                gameScore();
                reset();
            } else {
                JOptionPane.showMessageDialog(this, "玩家 O 贏了!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                oCount++;
                gameScore();
                reset();
            }
        };
    }

    private int win_game(String text1, String text2, String text3) {
        if (text1.equals(text2) && text2.equals(text3)) {
            if (text1.equals("X")) {
                return 1;
            } else if (text1.equals("O")) {
                return 2;
            }
        }
        return 0;
    }

    private void trun_yellow(int n) {
        switch (n) {
            case 1:
                jButton1.setBackground(Color.yellow);
                break;
            case 2:
                jButton2.setBackground(Color.yellow);
                break;
            case 3:
                jButton3.setBackground(Color.yellow);
                break;
            case 4:
                jButton4.setBackground(Color.yellow);
                break;
            case 5:
                jButton5.setBackground(Color.yellow);
                break;
            case 6:
                jButton6.setBackground(Color.yellow);
                break;
            case 7:
                jButton7.setBackground(Color.yellow);
                break;
            case 8:
                jButton8.setBackground(Color.yellow);
                break;
            case 9:
                jButton9.setBackground(Color.yellow);
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jlblPlayerO = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("新細明體", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("井 字 棋");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("新細明體", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("新細明體", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("新細明體", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 204, 102));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("新細明體", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("玩家 X :");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 204, 102));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jlblPlayerX.setBackground(new java.awt.Color(102, 102, 102));
        jlblPlayerX.setFont(new java.awt.Font("新細明體", 1, 48)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jPanel7.add(jlblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("新細明體", 1, 96)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("新細明體", 1, 96)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("新細明體", 1, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 204, 102));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("新細明體", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("玩家 O :");
        jPanel12.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 204, 102));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jlblPlayerO.setBackground(new java.awt.Color(102, 102, 102));
        jlblPlayerO.setFont(new java.awt.Font("新細明體", 1, 48)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jPanel13.add(jlblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("新細明體", 1, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("新細明體", 1, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("新細明體", 1, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jbtnReset.setFont(new java.awt.Font("新細明體", 1, 48)); // NOI18N
        jbtnReset.setText("重置");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel19.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel19);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jbtnExit.setFont(new java.awt.Font("新細明體", 1, 48)); // NOI18N
        jbtnExit.setText("離開");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel15.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "確定要離開嗎 ?", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        reset();
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (getText(1).isEmpty()) {
            setText(1, startGame);
            if (startGame.equalsIgnoreCase("X")) {
                jButton1.setForeground(Color.red);
            } else {
                jButton1.setForeground(Color.blue);
            }
            toggle_player();
            check_win();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (getText(2).isEmpty()) {
            setText(2, startGame);
            if (startGame.equalsIgnoreCase("X")) {
                jButton2.setForeground(Color.red);
            } else {
                jButton2.setForeground(Color.blue);
            }
            toggle_player();
            check_win();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (getText(3).isEmpty()) {
            setText(3, startGame);
            if (startGame.equalsIgnoreCase("X")) {
                jButton3.setForeground(Color.red);
            } else {
                jButton3.setForeground(Color.blue);
            }
            toggle_player();
            check_win();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (getText(4).isEmpty()) {
            setText(4, startGame);
            if (startGame.equalsIgnoreCase("X")) {
                jButton4.setForeground(Color.red);
            } else {
                jButton4.setForeground(Color.blue);
            }
            toggle_player();
            check_win();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (getText(5).isEmpty()) {
            setText(5, startGame);
            if (startGame.equalsIgnoreCase("X")) {
                jButton5.setForeground(Color.red);
            } else {
                jButton5.setForeground(Color.blue);
            }
            toggle_player();
            check_win();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (getText(6).isEmpty()) {
            setText(6, startGame);
            if (startGame.equalsIgnoreCase("X")) {
                jButton6.setForeground(Color.red);
            } else {
                jButton6.setForeground(Color.blue);
            }
            toggle_player();
            check_win();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (getText(7).isEmpty()) {
            setText(7, startGame);
            if (startGame.equalsIgnoreCase("X")) {
                jButton7.setForeground(Color.red);
            } else {
                jButton7.setForeground(Color.blue);
            }
            toggle_player();
            check_win();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (getText(8).isEmpty()) {
            setText(8, startGame);
            if (startGame.equalsIgnoreCase("X")) {
                jButton8.setForeground(Color.red);
            } else {
                jButton8.setForeground(Color.blue);
            }
            toggle_player();
            check_win();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (getText(9).isEmpty()) {
            setText(9, startGame);
            if (startGame.equalsIgnoreCase("X")) {
                jButton9.setForeground(Color.red);
            } else {
                jButton9.setForeground(Color.blue);
            }
            toggle_player();
            check_win();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe_sc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_sc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_sc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_sc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_sc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
