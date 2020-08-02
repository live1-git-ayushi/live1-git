package java7.fundamentals;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class WrapperClass {
	public static void main(String[] args) {
		
	
 int i=10;
 
 // primtive data type is wrapped
 //primitive is converted to a reference type(Boxing)
 Integer integer =i;
 System.out.println(i+i);
 System.out.println(integer.toString()+integer.toString());
 //primitive type is unwrapped
 //referenced type is converted to primitive type (Unboxing)
 int x= integer;
 List<Integer> list = new ArrayList<Integer>();
 List list2 = new ArrayList<Object>();
 list.add(x); // internal typecasting is happening
 list.add((Integer)x); // explicitly doing the typecasting
 list2.add("Test");
// list.add("Test"); // not allowed as we can store only integer values here
 System.out.println(list);
 
	}
}
