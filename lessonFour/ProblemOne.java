package lessonfour;

public class ProblemOne {
public static String linearSort(String s1,String s2,int n,int m){
	String st1="";
	String st2="";
	if(s1.length()>1 && s2.length()>1){
		if(m==s2.length() || n==s1.length()){
			if(n<s1.length()){
				st1+=s1.substring(n);
			}
			else if(m<s2.length()){
				st1+=s2.substring(m);
			}
			return st1;
		}
		if(s2.charAt(s2.length()-1)<s1.charAt(0)){
			st1=s2+s1;
		}
		else if(s1.charAt(s1.length()-1)<s2.charAt(0)){
			st1=s1+s2;
		}
		else{
			if(s1.charAt(n)>=s2.charAt(m)){
				st1+=s2.charAt(m)+linearSort(s1,s2,n,m+1);
				
			}
			else{
				st1+=s1.charAt(n)+linearSort(s1,s2,n+1,m);
				
			}
			
		}
	}
	return st1;
}
}
