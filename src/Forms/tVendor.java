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

public class tVendor extends JDialog {

	public String skd_pabrik; 
	public String snama_pbrk;
	public String salamat;
	public String stelepon;
	public String sketerangan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			tVendor dialog = new tVendor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public tVendor() {
		setBounds(100, 100, 564, 241);
		setTitle("Pilih Pabrik");

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
		model.addColumn("Kode Pabrik"); 
		model.addColumn("Nama Pabrik");
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
			
			String sql = "SELECT * FROM  t_pabrik ORDER BY kd_pabrik ASC";
			
			ResultSet rec = s.executeQuery(sql);
			int row = 0;
			while((rec!=null) && (rec.next()))
            {			
				model.addRow(new Object[0]);
				model.setValueAt(rec.getString("kd_pabrik"), row, 0); 
				model.setValueAt(rec.getString("nama_pbrk"), row, 1);
				model.setValueAt(rec.getString("alamat"), row, 2);
				model.setValueAt(rec.getDouble("telepon"), row, 3);
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
				skd_pabrik = table.getValueAt(index, 0).toString(); 
				snama_pbrk = table.getValueAt(index, 1).toString();
				salamat = table.getValueAt(index, 2).toString();
				stelepon = table.getValueAt(index, 3).toString();
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