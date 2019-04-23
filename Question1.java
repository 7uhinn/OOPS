import java.io.*;
import java.util.Scanner;

class teacher implements java.io.Serializable
{
    String firstname;
    String lastname;

    // Default constructor
    void  teacher(String firstname, String lastname)
    {
        this.firstname=firstname;
        this.lastname=lastname;
    }

}
class Question1
{
    public static void main(String[] args)
    {   Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter first and last name :");
        teacher object[]=new teacher[3];
        for(int i=0;i<3;i++){
            object[i]=new teacher();
            String name1=scan.nextLine();
            String name2=scan.nextLine();

       object[i].teacher(name1,name2); }
       String filename = "assets/file123.txt";

        // Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            for(int i=0;i<3;i++){
            // Method for serialization of object
            out.writeObject(object[i]);}

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        teacher object1 = null;

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            for(int k=0;k<3;k++){
            object1 = (teacher)in.readObject();
            System.out.println("First Name is: " + object1.firstname +"\t Last Name is: " + object1.lastname);
 
            }
            in.close();
            file.close();

            System.out.println("Object has been deserialized ");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
      {
           System.out.println("ClassNotFoundException is caught");
        }

    }
}
