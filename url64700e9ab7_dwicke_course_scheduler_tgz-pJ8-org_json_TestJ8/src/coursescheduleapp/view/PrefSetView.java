package coursescheduleapp.view;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import coursescheduleapp.model.CourseCollectionDB;
import coursescheduleapp.model.PreferenceSet;
import java.awt.Insets;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PrefSetView.java
 *
 * Created on Apr 6, 2010, 7:12:36 PM
 */


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
/**
 *
 * @author Drew
 */
public class PrefSetView extends javax.swing.JPanel {

	private PreferenceSet prefSet;
	private int numEquiv, numSelect;
	private CourseCollectionDB courseDB;
    /** Creates new form PrefSetView */
    public PrefSetView() {
        initComponents();
        
    }
    
    public void setPrefSet(PreferenceSet prefSet, int numEquiv, int numSelect, CourseCollectionDB courseDB)
    {
    	this.prefSet = prefSet;
    	this.numEquiv = numEquiv;
    	this.numSelect = numSelect;
    	this.courseDB = courseDB;
    	coursePrefView1.setCoursePref(prefSet.getCoursePref(), numEquiv, numSelect, courseDB);
    	schedPrefView1.setSchedPref(prefSet.getSchedulePref());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coursePrefView1 = new CoursePrefView();

        FormLayout thisLayout = new FormLayout(
        		"max(p;5dlu), max(p;5dlu), max(p;5dlu), max(p;5dlu)", 
        		"max(p;5dlu), max(p;5dlu), max(p;5dlu), max(p;5dlu)");
        this.setLayout(thisLayout);
        this.add(coursePrefView1, new CellConstraints(2, 1, 1, 1, CellConstraints.LEFT, CellConstraints.TOP, new Insets(0, 0, 0, 4)));
        {
        	schedPrefView1 = new SchedPrefView();
        	this.add(schedPrefView1, new CellConstraints("3, 1, 1, 1, fill, top"));
        }
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CoursePrefView coursePrefView1;
    private SchedPrefView schedPrefView1;
    // End of variables declaration//GEN-END:variables

}
