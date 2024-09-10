/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThietKeGiaoDien;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ADMIN
 */
public class TinhToanDonGian extends JFrame {

    private JLabel lb1, lb2, lb3;
    private JTextField txt1, txt2, txt3;
    private JButton btn1, btn2, btn3, btn4;

    public TinhToanDonGian() {
        setTitle("CaCuLaTor");
        taoGiaoDien();
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        TinhToanDonGian frm = new TinhToanDonGian();
        frm.setVisible(true);
    }

    private void taoGiaoDien() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 5, 5));
        p1.add(lb1 = new JLabel("      A"));
        p1.add(txt1 = new JTextField());
        p1.add(lb2 = new JLabel("      B"));
        p1.add(txt2 = new JTextField());
        p1.add(lb3 = new JLabel("   Kết quả"));
        p1.add(txt3 = new JTextField());

        JPanel p2 = new JPanel();
        p2.add(btn1 = new JButton("Cộng"));
        p2.add(btn2 = new JButton("Trừ"));
        p2.add(btn3 = new JButton("Nhân"));
        p2.add(btn4 = new JButton("Chia"));

        //Xu ly Btn1
        btn1.addActionListener((e) -> {
            double x1 = Double.parseDouble(txt1.getText());
            double y1 = Double.parseDouble(txt2.getText());
            double kq = x1 + y1;
            txt3.setText(String.valueOf(kq));
        });

        btn2.addActionListener((e) -> {
            double x1 = Double.parseDouble(txt1.getText());
            double y1 = Double.parseDouble(txt2.getText());
            double kq = x1 - y1;
            txt3.setText(String.valueOf(kq));
        });

        btn3.addActionListener((e) -> {
            double x1 = Double.parseDouble(txt1.getText());
            double y1 = Double.parseDouble(txt2.getText());
            double kq = x1 * y1;
            txt3.setText(String.valueOf(kq));
        });

        btn4.addActionListener((e) -> {
            double x1 = Double.parseDouble(txt1.getText());
            double y1 = Double.parseDouble(txt2.getText());
            double kq;
            if (x1 == 0 || y1 == 0) {
                kq = 0;
            } else {
                kq = x1 / y1;
            }
            txt3.setText(String.valueOf(kq));
        });

        //Set layout màn hình chính
        setLayout(new BorderLayout());
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
    }
}
