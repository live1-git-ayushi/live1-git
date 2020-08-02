import java.util.Arrays;

import javax.print.attribute.standard.NumberUpSupported;

public class ShallowClone implements Cloneable {

	public int[] numbers;
	public String nameString ="Rambo";
	public float f = 5.5f;
	
	public ShallowClone(int size)
	{
	numbers = new int[size];	
	}
	public static void main(String
			[] args) {
		// TODO Auto-generated method stub
		ShallowClone shallowClone = new ShallowClone(2);
		shallowClone.numbers[0]=100;
		try {
			ShallowClone shallowClone2 = (ShallowClone) shallowClone.clone();
			System.out.println("Cloed succesfully");
			System.out.println(shallowClone);
			System.out.println(shallowClone2);
			shallowClone2.nameString="John";
			System.out.println(shallowClone);
			System.out.println(shallowClone2);
			
		}catch(CloneNotSupportedException E)
		{
			System.out.println(E);
		}
	}
	@Override
	public String toString() {
		return "ShallowClone [numbers=" + Arrays.toString(numbers) + ", nameString=" + nameString + ", f=" + f + "]";
	}

}
