import java.util.Scanner;
// Interface is Created 
interface StringMethod {
	 String ReverseString(String str);
	 }
interface NumberMethod {
	 int ReverseNumber(int number);
	 }
// Implements the Interface in Class 
  class  MainClass implements StringMethod,NumberMethod{
	public String ReverseString(String str ) {
		char[] array=str.toCharArray();
		String ReverseStr="";
		for(int i=array.length-1; i>=0; i--) {
			ReverseStr=ReverseStr+array[i];
		}			return ReverseStr;}
	public int ReverseNumber(int number) {
		System.out.println("Hello Your Data is Printed :2nd Method ");	
		return 2*number;	}
	//Main Function is Used to Called;	
	public static void main(String []args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str1=scanner.nextLine();
		MainClass refMain=new MainClass();
		System.out.println(refMain.ReverseNumber(7));
		System.out.println(refMain.ReverseString(str1)+" ");	}		}
