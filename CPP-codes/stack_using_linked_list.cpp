
								// STACK IMPLEMENTING USING THE LINKED LIST
#include <iostream>
#include<stdlib.h>
using namespace std;
// CREATING STRUCTURE OF THE LINKED LIST
struct node
{
 int data;
 struct node*link;
}*top=NULL;

// TO CHECK WHETHER IT IS EMPTY OR NOT
int isEmpty()
{
	if(top==NULL)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

// FOR ENTERING DATA IN THE STACK 
void push(int data)
{
    struct node*newnode;
    newnode=(struct node*)malloc(sizeof(struct node));
    if(newnode==NULL)
    {
        cout<<"Stack overflow\n";
        exit(1);
    }
    newnode->data=data;
    newnode->link=NULL;
    
    newnode->link=top;
    top=newnode;
}

// FOR DELETING THE DATA FROM STACK
int pop()
{
	struct node*temp;
	int val;
	if(isEmpty())
	{
		cout<<"Stack underflow"<<endl;
		exit(1);
	}
	temp=top;
	val=temp->data;
	top=top->link;
	free(temp);
	temp=NULL;
	return val;
}

// FOR RETURNING THE DATA USER WANT TO SEE
int peek()
{
	if(isEmpty())
	{
		cout<<"Stack is underflow"<<endl;
		exit(1);
	}
	return top->data;
}
void print()
{
    struct node*temp;
    temp=top;
    cout<<"Element of the stack are-->"<<endl;
    while(temp)
    {
        cout<<temp->data<<endl;
        temp=temp->link;
    }
    cout<<"\n";
}

// MAIN FUNCTION 
int main()
{
    int choice;
    int data;
    while(1)
    {
       
        cout<<"1.Push"<<endl;
        cout<<"2.Pop"<<endl;
        cout<<"3.Print top element"<<endl;
        cout<<"4.Print all element"<<endl;
        cout<<"5.Quit"<<endl;
        cout<<"Enter your choice"<<endl;
        cin>>choice;
        
        switch(choice)
        {
            case 1 : cout<<"Enter element to push in the stack"<<endl;
            cin>>data;
            push(data);
            break;
            
            case 2: data=pop();
                    cout<<"Deleted element is "<<data<<endl;
            break;
            
            case 3:cout<<"Top element of the list "<<peek()<<endl;
            break;
            
            case 4: cout<<"All element are"<<endl;
                    print();
            break;
            
            case 5: exit(1);
            
            default:
                cout<<"Wrong choice"<<endl;
            break;
        }
    }
    return 0;
}







