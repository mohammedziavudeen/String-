package string;

public class Split {

	public static void main(String[] args) {
		String name="ziavudeen.pdf",name2="";
		int len=name.length()-4;
		for(int i=len;i<name.length();i++) {
			name2=name2+name.charAt(i);
		}
		if(name2.equals(".pdf")){
			System.out.println("It is pdf file");
		}
		else {
			System.out.println("It is not pdf file");
		}
	}

}
