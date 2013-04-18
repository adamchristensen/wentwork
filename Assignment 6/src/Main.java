import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Main {
	 public static void main(String[] bscs){
         HuffmanTree tree = new HuffmanTree();//generate a new tree object
          String inputFile;
          String outputFile;
          Scanner kb = new Scanner(System.in); //initialize a scanner for input
          System.out.println("Please enter the name of the Input File");
          inputFile = kb.nextLine();//get input from user to know which text file to access.

          //File f = new File(inputFile); 
              Scanner fr = null;//initialize a new scanner object for reading from the file.
          try {
              fr = new Scanner(new File(inputFile));//set the scanner object to use the file from the user.
              tree.add('\n', fr.next().trim()); //trim the first word from the file(removing whitespaces and punctuation) and make it the root of the tree
              String temp = fr.next(); //set a temp string to the next value in the file
              if(temp.charAt(0)==' ' && temp.charAt(1)==' ') //if the first character and the second characters are whitespaces, add a whitespace to the tree
              {
                  tree.add(' ', temp.trim());
              }
              else //If the first and second characters are not whitespaces, add the string to the tree.
                  tree.add(temp.charAt(0), temp.substring(1));
              while(fr.hasNext()){ //while the text file still has characters in it
                  temp = fr.next(); //set temp to the next characters in the file
                  if(temp.equals("**")){ //if ** is read, stop reading from the file.
                      break;
                  }
                  else //If ** is not reached, keep adding to the tree.
                      tree.add(temp.charAt(0), temp.substring(1));
              }
              FileWriter f0 = new FileWriter(new File("decoded.ou")); //create a new fileWriter for outputting to a file.
              f0.write(tree.getDecodedMessage(fr.nextLine())); //write the decoded message from the file to the new fileWriter.
              f0.close(); //close the fileWriter

          } catch (Exception ex) {
             System.out.println(ex.getMessage()); //Output errors if (when) they occur.
          }


          }
}
