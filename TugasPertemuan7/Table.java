package TugasPertemuan7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import TugasPertemuan7.MyTable;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
/**
 *
 * @author RIFKI
 */
public class Table extends JFrame{
    
    public Table(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelInput = new JLabel("Nama : ");
        labelInput.setBounds(15,20,50,10);
        
        JLabel labelInput2 = new JLabel("NO hp : ");
        labelInput2.setBounds(15,90,350,10);
        
        JLabel labelInput3 = new JLabel("Alamat : ");
        labelInput3.setBounds(15,230,350,10);
        
        JTextField textField = new JTextField();
        textField.setBounds(15,40,350,30);
        
         JTextField textField2 = new JTextField();
        textField2.setBounds(15,115,350,30);
        
        JTextField textField3 = new JTextField();
        textField3.setBounds(15,250,350,90);
        
        JLabel labelRadio = new JLabel("Jenis Kelamin :");
        labelRadio.setBounds(15,160,350,10);
        
        JRadioButton radioButton1 = new JRadioButton("Laki - Laki", true);
        radioButton1.setBounds(15,175,350,30);
        
        JRadioButton radioButton2 = new JRadioButton("Perempuan", true);
        radioButton2.setBounds(15,200,350,30);
        

       
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton1);
        bg.add(radioButton2);

        
        JButton button = new JButton("simpan");
        button.setBounds(15,350,80,40);
        
        JButton button2 = new JButton("Edit");
        button2.setBounds(100,350,80,40);
        
        JButton button3 = new JButton("Hapus");
        button3.setBounds(190,350,90,40);
        
        JButton button4 = new JButton("simpan Ke TXT");
        button4.setBounds(290,350,160,40);
        
        javax.swing.JTable table = new JTable();
        JScrollPane scrollableTable = new JScrollPane(table);
        scrollableTable.setBounds(15,400,450,200);
        
        MyTable tableModel = new MyTable();
        table.setModel(tableModel);
        
        
        button.addActionListener((ActionEvent e) -> { 
            if((textField.getText().equals(""))){
                JOptionPane.showMessageDialog(null,"Nama masih Kosong","Peringatan",JOptionPane.ERROR_MESSAGE);
            }else if (textField2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "No Hp masih kosong","Peringatan",JOptionPane.ERROR_MESSAGE);
             }
            else if (textField3.getText().equals("")){
                JOptionPane.showMessageDialog(null, "alamat masih kosong","Peringatan",JOptionPane.ERROR_MESSAGE);
             }
            int confirmation = JOptionPane.showConfirmDialog(this, "apakan anda yakin ingin meginput data?","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if(confirmation == JOptionPane.YES_NO_OPTION){
                JOptionPane.showMessageDialog(this,"data berhasil di tambahkan");
            }else{
            
            JOptionPane.showMessageDialog(this,"Anda menekan tombol NO");
          }
            
            
            String jenisKelamin = "";
            if(radioButton1.isSelected()){
                jenisKelamin = radioButton1.getText();
            }
            if(radioButton2.isSelected()){
                jenisKelamin = radioButton2.getText();
            }
        
            String nama = textField.getText();
            String noHp = textField2.getText();
            String alamat = textField3.getText();
            tableModel.add(new ArrayList<>(Arrays.asList(nama,noHp, jenisKelamin,alamat)));
        });

        this.add(button);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(textField);
        this.add(textField2);
        this.add(textField3);
        this.add(labelRadio);
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(labelInput);
        this.add(labelInput2);
        this.add(labelInput3);
        this.add(scrollableTable);
        
        this.setSize(500,600);
        this.setLayout(null);
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
                     
        public void run(){
            Table h = new Table();
            h.setVisible(true);
        }
        });
    }

}
