/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Cuong
 */
public class BangDangKy {

    private SinhVien sinhVien;

    private MonHoc monHoc;

    private Calendar registerDate;

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public BangDangKy(SinhVien sinhVien, MonHoc monHoc) {
        this.sinhVien = sinhVien;
        this.monHoc = monHoc;
        registerDate = Calendar.getInstance();
    }

    public BangDangKy() {

    }

    public int compareStudentName(BangDangKy bangDangKy) {
        return this.sinhVien.compareStudentName(bangDangKy.sinhVien);
    }

    public int compareRegisterTime(BangDangKy bangDangKy) {
        if (registerDate.before(bangDangKy.registerDate)) {
            return 1;
        }
        if (registerDate.after(bangDangKy.registerDate)) {
            return -1;
        }
        return 0;
    }

    public void in() {
        System.out.printf("%8d%15s%5d%15s   ", sinhVien.getId(), sinhVien.getName(), monHoc.getId(), monHoc.getName(), registerDate.toString());
        printDate();
    }

    public boolean matchRegistation(SinhVien sinhVien, MonHoc monHoc) {
        if (this.sinhVien.matchID(sinhVien.getId())
                && this.monHoc.matchID(monHoc.getId())) {
            return true;
        }
        return false;
    }

    private void printDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateFormat.format(registerDate));
    }
}
