import java.util.HashMap;
public class Java1Review {
	
	public static double divide(double divedend, double divisor) {
		return divedend/divisor;
	}
	
	public static boolean isDivisibleBy7(int number) {
		return number % 7 == 0;
		
	}

	public static String main(String str) {
		return "Overloaded main method was passed \""+str+"\".";
	}	

	public static int divide(int divedend, int divisor) {
		return divedend/divisor;
		
	}
	
	public static int findMin(int a, int b, int c) {
		return Math.min(a, Math.min(b,c));
	}
	
	
	public static int findMin(int[] array) {
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
			}
	
	public static double average(int[] array) {
		int sum = 0;
		for (int num:array) {
			sum+=num;
		}
		return (double)sum/array.length;
	}
	
	public static void toLowerCase(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].toLowerCase();
		}
	}
	
	public static String[] toLowerCaseCopy(String[] strings) {
		String[] lowercaseCopy = new String[strings.length];
		for (int i = 0; i < strings.length; i++) {
			lowercaseCopy[i] = strings[i].toLowerCase();
		}
		return lowercaseCopy;
	}
	
	public static void removeDuplicates(int[] array) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++) { 
			if(map.containsKey(array[i])) 
				map.put(array[i], map.get(array[i])+1);
			else 
				map.put(array[i], 1);
		}
		for(int i=0;i<array.length;i++) {
			int count = map.get(array[i]);
			if(count>1)
				array[i]=0;
		}
	}
}
