/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai02;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Cuong
 */
public class Main {

    public static MonHoc foundSubject(int id, Vector<MonHoc> monHocVector) {
        for (MonHoc monHoc : monHocVector) {
            if (monHoc.matchID(id)) {
                return monHoc;
            }
        }
        return null;
    }

    public static boolean repeat(SinhVien sinhVien, MonHoc monHoc, Vector<BangDangKy> bangDangKyVector) {
        for (BangDangKy bangDangKy : bangDangKyVector) {
            if (bangDangKy.matchRegistation(sinhVien, monHoc)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Vector<SinhVien> sinhVienVector = new Vector<>();
        Vector<MonHoc> monHocVector = new Vector<>();
        Vector<BangDangKy> bangDangKyVector = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        int keyCommand = 0;
        do {
            Menu.createMenu();
            keyCommand = Integer.parseInt(scanner.nextLine());
            switch (keyCommand) {
                case 1:
                    SinhVien sv = new SinhVien();
                    sv.nhap(scanner);
                    sinhVienVector.add(sv);
                    break;
                case 2:
                    System.out.println("Danh sach sinh vien");
                    sinhVienVector.stream().forEach((sinhVien) -> {
                        sinhVien.in();
                    });
                    break;
                case 3:
                    MonHoc mh = new MonHoc();
                    mh.nhap(scanner);
                    monHocVector.add(mh);
                    break;
                case 4:
                    System.out.println("Danh sach mon hoc");
                    monHocVector.stream().forEach((monHoc) -> {
                        monHoc.in();
                    });
                    break;
                case 5:
                    for (SinhVien sinhVien : sinhVienVector) {
                        System.out.println("Sinh vien " + sinhVien.getName());
                        int keyCommandRegister = 0;
                        do {
                            Menu.createRegisterMenu();
                            keyCommandRegister = Integer.parseInt(scanner.nextLine());
                            if (keyCommandRegister == 1) {
                                System.out.println("Danh sach mon hoc : ");
                                for (MonHoc monHoc : monHocVector) {
                                    monHoc.in();
                                }
                                System.out.print("Nhap ma mon hoc muon dang ky : ");
                                int idMH = Integer.parseInt(scanner.nextLine());
                                MonHoc monHoc = null;
                                monHoc = foundSubject(idMH, monHocVector);
                                if (monHoc == null) {
                                    System.out.println("Khong hop le");
                                } else if (repeat(sinhVien, monHoc, bangDangKyVector)) {
                                    System.out.println("Dang ky khong thanh cong");
                                } else {
                                    bangDangKyVector.add(new BangDangKy(sinhVien, monHoc));
                                }
                                System.out.println(Line.LINE_SHORT);
                            }
                        } while (keyCommandRegister != 0);
                        System.out.println(Line.LINE_LONG);
                    }
                    break;
                case 6:
                    for (int i = 0; i < bangDangKyVector.size(); i++) {
                        for (int j = i + 1; j < bangDangKyVector.size(); j++) {
                            if (bangDangKyVector.get(i).compareStudentName(bangDangKyVector.get(j)) > 1) {
                                BangDangKy tmp = bangDangKyVector.get(i);
                                bangDangKyVector.set(i, bangDangKyVector.get(j));
                                bangDangKyVector.set(j, tmp);
                            }
                        }
                    }
                    System.out.println("Bang dang ky : ");
                    for (BangDangKy bangDangKy : bangDangKyVector) {
                        bangDangKy.in();
                    }
                    break;
                case 7:
                    for (int i = 0; i < bangDangKyVector.size(); i++) {
                        for (int j = i + 1; j < bangDangKyVector.size(); j++) {
                            if (bangDangKyVector.get(i).compareRegisterTime(bangDangKyVector.get(j)) > 1) {
                                BangDangKy tmp = bangDangKyVector.get(i);
                                bangDangKyVector.set(i, bangDangKyVector.get(j));
                                bangDangKyVector.set(j, tmp);
                            }
                        }
                    }
                    System.out.println("Bang dang ky : ");
                    for (BangDangKy bangDangKy : bangDangKyVector) {
                        bangDangKy.in();
                    }
                    break;
                case 8:
                    

            }
            System.out.println(Line.LINE_LONG + "\n");
        } while (keyCommand != 0);
    }
}
