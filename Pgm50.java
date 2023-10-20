package assignments;
import java.util.*;
public class Pgm50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strings : ");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		char []s3=s1.toCharArray();
		char[] s4=s2.toCharArray();
		if(s1.length()!=s2.length())
			System.out.println("Both strings are not anagram");
		else {
			for(int i=0;i<s3.length;i++) {
				for(int j=0;j<s3.length;j++) {
					if(s3[i]>s3[j]) {
						char temp=(char)s3[i];
						s3[i]=(char)s3[j];
						s3[j]=(char)temp;
					}
					if(s4[i]>s4[j]) {
						char temp=(char)s4[i];
						s4[i]=(char)s4[j];
						s4[j]=(char)temp;
					}
				}
			}
			int count=0;
			for(int i=0;i<s3.length;i++) {
				if(s3[i]==s4[i])
					count++;
			}
			if(count==s3.length)
				System.out.println("Both are anagram");
			else
				System.out.println("Not a anagram");
		}
	}
}
