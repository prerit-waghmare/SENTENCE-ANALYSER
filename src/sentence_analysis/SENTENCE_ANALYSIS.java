/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentence_analysis;

/**
 *
 * @author PRERIT WAGHMARE
 */
public class SENTENCE_ANALYSIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        class_for_recoginization ee=new class_for_recoginization();
        
       
     // System.out.println(ee.sen_type);
      ee.input();//take input
      ee.check_punctuation();
      ee.check_tenses();
      
        if(ee.sen_type=="null")
        {
           System.err.println("error");
        }
        else{   
            System.out.println(ee.sen_type);
        }
        
    }
    
}
