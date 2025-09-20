import java.util.*;
public class Main
{
    private int size;
    private int a[];
    private int top;
    
    public Main(int x)
    {
    this.size=x;
    this.a=new int[size];
    this.top=-1;
    }
    
    public void push(int x)
    {
        if(isFull())
        {
            System.out.print("Overflow");
            return;
        }
        a[++top]=x;
    }
    
    public int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        return a[top--];
    }
    
    public int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        return a[top];
    }
    
    public boolean isEmpty()
    {
        return top==-1;
    }
    
    public boolean isFull()
    {
        return top==size-1;
    }
    
    public void display()
    {
        for (int i = 0; i <= top; i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int x=sc.nextInt();
	    
		Main ob=new Main(x);
		
		for(int i=0;i<x;i++)
		{
		    int a =sc.nextInt();
		    ob.push(a);
		}
		
		System.out.println("Popped:"+ob.pop());
		
		System.out.println("Peek:"+ob.peek());
		
		System.out.print("All Elements:");
		ob.display();
		
	}
}
