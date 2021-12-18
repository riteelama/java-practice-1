package demoClass;
public class stringBufferExample {
	public static void main(String [] args)
	{
		StringBuffer sb = new StringBuffer("Universal");
		System.out.println(sb.append("college"));
		sb.insert(4, "Hello");
		System.out.println(sb);
	}

}
