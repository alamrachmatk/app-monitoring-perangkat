 

package Forms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author SI
 */
public class DataPerangkat extends javax.swing.JFrame {
    Connection cn= null;
    ResultSet rs = null;
    DefaultTableModel tabModel;  
    
    public DataPerangkat() {
        initComponents();
        konek();
        tampilData(); 
    }
 
  
    
            void konek (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection ("jdbc:mysql://localhost/db_multimedia_nusantara","root","");
            Object [] judul_kolom = {"Kode Perangkat","Nama Perangkat","Kategori Perangkat","Stok","Keterangan"};
            tabModel=new DefaultTableModel(null,judul_kolom);
            gridProdi.setModel(tabModel);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
    }
  }
    
  
   void tampilData(){
        try{
            Statement stm; //buat stm
            stm=cn.createStatement();
            tabModel.getDataVector().removeAllElements();
            rs=stm.executeQuery("SELECT * FROM t_barang ORDER BY kd_barang ASC");//mengambil data barang
            while(rs.next()){
                Object[] data={rs.getString("kd_barang"),
                               rs.getString ("nama_barang"),
                               rs.getString("kategori_brg"),
                               rs.getString("stok"), 
                               rs.getString("keterangan"),
                };
                tabModel.addRow(data);
            }
        }catch(Exception e){
            e.printStackTrace();
                    
        }
    } 
    
 
    

    int row = 0;
    public void Tampil(){
      row = gridProdi.getSelectedRow();
      kd_barang.setText(tabModel.getValueAt(row, 0).toString());
      nama_barang.setText(tabModel.getValueAt(row, 1).toString());
      kategori_brg.setText(tabModel.getValueAt(row, 2).toString()); 
      stok.setText(tabModel.getValueAt(row, 3).toString()); 
      keterangan.setText(tabModel.getValueAt(row, 4).toString());
    }

    public void bersih(){
        kd_barang.setText("");
        nama_barang.setText("");
        kategori_brg.setText(""); 
        stok.setText(""); 
        keterangan.setText("");

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridProdi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kd_barang = new javax.swing.JTextField();
        kategori_brg = new javax.swing.JTextField();
        cmdBaru = new javax.swing.JButton();
        cmdSimpan = new javax.swing.JButton();
        cmdHapus = new javax.swing.JButton();
        cmdUpdate = new javax.swing.JButton();
        cmdClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        stok = new javax.swing.JTextField();
        nama_barang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();
        keterangan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        gridProdi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        gridProdi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridProdiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gridProdi);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Kode Perangkat");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Kategori Perangkat");

        cmdBaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Add-32.png"))); // NOI18N
        cmdBaru.setText("Refresh");
        cmdBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBaruActionPerformed(evt);
            }
        });

        cmdSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Drives-Floppy-icon.png"))); // NOI18N
        cmdSimpan.setText("Simpan");
        cmdSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSimpanActionPerformed(evt);
            }
        });

        cmdHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Delete-32.png"))); // NOI18N
        cmdHapus.setText("Hapus");
        cmdHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdHapusActionPerformed(evt);
            }
        });

        cmdUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Edit-32.png"))); // NOI18N
        cmdUpdate.setText("Update");
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });

        cmdClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door_out.png"))); // NOI18N
        cmdClose.setText("Close");
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Stok");

        stok.setEditable(false);
        stok.setBackground(new java.awt.Color(204, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nama Perangkat");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Cari Berdasarkan Kode Perangkat");

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cari.png"))); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Keterangan");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Data Perangkat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kd_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kategori_brg, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdBaru)
                .addGap(3, 3, 3)
                .addComponent(cmdSimpan)
                .addGap(7, 7, 7)
                .addComponent(cmdHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdClose)
                .addGap(27, 27, 27)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCari))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(kd_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kategori_brg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(cmdBaru))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(cmdSimpan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmdHapus)
                                    .addComponent(cmdUpdate)
                                    .addComponent(cmdClose)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCari))
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel9)
                        .addGap(347, 347, 347))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gridProdiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridProdiMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount()==1) {
            Tampil();
        }
}//GEN-LAST:event_gridProdiMouseClicked

    private void cmdBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBaruActionPerformed
        // TODO add your handling code here:
        bersih();
}//GEN-LAST:event_cmdBaruActionPerformed

    private void cmdSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSimpanActionPerformed
        // TODO add your handling code here:
        String s_kd_barang = kd_barang.getText();
        String s_nama_barang = nama_barang.getText();
        String s_kategori_brg = kategori_brg.getText(); 
        String s_stok = stok.getText(); 
        String s_keterangan = keterangan.getText(); 
        
        //validasi isian
        if (s_kd_barang.isEmpty()){
            JOptionPane.showMessageDialog(null,"Kode Barang Masih Kosong");
            kd_barang.requestFocus();
            return;
        }
          if (s_nama_barang.isEmpty()){
            JOptionPane.showMessageDialog(null,"Nama Barang Masih Kosong");
            nama_barang.requestFocus();
            return;
        } 
        if (s_kategori_brg.isEmpty()){
            JOptionPane.showMessageDialog(null,"Kategori Barang Masih Kosong");
            kategori_brg.requestFocus();
            return;
        } 
        if (s_keterangan.isEmpty()){
            JOptionPane.showMessageDialog(null,"Keterangan Masih Kosong");
            keterangan.requestFocus();
            return;
        }
      
        
        
                try{
            Statement stm=cn.createStatement();
            stm.executeUpdate("insert into t_barang set kd_barang='"+s_kd_barang+"',"+
                "nama_barang='"+s_nama_barang+"',"+
                "kategori_brg='"+s_kategori_brg+"',"+
                "stok='0',"+ 
                "keterangan='"+s_keterangan+"'");

            tampilData();
            bersih();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan ");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Data Gagal Disimpan");
        }
         
}//GEN-LAST:event_cmdSimpanActionPerformed

    private void cmdHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdHapusActionPerformed
                try{
            Statement stm=cn.createStatement();
            stm.executeUpdate("DELETE FROM t_barang WHERE kd_barang='"+
                tabModel.getValueAt(gridProdi.getSelectedRow(),0)+"'");

            tabModel.removeRow(row);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus !");
            bersih();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
}//GEN-LAST:event_cmdHapusActionPerformed

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
        // TODO add your handling code here:
        String s_kd_barang = kd_barang.getText();
        String s_nama_barang = nama_barang.getText();
        String s_kategori_brg = kategori_brg.getText(); 
        String s_stok = stok.getText(); 
        String s_keterangan = keterangan.getText(); 
        
        //validasi isian
        if (s_kd_barang.isEmpty()){
            JOptionPane.showMessageDialog(null,"Kode Barang Masih Kosong");
            kd_barang.requestFocus();
            return;
        }
          if (s_nama_barang.isEmpty()){
            JOptionPane.showMessageDialog(null,"Nama Barang Masih Kosong");
            nama_barang.requestFocus();
            return;
        } 
        if (s_kategori_brg.isEmpty()){
            JOptionPane.showMessageDialog(null,"Kategori Barang Masih Kosong");
            kategori_brg.requestFocus();
            return;
        } 
        if (s_keterangan.isEmpty()){
            JOptionPane.showMessageDialog(null,"Keterangan Masih Kosong");
            keterangan.requestFocus();
            return;
        }
        
               try{

            Statement stm=cn.createStatement();
            stm.executeUpdate("UPDATE t_barang SET kd_barang='"
                + s_kd_barang + "',nama_barang='"
                + s_nama_barang + "',kategori_brg='"
                + s_kategori_brg + "',keterangan='" 
                + s_keterangan +"'where kd_barang='"+
                tabModel.getValueAt(gridProdi.getSelectedRow(),0)+"'");
            tampilData();
            bersih();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error Update");
        }
        
         
    }//GEN-LAST:event_cmdUpdateActionPerformed

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_cmdCloseActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        try{
            Statement stm=cn.createStatement();
            tabModel.getDataVector().removeAllElements();
            rs=stm.executeQuery("select * from t_barang where kd_barang like '%"+search.getText()+"%'");
            while (rs.next()){
                  Object[] data={rs.getString("kd_barang"),
                               rs.getString ("nama_barang"),
                               rs.getString("kategori_brg"),
                               rs.getString("stok"), 
                               rs.getString("keterangan"),

                };
                tabModel.addRow(data);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCariActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPerangkat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton cmdBaru;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdHapus;
    private javax.swing.JButton cmdSimpan;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JTable gridProdi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kategori_brg;
    private javax.swing.JTextField kd_barang;
    private javax.swing.JTextField keterangan;
    private javax.swing.JTextField nama_barang;
    private javax.swing.JTextField search;
    private javax.swing.JTextField stok;
    // End of variables declaration//GEN-END:variables

}