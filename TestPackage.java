//multiple choice
//class A extends B -CORRECT
//class A extends B,C -WRONG
//Class A implements B,C - CORRECT
//Class A EXTENDS B implements D,C - CORRECT
//MCQS in interface , implements, extends,
//X extends Y - X&Y both can either be classes of interfaces
//X extends Y,X - X&Y&Z should be interfaces
//X extends Y implements Z
//------------------------------------------------------------
//Package in JAVA 
//A group of similar types of classes(cotains methods) , interfaces and subpackages.
//Categorized in 2 forms
//1.built in - lang,util,awt,swing
//2.user defined
//Advantages 
//used to categorise classes and interfaces
//C:\Program Files\Java\jdk1.8.0_231\src.zip\java ------- location of java packages in jdk
// C:\Program Files\Java\jre1.8.0_241\lib\rt ----------add9copy) rt in new folder nd extract
//my first java package
package mypackage;
public class TestPackage
{
 public static void main(String args[])
 {
 System.out.println("my first package");
 }
}
//javac -d . TestPackage.java  - compilation
//-d is destination
//. is current working directory (another path can be given in double codes depends on compiler double codes to b used or not)(for its execution we need 
//to change cmd path)
//
//java mypackage.TestPackage - execution (package name.class  name) - package name of main program when accessin from outside
//java interpreter
//mypackage is folder name

