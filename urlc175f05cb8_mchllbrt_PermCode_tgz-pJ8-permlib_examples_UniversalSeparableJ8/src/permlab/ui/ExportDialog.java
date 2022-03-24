package permlab.ui;

import permlab.utilities.ExportType;
import javax.swing.JRadioButton;
import permlab.utilities.ExportInterface;

/**
 * Represents an export dialogue box to give options for outputting the
 * displayed element in various formats.
 * 
 * @author M Belton
 */
public class ExportDialog extends javax.swing.JDialog {

    private ExportInterface e = null;
    public static boolean saveAsFile = false;
    private static ExportInterface lastSelectedFromat = null;

    /**
     * Creates new ExportDialog.
     * 
     * @param parent the frame that has called this box
     * @param modal sets the modality of the box
     */
    public ExportDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
    }

    /**
     * Returns the export interface selected
     * 
     * @return the selected export interface
     */
    public ExportInterface getExportInterface() {
        return e;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ExportType[] options = ExportType.values();
        formatOptions = new javax.swing.JComboBox(options);
        jLabel2 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        fileRadioButton = new javax.swing.JRadioButton();
        textRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Export");
        setBounds(new java.awt.Rectangle(0, 22, 183, 163));

        jLabel1.setText("Choose your export format:");

        formatOptions.setModel(new javax.swing.DefaultComboBoxModel(options));
        if (lastSelectedFromat != null) {
            formatOptions.setSelectedItem(lastSelectedFromat);
        } else {
            formatOptions.setSelectedItem(options[0]);
        }
        updateExportLocations();
        formatOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatOptionsActionPerformed(evt);
            }
        });

        jLabel2.setText("Export to...");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        fileRadioButton.setText("File");
        fileRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileRadioButtonActionPerformed(evt);
            }
        });

        textRadioButton.setText("Text window");
        textRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRadioButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(jLabel2))
                .addContainerGap(112, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(cancelButton)
                                .add(18, 18, 18)
                                .add(okButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(fileRadioButton)
                                .add(formatOptions, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 134, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(textRadioButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 134, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formatOptions, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(fileRadioButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(textRadioButton)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cancelButton)
                    .add(okButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Sets the selected export type. This also saves the selected type so it is
     * remembered as the first choice the next time the user exports.
     * 
     * @param evt the event of the ok button being pressed
     */
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        e = (ExportType) formatOptions.getSelectedItem();
        saveAsFile = !textRadioButton.isSelected();
        //saveAsFile = (boolean) "file".equals((String) exportLocations.getSelectedItem());
        lastSelectedFromat = e;
        this.setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    /**
     * Manages which options are available.
     */
    private void updateExportLocations() {
        if ((ExportType) formatOptions.getSelectedItem() == ExportType.PSTricks
                || (ExportType) formatOptions.getSelectedItem() == ExportType.TikZ) {
            selectButton(textRadioButton);
            textRadioButton.setEnabled(true);
        } else {
            selectButton(fileRadioButton);
            textRadioButton.setEnabled(false);
        }
    }
    
    /**
     * Toggles options based on radio button selection.
     * 
     * @param button the button to consider
     */
    private void selectButton(JRadioButton button) {
        button.setSelected(true);
        if (button == fileRadioButton) {
            textRadioButton.setSelected(false);
        } else {
            fileRadioButton.setSelected(false);
        }
    }
    
    /**
     * Manages which formats are available.
     * 
     * @param evt responds to formats options being changed
     */
    private void formatOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatOptionsActionPerformed
        updateExportLocations();
    }//GEN-LAST:event_formatOptionsActionPerformed

    /**
     * Stops the export.
     * 
     * @param evt responds to cancelling the export.
     */
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        e = null;
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Sets options for saving as a file.
     * 
     * @param evt responds to file radio button being selected
     */
    private void fileRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileRadioButtonActionPerformed
        selectButton(fileRadioButton);
    }//GEN-LAST:event_fileRadioButtonActionPerformed

    /**
     * Sets options for saving as a text frame.
     * 
     * @param evt responds to text radio button being selected
     */
    private void textRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRadioButtonActionPerformed
        selectButton(textRadioButton);
    }//GEN-LAST:event_textRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ExportDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExportDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExportDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExportDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ExportDialog dialog = new ExportDialog(new javax.swing.JFrame(), true);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButton fileRadioButton;
    private javax.swing.JComboBox formatOptions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton okButton;
    private javax.swing.JRadioButton textRadioButton;
    // End of variables declaration//GEN-END:variables
}