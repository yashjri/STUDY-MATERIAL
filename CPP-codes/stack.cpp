#include<iostream>
using namespace std;
# define n 100
class stack
{
	private:
		int * arr;
		int top;
	public:
		stack()
		{
			arr=new int[n];
			top=-1;
		}
		void push(int x)
		{
			if(top==n-1)
			{
				cout<<"Stack overflow\n";
				return ;
			}
			top++;
			arr[top]=x;
		}
		void pop()
		{
			if(top==-1)
			{
				cout<<"no elemen to pop\n";
				return ;
			}
			top--;
		}
		int Top()
		{
			if(top==-1)
			{
				cout<<"no elemen to pop\n";
				return -1 ;
			}
			return arr[top];
		}
		
		bool empty()
		{
			return top==-1;
		}
};
void displayStack(stack s)       // this will display the element of stack in the order 
{
    if (s.empty())
    {
        cout << "Stack is empty." << endl;
        return;
    }

    cout << "Elements of the stack: "<<endl;
    while (!s.empty())
    {
        cout << s.Top()<<endl;
        s.pop();
    }
    cout << endl;
}
int main()
{
	stack s1;
	s1.push(100);
	s1.push(200);
	s1.push(300);
	cout<<s1.Top()<<endl;
    displayStack(s1);
	return 0;
}
