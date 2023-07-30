package com.Bunga_Laelatul_Muna.PBO.Pertemuan8.Guided;

import javax.swing.*;
public class Registration extends JFrame {

    private JLabel namaLabel;
    private JLabel passwordLabel;
    private JLabel jenisKelaminLabel;
    private JLabel ttlLabel;
    private JLabel jabatanLabel;
    private JLabel bahasaLabel;
    private JLabel alamatLengkapLabel;
    private JTextArea alamatfield;
    private JLabel skillLabel;
    private JButton submitButton;
    private JSlider Skillslider;
    private JSpinner ttlSpinner;
    private JComboBox ttlCombo;
    private JTextField namaField;
    private JPasswordField passwordField;
    private JCheckBox perempuanCheckBox;
    private JCheckBox lakiLakiCheckBox;
    private JComboBox<String> comboBox;
    private JCheckBox indonesiaCheckBox;
    private JCheckBox lainnyaCheckBox;
    private JTextField ttlfield;
    private JSpinner TTLSpinner;
    private JComboBox TTPCombo;
    private JTextArea alamatFieldTextArea;
    private JSlider slider;
    private JPanel mainPanel;

    public Registration() {
        super("Formulir");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(800, 600);
    }

    public static void main(String[] args) {
        JFrame jFrame = new Registration();
        jFrame.setVisible(true);
    }
}
