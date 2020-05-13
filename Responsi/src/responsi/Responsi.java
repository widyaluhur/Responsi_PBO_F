
package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Responsi {

    public static void main(String[] args) {
       
        new HalAdmin();
        
         
    }
   
}

class GUI extends JFrame {
      JButton btnHome = new JButton("Home");
      JButton btnGaji = new JButton("Gaji");
      JButton btnData = new JButton("Data");
      JButton btnPetunjuk = new JButton("Petunjuk");
      JButton btnAdmin = new JButton("Admin");
      
     
      JLabel lTampilan = new JLabel("Selamat Datang");
      JLabel lTampilan2 = new JLabel("Masuk Menu Gaji untuk Perhitungan");
      JLabel lTampilan3 = new JLabel("Menu Petunjuk Jika Anda Kesulitan");
      JLabel lTampilanDefault = new JLabel("APP PERHITUNGAN GAJI");
      
      
   

   public GUI() {
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
          new GUI();
           dispose();
        });
        btnGaji.addActionListener((ActionEvent e) -> {
           new Gaji();
           dispose();
           });
       
        btnData.addActionListener((ActionEvent e) -> {
           new Data();
           dispose();
        });
        
        btnPetunjuk.addActionListener((ActionEvent e) -> {
           new Petunjuk();
           dispose();
        });
        btnAdmin.addActionListener((ActionEvent e) -> {
           new Admin();
           dispose();
        });
        
        
       
        
       
        
    }
}