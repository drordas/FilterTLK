/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.filter;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class CreateICMPFilter extends javax.swing.JFrame {
    
    
    private Toret rules = Toret.getInstance();
    
    public CreateICMPFilter() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Create ICMP filtering rules");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Body = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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
        jTextField7 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        icmpCheckSum = new javax.swing.JButton();
        filterName1 = new javax.swing.JLabel();
        icmpCode = new javax.swing.JButton();
        icmpType = new javax.swing.JButton();
        Footer = new javax.swing.JPanel();
        ICMP_Back = new javax.swing.JButton();
        ICMP_SeeFilter = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        /*
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(8);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);
        MAX_ICMP_PAYLOAD = new javax.swing.JFormattedTextField(formatter);
        */
        MIN_ICMP_PAYLOAD = new javax.swing.JFormattedTextField();
        /*
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(8);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);
        MAX_ICMP_PAYLOAD = new javax.swing.JFormattedTextField(formatter);
        */
        MAX_ICMP_PAYLOAD = new javax.swing.JFormattedTextField();
        ICMP_FIRST_OCTET = new javax.swing.JToggleButton();
        ICMP_SECOND_OCTET = new javax.swing.JToggleButton();
        ICMP_THIRD_OCTET = new javax.swing.JToggleButton();
        ICMP_FOURTH_OCTET = new javax.swing.JToggleButton();
        filterName = new javax.swing.JLabel();
        ICMP_ADD_PAYLOAD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Body.setBorder(null);
        Body.setMinimumSize(new java.awt.Dimension(860, 362));
        Body.setPreferredSize(new java.awt.Dimension(860, 362));
        Body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("3");
        jTextField6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 32, 163, 36));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("2");
        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 32, 163, 36));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("1");
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 32, 163, 36));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");
        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 32, 163, 36));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(58, 99, 243));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Octet");
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 32, 103, 36));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Offsets");
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 32, 103, 36));

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(58, 99, 243));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("Octet");
        jTextField20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 69, 103, 36));

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(58, 99, 243));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("Bit");
        jTextField19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField19.setPreferredSize(new java.awt.Dimension(54, 22));
        Body.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 69, 103, 36));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel34.setText("16");
        jLabel34.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel34, gridBagConstraints);

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("17");
        jLabel35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel35, gridBagConstraints);

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("18");
        jLabel36.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel36, gridBagConstraints);

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("19");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel37, gridBagConstraints);

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("20");
        jLabel38.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel38, gridBagConstraints);

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel39, gridBagConstraints);

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("22");
        jLabel40.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel40, gridBagConstraints);

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("23");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel41, gridBagConstraints);

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("24");
        jLabel42.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel42, gridBagConstraints);

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("25");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel43, gridBagConstraints);

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("26");
        jLabel44.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel44, gridBagConstraints);

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("27");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel45, gridBagConstraints);

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("28");
        jLabel46.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel46, gridBagConstraints);

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("29");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel47, gridBagConstraints);

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("30");
        jLabel48.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel48, gridBagConstraints);

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("31");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        jPanel6.add(jLabel49, gridBagConstraints);

        Body.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 69, 326, 36));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(131, 18));
        jPanel1.setPreferredSize(new java.awt.Dimension(131, 18));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel18.setText(" 0 ");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel18, gridBagConstraints);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText(" 1 ");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel19, gridBagConstraints);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText(" 2 ");
        jLabel20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel20, gridBagConstraints);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText(" 3 ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel21, gridBagConstraints);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText(" 4 ");
        jLabel22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel22, gridBagConstraints);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText(" 5 ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel23, gridBagConstraints);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText(" 6 ");
        jLabel24.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel24, gridBagConstraints);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText(" 7 ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel25, gridBagConstraints);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText(" 8  ");
        jLabel26.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel26, gridBagConstraints);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText(" 9 ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel27, gridBagConstraints);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText(" 10 ");
        jLabel28.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel28, gridBagConstraints);

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText(" 11 ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel29, gridBagConstraints);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText(" 12 ");
        jLabel30.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel30, gridBagConstraints);

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText(" 13 ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel31, gridBagConstraints);

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText(" 14 ");
        jLabel32.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel32, gridBagConstraints);

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText(" 15 ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel33, gridBagConstraints);

        Body.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 69, 326, 36));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("0");
        jTextField7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 105, 103, 38));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("0");
        jTextField10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField10.setPreferredSize(new java.awt.Dimension(54, 22));
        Body.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 105, 103, 38));

        icmpCheckSum.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        icmpCheckSum.setText("Checksum");
        icmpCheckSum.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        icmpCheckSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icmpCheckSumActionPerformed(evt);
            }
        });
        Body.add(icmpCheckSum, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 105, 326, 38));

        filterName1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        filterName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filterName1.setText("ICMP Packet");
        filterName1.setMaximumSize(new java.awt.Dimension(140, 20));
        filterName1.setMinimumSize(new java.awt.Dimension(140, 20));
        filterName1.setName(""); // NOI18N
        filterName1.setPreferredSize(new java.awt.Dimension(140, 20));
        Body.add(filterName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 760, 33));

        icmpCode.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        icmpCode.setText("Code");
        icmpCode.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        icmpCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icmpCodeActionPerformed(evt);
            }
        });
        Body.add(icmpCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 105, 163, 38));

        icmpType.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        icmpType.setText("Type");
        icmpType.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        icmpType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icmpTypeActionPerformed(evt);
            }
        });
        Body.add(icmpType, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 105, 163, 38));

        getContentPane().add(Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 862, 150));

        ICMP_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uvigo/esei/images/back.png"))); // NOI18N
        ICMP_Back.setText("Back");
        ICMP_Back.setAlignmentY(0.0F);
        ICMP_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICMP_BackActionPerformed(evt);
            }
        });

        ICMP_SeeFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uvigo/esei/images/find.png"))); // NOI18N
        ICMP_SeeFilter.setText("See Filter");
        ICMP_SeeFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICMP_SeeFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterLayout.createSequentialGroup()
                .addContainerGap(645, Short.MAX_VALUE)
                .addComponent(ICMP_SeeFilter)
                .addGap(18, 18, 18)
                .addComponent(ICMP_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ICMP_Back)
                    .addComponent(ICMP_SeeFilter))
                .addGap(8, 8, 8))
        );

        getContentPane().add(Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 445, 860, 50));

        jPanel3.setBorder(null);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MIN_ICMP_PAYLOAD.setBackground(new java.awt.Color(254, 254, 254));
        MIN_ICMP_PAYLOAD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MIN_ICMP_PAYLOAD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        MIN_ICMP_PAYLOAD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MIN_ICMP_PAYLOAD.setText("4");
        MIN_ICMP_PAYLOAD.setToolTipText("Offset Number");
        MIN_ICMP_PAYLOAD.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        MIN_ICMP_PAYLOAD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MIN_ICMP_PAYLOADFocusLost(evt);
            }
        });
        jPanel3.add(MIN_ICMP_PAYLOAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 50, 103, 38));

        MAX_ICMP_PAYLOAD.setBackground(new java.awt.Color(254, 254, 254));
        MAX_ICMP_PAYLOAD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MAX_ICMP_PAYLOAD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        MAX_ICMP_PAYLOAD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MAX_ICMP_PAYLOAD.setText("32");
        MAX_ICMP_PAYLOAD.setToolTipText("Offset Number");
        MAX_ICMP_PAYLOAD.setFocusable(false);
        MAX_ICMP_PAYLOAD.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        MAX_ICMP_PAYLOAD.setPreferredSize(new java.awt.Dimension(13, 22));
        jPanel3.add(MAX_ICMP_PAYLOAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 50, 103, 38));

        ICMP_FIRST_OCTET.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ICMP_FIRST_OCTET.setText("First Octet");
        ICMP_FIRST_OCTET.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ICMP_FIRST_OCTET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICMP_FIRST_OCTETActionPerformed(evt);
            }
        });
        jPanel3.add(ICMP_FIRST_OCTET, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 50, 163, 38));

        ICMP_SECOND_OCTET.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ICMP_SECOND_OCTET.setText("Second Octet");
        ICMP_SECOND_OCTET.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ICMP_SECOND_OCTET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICMP_SECOND_OCTETActionPerformed(evt);
            }
        });
        jPanel3.add(ICMP_SECOND_OCTET, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 50, 163, 38));

        ICMP_THIRD_OCTET.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ICMP_THIRD_OCTET.setText("Third Octet");
        ICMP_THIRD_OCTET.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ICMP_THIRD_OCTET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICMP_THIRD_OCTETActionPerformed(evt);
            }
        });
        jPanel3.add(ICMP_THIRD_OCTET, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 50, 163, 38));

        ICMP_FOURTH_OCTET.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ICMP_FOURTH_OCTET.setText("Fourth Octet");
        ICMP_FOURTH_OCTET.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ICMP_FOURTH_OCTET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICMP_FOURTH_OCTETActionPerformed(evt);
            }
        });
        jPanel3.add(ICMP_FOURTH_OCTET, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 50, 163, 38));

        filterName.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        filterName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filterName.setText("Options && Padding && Payload");
        filterName.setMaximumSize(new java.awt.Dimension(140, 20));
        filterName.setMinimumSize(new java.awt.Dimension(140, 20));
        filterName.setName(""); // NOI18N
        filterName.setPreferredSize(new java.awt.Dimension(140, 20));
        jPanel3.add(filterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 760, 40));

        ICMP_ADD_PAYLOAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uvigo/esei/images/add.png"))); // NOI18N
        ICMP_ADD_PAYLOAD.setText("Add payload");
        ICMP_ADD_PAYLOAD.setEnabled(false);
        ICMP_ADD_PAYLOAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICMP_ADD_PAYLOADActionPerformed(evt);
            }
        });
        jPanel3.add(ICMP_ADD_PAYLOAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 120, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 860, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    int numPressed = 0;
    private int mask = 0b0000;
    
    private void checkPayloadButton(){      
        if( mask == 0 || mask == 5 || mask== 7 || mask == 9 || 
            mask == 11 || mask == 13 || mask == 10 || mask == 14 ){
            ICMP_ADD_PAYLOAD.setEnabled(false);
        }else ICMP_ADD_PAYLOAD.setEnabled(true);
        
    }

    private void ICMP_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICMP_BackActionPerformed
        SelectTypeFilter obj = new SelectTypeFilter();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ICMP_BackActionPerformed

    private void ICMP_SeeFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICMP_SeeFilterActionPerformed
        SeeFilter obj = new SeeFilter();
        SeeFilter.jTextArea1.setText(rules.getRules());
        obj.setVisible(true);
        dispose();
        obj.ret = "ICMP";
    }//GEN-LAST:event_ICMP_SeeFilterActionPerformed

    private void MIN_ICMP_PAYLOADFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MIN_ICMP_PAYLOADFocusLost
       String text = MIN_ICMP_PAYLOAD.getText();
       
       try{
        int number = Integer.parseInt(text);
        if ( number >= 8 && (number % 4 == 0) ){
            MIN_ICMP_PAYLOAD.setText(text);
            MAX_ICMP_PAYLOAD.setText(Integer.toString(number * 8));
        }else{ 
            MIN_ICMP_PAYLOAD.setText("4");
            MAX_ICMP_PAYLOAD.setText("32");
        }
       }catch(NumberFormatException e){
           MIN_ICMP_PAYLOAD.setText("4");
           MAX_ICMP_PAYLOAD.setText("32");
       }  
    }//GEN-LAST:event_MIN_ICMP_PAYLOADFocusLost

    
    private void ICMP_ADD_PAYLOADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICMP_ADD_PAYLOADActionPerformed
        JOptionPane.showMessageDialog(null,"Options && Padding && Payload are optional (may not exist)","Information", JOptionPane.INFORMATION_MESSAGE);
        try{
             int initOctec = Integer.parseInt(MIN_ICMP_PAYLOAD.getText());
             StringBuilder rule = new StringBuilder();
             int numBits;
             
             switch(mask){
                case 0b1111: rule.append("icmp[").append(initOctec).append(":4]");
                        numBits = 32;
                        break;
                case 0b1100: rule.append("icmp[").append(initOctec).append(":2]");
                        numBits = 16;
                        break;
                case 0b1000: rule.append("icmp[").append(initOctec).append("]");
                        numBits= 8;
                        break;
                case 0b0100: rule.append("icmp[").append(initOctec+1).append("]");
                        numBits= 8;
                        break;
                case 0b0010: rule.append("icmp[").append(initOctec+2).append("]");
                        numBits= 8;
                        break;
                case 0b0001: rule.append("icmp[").append(initOctec+3).append("]");
                        numBits= 8;
                        break; 
                case 0b0110: rule.append("icmp[").append(initOctec+1).append(":2]");
                        numBits= 16;
                        break;                    
                case 0b0011: rule.append("icmp[").append(initOctec+2).append(":2]");
                        numBits= 16;
                        break;                        
                default: JOptionPane.showMessageDialog(null, "Option is invalid","ERROR",JOptionPane.ERROR_MESSAGE);
                        numBits=0;
                        break;                         
 
             }
             ICMP_ADD_PAYLOAD.setEnabled(false);
             ICMP_FIRST_OCTET.setSelected(false);
             ICMP_SECOND_OCTET.setSelected(false);
             ICMP_THIRD_OCTET.setSelected(false);
             ICMP_FOURTH_OCTET.setSelected(false);
             ICMP_ADD_PAYLOAD.setEnabled(false);
             mask = 0b0000;
             
             condition c = new condition();
             condition.jLabelFilter.setText(rule.toString());
             c.setVisible(true);
             c.icmp = this;
             c.t = "ICMP";
             c.numberBits = numBits;
             dispose();    

        }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Invalid ICMP octet.\n", "ERROR", JOptionPane.ERROR_MESSAGE);
             ICMP_FIRST_OCTET.setSelected(false);
             ICMP_SECOND_OCTET.setSelected(false);
             ICMP_THIRD_OCTET.setSelected(false);
             ICMP_FOURTH_OCTET.setSelected(false);
             numPressed = 0;
             mask = 0b0000;
        }
    }//GEN-LAST:event_ICMP_ADD_PAYLOADActionPerformed

    private void icmpCheckSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icmpCheckSumActionPerformed

        condition c = new condition();        
        condition.jLabelFilter.setText("icmp[2:2]");
        c.setVisible(true);
        c.icmp = this;
        c.t = "ICMP";
        dispose();
    }//GEN-LAST:event_icmpCheckSumActionPerformed

    private void icmpCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icmpCodeActionPerformed
        
        condition c = new condition(condition.options.ICMP_CODE);
        condition.jLabelFilter.setText("icmp[1]");
        c.setVisible(true);
        c.icmp = this;
        c.t = "ICMP";
        dispose();
    }//GEN-LAST:event_icmpCodeActionPerformed

    private void ICMP_FIRST_OCTETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICMP_FIRST_OCTETActionPerformed

        if(ICMP_FIRST_OCTET.isSelected())
            mask |= 0b1000;
        else mask ^= 0b1000;
        
        //enablePayloadButton();
        checkPayloadButton();
    }//GEN-LAST:event_ICMP_FIRST_OCTETActionPerformed

    private void ICMP_FOURTH_OCTETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICMP_FOURTH_OCTETActionPerformed
        if(ICMP_FOURTH_OCTET.isSelected()){
            mask |= 0b0001;
            if(mask == 0b1101){
                ICMP_THIRD_OCTET.setSelected(true);
                mask |= 0b0010;
            }
        }else{ 
            mask ^= 0b0001;
            if(mask == 0b1110){
                ICMP_THIRD_OCTET.setSelected(false);
                mask ^= 0b0010;
            }
        }
        checkPayloadButton();
    }//GEN-LAST:event_ICMP_FOURTH_OCTETActionPerformed

    private void ICMP_SECOND_OCTETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICMP_SECOND_OCTETActionPerformed
        if(ICMP_SECOND_OCTET.isSelected())
            mask |= 0b0100;
        else mask ^= 0b0100;
        
        checkPayloadButton();
    }//GEN-LAST:event_ICMP_SECOND_OCTETActionPerformed

    private void ICMP_THIRD_OCTETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICMP_THIRD_OCTETActionPerformed
       if(ICMP_THIRD_OCTET.isSelected())
            mask |= 0b0010;
        else mask ^= 0b0010; 
       
       checkPayloadButton();
    }//GEN-LAST:event_ICMP_THIRD_OCTETActionPerformed

    private void icmpTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icmpTypeActionPerformed
        condition c = new condition(condition.options.ICMP_TYPE);
        condition.jLabelFilter.setText("icmp[0]");
        c.setVisible(true);
        c.icmp = this;
        c.t = "ICMP";
        dispose();
    }//GEN-LAST:event_icmpTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Footer;
    private javax.swing.JButton ICMP_ADD_PAYLOAD;
    private javax.swing.JButton ICMP_Back;
    private javax.swing.JToggleButton ICMP_FIRST_OCTET;
    private javax.swing.JToggleButton ICMP_FOURTH_OCTET;
    private javax.swing.JToggleButton ICMP_SECOND_OCTET;
    private javax.swing.JButton ICMP_SeeFilter;
    private javax.swing.JToggleButton ICMP_THIRD_OCTET;
    private javax.swing.JFormattedTextField MAX_ICMP_PAYLOAD;
    private javax.swing.JFormattedTextField MIN_ICMP_PAYLOAD;
    private javax.swing.JLabel filterName;
    private javax.swing.JLabel filterName1;
    private javax.swing.JButton icmpCheckSum;
    private javax.swing.JButton icmpCode;
    private javax.swing.JButton icmpType;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
