package stackApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import stacks.stack;

public class reverseStack {

	public static void main(String args[])
	{
		InputStreamReader io=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(io);
		String s="";
		String rev="";
		try {
			 s=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rev=reverse(s);
		System.out.println(rev);
	}
	
	static String reverse(String s)
	{
		
		stack st=new stack(s.length());
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			st.push(ch);
		}
		//reversing
		for(int i=0;i<s.length();i++)
		{
			rev+=st.pop();
		}
		
		return rev;
		
	}
}
