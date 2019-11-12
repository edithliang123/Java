//A converter of length, created by java GUI
import java.awt.Color; 
import java.awt.FlowLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
  
import javax.swing.JButton; 
import javax.swing.JComboBox; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JOptionPane; 
import javax.swing.JTextField; 
  
public class Convert { 
        public static void main(String[] args) { 
            JFrame frame = new JFrame(); 
            frame.setSize(700,100); 
            frame.setTitle("Conversion System"); 
            frame.getContentPane().setBackground(Color.PINK); 
            FlowLayout layout = new FlowLayout(); 
            frame.setLayout(layout); 
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     
JLabel label = new JLabel(); 
label.setText("Convert"); 
frame.add(label); 
  
JTextField text = new JTextField(8); 
frame.add(text); 
text.setEditable(true); 
  
String[] options = {"Mile", "Yard", "Foot", "Inch"}; 
JComboBox combobox = new JComboBox(options); 
frame.add(combobox); 
  
  
JLabel label2 = new JLabel(); 
label2.setText("To"); 
frame.add(label2); 
  
String[] options2 = {"Kilometer", "Meter", "Centimeter"}; 
JComboBox combobox2 = new JComboBox(options2); 
frame.add(combobox2); 
  
JButton button = new JButton("GO!"); 
frame.add(button); 
JLabel label3 = new JLabel(); 
button.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent e) { 
    if(combobox.getSelectedItem() == "Mile") { 
        if(combobox2.getSelectedItem() == "Kilometer") { 
            double num = (Integer.valueOf(text.getText()) * (1.609344)); 
            String number = String.format("%.2f", num); 
            label3.setText(number); 
            frame.add(label3); 
        } 
        if(combobox2.getSelectedItem() == "Meter") { 
            double num = (Integer.valueOf(text.getText()) * (1609.344)); 
            String number = String.format("%.2f", num); 
            label3.setText(number); 
            frame.add(label3); 
        } 
        if(combobox2.getSelectedItem() == "Centimeter") { 
            double num = (Integer.valueOf(text.getText()) * (160934.4)); 
            String number = String.format("%.2f", num); 
            label3.setText(number); 
            frame.add(label3); 
        } 
    } 
    if(combobox.getSelectedItem() == "Yard") { 
        if(combobox2.getSelectedItem() == "Kilometer") { 
            double num = (Integer.valueOf(text.getText()) * (0.0009144)); 
            String number = String.format("%.2f", num); 
            label3.setText(number); 
            frame.add(label3); 
        } 
        if(combobox2.getSelectedItem() == "Meter") { 
            double num = (Integer.valueOf(text.getText()) * (0.9144)); 
            String number = String.format("%.2f", num); 
            label3.setText(number); 
            frame.add(label3); 
        } 
        if(combobox2.getSelectedItem() == "Centimeter") { 
            double num = (Integer.valueOf(text.getText()) * (91.44)); 
            String number = String.format("%.2f", num); 
            label3.setText(number); 
            frame.add(label3); 
        } 
    } 
    if(combobox.getSelectedItem() == "Foot") { 
        if(combobox2.getSelectedItem() == "Kilometer") { 
            double num = (Integer.valueOf(text.getText()) * (0.0003048)); 
            String number = String.format("%.2f", num); 
            label3.setText(number); 
            frame.add(label3); 
        } 
        if(combobox2.getSelectedItem() == "Meter") { 
            double num = (Integer.valueOf(text.getText()) * (0.3048)); 
            String number = String.format("%.2f", num); 
            label3.setText(number); 
            frame.add(label3); 
        } 
        if(combobox2.getSelectedItem() == "Centimeter") { 
            double num = (Integer.valueOf(text.getText()) * (30.48)); 
            String number = String.format("%.2f", num); 
            label3.setText(number); 
            frame.add(label3); 
        } 
    }     
    if(combobox.getSelectedItem() == "Inch") { 
        if(combobox2.getSelectedItem() == "Kilometer") { 
            double num = (Integer.valueOf(text.getText()) * (0.0000254)); 
            String number = String.format("%.2f", num); 
            label3.setText(number); 
            frame.add(label3); 
        } 
        if(combobox2.getSelectedItem() == "Meter") { 
            double num = (Integer.valueOf(text.getText()) * (0.0254)); 
            String number = String.format("%.2f", num); 
            label3.setText(number); 
            frame.add(label3); 
        } 
        if(combobox2.getSelectedItem() == "Centimeter") { 
            double num = (Integer.valueOf(text.getText()) * (2.54)); 
            String number = String.format("%.2f", num); 
            label3.setText(number); 
            frame.add(label3); 
        } 
    } 
    frame.setVisible(true); 
    } 
}); 
frame.setVisible(true); 
} 
} 
