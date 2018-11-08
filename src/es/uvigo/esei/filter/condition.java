/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.filter;

import java.awt.Font;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static es.uvigo.esei.filter.condition.jLabelFilter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author bruno
 */
public class condition extends javax.swing.JFrame {

    /**
     * Creates new form cond
     */
    
    int numberBits;
    enum options {NORMAL, ICMP_TYPE, ICMP_CODE};
    options type;
    CreateUdpFilter udp = new CreateUdpFilter();
    CreateIpFilter ip = new CreateIpFilter();
    CreateTcpFilter tcp = new CreateTcpFilter();
    CreateICMPFilter icmp = new CreateICMPFilter();
    
    public condition() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Select Condition");
        MenuFrame mf = new MenuFrame();
        this.setIconImage(mf.getIconImage());
        numberBits = 0;
        this.type = options.ICMP_TYPE;
        this.TYPE_PANEL.setVisible(false);
    }
    
    public condition(options type) {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Select Condition");
        MenuFrame mf = new MenuFrame();
        this.setIconImage(mf.getIconImage());
        numberBits = 0;
        this.type = type;
        
        switch(type){
            case ICMP_TYPE:
                this.ICMP_CODE_OPTIONS.setVisible(false);
                this.REST_PANEL.setVisible(false);
                this.TYPE_PANEL.setVisible(true);
                this.CONDITION_EDITOR.setText("0x00");
                break;
            case ICMP_CODE:
                this.ICMP_CODE_OPTIONS.setVisible(true);
                this.REST_PANEL.setVisible(false);
                this.TYPE_PANEL.setVisible(true);
                this.CONDITION_EDITOR.setText("0x00");
                break;
            default: 
                this.REST_PANEL.setVisible(true);
                this.TYPE_PANEL.setVisible(false);
                break;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        valueBG = new javax.swing.ButtonGroup();
        Header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxCondition = new javax.swing.JComboBox<>();
        jLabelFilter = new javax.swing.JLabel();
        TYPE_PANEL = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ICMP_CODE_OPTIONS = new javax.swing.JComboBox<>();
        ICMP_TYPE_OPTIONS = new javax.swing.JComboBox<>();
        Footer = new javax.swing.JPanel();
        ipOk = new javax.swing.JButton();
        IpBack = new javax.swing.JButton();
        REST_PANEL = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jRadioHEX = new javax.swing.JRadioButton();
        jRadioASCII = new javax.swing.JRadioButton();
        jRadioDec = new javax.swing.JRadioButton();
        TEXT_EDITOR = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CONDITION_EDITOR = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("UnJamoBatang", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enter the conditions that the filter must meet.");
        Header.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 862, 33));

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 862, 40));

        Body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new Font("Tahoma", Font.BOLD,14));
        jLabel1.setText("Pattern rule:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel2.setFont(new Font("Tahoma", Font.BOLD,14));
        jLabel2.setText("Condition:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, -1, -1));

        jComboBoxCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==", ">", "<" }));
        jPanel3.add(jComboBoxCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 78, 68, -1));

        jLabelFilter.setFont(new java.awt.Font("Ubuntu Light", 3, 15)); // NOI18N
        jLabelFilter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabelFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 40, 262, 20));

        Body.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 650, 120));

        getContentPane().add(Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 862, 150));

        TYPE_PANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new Font("Tahoma", Font.BOLD,14));
        jLabel5.setText("Value:");
        TYPE_PANEL.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ICMP_CODE_OPTIONS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Code" }));
        ICMP_CODE_OPTIONS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ICMP_CODE_OPTIONS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICMP_CODE_OPTIONSActionPerformed(evt);
            }
        });
        TYPE_PANEL.add(ICMP_CODE_OPTIONS, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 310, 21));

        ICMP_TYPE_OPTIONS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Echo Reply", "Destination Unreachable", "Source Quench", "Redirect", "Alternate Host Address", "Echo", "Router Advertisement", "Router Solicitation", "Time Exceeded", "Parameter Problem", "Timestamp", "Timestamp Reply", "Information Request", "Information Reply", "Address Mask Request", "Address Mask Reply", "Traceroute", "Datagram Conversion Error", "Mobile Host Redirect", "IPv6 Where-Are-You", "IPv6 I-Am-Here", "Mobile Registration Request", "Mobile Registration Reply", "Domain Name Request", "Domain Name Reply", "SKIP", "Photuris", "Extended Echo Request", "Extended Echo Reply", "RFC3692-style Experiment 1", "RFC3692-style Experiment 2" }));
        ICMP_TYPE_OPTIONS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ICMP_TYPE_OPTIONS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICMP_TYPE_OPTIONSActionPerformed(evt);
            }
        });
        TYPE_PANEL.add(ICMP_TYPE_OPTIONS, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 310, 21));

        getContentPane().add(TYPE_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 650, 60));

        ipOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uvigo/esei/images/ok.png"))); // NOI18N
        ipOk.setText("OK");
        ipOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipOkActionPerformed(evt);
            }
        });

        IpBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uvigo/esei/images/back.png"))); // NOI18N
        IpBack.setText("Back");
        IpBack.setAlignmentY(0.0F);
        IpBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterLayout.createSequentialGroup()
                .addContainerGap(685, Short.MAX_VALUE)
                .addComponent(ipOk)
                .addGap(18, 18, 18)
                .addComponent(IpBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipOk)
                    .addComponent(IpBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 445, 860, 50));

        REST_PANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new Font("Tahoma", Font.BOLD,14));
        jLabel3.setText("Value:");
        REST_PANEL.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        valueBG.add(jRadioHEX);
        jRadioHEX.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jRadioHEX.setSelected(true);
        jRadioHEX.setText("HEX");
        jRadioHEX.setName(""); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jRadioHEX, org.jdesktop.beansbinding.ELProperty.create("HEX"), jRadioHEX, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        jRadioHEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioHEXActionPerformed(evt);
            }
        });
        REST_PANEL.add(jRadioHEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, 30));

        valueBG.add(jRadioASCII);
        jRadioASCII.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jRadioASCII.setText("ASCII");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jRadioASCII, org.jdesktop.beansbinding.ELProperty.create("ASCII"), jRadioASCII, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        jRadioASCII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioASCIIActionPerformed(evt);
            }
        });
        REST_PANEL.add(jRadioASCII, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        valueBG.add(jRadioDec);
        jRadioDec.setFont(new java.awt.Font("Ubuntu Light", 1, 15)); // NOI18N
        jRadioDec.setText("DEC");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jRadioDec, org.jdesktop.beansbinding.ELProperty.create("DEC"), jRadioDec, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        jRadioDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioDecActionPerformed(evt);
            }
        });
        REST_PANEL.add(jRadioDec, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        TEXT_EDITOR.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            TEXT_EDITOR.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("HHHHHHHHH")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TEXT_EDITOR.setDoubleBuffered(true);
        TEXT_EDITOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TEXT_EDITORKeyReleased(evt);
            }
        });
        REST_PANEL.add(TEXT_EDITOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 35, 310, -1));

        getContentPane().add(REST_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 650, 60));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setWheelScrollingEnabled(false);

        CONDITION_EDITOR.setEditable(false);
        CONDITION_EDITOR.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CONDITION_EDITOR.setText("0x");
        CONDITION_EDITOR.setAutoscrolls(false);
        CONDITION_EDITOR.setDoubleBuffered(true);
        CONDITION_EDITOR.setDragEnabled(true);
        CONDITION_EDITOR.setFocusable(false);
        jScrollPane2.setViewportView(CONDITION_EDITOR);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 310, 21));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 650, 20));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String t = "";
    Toret rules = Toret.getInstance();

    private void ipOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipOkActionPerformed
        rules.appendRules( jLabelFilter.getText().trim() + 
                           (String)jComboBoxCondition.getSelectedItem() + 
                           CONDITION_EDITOR.getText().trim() );
        switch (t) {
            case "UDP":
                udp.setVisible(true);
                dispose();
                break;
            case "IP":
                ip.setVisible(true);
                dispose();
                break;
            case "TCP":
                tcp.setVisible(true);
                dispose();
                break;
            case "ICMP":
                icmp.setVisible(true);
                dispose();
                break;
            default:
                break; 
        }
    }//GEN-LAST:event_ipOkActionPerformed


    private void IpBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpBackActionPerformed
        switch(t){
            case "UDP": 
                udp.setVisible(true);
                break;
            case "TCP": 
                tcp.setVisible(true);
                break;
            case "IP": 
                ip.setVisible(true);
                break;
            case "ICMP":
                icmp.setVisible(true);
                dispose();
                break;
        }
        dispose();
    }//GEN-LAST:event_IpBackActionPerformed

    private void jRadioASCIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioASCIIActionPerformed
        try {
            TEXT_EDITOR.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("AAAAAAAA")));
            CONDITION_EDITOR.setText("0x");
        } catch (ParseException ex) {
            Logger.getLogger(condition.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioASCIIActionPerformed

    private void jRadioHEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioHEXActionPerformed
        try {
            TEXT_EDITOR.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("HHHHHHHH")));
            CONDITION_EDITOR.setText("0x");
        } catch (ParseException ex) {
            Logger.getLogger(condition.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioHEXActionPerformed

    private void jRadioDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioDecActionPerformed
        try {
            TEXT_EDITOR.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("########")));
            CONDITION_EDITOR.setText("0x");
        } catch (ParseException ex) {
            Logger.getLogger(condition.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioDecActionPerformed

    private void TEXT_EDITORKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TEXT_EDITORKeyReleased
        String text = TEXT_EDITOR.getText().trim();
        
        switch(valueBG.getSelection().getActionCommand()){
            case "HEX":   CONDITION_EDITOR.setText("0x"+text);
                break;
            case "ASCII": CONDITION_EDITOR.setText("0x"+ASCIItoHEX(text));
                break;
            case "DEC":   CONDITION_EDITOR.setText("0x"+DECtoHEX(text));
                break;
        }
    }//GEN-LAST:event_TEXT_EDITORKeyReleased

    private void ICMP_CODE_OPTIONSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICMP_CODE_OPTIONSActionPerformed
        CONDITION_EDITOR.setText("0x"+DECtoHEX(Integer.toString(ICMP_CODE_OPTIONS.getSelectedIndex())));
    }//GEN-LAST:event_ICMP_CODE_OPTIONSActionPerformed

    private void ICMP_TYPE_OPTIONSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICMP_TYPE_OPTIONSActionPerformed
        String cond = "";
        switch(ICMP_TYPE_OPTIONS.getSelectedIndex()){
            case 0: //Echo Reply
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                cond="0x"+DECtoHEX("0");
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("0"));
                break;
            case 1: //Destination Unreachable
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"Net Unreachable","Host Unreachable","Protocol Unreachable",
                                                                                 "Port Unreachable","Fragmentation Needed and not set", "Source Route Failed",
                                                                                 "Destination Network Unknown","Destination Host Unknown","Source Host Isolated",
                                                                                 "Communication with Dest. Network is Admin. Prohibited",
                                                                                 "Communication with Dest. Host is Admin. Prohibited", 
                                                                                 "Destination Network Unreachable","Destination Host Unreachable",
                                                                                 "Communication Admin. Prohibited", "Host Precedence Violation",
                                                                                 "Precedence cutoff in effect"}));
                cond="0x"+DECtoHEX("3");
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("3"));
                break;
            case 2: //Source Quench
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                cond= "0x"+DECtoHEX("4");
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("4"));
                break;
            case 3: //Redirect
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"Redirect Datagram for the Network",
                                                                                 "Redirect Datagram for the Host",
                                                                                 "Redirect Datagram for the Type of Service and Network",
                                                                                 "Redirect Datagram for the Type of Service and Host"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("5"));
                cond= "0x"+DECtoHEX("5");
                break;
            case 4: //Alternate Host Address
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"Alternate Address for Host"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("6"));
                cond= "0x"+DECtoHEX("6");
                break;
            case 5: //Echo
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));                
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("8"));
                cond = "0x"+DECtoHEX("8");
                break;
            case 6: //Router Advertisement
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"Normal router advertisement","Does not route common traffic"}));                
                CONDITION_EDITOR.setText("0x"+DECtoHEX("9"));
                break;
            case 7: //Router Solicitation
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No code"}));                
                CONDITION_EDITOR.setText("0x"+DECtoHEX("10"));
                break;
            case 8: //Time Exceeded
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"TTL exceeded in Transit","Fragment Reassembly Time Exceeded"}));                
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("11"));
                cond = "0x"+DECtoHEX("11");
                break;
            case 9: //Parameter Problem
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"Pointer indicates the error","Missing a Required Option","Bad Length"}));                                
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("12"));
                cond = "0x"+DECtoHEX("12");
                break;
            case 10: //Timestamp
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("13"));
                cond = "0x"+DECtoHEX("13");
                break;
            case 11://Timestamp Reply
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("14"));
                cond = "0x"+DECtoHEX("14");
                break;
            case 12://Information Request
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("15"));
                cond = "0x"+DECtoHEX("15");
                break;
            case 13://Information Reply
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("16"));
                cond = "0x"+DECtoHEX("16");
                break;
            case 14://Address Mask Request
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("17"));
                cond = "0x"+DECtoHEX("17");
                break;
            case 15://Address Mask Reply
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("18"));
                cond = "0x"+DECtoHEX("18");
                break;
            case 16://Traceroute
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("30"));
                cond = "0x"+DECtoHEX("30");
                break;
            case 17://Datagram Conversion Error
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("31"));
                cond = "0x"+DECtoHEX("31");
                break;
            case 18://Mobile Host Redirect
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("32"));
                cond = "0x"+DECtoHEX("32");
                break;
            case 19://IPv6 Where-Are-You
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("33"));
                cond = "0x"+DECtoHEX("33");
                break;
            case 20://IPv6 I-Am-Here
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("34"));
                cond = "0x"+DECtoHEX("34");
                break;
            case 21://Mobile Registration Request
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("35"));
                cond = "0x"+DECtoHEX("35");
                break;
            case 22://Mobile Registration Reply
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("36"));
                cond = "0x"+DECtoHEX("36");
                break;
            case 23://Domain Name Request
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("37"));
                cond = "0x"+DECtoHEX("37");
                break;
            case 24://Domain Name Reply
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("38"));
                cond = "0x"+DECtoHEX("38");
                break;
            case 25://SKIP
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("39"));
                cond = "0x"+DECtoHEX("39");
                break;
            case 26://Photuris
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"Bad SIP","Authentication Failed",
                                                                                 "Decompression Failed","Decryption Failed",
                                                                                 "Need Authentication","Need Authorization"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("40"));
                cond = "0x"+DECtoHEX("40");
                break;
            case 27://Extended Echo Request
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Error"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("42"));
                cond = "0x"+DECtoHEX("42");
                break;
            case 28://Extended Echo Reply
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Error","Malformed Query","No Such Interface","No Such Table Entry","Multiple Interfaces Satisfy Query"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("43"));
                cond = "0x"+DECtoHEX("43");
                break;
            case 29://RFC3692-style Experiment 1
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("253"));
                cond = "0x"+DECtoHEX("253");
                break;
            case 30://RFC3692-style Experiment 2
                ICMP_CODE_OPTIONS.setModel(new DefaultComboBoxModel(new String[]{"No Code"}));
                //CONDITION_EDITOR.setText("0x"+DECtoHEX("254"));
                cond = "0x"+DECtoHEX("254");
                break;
        }
        
        if(this.type == options.ICMP_TYPE) CONDITION_EDITOR.setText(cond);
    }//GEN-LAST:event_ICMP_TYPE_OPTIONSActionPerformed

    private String ASCIItoHEX(String ascii){
        char[] charArray = ascii.toCharArray();
        StringBuilder str = new StringBuilder();
        for(char ch: charArray)
            str.append(String.format("%H", ch));
        return str.toString();
    }
    
    private String DECtoHEX(String dec){
        if(dec.length() > 0 && !dec.equals("")){
            String number = Long.toHexString(Long.parseLong(dec)).toUpperCase();
            if(number.length() < 2) number= "0"+number;
            return number;
        }
        return "";
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JEditorPane CONDITION_EDITOR;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JComboBox<String> ICMP_CODE_OPTIONS;
    private javax.swing.JComboBox<String> ICMP_TYPE_OPTIONS;
    private javax.swing.JButton IpBack;
    private javax.swing.JPanel REST_PANEL;
    private javax.swing.JFormattedTextField TEXT_EDITOR;
    private javax.swing.JPanel TYPE_PANEL;
    private javax.swing.JButton ipOk;
    private javax.swing.JComboBox<String> jComboBoxCondition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabelFilter;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioASCII;
    private javax.swing.JRadioButton jRadioDec;
    private javax.swing.JRadioButton jRadioHEX;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup valueBG;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
