package programs;

public class SequenceOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbddaesssxxxxxxsaabbcc";
		for(int i=0;i<str.length()-1;i++){
			int count=0;
			for(int j=i;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;
				}
				else{
					i=i+(count-1);
					break;
				}
			}
			System.out.println(count+""+str.charAt(i));
		}
		
      
	}

}
