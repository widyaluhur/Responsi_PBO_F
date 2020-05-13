
package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class HalAdmin extends JFrame {
  JButton btnHome = new JButton("Home");
      JButton btnGaji = new JButton("Tambah");
      JButton btnData = new JButton("Data");
       JButton btnPetunjuk = new JButton("Petunjuk");
        JButton btnAdmin = new JButton("Karyawan");
      
     
      JLabel lTampilan = new JLabel("Selamat Datang Admin");
      JLabel lTampilan2 = new JLabel("Masuk Menu Tambah untuk Menambah data");
      JLabel lTampilan3 = new JLabel("Menu Petunjuk Jika Kesulitan");
       JLabel lTampilanDefault = new JLabel("APP PERHITUNGAN GAJI");
      
      
   

        public HalAdmin() {
     setTitle("Gaji");
     setDefaultCloseOperation(3);
     setSize(600,400);

       
       
       
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
        btnAdmin.setBounds(470,10, 100,30);
        
        add(lTampilan);
        lTampilan.setBounds(150, 100, 200,20);
         add(lTampilan2);
        lTampilan2.setBounds(150, 120, 300,20);
         add(lTampilan3);
        lTampilan3.setBounds(150, 140, 200,20);
         add(lTampilanDefault);
        lTampilanDefault.setBounds(180, 320, 200,20);
        
        setVisible(true);
          
        
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
        btnAdmin.addActionListener((ActionEvent e) -> {
           new GUI();
           dispose();
        });
        
        
       
        
       
        
    }   
}
