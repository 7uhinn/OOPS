import java.util.Hashtable;
import java.util.Enumeration;
import java.awt.*;
import java.awt.event.*;
class Question5 extends Frame implements ActionListener
{
	 Enumeration names;
     String key;
     TextField t1;  
     Button b;
     Label mean,t2;
      Hashtable<String, String> hashtable = new Hashtable<String, String>();
       Frame f= new Frame("Dictionary");  

	Question5()
	{
		hashtable.put("tremendous","bohot badia");
   hashtable.put("yatch","mehengi now");
   hashtable.put("urban","shehri");
   hashtable.put("intelligent","hoshiyar");
   hashtable.put("orange","narangi evam santra");
    t1=new TextField();  
    t1.setBounds(50,100, 200,30);  
    f.add(t1);
    t2= new Label();  
    t2.setBounds(50,250,300,60);  
   	f.add(t2);
   	b=new Button("Click Here");  
    b.setBounds(50,150,80,30);  
    f.add(b);  
    mean= new Label("Meaning") ;
    mean.setBounds(50,200,100,30);
    f.add(mean);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
    setSize(500,500);

    b.addActionListener(this);

	}

  public void actionPerformed(ActionEvent e) {  
            String s1=t1.getText(); 
        
        	 names = hashtable.keys();
   			 while(names.hasMoreElements())
   			{
      			key = (String) names.nextElement();
            if(e.getSource() == b ){
      				t2.setText(hashtable.get(s1));}
   			}
        
    } 
	public static void main(String[] args)
 {
  
   new Question5(); 
  }}