import java.awt.BorderLayout; 
import java.awt.CardLayout;  
import java.awt.Color; 
import java.awt.Dimension; 
import java.awt.event.ActionEvent;   
import java.awt.event.ActionListener; 
  
import javax.swing.Box; 
import javax.swing.BoxLayout; 
import javax.swing.JButton;   
import javax.swing.JComboBox;   
import javax.swing.JFrame;   
import javax.swing.JLabel;   
import javax.swing.JOptionPane;  
import javax.swing.JPanel;  
import javax.swing.JTextField;     
  
public class PersonalProject {   
    JFrame frame = new JFrame();   
    JButton button1 = new JButton();  
    JButton button2 = new JButton();  
    JButton button3 = new JButton();  
    JButton button4 = new JButton();  
    CardLayout c1 = new CardLayout();  
    JPanel parent = new JPanel(); 
    JPanel p = new JPanel();  
    JPanel p1 = new JPanel(); 
    JPanel p2 = new JPanel(); 
    JPanel p3 = new JPanel(); 
    JLabel order = new JLabel(); 
    JButton Continue = new JButton(); 
    JLabel Shipping = new JLabel(); 
    JLabel name = new JLabel(); 
    JTextField name2 = new JTextField(30); 
    JLabel phone = new JLabel(); 
    JTextField phone2 = new JTextField(30); 
    JLabel address = new JLabel(); 
    JTextField address2 = new JTextField(30); 
    JLabel payment = new JLabel(); 
    JLabel card = new JLabel(); 
    JTextField card2 = new JTextField(30); 
    JButton continue2 = new JButton(); 
    JLabel finish = new JLabel(); 
    JButton close = new JButton(); 
  
public PersonalProject() {  
    frame.setSize(800,500);   
    frame.setTitle("Delivery System");   
    p.setBackground(Color.pink); 
    p1.setBackground(Color.pink); 
    p2.setBackground(Color.pink); 
    p3.setBackground(Color.pink); 
    parent.setLayout(c1);   
    p.setLayout(null);  
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    parent.add(p,"p");  
    parent.add(p1,"p1"); 
    parent.add(p2,"p2"); 
    parent.add(p3,"p3"); 
    p1.setLayout(new BoxLayout(p1,BoxLayout.PAGE_AXIS)); 
    p1.add(Box.createRigidArea(new Dimension(0,10))); 
    p2.setLayout(new BoxLayout(p2,BoxLayout.PAGE_AXIS)); 
    p2.add(Box.createRigidArea(new Dimension(0,10))); 
    p3.setLayout(new BorderLayout()); 
    c1.show(parent, "p"); 
  
    JLabel item1 = new JLabel();   
    item1.setText("Select Items:");   
    item1.setBounds(100, 50,100,100);  
    p.add(item1);  
  
    String[] item = {"Fruits/Vegetables","Apple","Asparagus","Avocado","Banana",   
    "Bell pepper","Blueberry","Broccoli","Cabbage","Carrot","Celery",   
    "Cranberry","Cumcumber","Eggplant","Ginger","Grape","Leeks","Lemon",   
    "Lettuce","Lychee","Orange","Pineapple","Potato","Spanish",   
    "Strawberry","Sweet Potato","Taro","Tomato",   
    "Watermelon",};   
    JComboBox combobox = new JComboBox(item);   
    combobox.setBounds(200,88,180,30);  
    p.add(combobox);   
  
    String[] weight = {"1 lb","2 lb","3 lb","4 lb","5 lb","6 lb","7 lb", 
            "8 lb","9 lb","10 lb",};   
    JComboBox weightbox = new JComboBox(weight);   
    weightbox.setBounds(390,88,80,30);  
    p.add(weightbox);          
  
    button1.setText("Add");  
    button1.setBounds(480,88,90,30);  
    p.add(button1);  
    button1.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) { 
            p1.add(Box.createRigidArea(new Dimension(0,10))); 
            if(combobox.getSelectedItem() != "Fruits/Vegetables") { 
            JLabel list = new JLabel("1 x " + combobox.getSelectedItem() +  
                    " (" + weightbox.getSelectedItem() + ")"); 
            p1.add(list); 
            JButton remove = new JButton("delete"); 
            p1.add(remove); 
            remove.addActionListener(new ActionListener(){ 
                public void actionPerformed(ActionEvent e) { 
                p1.remove(list); 
                p1.remove(remove); 
                p1.revalidate(); 
                p1.repaint(); 
                } 
            }); 
            } 
            else { 
                JOptionPane.showMessageDialog(null, "Please select an item!", null, 
                        JOptionPane.WARNING_MESSAGE); 
                } 
        } 
    }); 
     
    String[] item2 = {"Pork/Beef/Chicken","Bacon","Boneless Pork Chops","Ground Pork",  
            "Ham","Pork Sausage Links","Beef Franks","Beef Steak Strips","Flank Steak",  
            "Flat Iron Steak","Filet Mignon","Ground Beef","Rib Eye Steak","Sirloin Steak",  
            "Stew Meat","Boneless Chicken Breast", "Chicken Drums","Chicken Strips",  
            "Chicken Wings"};   
    JComboBox combobox2 = new JComboBox(item2);   
    combobox2.setBounds(200,150,180,30);  
    p.add(combobox2);   
  
    String[] weight2 = {"1 lb","2 lb","3 lb","4 lb","5 lb","6 lb","7 lb","8 lb","9 lb","10 lb",};   
    JComboBox weightbox2 = new JComboBox(weight2);   
    weightbox2.setBounds(390,150,80,30);  
    p.add(weightbox2);  
  
    button2.setText("Add");  
    button2.setBounds(480, 150, 90,30);  
    p.add(button2);  
    button2.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) { 
            p1.add(Box.createRigidArea(new Dimension(0,10))); 
            if(combobox2.getSelectedItem() != "Pork/Beef/Chicken") { 
            JLabel list = new JLabel("1 x " + combobox2.getSelectedItem() +  
                    " (" + weightbox2.getSelectedItem() + ")"); 
            p1.add(list); 
            JButton remove = new JButton("delete"); 
            p1.add(remove); 
            remove.addActionListener(new ActionListener(){ 
                public void actionPerformed(ActionEvent e) { 
                p1.remove(list); 
                p1.remove(remove); 
                p1.revalidate(); 
                p1.repaint(); 
                } 
            }); 
            } 
            else { 
            JOptionPane.showMessageDialog(null, "Please select an item!", null, 
                    JOptionPane.WARNING_MESSAGE); 
            } 
        } 
    }); 
   
    String[] item3 = {"Seafood","Large Cooked Shrimp","Alaskan Salmon","Farmed Salmon",  
            "Tilapia","Fresh Pacific Ling Cod","Crab Meat","Oyster","Clam",  
            "Scallop","Squid","Farmed Tuna","Fresh White Tuna"};  
    JComboBox combobox3 = new JComboBox(item3);   
    combobox3.setBounds(200,210,180,30);  
    p.add(combobox3);   
  
    String[] weight3 = {"1 lb","2 lb","3 lb","4 lb","5 lb","6 lb","7 lb","8 lb","9 lb","10 lb",};   
    JComboBox weightbox3 = new JComboBox(weight3);   
    weightbox3.setBounds(390,210,80,30);  
    p.add(weightbox3);  
  
    button3.setText("Add");  
    button3.setBounds(480, 210, 90,30);  
    p.add(button3);  
    button3.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) { 
            p1.add(Box.createRigidArea(new Dimension(0,10))); 
            if(combobox3.getSelectedItem() != "Seafood") { 
            JLabel list = new JLabel("1 x " + combobox3.getSelectedItem() +  
                    " (" + weightbox3.getSelectedItem() + ")"); 
            p1.add(list); 
            JButton remove = new JButton("delete"); 
            p1.add(remove); 
            remove.addActionListener(new ActionListener(){ 
                public void actionPerformed(ActionEvent e) { 
                p1.remove(list); 
                p1.remove(remove); 
                p1.revalidate(); 
                p1.repaint(); 
                } 
            }); 
            } 
            else { 
                JOptionPane.showMessageDialog(null, "Please select an item!", null, 
                        JOptionPane.WARNING_MESSAGE); 
                } 
        } 
    }); 
  
    button4.setText("Continue");  
    button4.setBounds(600, 400, 150,30);  
    p.add(button4); 
    button4.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) { 
            c1.show(parent, "p1");             
        }     
    }); 
     
    order.setText("Confirm Your Orders:"); 
    p1.add(order); 
     
    Continue.setText("Continue"); 
    p1.add(Continue); 
    Continue.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) { 
            c1.show(parent, "p2"); 
        } 
    }); 
     
    Shipping.setText("Shipping Information:"); 
    p2.add(Shipping); 
     
    name.setText("Full Name:"); 
    p2.add(name); 
     
    name2.setEditable(true); 
    name2.setMaximumSize(name2.getPreferredSize()); 
    p2.add(name2); 
     
    p2.add(Box.createRigidArea(new Dimension(0,10))); 
    phone.setText("Phone Number:"); 
    p2.add(phone); 
     
    phone2.setEditable(true); 
    phone2.setMaximumSize(phone2.getPreferredSize()); 
    p2.add(phone2); 
     
    p2.add(Box.createRigidArea(new Dimension(0,10))); 
    address.setText("Address:"); 
    p2.add(address); 
     
    address2.setEditable(true); 
    address2.setMaximumSize(address2.getPreferredSize()); 
    p2.add(address2); 
     
    p2.add(Box.createRigidArea(new Dimension(0,10))); 
    payment.setText("Payment Information;"); 
    p2.add(payment); 
     
    card.setText("Card Number:"); 
    p2.add(card); 
     
    card2.setEditable(true); 
    card2.setMaximumSize(card2.getPreferredSize()); 
    p2.add(card2); 
     
    continue2.setText("Continue"); 
    p2.add(continue2); 
    continue2.addActionListener(new ActionListener(){ 
        public void actionPerformed(ActionEvent e) { 
            c1.show(parent, "p3"); 
        } 
    }); 
  
    finish.setText("                 You are all set! Your order will be shipped as" 
            + " soon as possible.Thank you for using the delivery system:)"); 
    p3.add(finish, BorderLayout.CENTER); 
     
    frame.add(parent); 
    frame.setVisible(true);   
}  
public static void main(String[] args) {   
new PersonalProject();  
}   
}
