/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author CGM-C
 */
public class TextCompression extends javax.swing.JFrame {

    /**
     * Creates new form TextCompression
     */
    public TextCompression() {
        initComponents();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String text=jTextField1.getText();
        String res="";
        int count=1,flag;
        for(int i=0;i<text.length();i++)
        {
            flag=1;
            if(!(i==text.length()-1))
            {
                if(text.charAt(i)==text.charAt(i+1))
                {
                    count++;
                    flag=0;
                }
            }
            if(flag==1)
            {
                res=res+text.charAt(i)+""+count;
                count=1;
            }
        }
        jLabel1.setText(res);
    
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}
