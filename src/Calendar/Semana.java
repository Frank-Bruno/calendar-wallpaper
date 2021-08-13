/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar;

import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author joaod
 */
public class Semana extends javax.swing.JFrame {
    public static Semana semana;
    //instanciando a agenda
    Dia_principal Dia_principal = new Dia_principal();
    //variaveis que serão usadas depois da criação dos objetos swing
    int AnoFIXO = 0, MesFIXO = 0, DiaFIXO = 0;
    int AnoAltera = 0, MesAltera = 0, DiaAltera = 0;
    int valorselecao = 0;
    int g;
    public Semana() {
        super("Semana");
        //intanciando a classe Utilidades
        Utilidades u = new Utilidades();
        //aplicando os metodos na classe semana
        u.utilidade(this);
        
        initComponents();
        //iniciando os metodos criandos nessa classe
        iniciocalendario();
        calendario();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BD1 = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        data = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        T = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        data1 = new javax.swing.JLabel();
        h1 = new javax.swing.JLabel();
        T1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        data2 = new javax.swing.JLabel();
        h2 = new javax.swing.JLabel();
        T2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        data3 = new javax.swing.JLabel();
        h3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T3 = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        data4 = new javax.swing.JLabel();
        h4 = new javax.swing.JLabel();
        T4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        data5 = new javax.swing.JLabel();
        h5 = new javax.swing.JLabel();
        T5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        data6 = new javax.swing.JLabel();
        h6 = new javax.swing.JLabel();
        T6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1075, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BD1.setBorder(null);
        BD1.setBorderPainted(false);
        BD1.setContentAreaFilled(false);
        BD1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BD1ActionPerformed(evt);
            }
        });
        getContentPane().add(BD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 60, 100));

        Fechar.setBackground(new java.awt.Color(0, 0, 0));
        Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calendar/imag/Fechar.png"))); // NOI18N
        Fechar.setBorder(null);
        Fechar.setBorderPainted(false);
        Fechar.setContentAreaFilled(false);
        Fechar.setFocusCycleRoot(true);
        Fechar.setIconTextGap(1);
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        getContentPane().add(Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, -1, -1));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(2, 0, 0, -120));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("DOM");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jPanel8.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("SEG");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel8.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("TER");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel8.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("QUA");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel8.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("QUI");
        jLabel5.setToolTipText("");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel8.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("SEX");
        jLabel6.setToolTipText("");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel8.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("SÁB");
        jLabel7.setToolTipText("");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel8.add(jLabel7);

        jPanel1.setOpaque(false);

        data.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        data.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        data.setText("Data");
        data.setToolTipText("");
        data.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        data.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        h.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        h.setText("Hora");

        T.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        T.setText("Tarefa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(data, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(h, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(T, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel8.add(jPanel1);

        jPanel2.setOpaque(false);

        data1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        data1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        data1.setText("Data");
        data1.setToolTipText("");
        data1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        data1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        h1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        h1.setText("Hora");

        T1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        T1.setText("Tarefa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(data1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(h1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(T1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(data1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel8.add(jPanel2);

        jPanel3.setOpaque(false);

        data2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        data2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        data2.setText("Data");
        data2.setToolTipText("");
        data2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        data2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        h2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        h2.setText("Hora");

        T2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        T2.setText("Tarefa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(data2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(h2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(T2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(data2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel8.add(jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        data3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        data3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        data3.setText("Data");
        data3.setToolTipText("");
        data3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        data3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(data3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        h3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        h3.setText("Hora");
        jPanel4.add(h3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 62, 110));

        jScrollPane1.setOpaque(false);

        T3.setToolTipText("");
        T3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        T3.setOpaque(false);
        jScrollPane1.setViewportView(T3);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 30, 80, 120));

        jPanel8.add(jPanel4);

        jPanel5.setOpaque(false);

        data4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        data4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        data4.setText("Data");
        data4.setToolTipText("");
        data4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        data4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        h4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        h4.setText("Hora");

        T4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        T4.setText("Tarefa");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(data4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(h4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(T4, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(data4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel8.add(jPanel5);

        jPanel6.setOpaque(false);

        data5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        data5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        data5.setText("Data");
        data5.setToolTipText("");
        data5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        data5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        h5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        h5.setText("Hora");

        T5.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        T5.setText("Tarefa");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(data5, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(h5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(T5, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(data5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel8.add(jPanel6);

        jPanel7.setOpaque(false);

        data6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        data6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        data6.setText("Data");
        data6.setToolTipText("");
        data6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        data6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        h6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        h6.setText("Hora");

        T6.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        T6.setText("Tarefa");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(data6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(h6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(T6, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(data6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel8.add(jPanel7);

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        // TODO add your handling code here:
        //código que fecha o programa

        System.exit(0);
    }//GEN-LAST:event_FecharActionPerformed

    private void BD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BD1ActionPerformed
        // TODO add your handling code here:
        int i;
        int n;
        
            DefaultListModel listModel = new DefaultListModel(); 
        
            n = Dia_principal.agenda.tamanho();
        for (i=0;i<n;i++) {
               listModel.addElement(i+" "+Dia_principal.agenda.texto1(i));
            }
            T3.setModel(listModel);
        Dia_principal.setVisible(true);
        this.dispose();
        this.repaint();
        this.semana.validate();
        
    }//GEN-LAST:event_BD1ActionPerformed

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
            java.util.logging.Logger.getLogger(Semana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Semana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Semana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Semana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                semana = new Semana();
                semana.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BD1;
    private javax.swing.JButton Fechar;
    public javax.swing.JLabel T;
    public javax.swing.JLabel T1;
    public javax.swing.JLabel T2;
    private javax.swing.JList<String> T3;
    public javax.swing.JLabel T4;
    public javax.swing.JLabel T5;
    public javax.swing.JLabel T6;
    public javax.swing.JLabel data;
    public javax.swing.JLabel data1;
    public javax.swing.JLabel data2;
    public javax.swing.JLabel data3;
    public javax.swing.JLabel data4;
    public javax.swing.JLabel data5;
    public javax.swing.JLabel data6;
    public javax.swing.JLabel h;
    public javax.swing.JLabel h1;
    public javax.swing.JLabel h2;
    public javax.swing.JLabel h3;
    public javax.swing.JLabel h4;
    public javax.swing.JLabel h5;
    public javax.swing.JLabel h6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void iniciocalendario(){
        SimpleDateFormat Dia = new SimpleDateFormat("dd");
        SimpleDateFormat Mes = new SimpleDateFormat("MM");
        SimpleDateFormat Ano = new SimpleDateFormat("YY");
       
        DiaFIXO = Integer.parseInt(Dia.format(new Date()));
        AnoFIXO = Integer.parseInt(Ano.format(new Date()));
        MesFIXO = Integer.parseInt(Mes.format(new Date()));
        
    }
    public void calendario(){
        //limpa o texto das variaveis
        data.setText("");
        data1.setText("");
        data2.setText("");
        data3.setText("");
        data4.setText("");
        data5.setText("");
        data6.setText("");
        //adicionando o texto nas variaveis
        data.setText(""+(DiaFIXO - 3));
        data1.setText(""+(DiaFIXO - 2));
        data2.setText(""+(DiaFIXO - 1));
        data3.setText(""+DiaFIXO);
        data4.setText(""+(DiaFIXO + 1));
        data5.setText(""+(DiaFIXO + 2));
        data6.setText(""+(DiaFIXO + 3));
        
        
        
        DiaAltera = DiaFIXO - 1;
        MesAltera = MesFIXO;
        AnoAltera = AnoFIXO;
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(AnoAltera, MesAltera, DiaAltera);
        int SetaDia = 0;
        String DiaSemana1 = null;
        String DiaSemana2 = null;
        String DiaSemana3 = null;
        String DiaSemanaMeio = null;
        String DiaSemana5 = null;
        String DiaSemana6 = null;
        String DiaSemana7 = null;
        
        int Semana = calendar.get(Calendar.DAY_OF_WEEK);
        switch (Semana) {
            case Calendar.SUNDAY:
                SetaDia = 1;
                DiaSemana1 = "QUI";
                DiaSemana2 = "SEX";
                DiaSemana3 = "SÁB";
                DiaSemanaMeio = "DOM";
                DiaSemana5 = "SEG";
                DiaSemana6 = "TER";
                DiaSemana7 = "QUA";
                break;
            case Calendar.MONDAY:
                SetaDia = 2;
                DiaSemana1 = "SEX";
                DiaSemana2 = "SÁB";
                DiaSemana3 = "DOM";
                DiaSemanaMeio = "SEG";
                DiaSemana5 = "TER";
                DiaSemana6 = "QUA";
                DiaSemana7 = "QUI";
                break;
            case Calendar.TUESDAY:
                SetaDia = 3;
                DiaSemana1 = "SÁB";
                DiaSemana2 = "DOM";
                DiaSemana3 = "SEG";
                DiaSemanaMeio = "TER";
                DiaSemana5 = "QUA";
                DiaSemana6 = "QUI";
                DiaSemana7 = "SEX";
                break;
            case Calendar.WEDNESDAY:
                SetaDia = 4;
                DiaSemana1 = "DOM";
                DiaSemana2 = "SEG";
                DiaSemana3 = "TER";
                DiaSemanaMeio = "QUA";
                DiaSemana5 = "QUI";
                DiaSemana6 = "SEX";
                DiaSemana7 = "SÁB";
                break;
            case Calendar.THURSDAY:
                SetaDia = 5;
                DiaSemana1 = "SEG";
                DiaSemana2 = "TER";
                DiaSemana3 = "QUA";
                DiaSemanaMeio = "QUI";
                DiaSemana5 = "SEX";
                DiaSemana6 = "SÁB";
                DiaSemana7 = "DOM";
                break;
            case Calendar.FRIDAY:
                SetaDia = 6;
                DiaSemana1 = "TER";
                DiaSemana2 = "QUA";
                DiaSemana3 = "QUI";
                DiaSemanaMeio = "SEX";
                DiaSemana5 = "SÁB";
                DiaSemana6 = "DOM";
                DiaSemana7 = "SEG";
                break;
            case Calendar.SATURDAY:
                SetaDia = 7;
                DiaSemana1 = "QUA";
                DiaSemana2 = "QUI";
                DiaSemana3 = "SEX";
                DiaSemanaMeio = "SÁB";
                DiaSemana5 = "DOM";
                DiaSemana6 = "SEG";
                DiaSemana7 = "TER";
                break;
            default:
                break;
        }
        //limpa o texto das variaveis
        jLabel1.setText("");
        jLabel2.setText("");
        jLabel3.setText("");
        jLabel4.setText("");
        jLabel5.setText("");
        jLabel6.setText("");
        jLabel7.setText("");
        //adicionando o texto nas variaveis
        jLabel1.setText(""+DiaSemana1);
        jLabel2.setText(""+DiaSemana2);
        jLabel3.setText(""+DiaSemana3);
        jLabel4.setText(""+DiaSemanaMeio);
        jLabel5.setText(""+DiaSemana5);
        jLabel6.setText(""+DiaSemana6);
        jLabel7.setText(""+DiaSemana7);
        
        int i;
        int n;
        
            DefaultListModel listModel = new DefaultListModel(); 
        
            n = Dia_principal.agenda.tamanho();
        for (i=0;i<n;i++) {
               listModel.addElement(i+" "+Dia_principal.agenda.texto1(i));
            }
            T3.setModel(listModel);
        
        
        
        
       
        
    }
}
