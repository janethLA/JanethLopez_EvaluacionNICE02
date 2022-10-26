import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortInnerContent {

	private String message;
	
	public SortInnerContent(String message) {
		this.message=message;
	}
	
	public String orderContentMessage() {
		String result="";
		String w="";
		ArrayList<String> words=new ArrayList<String>(); 
		for(int i=0;i<message.length();i++) {
			w+=message.charAt(i);
			if((int)message.charAt(i)==32) {
				words.add(w.trim());
				w="";
			}
			
			if(i==message.length()-1) {
				words.add(w);
			}
		}
		for(int i=0;i<words.size();i++) {
			result+= orderWord(words.get(i))+" ";
		}
	    
		return result;
	}
	
	private String orderWord(String word) {
		String result="";
		result+=word.charAt(0);
		String contenidoInterno = word.substring(1, word.length()-1);
		result+=ordenarContenidoInterno(contenidoInterno);
		result+=word.charAt(word.length()-1);
		return result;
	}
	
	private String ordenarContenidoInterno(String m) {
		String result="";
		String m1=m;
		char c, c1;  //ndu
		int pos=0;
		Character[] array =  convertStringToArray(m);
        Arrays.sort(array, Comparator.reverseOrder());
		result = convertArrayToString(array);
		return result;
	}
	
	private Character[] convertStringToArray(String m) {
		Character[] result=new Character[m.length()];
		for(int i=0;i<m.length();i++) {
			result[i]=m.charAt(i);
		}
		return result;
	}
	private String convertArrayToString(Character[] c) {
		String result="";
		for(int i=0;i<c.length;i++) {
			result+=c[i];
		}
		return result;
	}
	public static void main (String args []) {
		SortInnerContent e= new SortInnerContent("sort the inner content in descending order");
	    System.out.println(e.orderContentMessage());

	}
}
