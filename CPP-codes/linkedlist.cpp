#include<iostream>
#include<stdlib.h>
using namespace std;
struct node
{
	int data;
	struct node*link;
};
void count_of_node(struct node *head)
{
	int count=0;
	if(head==NULL)
	{
		cout<<"linked list is empty";
	}
	struct node *ptr=NULL;
	ptr=head;
	while(ptr!= NULL)
	{
		count++;
		ptr=ptr->link;
	}
	cout<<count<<endl;
}
void count_of_node1(struct node *tail)
{
	int count=0;
	if(tail==NULL)
	{
		cout<<"linked list is empty";
	}
	struct node *ptr=NULL;
	ptr=tail;
	while(ptr!= NULL)
	{
		count++;
		ptr=ptr->link;
	}
	cout<<count<<endl;
}
int main()
{
	struct node*head=NULL;
	head=(struct node*)malloc(sizeof(struct node));
	head->data=100;
	head->link=NULL;
	cout<<"The first entry of the linked list is :- "<<head->data<<endl;
	cout<<"-------------------------------------"<<endl;
	struct node*tail=NULL;
	tail=(struct node*)malloc(sizeof(struct node));
	tail->data=200;
	tail->link=NULL;
	cout<<"The second entry of the linked list is :- "<<tail->data<<endl;
	cout<<"--------------------------------------"<<endl;
	struct node*three=NULL;
	three=(struct node*)malloc(sizeof(struct node));
	three->data=300;
	three->link=NULL;
	cout<<"The third entry of the linked list is :- "<<three->data<<endl;
	cout<<"--------------------------------------"<<endl;
	count_of_node(head);
	count_of_node1(tail);
	return 0;
}
