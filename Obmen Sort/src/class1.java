import java.util.Arrays;
public class class1 {
	public static void main(String []args){
		int  i;
		int buf;
		int [] Array = new int [10];
		for (i = 0; i < 10; i = i + 1) {
			Array [i] = (int)(Math.random()*100);
		}
		for(i = 0; i < Array.length; i++){
	        for(int j = 0; j < Array.length-1; j++){
	        	if (Array[j] > Array[j+1]) {
					buf = Array[j+1];
					Array[j+1] = Array[j];
					Array[j] = buf;
					System.out.println(Arrays.toString(Array));
					}

				}
			}
		}
}

