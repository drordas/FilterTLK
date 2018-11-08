/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.filter;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class CreateIpFilter extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    private final Toret rules = Toret.getInstance();

    private int mask = 0b0000;
    
    public CreateIpFilter() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Create IP filtering rules");
        //MenuFrame mf = new MenuFrame();
        //this.setIconImage(mf.getIconImage());
    }

    private void checkPayloadButton(){
        if( mask == 0 || mask == 5 || mask == 7 || mask == 9 || 
            mask == 11 || mask == 13 || mask == 10 || mask == 14 ){
            IP_ADD_PAYLOAD.setEnabled(false);
        }else IP_ADD_PAYLOAD.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
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
        ipVersion = new javax.swing.JButton();
        ipIHL = new javax.swing.JButton();
        ipDSCP = new javax.swing.JButton();
        ipECN = new javax.swing.JButton();
        ipLength = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        ipIdentification = new javax.swing.JButton();
        ipFlags = new javax.swing.JButton();
        ipFOfsset = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        ipTTL = new javax.swing.JButton();
        ipProtocol = new javax.swing.JButton();
        ipHeaderCheckSum = new javax.swing.JButton();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        ipSourceIP = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        ipDestIP = new javax.swing.JButton();
        IP_MIN_OCTET = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        IP_FOURTH_OCTET = new javax.swing.JToggleButton();
        IP_FIRST_OCTET = new javax.swing.JToggleButton();
        IP_SECOND_OCTET = new javax.swing.JToggleButton();
        IP_THIRD_OCTET = new javax.swing.JToggleButton();
        IP_MIN_VALUE = new javax.swing.JFormattedTextField();
        Footer = new javax.swing.JPanel();
        IpBack = new javax.swing.JButton();
        ipSeeFilter = new javax.swing.JButton();
        IP_ADD_PAYLOAD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IPv4 Packet");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 862, 40));

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
        jTextField3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");
        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Header.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 2, 163, 36));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("1");
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Header.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 2, 163, 36));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("2");
        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Header.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 2, 163, 36));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("3");
        jTextField6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Header.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 2, 163, 36));

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 862, 40));

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
        jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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

        ipVersion.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipVersion.setText("Version");
        ipVersion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipVersionActionPerformed(evt);
            }
        });
        Body.add(ipVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 38, 81, 36));

        ipIHL.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        ipIHL.setText("<html><p align='center'>Header <br> Length</p></html>");
        ipIHL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipIHL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipIHLActionPerformed(evt);
            }
        });
        Body.add(ipIHL, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 38, 82, 36));

        ipDSCP.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipDSCP.setText("DSCP");
        ipDSCP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipDSCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipDSCPActionPerformed(evt);
            }
        });
        Body.add(ipDSCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 38, 117, 36));

        ipECN.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipECN.setText("ECN");
        ipECN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipECN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipECNActionPerformed(evt);
            }
        });
        Body.add(ipECN, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 38, 46, 36));

        ipLength.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipLength.setText("Total Length");
        ipLength.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipLengthActionPerformed(evt);
            }
        });
        Body.add(ipLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 38, 326, 36));

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

        ipIdentification.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipIdentification.setText("Identification");
        ipIdentification.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipIdentification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipIdentificationActionPerformed(evt);
            }
        });
        Body.add(ipIdentification, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 74, 326, 36));

        ipFlags.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipFlags.setText("Flags");
        ipFlags.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipFlags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipFlagsActionPerformed(evt);
            }
        });
        Body.add(ipFlags, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 74, 65, 36));

        ipFOfsset.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipFOfsset.setText("Fragment Offset");
        ipFOfsset.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipFOfsset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipFOfssetActionPerformed(evt);
            }
        });
        Body.add(ipFOfsset, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 74, 261, 36));

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

        ipTTL.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipTTL.setText("Time to Live (TTL)");
        ipTTL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipTTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipTTLActionPerformed(evt);
            }
        });
        Body.add(ipTTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 110, 163, 36));

        ipProtocol.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipProtocol.setText("Protocol");
        ipProtocol.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipProtocol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipProtocolActionPerformed(evt);
            }
        });
        Body.add(ipProtocol, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 110, 163, 36));

        ipHeaderCheckSum.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipHeaderCheckSum.setText("Header Checksum");
        ipHeaderCheckSum.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipHeaderCheckSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipHeaderCheckSumActionPerformed(evt);
            }
        });
        Body.add(ipHeaderCheckSum, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 110, 326, 36));

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("12");
        jTextField16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 146, 103, 36));

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("96");
        jTextField17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField17.setPreferredSize(new java.awt.Dimension(54, 22));
        Body.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 146, 103, 36));

        ipSourceIP.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipSourceIP.setText("Source IP Address");
        ipSourceIP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipSourceIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipSourceIPActionPerformed(evt);
            }
        });
        Body.add(ipSourceIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 146, 652, 36));

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("16");
        jTextField18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Body.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 182, 103, 36));

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("128");
        jTextField19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField19.setPreferredSize(new java.awt.Dimension(54, 22));
        Body.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 182, 103, 36));

        ipDestIP.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        ipDestIP.setText("Destination IP Address");
        ipDestIP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ipDestIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipDestIPActionPerformed(evt);
            }
        });
        Body.add(ipDestIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 182, 652, 36));

        IP_MIN_OCTET.setEditable(false);
        IP_MIN_OCTET.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        IP_MIN_OCTET.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IP_MIN_OCTET.setText("160");
        IP_MIN_OCTET.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        IP_MIN_OCTET.setPreferredSize(new java.awt.Dimension(54, 22));
        Body.add(IP_MIN_OCTET, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 260, 103, 36));

        jLabel34.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Options && Padding && Payload");
        Body.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 219, 650, 40));

        IP_FOURTH_OCTET.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        IP_FOURTH_OCTET.setText("Fourth Octet");
        IP_FOURTH_OCTET.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        IP_FOURTH_OCTET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IP_FOURTH_OCTETActionPerformed(evt);
            }
        });
        Body.add(IP_FOURTH_OCTET, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 260, 163, 36));

        IP_FIRST_OCTET.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        IP_FIRST_OCTET.setText("First Octet");
        IP_FIRST_OCTET.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        IP_FIRST_OCTET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IP_FIRST_OCTETActionPerformed(evt);
            }
        });
        Body.add(IP_FIRST_OCTET, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 260, 163, 36));

        IP_SECOND_OCTET.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        IP_SECOND_OCTET.setText("Second Octet");
        IP_SECOND_OCTET.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        IP_SECOND_OCTET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IP_SECOND_OCTETActionPerformed(evt);
            }
        });
        Body.add(IP_SECOND_OCTET, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 260, 163, 36));

        IP_THIRD_OCTET.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        IP_THIRD_OCTET.setText("Third Octet");
        IP_THIRD_OCTET.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        IP_THIRD_OCTET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IP_THIRD_OCTETActionPerformed(evt);
            }
        });
        Body.add(IP_THIRD_OCTET, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 260, 163, 36));

        IP_MIN_VALUE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        IP_MIN_VALUE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IP_MIN_VALUE.setText("20");
        IP_MIN_VALUE.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        IP_MIN_VALUE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IP_MIN_VALUEFocusLost(evt);
            }
        });
        Body.add(IP_MIN_VALUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 260, 103, 36));

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
                .addContainerGap(665, Short.MAX_VALUE)
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

        IP_ADD_PAYLOAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uvigo/esei/images/add.png"))); // NOI18N
        IP_ADD_PAYLOAD.setText("Add");
        IP_ADD_PAYLOAD.setEnabled(false);
        IP_ADD_PAYLOAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IP_ADD_PAYLOADActionPerformed(evt);
            }
        });
        getContentPane().add(IP_ADD_PAYLOAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ipECNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipECNActionPerformed
        condition c = new condition();
        condition.jLabelFilter.setText("((ip[1] << 6) >> 6)");
        
        c.setVisible(true);
        c.ip = this;
        c.t = "IP";
        dispose();
    }//GEN-LAST:event_ipECNActionPerformed

    private void ipLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipLengthActionPerformed
        condition c = new condition();
        condition.jLabelFilter.setText("ip[2:2]");
        
        c.setVisible(true);
        c.ip = this;
        c.t = "IP";
        dispose();
    }//GEN-LAST:event_ipLengthActionPerformed

    private void ipFlagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipFlagsActionPerformed
        condition c = new condition();
        condition.jLabelFilter.setText("(ip[6] >> 5)");
        
        c.setVisible(true);
        c.ip = this;
        c.t = "IP";
        dispose();
    }//GEN-LAST:event_ipFlagsActionPerformed

    private void ipFOfssetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipFOfssetActionPerformed
        condition c = new condition();
        condition.jLabelFilter.setText("((ip[6:2] << 3) >> 3)");
        
        c.setVisible(true);
        c.ip = this;
        c.t = "IP";
        dispose();
    }//GEN-LAST:event_ipFOfssetActionPerformed

    private void ipHeaderCheckSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipHeaderCheckSumActionPerformed

        condition c = new condition();
        condition.jLabelFilter.setText("ip[10:2]");
        
        c.setVisible(true);
        c.ip = this;
        c.t = "IP";
        dispose();
    }//GEN-LAST:event_ipHeaderCheckSumActionPerformed

    private void ipVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipVersionActionPerformed

        condition c = new condition();
        condition.jLabelFilter.setText("(ip[0] >> 4)");
        
        c.setVisible(true);
        c.ip = this;
        c.numberBits = 4;
        c.t = "IP";
        dispose();
    }//GEN-LAST:event_ipVersionActionPerformed

    private void ipIHLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipIHLActionPerformed

        condition c = new condition();
        condition.jLabelFilter.setText("((ip[0] >> 1) & 0x07)");
        
        c.setVisible(true);
        c.ip = this;
        c.t = "IP";
        c.numberBits = 4;
        dispose();
    }//GEN-LAST:event_ipIHLActionPerformed

    private void ipDSCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipDSCPActionPerformed

        condition c = new condition();
        condition.jLabelFilter.setText("(ip[1] >> 2)");
        
        c.setVisible(true);
        c.ip = this;
        c.t = "IP";
        c.numberBits = 6;
        dispose();
    }//GEN-LAST:event_ipDSCPActionPerformed

    private void ipIdentificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipIdentificationActionPerformed
        
        condition c = new condition();
        condition.jLabelFilter.setText("ip[4:2]");
        
        c.setVisible(true);
        c.ip = this;
        c.numberBits = 16;
        c.t = "IP";
        dispose();
    }//GEN-LAST:event_ipIdentificationActionPerformed

    private void ipTTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipTTLActionPerformed

        condition c = new condition();
        condition.jLabelFilter.setText("ip[8]");
        
        c.setVisible(true);
        c.ip = this;
        c.numberBits = 8;
        c.t = "IP";
        dispose();
    }//GEN-LAST:event_ipTTLActionPerformed

    private void ipProtocolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipProtocolActionPerformed

        condition c = new condition();
        condition.jLabelFilter.setText("ip[9]");
        
        c.setVisible(true);
        c.ip = this;
        c.t = "IP";
        c.numberBits = 8;
        dispose();
    }//GEN-LAST:event_ipProtocolActionPerformed

    private void ipSourceIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipSourceIPActionPerformed

        condition c = new condition();
        condition.jLabelFilter.setText("ip[12:4]");

        c.setVisible(true);
        c.ip = this;
        c.numberBits = 16;
        c.t = "IP";
        dispose();
    }//GEN-LAST:event_ipSourceIPActionPerformed

    private void ipDestIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipDestIPActionPerformed

        condition c = new condition();
        condition.jLabelFilter.setText("ip[16:4]");
        c.setVisible(true);
        c.ip = this;
        c.t = "IP";
        c.numberBits = 16;
        dispose();
    }//GEN-LAST:event_ipDestIPActionPerformed

    private void ipSeeFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipSeeFilterActionPerformed
        SeeFilter obj = new SeeFilter();
        obj.setVisible(true);
        dispose();
        obj.ret = "IP";
        SeeFilter.jTextArea1.setText(rules.getRules());
    }//GEN-LAST:event_ipSeeFilterActionPerformed

    private void IpBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpBackActionPerformed
        SelectTypeFilter obj = new SelectTypeFilter();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_IpBackActionPerformed

    private void IP_MIN_VALUEFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IP_MIN_VALUEFocusLost
       String text = IP_MIN_VALUE.getText();
       
       try{
        int number = Integer.parseInt(text);
        if ( number >= 20 && (number % 4 == 0) && number <= 65532 ){
            IP_MIN_VALUE.setText(text);
            IP_MIN_OCTET.setText(Long.toString(number * 8));
        }else{ 
           JOptionPane.showMessageDialog(null, "Octect range is not correct\n Must be between 20 and 8188", "ERROR", JOptionPane.ERROR_MESSAGE);
           IP_MIN_VALUE.setText(Integer.toString(Integer.parseInt(IP_MIN_OCTET.getText()) / 8 ));
        }
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Options & Payload length is inconsistent\n", "ERROR", JOptionPane.ERROR_MESSAGE);
           IP_MIN_VALUE.setText( Integer.toString(Integer.parseInt(IP_MIN_OCTET.getText()) / 8) );
       } 
    }//GEN-LAST:event_IP_MIN_VALUEFocusLost

    private void IP_FIRST_OCTETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IP_FIRST_OCTETActionPerformed
        if(IP_FIRST_OCTET.isSelected())
            mask |= 0b1000;
        else mask ^= 0b1000;
        checkPayloadButton();
    }//GEN-LAST:event_IP_FIRST_OCTETActionPerformed

    private void IP_SECOND_OCTETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IP_SECOND_OCTETActionPerformed
        if(IP_SECOND_OCTET.isSelected())
            mask |= 0b0100;
        else mask ^= 0b0100;
        checkPayloadButton();
    }//GEN-LAST:event_IP_SECOND_OCTETActionPerformed

    private void IP_THIRD_OCTETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IP_THIRD_OCTETActionPerformed
        if(IP_THIRD_OCTET.isSelected())
            mask |= 0b0010;
        else mask ^= 0b0010;
        checkPayloadButton();
    }//GEN-LAST:event_IP_THIRD_OCTETActionPerformed

    private void IP_FOURTH_OCTETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IP_FOURTH_OCTETActionPerformed
        if(IP_FOURTH_OCTET.isSelected()){
            mask |= 0b0001;
            if(mask == 0b1101){
                IP_THIRD_OCTET.setSelected(true);
                mask |= 0b0010;
            }
        }else{ 
            mask ^= 0b0001;
            if(mask == 0b1110){
                IP_THIRD_OCTET.setSelected(false);
                mask ^= 0b0010;
            }
        }
        checkPayloadButton();
    }//GEN-LAST:event_IP_FOURTH_OCTETActionPerformed

    private void IP_ADD_PAYLOADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IP_ADD_PAYLOADActionPerformed
        JOptionPane.showMessageDialog(null,"Only exists if Header Length > 5","Information", JOptionPane.INFORMATION_MESSAGE);
        int initOctec = Integer.parseInt(IP_MIN_VALUE.getText());
        StringBuilder rule = new StringBuilder("ip[");
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
        IP_FIRST_OCTET.setSelected(false);
        IP_SECOND_OCTET.setSelected(false);
        IP_THIRD_OCTET.setSelected(false);
        IP_FOURTH_OCTET.setSelected(false);
        IP_ADD_PAYLOAD.setEnabled(false);
        mask = 0b0000;
        
        condition c = new condition();
        condition.jLabelFilter.setText(rule.toString());
        c.setVisible(true);
        c.ip = this;
        c.t = "IP";
        c.numberBits = numBits;
        dispose();
    }//GEN-LAST:event_IP_ADD_PAYLOADActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JButton IP_ADD_PAYLOAD;
    private javax.swing.JToggleButton IP_FIRST_OCTET;
    private javax.swing.JToggleButton IP_FOURTH_OCTET;
    private javax.swing.JTextField IP_MIN_OCTET;
    private javax.swing.JFormattedTextField IP_MIN_VALUE;
    private javax.swing.JToggleButton IP_SECOND_OCTET;
    private javax.swing.JToggleButton IP_THIRD_OCTET;
    private javax.swing.JButton IpBack;
    private javax.swing.JButton ipDSCP;
    private javax.swing.JButton ipDestIP;
    private javax.swing.JButton ipECN;
    private javax.swing.JButton ipFOfsset;
    private javax.swing.JButton ipFlags;
    private javax.swing.JButton ipHeaderCheckSum;
    private javax.swing.JButton ipIHL;
    private javax.swing.JButton ipIdentification;
    private javax.swing.JButton ipLength;
    private javax.swing.JButton ipProtocol;
    private javax.swing.JButton ipSeeFilter;
    private javax.swing.JButton ipSourceIP;
    private javax.swing.JButton ipTTL;
    private javax.swing.JButton ipVersion;
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
