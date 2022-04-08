/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.instructions;

import backend.instructions.checkmod;
import frontend.FrontEnd;
import java.awt.Color;

/**
 *
 * @author Nikhil
 */
public class ADD implements InsInterface4
{

    //static int[] binaryconvert = null;
    static int no, no2, no3, chck;
    static int operand_2;

    /**
     *
     * @param ins
     * @param token2
     * @param token3
     * @param token4
     */
    @Override
    public void execute(String ins, String token2, String token3, String token4)
      {
        no = backend.Register.convertRegister(token2);
        no2 = backend.Register.convertRegister(token3);
        int modified = checkmod.modify(ins, token4);
        if (no > -1)
        {
           
            if(no2>-1)
            {
            backend.StepRun.callbbeq = false;
            backend.Register.r[no].b = backend.Register.r[no2].b + modified;

             } 
           else 
          {
            FrontEnd.appendToPane(FrontEnd.statuswindow,"ERROR(" + backend.ScanFile.current_line + "): Invalid Ist Source Register For ADD Instruction  \n",Color.RED);

          }   
           
        

      }
         else 
          {
            FrontEnd.appendToPane(FrontEnd.statuswindow,"ERROR(" + backend.ScanFile.current_line + "): Invalid Destination Register For ADD Instruction  \n",Color.RED);

          }
        
      }
}
