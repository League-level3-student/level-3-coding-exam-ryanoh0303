import java.util.HashMap;

public class HashMapCalculator {
	public int commonKeyValuePairs(HashMap<String, String> hash1, HashMap<String,String> hash2) {
		int x= 0;
		String[] arr = {"Alice", "Mary" , "Bob", "Chuck","Felix","Tam"};
		String[] arr2= {"Mary", "Felix","Ricardo", "Tam" , "Bob", "Jim"};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr[i].equals(arr2[j]) && hash1.get(arr[i]).equals(hash2.get(arr2[j]))) {
					x+=1;
				}
			}
		}

			
			
	return x;
	}
}
