package com.Bunga_Laelatul_Muna.PBO.Pertemuan8.Unguided;
// Bunga Laelatul Muna
// 21102010
import javax.swing.*;

public class Tugas_Form extends JFrame {
    private JPanel utamaPanel;
    private JLabel namaLengkapLabel;
    private JTextField namalField;
    private JLabel jenisKelaminLabel;
    private JRadioButton perempuanRadioButton;
    private JRadioButton lakiLakiRadioButton;
    private JComboBox agamaBox;
    private JLabel agamaLabel;
    private JLabel emailLabel;
    private JTextField emailField;
    private JLabel passwordLabel;
    private JPasswordField passwordField1;
    private JTextArea alamatTextArea;
    private JLabel alamatLabel;
    private JButton prosesButton;
    private JPanel iconPanel;
    private JLabel icon;
    private JLabel title;
    private JPanel titlePane;
    private JLabel hobiLabel;
    private JTextField hobiField;
    private JButton bersihButton;
    private JButton keluarButton;
    private JTextArea textArea1;

    public Tugas_Form() {
        super("Data Mahasiswa ");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(utamaPanel);
        this.setSize(800, 600);
    }

    public static void main(String[] args) {
        JFrame jFrame = new Tugas_Form();
        jFrame.setVisible(true);
    }

}
