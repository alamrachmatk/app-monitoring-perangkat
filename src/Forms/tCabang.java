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

public class tCabang extends JDialog {

	public String skd_pelanggan;
	public String skategori;
	public String snama_plngn;
	public String salamat;
	public String stelepon;
	public String sketerangan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			tCabang dialog = new tCabang();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public tCabang() {
		setBounds(100, 100, 564, 241);
		setTitle("Pilih Pelanggan");

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
		model.addColumn("Kode Pelanggan");
		model.addColumn("Kategori");
		model.addColumn("Nama Pelanggan");
		model.addColumn("Alamat");
		model.addColumn("Telepon");
		model.addColumn("Keterangan");
		
		Connection connect = null;
		Statement s = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connect =  DriverManager.getConnection("jdbc:mysql://localhost/db_multimedia_nusantara" +
					"?user=root&password=");
			
			s = connect.createStatement();
			
			String sql = "SELECT * FROM  t_pelanggan ORDER BY kd_pelanggan ASC";
			
			ResultSet rec = s.executeQuery(sql);
			int row = 0;
			while((rec!=null) && (rec.next()))
            {			
				model.addRow(new Object[0]);
				model.setValueAt(rec.getString("kd_pelanggan"), row, 0);
				model.setValueAt(rec.getString("kategori"), row, 1);
				model.setValueAt(rec.getString("nama_plngn"), row, 2);
				model.setValueAt(rec.getString("alamat"), row, 3);
				model.setValueAt(rec.getDouble("telepon"), row, 4);
				model.setValueAt(rec.getString("keterangan"), row, 5);
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
				skd_pelanggan = table.getValueAt(index, 0).toString();
				skategori = table.getValueAt(index, 1).toString();
				snama_plngn = table.getValueAt(index, 2).toString();
				salamat = table.getValueAt(index, 3).toString();
				stelepon = table.getValueAt(index, 4).toString();
				sketerangan = table.getValueAt(index, 5).toString();
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