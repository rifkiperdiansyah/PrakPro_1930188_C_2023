package TugasPertemuan7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.table.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author RIFKI
 */
public class MyTable extends AbstractTableModel{
    private String[] columnNames = {"Nama", "NO Hp","Jenis Kelamin","Alamat"};
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
    
    public int getColumnCount(){
        return columnNames.length;
    }
    public int getRowCount(){
        return data.size();
    }
    public String getColumnName(int col){
        return columnNames[col];
    }
        public String getColumnNoHp(int col){
        return columnNames[col];
    }
     public String getColumnAlamat(int col){
        return columnNames[col];
    }
    public Object getValueAt(int row, int col){
        List<String> rowItem = data.get(row);
        return rowItem.get(col);
    } 
    public boolean isCellEdittable(int row, int col){
        return false;
    }
    public void add(ArrayList<String> value){
        data.add(value);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }
}

