 
package Forms;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Locale;
import javax.swing.JOptionPane;



public class MenuUtama extends javax.swing.JFrame {
private Connection con ;
    private Statement st;
    String data[]=new String[5];
    String driver = "com.mysql.jdbc.Driver";
    String database = "jdbc:mysql://localhost:3306/db_multimedia_nusantara";
    String uid = "root";
    String pwd = "";
    /** Creates new form MenuUtama */
    public MenuUtama() {
        initComponents();
        Locale locale = new Locale ("id", "ID"); 
        Locale.setDefault(locale); 
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        masukan = new javax.swing.JButton();
        lihatPinjaman1 = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        lihatPinjaman3 = new javax.swing.JButton();
        lihatPinjaman4 = new javax.swing.JButton();
        lihatPinjaman5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        fileMenu1 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        fileMenu2 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(204, 204, 204));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainPanel.setEnabled(false);
        mainPanel.setMaximumSize(new java.awt.Dimension(1000, 1000));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        masukan.setBackground(new java.awt.Color(153, 153, 255));
        masukan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        masukan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Database-Table-icon.png"))); // NOI18N
        masukan.setText("DATA PERANGKAT");
        masukan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        masukan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masukanMouseClicked(evt);
            }
        });
        masukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukanActionPerformed(evt);
            }
        });
        jPanel1.add(masukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 190, 233, 60));

        lihatPinjaman1.setBackground(new java.awt.Color(153, 153, 255));
        lihatPinjaman1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lihatPinjaman1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/priest-icon.png"))); // NOI18N
        lihatPinjaman1.setText("DATA VENDOR");
        lihatPinjaman1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lihatPinjaman1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lihatPinjaman1MouseClicked(evt);
            }
        });
        lihatPinjaman1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatPinjaman1ActionPerformed(evt);
            }
        });
        jPanel1.add(lihatPinjaman1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 256, 233, 60));

        keluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_out.png"))); // NOI18N
        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel1.add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 240, 55));

        lihatPinjaman3.setBackground(new java.awt.Color(153, 153, 255));
        lihatPinjaman3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lihatPinjaman3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/priest-icon.png"))); // NOI18N
        lihatPinjaman3.setText("DATA CABANG");
        lihatPinjaman3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lihatPinjaman3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lihatPinjaman3MouseClicked(evt);
            }
        });
        lihatPinjaman3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatPinjaman3ActionPerformed(evt);
            }
        });
        jPanel1.add(lihatPinjaman3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 322, 233, 60));

        lihatPinjaman4.setBackground(new java.awt.Color(153, 153, 255));
        lihatPinjaman4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lihatPinjaman4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Database-Table-icon.png"))); // NOI18N
        lihatPinjaman4.setText("DATA PEMASUKAN");
        lihatPinjaman4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lihatPinjaman4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lihatPinjaman4MouseClicked(evt);
            }
        });
        lihatPinjaman4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatPinjaman4ActionPerformed(evt);
            }
        });
        jPanel1.add(lihatPinjaman4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 387, 233, 60));

        lihatPinjaman5.setBackground(new java.awt.Color(153, 153, 255));
        lihatPinjaman5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lihatPinjaman5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Database-Table-icon.png"))); // NOI18N
        lihatPinjaman5.setText("DATA PENGELUARAN");
        lihatPinjaman5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lihatPinjaman5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lihatPinjaman5MouseClicked(evt);
            }
        });
        lihatPinjaman5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatPinjaman5ActionPerformed(evt);
            }
        });
        jPanel1.add(lihatPinjaman5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 453, 233, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bgtengah.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 190, 648, 384));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/header.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 911, -1));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 95, Short.MAX_VALUE))
        );

        desktopPane.add(mainPanel);
        mainPanel.setBounds(0, 0, 1070, 680);

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1064, 680));

        menuBar.setToolTipText("Aplikasi Pemberian Bonus Metode AHP");

        fileMenu.setMnemonic('f');
        fileMenu.setText("Master");
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        jMenuItem9.setText("Data Perangkat");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem9);

        jMenuItem7.setText("Data Vendor");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem7);

        jMenuItem8.setText("Data Cabang");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem8);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        fileMenu1.setMnemonic('f');
        fileMenu1.setText("Pemasukan");
        fileMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenu1ActionPerformed(evt);
            }
        });

        jMenuItem14.setText("Data Pemasukan Perangkat");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        fileMenu1.add(jMenuItem14);

        menuBar.add(fileMenu1);

        fileMenu2.setMnemonic('f');
        fileMenu2.setText("Pengeluaran");
        fileMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenu2ActionPerformed(evt);
            }
        });

        jMenuItem13.setText("Data Pengeluaran Perangkat");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        fileMenu2.add(jMenuItem13);

        menuBar.add(fileMenu2);

        jMenu1.setText("Laporan");

        jMenuItem1.setText("Laporan Data Perangkat");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Laporan Data Vendor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Laporan Data Cabang");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setText("Laporan Pemasukan Perangkat");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem12.setText("Laporan Pengeluaran Perangkat");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        menuBar.add(jMenu1);

        jMenu4.setText("About");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem11.setText("About");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        menuBar.add(jMenu4);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        System.exit(0);
}//GEN-LAST:event_keluarActionPerformed

    private void masukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukanActionPerformed
 new DataPerangkat().setVisible(true);   
     
}//GEN-LAST:event_masukanActionPerformed

    private void masukanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masukanMouseClicked
        // TODO add your handling code here:
}//GEN-LAST:event_masukanMouseClicked

    private void lihatPinjaman1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatPinjaman1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lihatPinjaman1MouseClicked

    private void lihatPinjaman1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatPinjaman1ActionPerformed
 new DataVendor().setVisible(true);     
    }//GEN-LAST:event_lihatPinjaman1ActionPerformed

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_fileMenuActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         try{
   String NamaFile = "report_barang.jasper";
 HashMap parameter = new HashMap();
 Class.forName(driver);
 con = DriverManager.getConnection(database,uid,pwd);
 File reportfile = new File(NamaFile);
 JasperReport jasperReport =(JasperReport)JRLoader.loadObject(reportfile.getPath());
 JasperPrint jasperPrint =JasperFillManager.fillReport(jasperReport, parameter, con);
 JasperViewer.viewReport(jasperPrint,false);
 JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak dapat dicetak !",
            "Cetak Data",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
      new DataPerangkat().setVisible(true);     
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
    new DataBio().setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void fileMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenu1ActionPerformed

    private void lihatPinjaman3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatPinjaman3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lihatPinjaman3MouseClicked

    private void lihatPinjaman3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatPinjaman3ActionPerformed
new DataCabang().setVisible(true);     
    }//GEN-LAST:event_lihatPinjaman3ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
          new DataPemasukan().setVisible(true);  
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void fileMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenu2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      try{
   String NamaFile = "report_pabrik.jasper";
 HashMap parameter = new HashMap();
 Class.forName(driver);
 con = DriverManager.getConnection(database,uid,pwd);
 File reportfile = new File(NamaFile);
 JasperReport jasperReport =(JasperReport)JRLoader.loadObject(reportfile.getPath());
 JasperPrint jasperPrint =JasperFillManager.fillReport(jasperReport, parameter, con);
 JasperViewer.viewReport(jasperPrint,false);
 JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak dapat dicetak !",
            "Cetak Data",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
     try{
   String NamaFile = "report_pelanggan.jasper";
 HashMap parameter = new HashMap();
 Class.forName(driver);
 con = DriverManager.getConnection(database,uid,pwd);
 File reportfile = new File(NamaFile);
 JasperReport jasperReport =(JasperReport)JRLoader.loadObject(reportfile.getPath());
 JasperPrint jasperPrint =JasperFillManager.fillReport(jasperReport, parameter, con);
 JasperViewer.viewReport(jasperPrint,false);
 JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak dapat dicetak !",
            "Cetak Data",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
     new LaporanPemasukan().setVisible(true); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new DataVendor().setVisible(true); 
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new DataCabang().setVisible(true); 
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        new DataPengeluaran().setVisible(true); 
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
      new LaporanPengeluaran().setVisible(true);  
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void lihatPinjaman4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatPinjaman4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lihatPinjaman4MouseClicked

    private void lihatPinjaman4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatPinjaman4ActionPerformed
 new DataPemasukan().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_lihatPinjaman4ActionPerformed

    private void lihatPinjaman5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lihatPinjaman5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lihatPinjaman5MouseClicked

    private void lihatPinjaman5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatPinjaman5ActionPerformed
 new DataPengeluaran().setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_lihatPinjaman5ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu fileMenu1;
    private javax.swing.JMenu fileMenu2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton lihatPinjaman1;
    private javax.swing.JButton lihatPinjaman3;
    private javax.swing.JButton lihatPinjaman4;
    private javax.swing.JButton lihatPinjaman5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton masukan;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
