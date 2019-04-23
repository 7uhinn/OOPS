import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*; 


public class Nine implements ActionListener
{
JFrame frame;
JMenuBar menuBar;
JMenu menu1, menu2; 
JMenuItem menuItem1, menuItem2, menuItem3, menuItem4, menuItem5, menuItem6, menuItem7;
FileDialog fg;
JLabel label1;
JTextArea area;

Nine()
{
frame = new JFrame("File Operations");

area=new JTextArea();  
area.setBounds(20,100,300,300);

menuBar= new JMenuBar();

menu1 = new JMenu("File");
menuItem1 = new JMenuItem("New");
menuItem2 = new JMenuItem("Open");
menuItem3= new JMenuItem("Save");
menuItem4 = new JMenuItem("Exit");

menu1.add(menuItem1);
menu1.add(menuItem2);
menu1.add(menuItem3);
menu1.add(menuItem4);

menu2 = new JMenu("Save as");
menuItem5 = new JMenuItem(".jpeg");
menuItem6 = new JMenuItem(".png");
menuItem7 = new JMenuItem(".pdf");

menu2.add(menuItem5);
menu2.add(menuItem6);
menu2.add(menuItem7);

menu1.add(menu2);
menu1.add(menuItem4);

menuBar.add(menu1);

menuItem2.addActionListener(this);
menuItem4.addActionListener(this);

label1 = new JLabel("", JLabel.CENTER);

frame.setJMenuBar(menuBar);
frame.add(area);
frame.add(label1,BorderLayout.CENTER);
frame.setSize(370,270);
frame.setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getActionCommand().equals("Open"))
{
	fg = new FileDialog(frame, "Open a file");
	fg.setVisible(true);
	String file = fg.getDirectory()+ fg.getFile();
	label1.setText("File to Open - " + file);

	BufferedReader br = null;
	FileReader fr = null;
	try {

			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				area.setText(sCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();

		} 
}


if(ae.getActionCommand().equals("Exit"))
{
System.exit(0);
}
}

public static void main(String... ar)
{
new Nine();
}

}
