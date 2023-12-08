package datamahasiswa;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerMahasiswa {
    ArrayList<MahasiswaBaru> ArrayData;
    DefaultTableModel tablelist;

    public ControllerMahasiswa() {
        ArrayData = new ArrayList<>();
    }

    void InsertData(String id, String password) {
        MahasiswaBaru mhs = new MahasiswaBaru(id, password);
        ArrayData.add(mhs);
    }

    public DefaultTableModel showData() {
        String[] kolom = {"Id", "Password"};
        Object[][] objData = new Object[ArrayData.size()][2];
        int i = 0;

        for (MahasiswaBaru n : ArrayData) {
            String[] arrData = {n.getIDpengguna(), n.getPassword()};
            objData[i] = arrData;
            i++;
        }

        tablelist = new DefaultTableModel(objData, kolom) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };

        return tablelist;
    }
}

