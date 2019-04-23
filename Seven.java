import javax.swing.*;
import java.awt.event.*;  
import java.util.*;
import java.io.*;
 
class student
{
String name;
String snum;
student(String name,String snum)
{
this.name=name;
this.snum=snum;
}
}
class teacher
{
String name;
String subject;
String section;
teacher(String name,String subject,String section)
{
this.name=name;
this.subject=subject;
this.section=section;
}
}
 
class Seven implements ActionListener
 
{  
    JButton b,b1,b2;
    int i=0;
    student st=new student("0", "0");
    JTextField t1,t2,t3,t4,t5,t6;
    Hashtable<String, String> HT;
    JLabel l1,l2,l3,l4,l5,l6;
 
    Seven(){
 
    JFrame f= new JFrame("CheckBox Example");  
 
    l1=new JLabel("Name");
 
    l2=new JLabel("Rollno");
 
    l3=new JLabel("Subject/Sec");
 
    l4=new JLabel("Subject2");
 
    l5=new JLabel("Search number");
 
    l6=new JLabel("Name");
 
    l1.setBounds(200,100,200,30);
 
    l2.setBounds(200,150,200,30);
 
   l3.setBounds(200,200,200,30); 
    l4.setBounds(200,250,200,30);
 
   l5.setBounds(200,350,200,30); 
    l6.setBounds(200,400,200,30);
 
   b=new JButton("Teacher Store");
   b.addActionListener(this);
 
   b1=new JButton("Search");
   b1.addActionListener(this);
 
   b.setBounds(500,300,200,30);
   b2=new JButton("Student Store");
   b2.addActionListener(this);
 
   b2.setBounds(200,300,200,30);
 
 
   b1.setBounds(350,450,200,30);
 
   t1=new JTextField();
 
   t1.setBounds(350,100, 200,30);
 
   t2=new JTextField();
 
   t2.setBounds(350,150, 200,30);
 
   t3=new JTextField();
 
   t3.setBounds(350,200,200,30);
 
   t5=new JTextField();
 
   t5.setBounds(350,350,200,30);
 
   t6=new JTextField();
 
   t6.setBounds(350,400,200,30);
   t6.setEditable(false);
 
       final JLabel label = new JLabel();          
 
       label.setHorizontalAlignment(JLabel.CENTER);  
 
       label.setSize(400,100);  
 
       JCheckBox checkbox1 = new JCheckBox("Teacher");  
 
       checkbox1.setBounds(20,50, 100,50);  
 
       JCheckBox checkbox2 = new JCheckBox("Student");  
 
       checkbox2.setBounds(20,80, 100,50);  
 
       f.add(checkbox1); f.add(checkbox2); f.add(label);  
 
       checkbox1.addItemListener(new ItemListener() {  
 
            public void itemStateChanged(ItemEvent e1) {               
 
               label.setText("Teacher Checkbox: "   
 
               + (e1.getStateChange()==1?"checked":"unchecked"));
      
   	f.add(l1);f.add(l2);f.add(l3);f.add(l5);f.add(l6);f.add(t1);f.add(t2);f.add(t3);f.add(t5);f.add(t6);f.add(b);f.add(b1);f.add(b2);
 
 
            }  
 
         });  
 
       checkbox2.addItemListener(new ItemListener() {  
 
            public void itemStateChanged(ItemEvent e1) {               
 
               label.setText("Student Checkbox: "   
 
               + (e1.getStateChange()==1?"checked":"unchecked"));  
 
             
 
               f.add(l1);f.add(l2);f.add(l3);f.add(l5);f.add(l6);f.add(t1);f.add(t2);f.add(t3);f.add(t5);f.add(t6);f.add(b);f.add(b2);f.add(b1);
 
            }  
 
         });   
 
       f.setSize(1000,1000);  
 
       f.setLayout(null);  
 
       f.setVisible(true);  
}
public void actionPerformed(ActionEvent e){
 
if(e.getSource()==b){
File f=new File("assets/file7t.txt");
String str1=t1.getText();
String str2=t2.getText();
String str3=t3.getText();
 
String[] h=new String[10];
h[i]=str2;
String[] y=new String[10];
y[i]=str1;
HT=new Hashtable<String,String>();
HT.put(h[i], y[i]);
i++;
 
try{
   FileWriter fileWriter=new FileWriter(f, true);
   PrintWriter printWriter=new PrintWriter(fileWriter);  
   printWriter.printf("\r\n"+ str1);
   printWriter.printf("\r\n"+ str2);
   printWriter.printf("\r\n"+ str3);   
   printWriter.close();
}catch(Exception x){
   System.out.println(x);
}
}
 
else if(e.getSource()==b2){
File fe=new File("assets/file7s.txt");
String str1=t1.getText();
String str2=t2.getText();
String str3=t3.getText();
 
String[] h=new String[10];
h[i]=str2;
String[] y=new String[10];
y[i]=str1;
HT=new Hashtable<String,String>();
HT.put(h[i], y[i]);
i++;
 
try{
   FileWriter fileWriter=new FileWriter(fe, true);
   PrintWriter printWriter=new PrintWriter(fileWriter);  
   printWriter.printf("\r\n"+ str1);
   printWriter.printf("\r\n"+ str2);
   printWriter.printf("\r\n"+ str3);   
   printWriter.close();
}catch(Exception x){
   System.out.println(x);
}
}
else if(e.getSource()==b1){
 st.snum=t5.getText();
 t6.setText(HT.get(st.snum));
 
}
 
}  
public static void main(String args[]){
new Seven();
}
}
