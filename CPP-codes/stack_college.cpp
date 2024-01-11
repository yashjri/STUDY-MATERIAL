#include<iostream>
#include<stdlib.h>
#define n 100          // constant is n which is set to be 100
using namespace std;

class box         // class which basically represent a stack 
{
   private :
             int *arr;      // a pointer which refer to array
			 int top;      // a integer which refers to the top position
	public: 
	         box() // constructor
			 {
			   arr=new int[n];     // represent that value will be assign to the new dynamic array
			   top=-1;	           // value of top will be set to -1 or it refers that the value of stack is null right now and when value is entered it will store in stack
			 }	
			 
			 void push(int x)      // this will push the value in the stack 
			 {
			 	if(top==n-1) // it means that if the value of top is equals to n-1 it will not push the element in stack 
			 	{
			 	 cout<<"Stack is overflow"<<endl;
				  return ;	
				}
				top++; // top will be incremented so that we can enter the element in the stack 
				arr[top]=x; // value will be assign to that dynamic array as stack
			 }
			 
			 void display()
             {
	            if (top == -1) //it means if there will be no element stored in stack it will show this block result
                   {
                    cout << "Stack is empty" << endl;
                    return;
                   }
                // and if there are element in the stack it will show the result following 
                cout << "Stack elements: "<<endl;
                for (int i = top; i >= 0; i--)
                    {
                     cout << arr[i] << " "<<endl;
                    }
                cout << endl;
             }
};
int main()
{
	box b1;
	b1.push(100);
	b1.push(200);
	b1.push(300);
	b1.display();
	return 0;
}
