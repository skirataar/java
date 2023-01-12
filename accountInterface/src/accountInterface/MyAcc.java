package accountInterface;

public class MyAcc 
{
	public static account getAccount(char acc)
	{
		if(acc=='h')
			return new HDFC();
		else
			return new ICICI();
	}
}
