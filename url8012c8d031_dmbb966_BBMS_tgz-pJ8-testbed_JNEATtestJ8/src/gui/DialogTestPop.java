/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

import utilities.FIO;
import bbms.GlobalFuncs;
import java.nio.file.Files;
import unit.FitnessTypeEnum;
import unit.JNEATIntegration;

/**
 *
 * @author Brian
 */
public class DialogTestPop extends javax.swing.JDialog {
    
    private boolean overwriteDataFiles = true;

    /**
     * Creates new form DialogNewPop
     */
    public DialogTestPop(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPasswordField1 = new javax.swing.JPasswordField();
        NumScouts_Field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LoadPopDir = new javax.swing.JTextField();
        Load_Button = new javax.swing.JButton();
        DetailedOutputFileField = new javax.swing.JTextField();
        SummaryOutputFileField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RunsPerTestField = new javax.swing.JTextField();
        Warning_Label = new javax.swing.JLabel();
        OverwriteCheckbox = new javax.swing.JCheckBox();
        PauseEpochCheckbox = new javax.swing.JCheckBox();
        PauseIterCheckbox = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        PrefixOutputField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ShareSpotCheckbox = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        NetworkThreshold = new javax.swing.JTextField();
        ForceConcealment = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        VisibilityField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        EpochInterval = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Load Scenario");

        NumScouts_Field.setColumns(3);
        NumScouts_Field.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        NumScouts_Field.setText("5");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Num Scouts");

        Load_Button.setText("Load");
        Load_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Load_ButtonMouseClicked(evt);
            }
        });

        DetailedOutputFileField.setText("resultDetails.txt");

        SummaryOutputFileField.setText("resultSummary.txt");

        jLabel7.setText("Detailed Output");

        jLabel8.setText("Summary Output");

        jLabel11.setText("Runs per Test Case");

        RunsPerTestField.setText("10");

        Warning_Label.setText(" ");

        OverwriteCheckbox.setSelected(true);
        OverwriteCheckbox.setText("Overwrite Files");
        OverwriteCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OverwriteCheckboxItemStateChanged(evt);
            }
        });

        PauseEpochCheckbox.setText("Pause at Epoch");
        PauseEpochCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PauseEpochCheckboxItemStateChanged(evt);
            }
        });

        PauseIterCheckbox.setText("Pause at Iter");
        PauseIterCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PauseIterCheckboxItemStateChanged(evt);
            }
        });

        jLabel13.setText("Output Dir");

        PrefixOutputField.setText(GlobalFuncs.dirPrefix);

        jLabel14.setText("Target Population Directory");

        ShareSpotCheckbox.setText("Shared Spotting?");
        ShareSpotCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ShareSpotCheckboxItemStateChanged(evt);
            }
        });

        jLabel12.setText("Network Threshold");

        NetworkThreshold.setText("0.75");

        ForceConcealment.setSelected(true);
        ForceConcealment.setText("Force Scout Concealment");
        ForceConcealment.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ForceConcealmentItemStateChanged(evt);
            }
        });

        jLabel15.setText("Visibility");

        VisibilityField.setText("5");
        VisibilityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisibilityFieldActionPerformed(evt);
            }
        });

        jLabel16.setText("EpochInterval");

        EpochInterval.setText("5");
        EpochInterval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EpochIntervalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumScouts_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PauseIterCheckbox)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PauseEpochCheckbox)
                            .addComponent(RunsPerTestField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoadPopDir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Load_Button))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VisibilityField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(NetworkThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EpochInterval, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SummaryOutputFileField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PrefixOutputField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DetailedOutputFileField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OverwriteCheckbox))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Warning_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShareSpotCheckbox)
                            .addComponent(ForceConcealment))
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumScouts_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DetailedOutputFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(OverwriteCheckbox)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SummaryOutputFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(PrefixOutputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShareSpotCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Warning_Label)
                            .addComponent(ForceConcealment))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PauseIterCheckbox)
                            .addComponent(PauseEpochCheckbox))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(RunsPerTestField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(EpochInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(VisibilityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(NetworkThreshold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoadPopDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Load_Button))
                        .addGap(17, 17, 17))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void ValidateGlobalInputs() {
    	int numScouts = Integer.parseInt(NumScouts_Field.getText());
        int numRunsperTest = Integer.parseInt(RunsPerTestField.getText());
        int setVisibility = Integer.parseInt(VisibilityField.getText());
        double netThreshold = Double.parseDouble(NetworkThreshold.getText());
        int epochInt = Integer.parseInt(EpochInterval.getText());
        
        if (epochInt < 0) {
            GUI_NB.GCO("ERROR!  Epoch interval out of range.");
            return;
        }
        if (netThreshold < 0 || netThreshold > 1) {
            GUI_NB.GCO("ERROR!  Network threshold is out of range.");
            return;
        }
        
        if (setVisibility < 1) {
            GUI_NB.GCO("ERROR!  Visibility too low.");
            return;
        }
        
        if (numScouts < 1) {
            GUI_NB.GCO("ERROR! Improper number of scouts.");
            return;
        }
        
        if (numRunsperTest < 1) {
            GUI_NB.GCO("ERROR!  Improper number of runs per test case.");
            return;
        }
        
       
        GlobalFuncs.epochInterval = epochInt;
        GlobalFuncs.inputPrefix = LoadPopDir.getText();        
        GlobalFuncs.networkResultThreshold = netThreshold;
        
        GlobalFuncs.outputPrefix = PrefixOutputField.getText();
        FIO.newDirectory("src/saves/" + GlobalFuncs.outputPrefix);
        
      

                    	
    	File dOut = FIO.newFile("src/saves/" + GlobalFuncs.outputPrefix + "/" + DetailedOutputFileField.getText());
    	File sOut = FIO.newFile("src/saves/" + GlobalFuncs.outputPrefix + "/" + SummaryOutputFileField.getText());
        File iterOut = FIO.newFile("src/saves/" + GlobalFuncs.outputPrefix + "/" + "detailedIterations.txt");
    	
    	GlobalFuncs.detailedOutput = dOut.toPath();
    	GlobalFuncs.summaryOutput = sOut.toPath();
        GlobalFuncs.fullIterOutput = iterOut.toPath();
        
        if (overwriteDataFiles) {
            FIO.overwriteFile(GlobalFuncs.detailedOutput, "");
            FIO.overwriteFile(GlobalFuncs.summaryOutput, unit.JNEATIntegration.PrintTestSummaryKey());
            FIO.overwriteFile(GlobalFuncs.fullIterOutput, unit.JNEATIntegration.PrintDetailedIterKey());
            GUI_NB.GCO("Output files overwritten");
        }
        
        
        GlobalFuncs.visibility = setVisibility;
        
        StringBuffer buf = new StringBuffer("");
        buf.append("Vis: " + setVisibility + ", ");        
        buf.append("Population: " + GlobalFuncs.inputPrefix + ", ");
        buf.append("Fitness: " + GlobalFuncs.defaultFitType.toString() + ", ");
        buf.append("Death: " + GlobalFuncs.deathPenalty + ", ");
        buf.append("Net Thresh: " + GlobalFuncs.networkResultThreshold + ", ");
        buf.append("Force conceal: " + GlobalFuncs.forceTreePlacement + ", ");
        
                       
        FIO.appendFile(GlobalFuncs.summaryOutput, buf.toString());
        
        JNEATIntegration.PopTestFromDir(numScouts, numRunsperTest);
        dispose();    	
    }
    
    private void Load_ButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
        bbms.GlobalFuncs.tempStr = LoadPopDir.getText();
        ValidateGlobalInputs();
            
        
    }                                        

    private void OverwriteCheckboxItemStateChanged(java.awt.event.ItemEvent evt) {                                                   
        if (evt.getStateChange() == 1) overwriteDataFiles = true;
        else overwriteDataFiles = false;
    }                                                  

    private void PauseEpochCheckboxItemStateChanged(java.awt.event.ItemEvent evt) {                                                    
        if (evt.getStateChange() == 1) GlobalFuncs.pauseNewEpoch = true;
        else GlobalFuncs.pauseNewEpoch = false;
    }                                                   

    private void PauseIterCheckboxItemStateChanged(java.awt.event.ItemEvent evt) {                                                   
        if (evt.getStateChange() == 1) GlobalFuncs.pauseNewIter = true;
        else GlobalFuncs.pauseNewIter = false;
    }                                                  

    private void ShareSpotCheckboxItemStateChanged(java.awt.event.ItemEvent evt) {                                                   
        if (evt.getStateChange() == 1) {
            GlobalFuncs.defaultFitType = FitnessTypeEnum.SHARED_SPOTTING;
            GlobalFuncs.calcShared = true;
        }
        else {
            GlobalFuncs.defaultFitType = FitnessTypeEnum.SIMPLE_GREEDY;
            GlobalFuncs.calcShared = false;
        }
    }                                                  

    private void ForceConcealmentItemStateChanged(java.awt.event.ItemEvent evt) {                                                  
        if (evt.getStateChange() == 1) GlobalFuncs.forceTreePlacement = true;
        else GlobalFuncs.forceTreePlacement = false;
    }                                                 

    private void VisibilityFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void EpochIntervalActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogTestPop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogTestPop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogTestPop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogTestPop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogTestPop dialog = new DialogTestPop(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField DetailedOutputFileField;
    private javax.swing.JTextField EpochInterval;
    private javax.swing.JCheckBox ForceConcealment;
    private javax.swing.JTextField LoadPopDir;
    private javax.swing.JButton Load_Button;
    private javax.swing.JTextField NetworkThreshold;
    private javax.swing.JTextField NumScouts_Field;
    private javax.swing.JCheckBox OverwriteCheckbox;
    private javax.swing.JCheckBox PauseEpochCheckbox;
    private javax.swing.JCheckBox PauseIterCheckbox;
    private javax.swing.JTextField PrefixOutputField;
    private javax.swing.JTextField RunsPerTestField;
    private javax.swing.JCheckBox ShareSpotCheckbox;
    private javax.swing.JTextField SummaryOutputFileField;
    private javax.swing.JTextField VisibilityField;
    private javax.swing.JLabel Warning_Label;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration                   
}
