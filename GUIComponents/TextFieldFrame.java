package GUIComponents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldFrame extends JFrame{
  JTextField textField1=new JTextField(12), textField2=new JTextField("enter text here"), textField3=new JTextField("uneditable text field", 20);
  JPasswordField password=new JPasswordField("Hidden text");

  private class textfieldhandler implements ActionListener{
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==textField1)
      {
        JOptionPane.showMessageDialog(null,textField1.getText());
      }
      else if(e.getSource()==textField2)
      {
        JOptionPane.showMessageDialog(null,textField2.getText());
      }
      else if(e.getSource()==textField3)
      {
        JOptionPane.showMessageDialog(null,textField3.getText());
      }
      else if(e.getSource()==password)
      {
        JOptionPane.showMessageDialog(null,new String(password.getPassword()));
      }
      

    }

  }
  public TextFieldFrame()
  {
    super("Testing JTextField and JPasswordField");
    setLayout(new FlowLayout());
    add(textField1);
    add(textField2);
    add(textField3);
    add(password);
    textField3.setEditable(false);
    textField1.addActionListener(new textfieldhandler());
    textField2.addActionListener(new textfieldhandler());
    textField3.addActionListener(new textfieldhandler());
    password.addActionListener(new textfieldhandler());
    setSize(400,400);
    setDefaultCloseOperation(3);
    setVisible(true);
  }



public static void main (String[]args)
{
 TextFieldFrame window=new TextFieldFrame();

}

}



