
package responsi;

import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Pegawai extends JFrame  {
    
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/responsi_pbo";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;

    JButton btnHome = new JButton("Home");
      JButton btnGaji = new JButton("Tambah");
      JButton btnData = new JButton("Data");
       JButton btnPetunjuk = new JButton("Petunjuk");
        JButton btnAdmin = new JButton("Karyawan");
        JButton btnHapus = new JButton("Hapus");
         JButton btnUpdate = new JButton("Update");
        
         JTable table;
        DefaultTableModel tableModel;
        JScrollPane scrollPane;
        Object namaKolom[] = {"ID Karyawan","Nama","Posisi","Alamat","No HP","Gaji"};
        
         public Pegawai() {
             
             
              try{
                    Class.forName(JDBC_DRIVER);
                    koneksi = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
                    System.out.println("Koneksi Berhasil");
                }catch(ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                    System.out.println("Koneksi Gagal");
                }   
            
            tableModel = new DefaultTableModel(namaKolom,0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);

        setTitle("Data Pegawai");
        setDefaultCloseOperation(3);
        setSize(960,460);




        setLayout(null);
        

        add(btnHome);
        btnHome.setBounds(10, 10, 100,30);
       add(btnGaji);
        btnGaji.setBounds(10, 45, 100,30);
        add(btnData);
        btnData.setBounds(10, 80, 100,30);
        add(btnPetunjuk);
        btnPetunjuk.setBounds(10, 115, 100,30);
        add(btnAdmin);
        btnAdmin.setBounds(800,10, 100,30);
         add(btnHapus);
        btnHapus.setBounds(800,370, 100,30);
         add(btnUpdate);
        btnUpdate.setBounds(680,370, 100,30);
       
        add(scrollPane);
        scrollPane.setBounds(140,70,760,200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
       
         
        setVisible(true);
          
        if (this.getBanyakData() != 0) { 
                    String datagajik[][] = this.readPegawai(); 
                    table.setModel((new JTable(datagajik, namaKolom)).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Ada");
                }
        
         table.addMouseListener(new MouseAdapter() {
                   @Override
                   public void mouseClicked(MouseEvent e){ 
                       int baris = table.getSelectedRow();
                       int kolom = table.getSelectedColumn(); 
                       String dataterpilih = table.getValueAt(baris, 0).toString();
                       btnHapus.addActionListener((ActionEvent f) -> {
                          deletePegawai(dataterpilih);
                          String dataMuzaki[][] = readPegawai();
                        table.setModel(new JTable(dataMuzaki,namaKolom).getModel());
                        });

                   }
                });
        
        btnHome.addActionListener((ActionEvent e) -> {
          new HalAdmin();
           dispose();
        });
        btnGaji.addActionListener((ActionEvent e) -> {
           new Tambah();
           dispose();
           });
       
        btnData.addActionListener((ActionEvent e) -> {
           new Pegawai();
           dispose();
        });
        
        btnPetunjuk.addActionListener((ActionEvent e) -> {
           new PetunjukAdmin();
           dispose();
        });
        
         btnUpdate.addActionListener((ActionEvent e) -> {
           new Update();
           dispose();
        });
        
        
       
        
       
        
    }
          int getBanyakData() {
                int jmlData = 0;
                try{
                    statement = koneksi.createStatement();
                    String query = "SELECT * from `pegawai`";
                    ResultSet resultSet = statement.executeQuery(query);
                    while(resultSet.next()){
                        jmlData++;
                    }
                    return jmlData;
                }catch(SQLException e){
                    System.out.println(e.getMessage());
                    System.out.println("SQL error");
                    return 0;
                }
            }
          
String[][] readPegawai() {
                try{
                    int jmlData = 0;
                    String data[][]=new String[getBanyakData()][6];
                    String query = "Select * from `pegawai`";
                    ResultSet resultSet = statement.executeQuery(query);
                    while(resultSet.next()){
                        data[jmlData][0] = resultSet.getString("Idkaryawana");
                        data[jmlData][1] = resultSet.getString("Namaa");
                        data[jmlData][2] = resultSet.getString("Posisia");
                        data[jmlData][3] = resultSet.getString("Alamata");
                        data[jmlData][4] = resultSet.getString("Nohpa");
                        data[jmlData][5] = resultSet.getString("Totala");
                       
                        jmlData++;
                    }
                    return data;
                }catch(SQLException e){
                    System.out.println(e.getMessage());
                    System.out.println("SQL error");
                    return null;
                }
            }

  void deletePegawai(String Idkaryawan) {
                try{
                    String query = "DELETE FROM `pegawai` WHERE `Idkaryawana` = '"+Idkaryawan+"'";
                    statement = koneksi.createStatement();
                    statement.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "berhasil dihapus ");
                }catch(SQLException sql){
                    System.out.println(sql.getMessage());
                }
            }
}
