package stackApplication;

import stacks.stack;

public class bracketChecker {

	public static void main(String args[])
	{
	
		String s="a{b(c]d}e";
		stack st=new stack(10);
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			switch(ch)
			{
			case '{':
			case '(':
			case '[':
				st.push(ch);
				break;
			case '}':
			case ')':
			case ']':
				if(!st.isEmpty())
				{
					char matchingVal=st.pop();
					if((ch=='}' && matchingVal!='{')||
						(ch==']' && matchingVal!='[')||
						(ch==')' && matchingVal!='(')
						)
						{
						System.out.println("error"+ch+"at"+i);
						}
				}
				else
				{
					System.out.println("error"+ch+"at"+i);
				}
				break;
				
				default:
					break;
			
		
			}
		}
		if(!st.isEmpty())
		{
			System.out.println("error missing delimiter");
		}
	}
}
