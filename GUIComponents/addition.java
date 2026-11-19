package GUIComponents;
import javax.swing.*;//swing GuI component declaration in package Javax.swing
import java.awt.*;
import javax.swing.event.*;

public class addition{
    public static void main (String args[])
    {
        String s1=JOptionPane.showInputDialog("Enter First Integer :");
        String s2=JOptionPane.showInputDialog("Enter Second Integer :");
         int n1 = Integer.parseInt(s1);
         int n2=Integer.parseInt(s2);
         int sum=n1+n2;
         JOptionPane.showMessageDialog(null,"The sum is "+sum,"Sum of Two Integer:",JOptionPane.INFORMATION_MESSAGE);
         /*message dialog type:
         1. ERROR_MESSAGE
         2. INFORMATION_MESSAGE
         3. WARNING_MESSAGE
        4. QUESTION_MESSAGE
        5. PLAIN_MESSAGE


         */



    }
}

