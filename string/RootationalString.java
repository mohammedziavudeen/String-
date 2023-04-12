package string;
//Rotational string matching found
public class RootationalString {

	public static void main(String[] args) {
		String name="ziavudeen",name1="",name2="deenziavu";
		name1=name+name;
		boolean first=false;
		for(int i=0;i<name1.length();i++) {
			int count=0;
			int j=0;
			if(name2.charAt(j)==name1.charAt(i)) {
				for(;j<name2.length()&&i<name1.length();) {
					if(name2.charAt(j)==name1.charAt(i)) {
						j++;
						i++;
						count++;
						if(count==name2.length()) {
							//System.out.println("match");
							first=true;
						}
					}
					else {
						break;
					}
				}
			}	
		}
		if(first==true) {
			System.out.println("match");
		}
		else {
			System.out.println("no");
		}
	}

}
