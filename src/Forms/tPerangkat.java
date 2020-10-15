/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tPerangkat extends JDialog {

	public String skdbarang;
	public String snama_barang;
	public String skategori_brg;
	public String sstok;
	public String sharga;
	public String sketerangan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			tPerangkat dialog = new tPerangkat();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public tPerangkat() {
		setBounds(100, 100, 564, 241);
		setTitle("Pilih Barang");

		getContentPane().setLayout(null);
		
		// ScrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(62, 27, 440, 93);
		getContentPane().add(scrollPane);
		
		// Table
		final JTable table = new JTable();
		scrollPane.setViewportView(table);
			
		// Model for Table
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addColumn("Kode Perangkat");
		model.addColumn("Nama Perangkat");
		model.addColumn("Kategori Perangkat");
		model.addColumn("Stok"); 
		model.addColumn("Keterangan");
		
		Connection connect = null;
		Statement s = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connect =  DriverManager.getConnection("jdbc:mysql://localhost/db_multimedia_nusantara" +
					"?user=root&password=");
			
			s = connect.createStatement();
			
			String sql = "SELECT * FROM  t_barang ORDER BY kd_barang ASC";
			
			ResultSet rec = s.executeQuery(sql);
			int row = 0;
			while((rec!=null) && (rec.next()))
            {			
				model.addRow(new Object[0]);
				model.setValueAt(rec.getString("kd_barang"), row, 0);
				model.setValueAt(rec.getString("nama_barang"), row, 1);
				model.setValueAt(rec.getString("kategori_brg"), row, 2);
				model.setValueAt(rec.getString("stok"), row, 3); 
				model.setValueAt(rec.getString("keterangan"), row, 4);
				row++;
            }

			rec.close();
             
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		
		try {
			if(s != null) {
				s.close();
				connect.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Button  OK
		JButton btnOk = new JButton("Pilih");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = table.getSelectedRow();
				skdbarang = table.getValueAt(index, 0).toString();
				snama_barang = table.getValueAt(index, 1).toString();
				skategori_brg = table.getValueAt(index, 2).toString();
				sstok = table.getValueAt(index, 3).toString();
				sketerangan = table.getValueAt(index, 4).toString();
				dispose();
			}
		});
		btnOk.setBounds(176, 151, 83, 23);
		getContentPane().add(btnOk);
		
		// Button Cancel
		JButton btnCancel = new JButton("Tutup");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(292, 151, 89, 23);
		getContentPane().add(btnCancel);
		
	}

}