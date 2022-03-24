package permlab.ui;

import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.text.DefaultEditorKit;

/**
 * This is the GUI class that creates the main frame for the permutation
 * laboratory.
 * 
 * @author Michael Albert
 */
public class PermLab extends javax.swing.JFrame {

    public static final int MASK = Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();
    
    /**
     * Creates new form PermLab
     */
    public PermLab() {
        setLookAndFeel();
        initComponents();
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new HelpDispatcher("Front page", "PermLabHelp.html", this));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        helpLabel = new javax.swing.JLabel();
        classFrameButton = new javax.swing.JButton();
        staticPermFrameButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Permutation Laboratory (PermLab)");

        helpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helpLabel.setText("Type ? anywhere for help");

        classFrameButton.setText("Permutation classes");
        classFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classFrameButtonActionPerformed(evt);
            }
        });

        staticPermFrameButton.setText("Permutations");
        staticPermFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticPermFrameButtonActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Explore:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(staticPermFrameButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(classFrameButton))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {classFrameButton, staticPermFrameButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staticPermFrameButton)
                    .addComponent(classFrameButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Creates a new static perm frame window.
     * 
     * @param evt the permutations button being pressed
     */
    private void staticPermFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticPermFrameButtonActionPerformed
        StaticPermFrame s = new StaticPermFrame();
        s.setLocation(this.getX(), this.getY() + this.getHeight() + 10);
        s.setVisible(true);
    }//GEN-LAST:event_staticPermFrameButtonActionPerformed

    /**
     * Creates a new class enumeration frame.
     * 
     * @param evt the permutation classes button being pressed
     */
    private void classFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classFrameButtonActionPerformed
        ClassEnumerationFrame c = new ClassEnumerationFrame();
        c.setLocation(this.getX() + this.getWidth()+10, this.getY());
        c.setVisible(true);
    }//GEN-LAST:event_classFrameButtonActionPerformed

    /**
     * 
     * Generates and displays the 'front page' of the permutation laboratory
     * GUI.
     * 
     * @param args the command line arguments (not used)
     */
    public static void main(String args[]) {
        
        setLookAndFeel();
        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PermLab().setVisible(true);
            }
        });
    }
    
    /**
     * NOTE: Adds apple shortcuts for copy, paste, cut, and select all for text fields
     * and areas.
     */
    private static void setLookAndFeel() {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PermLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PermLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PermLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PermLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        // Allows apple shortcuts to be used
        InputMap im = (InputMap) UIManager.get("TextArea.focusInputMap");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_C, MASK), DefaultEditorKit.copyAction);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, MASK), DefaultEditorKit.pasteAction);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_X, MASK), DefaultEditorKit.cutAction);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_A, MASK), DefaultEditorKit.selectAllAction);
        im = (InputMap) UIManager.get("TextField.focusInputMap");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_C, MASK), DefaultEditorKit.copyAction);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, MASK), DefaultEditorKit.pasteAction);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_X, MASK), DefaultEditorKit.cutAction);
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_A, MASK), DefaultEditorKit.selectAllAction);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton classFrameButton;
    private javax.swing.JLabel helpLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton staticPermFrameButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}