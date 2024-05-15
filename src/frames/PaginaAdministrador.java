/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author kaik.salves
 */
public class PaginaAdministrador extends javax.swing.JFrame {

    String nivelConhecimento = "";

    /**
     * Creates new form PaginaAdministrador
     */
    public PaginaAdministrador() {
        initComponents();
        componentesAlterados();

    }

    public void componentesAlterados() {
        panelBar.setBackground(Color.white);
        panelFundo.setBackground(Color.white);
        retirarPaineis();
        panelUsuarioListar.setBackground(Color.white);
        txtUsuarioListar.setBackground(new Color(0, 0, 0, 0));
        tblListar.setBackground(Color.white);
    }

    public void retirarPaineis() {
        panelAlterar.setVisible(false);
        panelCadastrar.setVisible(false);
        panelBuscar.setVisible(false);
        panelListar.setVisible(false);
        panelExcluir.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFundo = new javax.swing.JPanel();
        panelExcluir = new javax.swing.JPanel();
        panelAlterar = new javax.swing.JPanel();
        panelCadastrar = new javax.swing.JPanel();
        panelBuscar = new javax.swing.JPanel();
        panelListar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        panelUsuarioListar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuarioListar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnMedioConhecimento = new javax.swing.JButton();
        btnAltoConhecimento = new javax.swing.JButton();
        btnBaixoConhecimento = new javax.swing.JButton();
        lblBaixo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelBar = new javax.swing.JPanel();
        lblListar = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        lblCadastrar = new javax.swing.JLabel();
        lblAlterar = new javax.swing.JLabel();
        lblExcluir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panelFundo.setLayout(null);

        javax.swing.GroupLayout panelExcluirLayout = new javax.swing.GroupLayout(panelExcluir);
        panelExcluir.setLayout(panelExcluirLayout);
        panelExcluirLayout.setHorizontalGroup(
            panelExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panelExcluirLayout.setVerticalGroup(
            panelExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        panelFundo.add(panelExcluir);
        panelExcluir.setBounds(0, 40, 880, 480);

        javax.swing.GroupLayout panelAlterarLayout = new javax.swing.GroupLayout(panelAlterar);
        panelAlterar.setLayout(panelAlterarLayout);
        panelAlterarLayout.setHorizontalGroup(
            panelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panelAlterarLayout.setVerticalGroup(
            panelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        panelFundo.add(panelAlterar);
        panelAlterar.setBounds(0, 40, 880, 480);

        javax.swing.GroupLayout panelCadastrarLayout = new javax.swing.GroupLayout(panelCadastrar);
        panelCadastrar.setLayout(panelCadastrarLayout);
        panelCadastrarLayout.setHorizontalGroup(
            panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panelCadastrarLayout.setVerticalGroup(
            panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        panelFundo.add(panelCadastrar);
        panelCadastrar.setBounds(0, 40, 880, 480);

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        panelFundo.add(panelBuscar);
        panelBuscar.setBounds(0, 40, 880, 480);

        panelListar.setBackground(new java.awt.Color(255, 255, 255));
        panelListar.setLayout(null);

        tblListar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"teste", "teste@gmail.com", "alto"}
            },
            new String [] {
                "Nome", "Email", "Nivel Conhecimento"
            }
        ));
        tblListar.setEnabled(false);
        tblListar.setGridColor(new java.awt.Color(255, 255, 255));
        tblListar.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblListar);

        panelListar.add(jScrollPane1);
        jScrollPane1.setBounds(24, 108, 828, 276);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btnListar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelListar.add(jButton1);
        jButton1.setBounds(360, 396, 140, 50);

        panelUsuarioListar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/nameImg.png"))); // NOI18N

        txtUsuarioListar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtUsuarioListar.setBorder(null);

        javax.swing.GroupLayout panelUsuarioListarLayout = new javax.swing.GroupLayout(panelUsuarioListar);
        panelUsuarioListar.setLayout(panelUsuarioListarLayout);
        panelUsuarioListarLayout.setHorizontalGroup(
            panelUsuarioListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioListarLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtUsuarioListar, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelUsuarioListarLayout.setVerticalGroup(
            panelUsuarioListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(txtUsuarioListar, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        panelListar.add(panelUsuarioListar);
        panelUsuarioListar.setBounds(24, 44, 350, 52);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nível de conhecimento");
        panelListar.add(jLabel2);
        jLabel2.setBounds(570, 30, 180, 17);

        btnMedioConhecimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/checkBox.png"))); // NOI18N
        btnMedioConhecimento.setBorder(null);
        btnMedioConhecimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMedioConhecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedioConhecimentoActionPerformed(evt);
            }
        });
        panelListar.add(btnMedioConhecimento);
        btnMedioConhecimento.setBounds(620, 70, 30, 20);

        btnAltoConhecimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/checkBox.png"))); // NOI18N
        btnAltoConhecimento.setBorder(null);
        btnAltoConhecimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAltoConhecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltoConhecimentoActionPerformed(evt);
            }
        });
        panelListar.add(btnAltoConhecimento);
        btnAltoConhecimento.setBounds(760, 70, 30, 20);

        btnBaixoConhecimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/checkBox.png"))); // NOI18N
        btnBaixoConhecimento.setBorder(null);
        btnBaixoConhecimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBaixoConhecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaixoConhecimentoActionPerformed(evt);
            }
        });
        panelListar.add(btnBaixoConhecimento);
        btnBaixoConhecimento.setBounds(490, 70, 30, 20);

        lblBaixo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBaixo.setText("Baixo");
        panelListar.add(lblBaixo);
        lblBaixo.setBounds(520, 70, 40, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Médio");
        panelListar.add(jLabel9);
        jLabel9.setBounds(650, 70, 40, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Alto");
        panelListar.add(jLabel10);
        jLabel10.setBounds(790, 70, 40, 20);

        panelFundo.add(panelListar);
        panelListar.setBounds(0, 40, 880, 480);

        panelBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblListar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblListar.setForeground(new java.awt.Color(0, 0, 0));
        lblListar.setText("Listar");
        lblListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblListarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblListarMouseExited(evt);
            }
        });

        lblBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(0, 0, 0));
        lblBuscar.setText("Buscar");
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBuscarMouseExited(evt);
            }
        });

        lblCadastrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastrar.setText("Cadastrar");
        lblCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseExited(evt);
            }
        });

        lblAlterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAlterar.setText("Alterar");
        lblAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlterarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAlterarMouseExited(evt);
            }
        });

        lblExcluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblExcluir.setText("Excluir");
        lblExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExcluirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExcluirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBarLayout = new javax.swing.GroupLayout(panelBar);
        panelBar.setLayout(panelBarLayout);
        panelBarLayout.setHorizontalGroup(
            panelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarLayout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(lblListar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblBuscar)
                .addGap(18, 18, 18)
                .addComponent(lblCadastrar)
                .addGap(18, 18, 18)
                .addComponent(lblAlterar)
                .addGap(18, 18, 18)
                .addComponent(lblExcluir)
                .addGap(327, 327, 327))
        );
        panelBarLayout.setVerticalGroup(
            panelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(lblCadastrar)
                    .addComponent(lblAlterar)
                    .addComponent(lblExcluir)
                    .addComponent(lblListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFundo.add(panelBar);
        panelBar.setBounds(-7, -8, 890, 40);

        getContentPane().add(panelFundo);

        setSize(new java.awt.Dimension(890, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblListarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListarMouseEntered
        lblListar.setForeground(Color.blue);
    }//GEN-LAST:event_lblListarMouseEntered

    private void lblBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseEntered
        lblBuscar.setForeground(Color.blue);
    }//GEN-LAST:event_lblBuscarMouseEntered

    private void lblCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseEntered
        lblCadastrar.setForeground(Color.blue);
    }//GEN-LAST:event_lblCadastrarMouseEntered

    private void lblAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlterarMouseEntered
        lblAlterar.setForeground(Color.blue);
    }//GEN-LAST:event_lblAlterarMouseEntered

    private void lblExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExcluirMouseEntered
        lblExcluir.setForeground(Color.blue);
    }//GEN-LAST:event_lblExcluirMouseEntered

    private void lblListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListarMouseExited
        lblListar.setForeground(Color.black);
    }//GEN-LAST:event_lblListarMouseExited

    private void lblBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseExited
        lblBuscar.setForeground(Color.black);
    }//GEN-LAST:event_lblBuscarMouseExited

    private void lblCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseExited
        lblCadastrar.setForeground(Color.black);
    }//GEN-LAST:event_lblCadastrarMouseExited

    private void lblAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlterarMouseExited
        lblAlterar.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblAlterarMouseExited

    private void lblExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExcluirMouseExited
        lblExcluir.setForeground(Color.black);
    }//GEN-LAST:event_lblExcluirMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListarMouseClicked
        retirarPaineis();
        panelListar.setVisible(true);
    }//GEN-LAST:event_lblListarMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        retirarPaineis();
        panelBuscar.setVisible(true);

    }//GEN-LAST:event_lblBuscarMouseClicked

    private void lblCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseClicked
        retirarPaineis();
        panelCadastrar.setVisible(true);
    }//GEN-LAST:event_lblCadastrarMouseClicked

    private void lblAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlterarMouseClicked
        retirarPaineis();
        panelAlterar.setVisible(true);
    }//GEN-LAST:event_lblAlterarMouseClicked

    private void lblExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExcluirMouseClicked
        retirarPaineis();
        panelExcluir.setVisible(true);
    }//GEN-LAST:event_lblExcluirMouseClicked

    private void btnMedioConhecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedioConhecimentoActionPerformed
        if (btnMedioConhecimento.isSelected()) {
            btnMedioConhecimento.setIcon(new ImageIcon(getClass().getResource("/assets/checkBox.png")));
            nivelConhecimento = "";
        } else {
            btnMedioConhecimento.setIcon(new ImageIcon(getClass().getResource("/assets/checkBoxOk.png")));
            btnBaixoConhecimento.setIcon(new ImageIcon(getClass().getResource("/assets/checkBox.png")));
            btnAltoConhecimento.setIcon(new ImageIcon(getClass().getResource("/assets/checkBox.png")));
            btnBaixoConhecimento.setSelected(false);
            btnAltoConhecimento.setSelected(false);
            btnMedioConhecimento.setSelected(true);
            nivelConhecimento = "Medio";

        }

    }//GEN-LAST:event_btnMedioConhecimentoActionPerformed

    private void btnAltoConhecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltoConhecimentoActionPerformed
        if (btnAltoConhecimento.isSelected()) {
            btnAltoConhecimento.setIcon(new ImageIcon(getClass().getResource("/assets/checkBox.png")));
            nivelConhecimento = "";
        } else {
            btnMedioConhecimento.setIcon(new ImageIcon(getClass().getResource("/assets/checkBox.png")));
            btnBaixoConhecimento.setIcon(new ImageIcon(getClass().getResource("/assets/checkBox.png")));
            btnAltoConhecimento.setIcon(new ImageIcon(getClass().getResource("/assets/checkBoxOk.png")));
            nivelConhecimento = "Alto";
            
        }

    }//GEN-LAST:event_btnAltoConhecimentoActionPerformed

    private void btnBaixoConhecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaixoConhecimentoActionPerformed
        if (btnBaixoConhecimento.isSelected()) {
            btnBaixoConhecimento.setIcon(new ImageIcon(getClass().getResource("/assets/checkBox.png")));
            nivelConhecimento = "";
        } else {
            btnBaixoConhecimento.setIcon(new ImageIcon(getClass().getResource("/assets/checkBoxOk.png")));
            btnMedioConhecimento.setIcon(new ImageIcon(getClass().getResource("/assets/checkBox.png")));
            btnAltoConhecimento.setIcon(new ImageIcon(getClass().getResource("/assets/checkBox.png")));
            nivelConhecimento = "Baixo";
        }
    }//GEN-LAST:event_btnBaixoConhecimentoActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaAdministrador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaAdministrador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaAdministrador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaAdministrador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltoConhecimento;
    private javax.swing.JButton btnBaixoConhecimento;
    private javax.swing.JButton btnMedioConhecimento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlterar;
    private javax.swing.JLabel lblBaixo;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblExcluir;
    private javax.swing.JLabel lblListar;
    private javax.swing.JPanel panelAlterar;
    private javax.swing.JPanel panelBar;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelCadastrar;
    private javax.swing.JPanel panelExcluir;
    private javax.swing.JPanel panelFundo;
    private javax.swing.JPanel panelListar;
    private javax.swing.JPanel panelUsuarioListar;
    private javax.swing.JTable tblListar;
    private javax.swing.JTextField txtUsuarioListar;
    // End of variables declaration//GEN-END:variables
}
