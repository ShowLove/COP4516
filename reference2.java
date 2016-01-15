// pass Array to method
private void PassArray(){
    String[] arrayw = new String[4]; //populate array
    PrintA(arrayw);}
private void PrintA(String[] a){
    //do whatever with array here
}

//Print an array
import java.util.Arrays;
System.out.println(Arrays.toString(array));

//Compile from terminal
javac HelloWorld.java
java HelloWorld

//initialize int array to zero
in arrays are initialized by default to zero

//manipulate char bytes like c (note char[] and String usage)
char[] word = new char[6];  
String str = "hello";
word = str.toCharArray(); 	  //word prints: hello
byte var = (byte) (word[0] + 1);
word[0] = (char) var;    	 //word prints: iello

//scan and print with gui
import javax.swing.JOptionPane;
String str = JOptionPane.showInputDialog(null, "Enter teh string you wish to check");

	