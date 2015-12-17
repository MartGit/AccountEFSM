
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Account
{
public Account()
{
	x2 = 0;
	x4 = -1;
	x6 = 10;
	x7 = 1000;
	k = 0;
	num = 2;
}
public int open(int x, int y, int z)
{
	if ((x > 0) && (x4 == -1))
	{
		x1 = x;
		x3 = y;
		x5 = z;
		x4 = 0;
		return 0;
	};
	return -1;
}
public int deposit(int d)
{
	if (x4 != 2)
	{
		return -1;
	}
	if (x2 != 0)
	{
		return -1;
	};
	if ((x1 < x7) && (d>0))
	{
		x1 = x1 + d - x6;
		return 0;
	}
	else
	{
		if (d > 0)
		{
		x1 = x1 + d;
		return 0;
		}
	}
 return -1;
}
public int withdraw(int w)
{
if (x4 != 2)
{
	return -1;
}
if (x2 != 0)
{
	return -1;
};
if ((x1 > w) && (w > 0))
{
	if (x1 < x7)
	{
		return -1;
	}
	else
	{
		x1 = x1 - w;
	};
	if (x1 < x7)
	{
		x1 = x1 - x6;
	}
  return 0;
}
return -1;
}
public int balance()
{
	if (x4 != 2)
	{
		return -1;
	}
	return x1;
}
public int lock(int x)
{
	if (x4 != 2)
	{
		return -1;
	}
	if (x != x3)
	{
		return -1;
	}
	if (x2 == 0)
	{
		x2 = 1;
		return 0;
	}
	else
	{
		return -1;
	}
}
public int unlock(int x)
{
	if (x4 != 2)
	{
		return -1;
	}
	if ((x2 != 0) && (x == x3))
	{
		x2 = 0;
	return 0;
	}
	else
	{
		return -1;
	}
}
public int login(int x)
{
	if (x4 != 0)
	{
		return -1;
	}
	if (x5 == x)
	{
		x4 = 1;
		k = 0;
		return 0;
	}
	return -1;
}
public int logout()
{
	if ((x4 == 0) || (x2 == 1))
	{
		return -1;
	}
	x4 = 0;
	return 0;
}
public int pin(int x)
{
	if (x4 != 1)
	{
		return -1;
	}
	if (x == x3)
	{
		x4 = 2;
		return 0;
	}
	else
	{
		k++;
	}
	if (k >= num)
	{
		x4 = 0;
	}
	return -1;
}
public int show_balance() //testing oriented method
{
	return x1;
}

public int show_account() //testing oriented method
{
	return x5;
}

public int show_noOfAttempts() //testing oriented method
{
	return k;
}

public String show_state() //testing oriented method
{
	if(x4 == 0)
		return ("IDLE");
	if(x4 == 1)
		return ("CHECK PIN");
	if(x4 == 2){
		
		if(x2 == 1)
			return ("LOCKED");
		else if(x1 < x7)
			return ("OVERDRAWN");
		else
			return ("READY");
		
		
	}
	
	return ("START");
}

public int showAllVariables() //testing oriented method

{
	
	Hashtable<String, Integer> allVar = new Hashtable<String, Integer>();
	
	allVar.put("Balance Value, x1,", x1);
	allVar.put("Pin Value, x3,", x3);
	allVar.put("Account # Value, x5,", x5);
	allVar.put("Penalty Value, x6,", x6);
	allVar.put("Minimum Balance Value, x7,", x7);
	allVar.put("Maximum # of Attempts Value, num,", num);	
	allVar.put("# of Attempts Value, k,", k);
	

		
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(allVar);
		printMap(treeMap);
	
	
	return 0;
	
}

	//Helper Method
public void printMap(Map<String, Integer> map){
	
	for(Map.Entry<String, Integer> entry : map.entrySet() ){
		
		System.out.println(entry.getKey() + " " +  "=" + " " + entry.getValue() + " " + ";" + " ");
		
		
	}
	
	System.out.println("State Value, x4," + " " + "=" + "  " + show_state());

}

	private int x1; //balance
	private int x2;
	private int x3; //pin #
	private int x4;
	private int x5; // account #
	private int x6; // penalty
	private int x7; // minimum balance
	private int k;
	private int num; //maximum # of attempts with incorrect pin
}