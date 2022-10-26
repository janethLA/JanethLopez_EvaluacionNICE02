import java.util.ArrayList;

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
				words.add(w);
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
		result+=contenidoInterno=ordenarContenidoInterno(contenidoInterno);
		result+=word.charAt(word.length()-1);
		return result;
	}
	
	private String ordenarContenidoInterno(String m) {
		String result="";
		String m1=m;
		for(int j=0;j<m.length();j++) {
			if((int)m.charAt(j)>(int)m.charAt(j+1)) {
				result+= m.charAt(j);
			}
		}
		return result;
	}
	
	public static void main (String args []) {
		SortInnerContent e= new SortInnerContent("Hola mundo");
	    System.out.println(e.orderContentMessage());

	}
}
