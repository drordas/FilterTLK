/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.filter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static es.uvigo.esei.filter.SeeFilter.jTextArea1;
import java.awt.HeadlessException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class SeeFilter extends javax.swing.JFrame {

    /**
     * Creates new form See
     */
    public SeeFilter() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Filter rules");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ipExportFile = new javax.swing.JButton();
        ipAddAnotherFilter = new javax.swing.JButton();
        IpBack = new javax.swing.JButton();
        FILTER_TOTAL = new javax.swing.JLabel();
        FILTER_IP = new javax.swing.JLabel();
        Footer = new javax.swing.JPanel();

        jLabel3.setText("Ip Rules:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Body.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 600, 290));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Summary");
        Body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 140, -1));

        jLabel5.setText("TCP Rules:");
        Body.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jLabel6.setText("UDP Rules:");
        Body.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        jLabel2.setText("ICMP Rules:");
        Body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, 18));

        jLabel7.setText("IP Rules:");
        Body.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        ipExportFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uvigo/esei/images/export.png"))); // NOI18N
        ipExportFile.setText("Export File");
        ipExportFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipExportFileActionPerformed(evt);
            }
        });
        Body.add(ipExportFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, -1));

        ipAddAnotherFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uvigo/esei/images/add.png"))); // NOI18N
        ipAddAnotherFilter.setText("Add Another Filter");
        ipAddAnotherFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipAddAnotherFilterActionPerformed(evt);
            }
        });
        Body.add(ipAddAnotherFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, -1, -1));

        IpBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/uvigo/esei/images/back.png"))); // NOI18N
        IpBack.setText("Back");
        IpBack.setAlignmentY(0.0F);
        IpBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpBackActionPerformed(evt);
            }
        });
        Body.add(IpBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 80, -1));
        Body.add(FILTER_TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, 18));

        FILTER_IP.setText("jLabel4");
        Body.add(FILTER_IP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        getContentPane().add(Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 862, 430));

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 445, 860, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String ret = "";
    /*Allows the return to the previous menu.*/
    private void IpBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpBackActionPerformed
        switch (ret) {
            case "IP":
                {
                    CreateIpFilter obj = new CreateIpFilter();
                    obj.setVisible(true);
                    break;
                }
            case "UDP":
                {
                    CreateUdpFilter obj = new CreateUdpFilter();
                    obj.setVisible(true);
                    break;
                }
            case "TCP":
                {
                    CreateTcpFilter obj = new CreateTcpFilter();
                    obj.setVisible(true);
                    break;
                }
            case "ICMP":
                {
                    CreateICMPFilter obj = new CreateICMPFilter();
                    obj.setVisible(true);
                    break;
                }
            default:
                {
                    JOptionPane.showMessageDialog(null,"Option not valid", "ERROR",JOptionPane.ERROR_MESSAGE);
                    break;
                }
        }
        dispose();
    }//GEN-LAST:event_IpBackActionPerformed

    /*It allows adding a new filter to those already created. Send the user to the filter selection menu.*/
    private void ipAddAnotherFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipAddAnotherFilterActionPerformed
        // TODO add your handling code here:
        SelectTypeFilter obj = new SelectTypeFilter();
        obj.text = jTextArea1.getText();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ipAddAnotherFilterActionPerformed

    /*It allows to export the filters created on a file to which the name must be inserted. 
    If the file already exists, you can overwrite or add the new filters to existing ones.*/
    private void ipExportFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipExportFileActionPerformed
        // TODO add your handling code here:
        try {
            String [] cmd = {"mkdir","-p","/tmp/created"};
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(this, "Invalid comand.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        javax.swing.JFileChooser jF1 = new javax.swing.JFileChooser("/tmp/created");
        String path;
        try{
            if(jF1.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
            path = jF1.getSelectedFile().getAbsolutePath();
            //path = "nDPI-dev/bruno/filtrosCreados";
                String rules = jTextArea1.getText().substring(0,jTextArea1.getText().length()-1);
                if(new File(path).exists())
                {
                    if(JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(this,"The file exists. Do you want to replace it?","Export File",JOptionPane.YES_NO_OPTION)){
                        File file = new File(path);
                        BufferedWriter bw;

                        bw = new BufferedWriter(new FileWriter(file));
                        jTextArea1.write(bw);
                        bw.close();
                    }else{
                        File file = new File(path);
                        try (FileWriter fw = new FileWriter(file.getAbsoluteFile(), true)) {
                            jTextArea1.setText("\n"+jTextArea1.getText());
                            jTextArea1.write(fw);
                        }
                    }
                }else{
                    File file = new File(path);
                    BufferedWriter bw;
                    
                    bw = new BufferedWriter(new FileWriter(file));
                    jTextArea1.write(bw);
                    bw.close();
                } 
            }
        }catch (HeadlessException | IOException ex){
            System.out.println(ex.getMessage());
        }finally{
            SelectTypeFilter obj = new SelectTypeFilter();
            obj.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ipExportFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JLabel FILTER_IP;
    private javax.swing.JLabel FILTER_TOTAL;
    private javax.swing.JPanel Footer;
    private javax.swing.JButton IpBack;
    private javax.swing.JButton ipAddAnotherFilter;
    private javax.swing.JButton ipExportFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
