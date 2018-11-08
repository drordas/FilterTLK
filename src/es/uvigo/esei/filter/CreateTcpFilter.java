/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.filter;

import java.awt.Color;
import java.util.Arrays;
import java.util.BitSet;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class CreateTcpFilter extends javax.swing.JFrame {
    private final Toret rules = Toret.getInstance();

    private int mask = 0b0000;
    
    public CreateTcpFilter() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Create TCP filtering rules");
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Header = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        ipSourcePort = new javax.swing.JButton();
        ipDestinationPort = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        ipSequenceNumber = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        ipAcknowledgmentNumber = new javax.swing.JButton();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        ipChecksum = new javax.swing.JButton();
        TCP_MIN_OCTEC = new javax.swing.JTextField();
        ipWindowSize = new javax.swing.JButton();
        ipNS = new javax.swing.JButton();
        ipUrgentPointer1 = new javax.swing.JButton();
        ipDataOffset = new javax.swing.JButton();
        ipReserved = new javax.swing.JButton();
        ipCWR = new javax.swing.JButton();
        ipECE = new javax.swing.JButton();
        ipURG = new javax.swing.JButton();
        ipACK = new javax.swing.JButton();
        ipPSH = new javax.swing.JButton();
        ipRST = new javax.swing.JButton();
        ipSYN = new javax.swing.JButton();
        ipFIN = new javax.swing.JButton();
        TCP_MIN_VALUE = new javax.swing.JFormattedTextField();
        jLabel34 = new javax.swing.JLabel();
        TCP_FIRST_OCTET = new javax.swing.JToggleButton();
        TCP_SECOND_OCTET = new javax.swing.JToggleButton();
        TCP_THIRD_OCTEC = new javax.swing.JToggleButton();
        TCP_FOURTH_OCTET = new javax.swing.JToggleButton();
        Footer = new javax.swing.JPanel();
        IpBack = new javax.swing.JButton();
        ipSeeFilter = new javax.swing.JButton();
        TCP_ADD_PAYLOAD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Offsets");
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Header.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 103, 36));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(58, 99, 243));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Octet");
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Header.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 2, 103, 36));

        jTextField3.setEditable(false);
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");
        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Header.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 2, 163, 36));

        jTextField4.setEditable(false);
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("1");
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Header.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 2, 163, 36));

        jTextField5.setEditable(false);
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("2");
        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Header.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 2, 163, 36));

        jTextField6.setEditable(false);
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("3");
        jTextField6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Header.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 2, 163, 36));

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 862, 40));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TCP Packet");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 862, 33));

        Body.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(58, 99, 243));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Octet");
        jTextField9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 103, 36));

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(58, 99, 243));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("Bit");
        jTextField8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField8.setPreferredSize(new java.awt.Dimension(54, 22));
        Body.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 2, 103, 36));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("1");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel3.add(jLabel3, gridBagConstraints);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("2");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel3.add(jLabel4, gridBagConstraints);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("3");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel3.add(jLabel5, gridBagConstraints);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("4");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel3.add(jLabel6, gridBagConstraints);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("5");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel3.add(jLabel7, gridBagConstraints);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("6");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel3.add(jLabel8, gridBagConstraints);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("7");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel3.add(jLabel9, gridBagConstraints);

        Body.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 2, 163, 36));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMinimumSize(new java.awt.Dimension(140, 21));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("8");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel2.add(jLabel10, gridBagConstraints);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("9");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel2.add(jLabel11, gridBagConstraints);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("10");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel2.add(jLabel12, gridBagConstraints);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("11");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel2.add(jLabel13, gridBagConstraints);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("12");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel2.add(jLabel14, gridBagConstraints);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("13");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel2.add(jLabel15, gridBagConstraints);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("14");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel2.add(jLabel16, gridBagConstraints);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("15");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel2.add(jLabel17, gridBagConstraints);

        Body.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 2, 163, 36));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel18.setText("16");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel18, gridBagConstraints);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("17");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel19, gridBagConstraints);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("18");
        jLabel20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel20, gridBagConstraints);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("19");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel21, gridBagConstraints);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("20");
        jLabel22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel22, gridBagConstraints);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel23, gridBagConstraints);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("22");
        jLabel24.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel24, gridBagConstraints);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("23");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel25, gridBagConstraints);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("24");
        jLabel26.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel26, gridBagConstraints);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("25");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel27, gridBagConstraints);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("26");
        jLabel28.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel28, gridBagConstraints);

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("27");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel29, gridBagConstraints);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("28");
        jLabel30.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel30, gridBagConstraints);

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("29");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel31, gridBagConstraints);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("30");
        jLabel32.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel32, gridBagConstraints);

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("31");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel5.add(jLabel33, gridBagConstraints);

        Body.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 2, 326, 36));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("0");
        jTextField10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 38, 103, 36));

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("0");
        jTextField11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField11.setPreferredSize(new java.awt.Dimension(54, 22));
        Body.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 38, 103, 36));

        ipSourcePort.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipSourcePort.setText("Source Port");
        ipSourcePort.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipSourcePort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipSourcePortActionPerformed(evt);
            }
        });
        Body.add(ipSourcePort, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 38, 326, 36));

        ipDestinationPort.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipDestinationPort.setText("Destination Port");
        ipDestinationPort.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipDestinationPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipDestinationPortActionPerformed(evt);
            }
        });
        Body.add(ipDestinationPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 38, 326, 36));

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("4");
        jTextField12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 74, 103, 36));

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("32");
        jTextField13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField13.setPreferredSize(new java.awt.Dimension(54, 22));
        Body.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 74, 103, 36));

        ipSequenceNumber.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipSequenceNumber.setText("Sequence Number");
        ipSequenceNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipSequenceNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipSequenceNumberActionPerformed(evt);
            }
        });
        Body.add(ipSequenceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 74, 652, 36));

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("8");
        jTextField14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 110, 103, 36));

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("64");
        jTextField15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField15.setPreferredSize(new java.awt.Dimension(54, 22));
        Body.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 110, 103, 36));

        ipAcknowledgmentNumber.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipAcknowledgmentNumber.setText("Acknowledgment Number");
        ipAcknowledgmentNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipAcknowledgmentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipAcknowledgmentNumberActionPerformed(evt);
            }
        });
        Body.add(ipAcknowledgmentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 110, 652, 36));

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("12");
        jTextField16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 146, 103, 58));

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("96");
        jTextField17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField17.setPreferredSize(new java.awt.Dimension(54, 22));
        Body.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 146, 103, 58));

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("16");
        jTextField18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 204, 103, 36));

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("128");
        jTextField19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField19.setPreferredSize(new java.awt.Dimension(54, 22));
        Body.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 204, 103, 36));

        ipChecksum.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipChecksum.setText("Checksum");
        ipChecksum.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipChecksum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipChecksumActionPerformed(evt);
            }
        });
        Body.add(ipChecksum, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 204, 326, 36));

        TCP_MIN_OCTEC.setEditable(false);
        TCP_MIN_OCTEC.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        TCP_MIN_OCTEC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TCP_MIN_OCTEC.setText("160");
        TCP_MIN_OCTEC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TCP_MIN_OCTEC.setPreferredSize(new java.awt.Dimension(54, 22));
        Body.add(TCP_MIN_OCTEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 280, 103, 36));

        ipWindowSize.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipWindowSize.setText("Window Size");
        ipWindowSize.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipWindowSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipWindowSizeActionPerformed(evt);
            }
        });
        Body.add(ipWindowSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 146, 326, 58));

        ipNS.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipNS.setText("<html><p align='center'>N<br>S</p></html>");
        ipNS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipNS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ipNS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipNSActionPerformed(evt);
            }
        });
        Body.add(ipNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 146, 19, 58));

        ipUrgentPointer1.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipUrgentPointer1.setText("Urgent Pointer");
        ipUrgentPointer1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipUrgentPointer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipUrgentPointer1ActionPerformed(evt);
            }
        });
        Body.add(ipUrgentPointer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 204, 326, 36));

        ipDataOffset.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipDataOffset.setText("<html><p align='center'>Header <br> Length</p></html>");
        ipDataOffset.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipDataOffset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipDataOffsetActionPerformed(evt);
            }
        });
        Body.add(ipDataOffset, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 146, 80, 58));

        ipReserved.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        ipReserved.setText("<html><p align='center'>Reserved 0 0 0 0</p></html>");
        ipReserved.setToolTipText("");
        ipReserved.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipReserved.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ipReserved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipReservedActionPerformed(evt);
            }
        });
        Body.add(ipReserved, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 146, 64, 58));

        ipCWR.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipCWR.setText("<html><p align='center'>C<br>W<br>R</p></html>");
        ipCWR.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipCWR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipCWRActionPerformed(evt);
            }
        });
        Body.add(ipCWR, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 146, 21, 58));

        ipECE.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipECE.setText("<html><p align='center'>E<br>C<br>E</p></html>");
        ipECE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipECE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipECEActionPerformed(evt);
            }
        });
        Body.add(ipECE, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 146, 19, 58));

        ipURG.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipURG.setText("<html><p align='center'>U<br>R<br>G</p></html>");
        ipURG.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipURG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipURGActionPerformed(evt);
            }
        });
        Body.add(ipURG, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 146, 19, 58));

        ipACK.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipACK.setText("<html><p align='center'>A<br>C<br>K</p></html>");
        ipACK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipACKActionPerformed(evt);
            }
        });
        Body.add(ipACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 146, 21, 58));

        ipPSH.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipPSH.setText("<html><p align='center'>P<br>S<br>H</p></html>");
        ipPSH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipPSH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipPSHActionPerformed(evt);
            }
        });
        Body.add(ipPSH, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 146, 21, 58));

        ipRST.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipRST.setText("<html><p align='center'>R<br>S<br>T</p></html>");
        ipRST.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipRST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipRSTActionPerformed(evt);
            }
        });
        Body.add(ipRST, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 146, 21, 58));

        ipSYN.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipSYN.setText("<html><p align='center'>S<br>Y<br>N</p></html>");
        ipSYN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipSYN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipSYNActionPerformed(evt);
            }
        });
        Body.add(ipSYN, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 146, 21, 58));

        ipFIN.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipFIN.setText("<html><p align='center'>F<br>I<br>N</p></html>");
        ipFIN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipFIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipFINActionPerformed(evt);
            }
        });
        Body.add(ipFIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 146, 21, 58));

        TCP_MIN_VALUE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TCP_MIN_VALUE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        TCP_MIN_VALUE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TCP_MIN_VALUE.setText("20");
        TCP_MIN_VALUE.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        TCP_MIN_VALUE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TCP_MIN_VALUEFocusLost(evt);
            }
        });
        Body.add(TCP_MIN_VALUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 103, 36));

        jLabel34.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Options && Padding && Payload");
        jLabel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 240, 652, 40));

        TCP_FIRST_OCTET.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        TCP_FIRST_OCTET.setText("First Octet");
        TCP_FIRST_OCTET.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TCP_FIRST_OCTET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCP_FIRST_OCTETActionPerformed(evt);
            }
        });
        Body.add(TCP_FIRST_OCTET, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 280, 163, 36));

        TCP_SECOND_OCTET.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        TCP_SECOND_OCTET.setText("Second Octet");
        TCP_SECOND_OCTET.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TCP_SECOND_OCTET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCP_SECOND_OCTETActionPerformed(evt);
            }
        });
        Body.add(TCP_SECOND_OCTET, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 280, 163, 36));

        TCP_THIRD_OCTEC.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        TCP_THIRD_OCTEC.setText("Third Octet");
        TCP_THIRD_OCTEC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TCP_THIRD_OCTEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCP_THIRD_OCTECActionPerformed(evt);
            }
        });
        Body.add(TCP_THIRD_OCTEC, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 280, 163, 36));

        TCP_FOURTH_OCTET.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        TCP_FOURTH_OCTET.setText("Fourth Octet");
        TCP_FOURTH_OCTET.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TCP_FOURTH_OCTET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCP_FOURTH_OCTETActionPerformed(evt);
            }
        });
        Body.add(TCP_FOURTH_OCTET, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 280, 163, 36));

        getContentPane().add(Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 862, -1));

        IpBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uvigo/esei/images/back.png"))); // NOI18N
        IpBack.setText("Back");
        IpBack.setAlignmentY(0.0F);
        IpBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpBackActionPerformed(evt);
            }
        });

        ipSeeFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uvigo/esei/images/find.png"))); // NOI18N
        ipSeeFilter.setText("See Filter");
        ipSeeFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipSeeFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterLayout.createSequentialGroup()
                .addContainerGap(667, Short.MAX_VALUE)
                .addComponent(ipSeeFilter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IpBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IpBack)
                    .addComponent(ipSeeFilter))
                .addGap(8, 8, 8))
        );

        getContentPane().add(Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 445, 860, 50));

        TCP_ADD_PAYLOAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uvigo/esei/images/add.png"))); // NOI18N
        TCP_ADD_PAYLOAD.setText("  Add");
        TCP_ADD_PAYLOAD.setEnabled(false);
        TCP_ADD_PAYLOAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCP_ADD_PAYLOADActionPerformed(evt);
            }
        });
        getContentPane().add(TCP_ADD_PAYLOAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void checkPayloadButton(){      
        if( mask == 0 || mask == 5 || mask == 7 || mask == 9 || 
            mask == 11 || mask == 13 || mask == 10 || mask == 14 ){
            TCP_ADD_PAYLOAD.setEnabled(false);
        }else TCP_ADD_PAYLOAD.setEnabled(true);
    }
    
    private void ipDestinationPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipDestinationPortActionPerformed
        
        condition c = new condition();
        condition.jLabelFilter.setText("tcp[2:2]");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipDestinationPortActionPerformed

    private void ipSequenceNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipSequenceNumberActionPerformed
        
        condition c = new condition();
        condition.jLabelFilter.setText("tcp[4:4]");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipSequenceNumberActionPerformed

    private void ipAcknowledgmentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipAcknowledgmentNumberActionPerformed
        rules.appendRules("tcp[8:4]");
        
        condition c = new condition();
        condition.jLabelFilter.setText("tcp[8:4]");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipAcknowledgmentNumberActionPerformed

    private void ipChecksumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipChecksumActionPerformed
        rules.appendRules("tcp[16:2]");
        
        condition c = new condition();
        condition.jLabelFilter.setText("tcp[16:2]");
        c.setVisible(true);
        c.tcp = this;
        c.numberBits= 16;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipChecksumActionPerformed

    private void ipWindowSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipWindowSizeActionPerformed
        
        condition c = new condition();
        condition.jLabelFilter.setText("tcp[14:2]");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipWindowSizeActionPerformed

    private void ipNSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipNSActionPerformed
       
        condition c = new condition();
        condition.jLabelFilter.setText("(tcp[12:1] & 0x01)");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipNSActionPerformed

    private void ipUrgentPointer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipUrgentPointer1ActionPerformed
        
        condition c = new condition();
        condition.jLabelFilter.setText("tcp[18:2]");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipUrgentPointer1ActionPerformed

    private void ipDataOffsetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipDataOffsetActionPerformed
        
        condition c = new condition();
        condition.jLabelFilter.setText("(tcp[12] >> 4)");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipDataOffsetActionPerformed

    private void ipSourcePortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipSourcePortActionPerformed
        condition c = new condition();
        condition.jLabelFilter.setText("tcp[0:2]");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipSourcePortActionPerformed

    private void ipReservedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipReservedActionPerformed
        
        condition c = new condition();
        condition.jLabelFilter.setText("((tcp[12] >> 1) & 0x07)");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipReservedActionPerformed

    private void ipCWRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipCWRActionPerformed
        
        condition c = new condition();
        condition.jLabelFilter.setText("(tcp[13] & 0x80)");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipCWRActionPerformed

    private void ipECEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipECEActionPerformed
        
        condition c = new condition();
        condition.jLabelFilter.setText("(tcp[13] & 0x40)");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipECEActionPerformed

    private void ipURGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipURGActionPerformed
        
        condition c = new condition();
        condition.jLabelFilter.setText("(tcp[13] & 0x20)");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipURGActionPerformed

    private void ipACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipACKActionPerformed
        
        condition c = new condition();
        condition.jLabelFilter.setText("(tcp[13] & 0x10)");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipACKActionPerformed

    private void ipPSHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipPSHActionPerformed
        condition c = new condition();
        condition.jLabelFilter.setText("(tcp[13] & 0x08)");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipPSHActionPerformed

    private void ipRSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipRSTActionPerformed
       
        condition c = new condition();
        condition.jLabelFilter.setText("(tcp[13] & 0x04)");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipRSTActionPerformed

    private void ipSYNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipSYNActionPerformed
        condition c = new condition();
        condition.jLabelFilter.setText("(tcp[13] & 0x02)");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipSYNActionPerformed

    private void ipFINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipFINActionPerformed
        condition c = new condition();
        condition.jLabelFilter.setText("(tcp[13] & 0x01)");
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        dispose();
    }//GEN-LAST:event_ipFINActionPerformed

    /*Allows the return to the previous menu.*/
    private void IpBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpBackActionPerformed
        SelectTypeFilter obj = new SelectTypeFilter();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_IpBackActionPerformed

    /*Add the filter created.*/
    private void ipSeeFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipSeeFilterActionPerformed
        SeeFilter obj = new SeeFilter();
        obj.setVisible(true);
        dispose();
        obj.ret = "TCP";
        SeeFilter.jTextArea1.setText(rules.getRules());
    }//GEN-LAST:event_ipSeeFilterActionPerformed

    private void TCP_MIN_VALUEFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TCP_MIN_VALUEFocusLost
       String text = TCP_MIN_VALUE.getText();
       
       try{
        int number = Integer.parseInt(text);
        if ( number >= 20 && (number % 4 == 0) && number <= 65532 ){
            TCP_MIN_VALUE.setText(text);
            TCP_MIN_OCTEC.setText(Long.toString(number * 8));
        }else{ 
           JOptionPane.showMessageDialog(null, "Octect range is not correct\n Must be between 20 and 8188", "ERROR", JOptionPane.ERROR_MESSAGE);
           TCP_MIN_VALUE.setText(Integer.toString(Integer.parseInt(TCP_MIN_OCTEC.getText()) / 8 ));
        }
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Options & Payload length is inconsistent\n", "ERROR", JOptionPane.ERROR_MESSAGE);
           TCP_MIN_VALUE.setText( Integer.toString(Integer.parseInt(TCP_MIN_OCTEC.getText()) / 8) );
       } 
    }//GEN-LAST:event_TCP_MIN_VALUEFocusLost

    private void TCP_FIRST_OCTETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCP_FIRST_OCTETActionPerformed
        if(TCP_FIRST_OCTET.isSelected())
            mask |= 0b1000;
        else mask ^= 0b1000;
        checkPayloadButton();
    }//GEN-LAST:event_TCP_FIRST_OCTETActionPerformed

    private void TCP_SECOND_OCTETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCP_SECOND_OCTETActionPerformed
        if(TCP_SECOND_OCTET.isSelected())
            mask |= 0b0100;
        else mask ^= 0b0100;
        checkPayloadButton();
    }//GEN-LAST:event_TCP_SECOND_OCTETActionPerformed

    private void TCP_FOURTH_OCTETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCP_FOURTH_OCTETActionPerformed
        if(TCP_FOURTH_OCTET.isSelected()){
            mask |= 0b0001;
            if(mask == 0b1101){
                TCP_THIRD_OCTEC.setSelected(true);
                mask |= 0b0010;
            }
        }else{ 
            mask ^= 0b0001;
            if(mask == 0b1110){
                TCP_THIRD_OCTEC.setSelected(false);
                mask ^= 0b0010;
            }
        }
        checkPayloadButton();
    }//GEN-LAST:event_TCP_FOURTH_OCTETActionPerformed

    private void TCP_ADD_PAYLOADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCP_ADD_PAYLOADActionPerformed
        JOptionPane.showMessageDialog(null,"Options && Padding && Payload are optional (may not exist)","Information", JOptionPane.INFORMATION_MESSAGE);
        int initOctec = Integer.parseInt(TCP_MIN_VALUE.getText());
        StringBuilder rule = new StringBuilder("tcp[");
        int numBits;
        switch(mask){
            case 0b1111: rule.append(initOctec).append(":4]");        
                    numBits = 32;
                    break;
            case 0b1100: rule.append(initOctec).append(":2]");
                    numBits= 16;
                    break;
            case 0b1000: rule.append(initOctec).append("]");
                    numBits= 8;
                    break;
            case 0b0100: rule.append(initOctec+1).append("]");
                    numBits= 8;
                    break;
            case 0b0010: rule.append(initOctec+2).append("]");
                    numBits= 8;
                    break;
            case 0b0001: rule.append(initOctec+3).append("]");
                    numBits= 8;
                    break; 
            case 0b0110: rule.append(initOctec+1).append(":2]");
                    numBits= 16;
                    break;                    
            case 0b0011: rule.append(initOctec+2).append(":2]");
                    numBits= 16;
                    break;                        
            default: JOptionPane.showMessageDialog(null, "Option is invalid","ERROR",JOptionPane.ERROR_MESSAGE);
                    numBits=0;
                    break;
        }
        TCP_FIRST_OCTET.setSelected(false);
        TCP_SECOND_OCTET.setSelected(false);
        TCP_THIRD_OCTEC.setSelected(false);
        TCP_FOURTH_OCTET.setSelected(false);
        TCP_ADD_PAYLOAD.setEnabled(false);
        mask = 0b0000;
        
        condition c = new condition();
        condition.jLabelFilter.setText(rule.toString());
        c.setVisible(true);
        c.tcp = this;
        c.t = "TCP";
        c.numberBits = numBits;
        dispose(); 
    }//GEN-LAST:event_TCP_ADD_PAYLOADActionPerformed

    private void TCP_THIRD_OCTECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCP_THIRD_OCTECActionPerformed
        if(TCP_THIRD_OCTEC.isSelected())
            mask |= 0b0010;
        else mask ^= 0b0010;
        checkPayloadButton();
    }//GEN-LAST:event_TCP_THIRD_OCTECActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JButton IpBack;
    private javax.swing.JButton TCP_ADD_PAYLOAD;
    private javax.swing.JToggleButton TCP_FIRST_OCTET;
    private javax.swing.JToggleButton TCP_FOURTH_OCTET;
    private javax.swing.JTextField TCP_MIN_OCTEC;
    private javax.swing.JFormattedTextField TCP_MIN_VALUE;
    private javax.swing.JToggleButton TCP_SECOND_OCTET;
    private javax.swing.JToggleButton TCP_THIRD_OCTEC;
    private javax.swing.JButton ipACK;
    private javax.swing.JButton ipAcknowledgmentNumber;
    private javax.swing.JButton ipCWR;
    private javax.swing.JButton ipChecksum;
    private javax.swing.JButton ipDataOffset;
    private javax.swing.JButton ipDestinationPort;
    private javax.swing.JButton ipECE;
    private javax.swing.JButton ipFIN;
    private javax.swing.JButton ipNS;
    private javax.swing.JButton ipPSH;
    private javax.swing.JButton ipRST;
    private javax.swing.JButton ipReserved;
    private javax.swing.JButton ipSYN;
    private javax.swing.JButton ipSeeFilter;
    private javax.swing.JButton ipSequenceNumber;
    private javax.swing.JButton ipSourcePort;
    private javax.swing.JButton ipURG;
    private javax.swing.JButton ipUrgentPointer1;
    private javax.swing.JButton ipWindowSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
