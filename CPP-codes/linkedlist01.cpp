
// SINGLE LINKED LIST ( CREATION OF NODE , DECLARTION OF SECOND NODE USING ANOTHER POINTER)

// stdlib , iostream , stdio 
#include<iostream>
#include<stdlib.h>   
using namespace std;
// declare the structure 
struct node
{
	int data ;         // syntax linked list 
	struct node* link;
};
/*
====1====2====3====4   ()
# single linked list ( one directional )
 1. create a node in the main function ( here we are using head )
 2. let's create a another node using struct ( here we are using current)
*/
int main()
{
 struct node* head=NULL;  // first node
 head=(struct node*)malloc(sizeof(struct node));  // define this line 
 head->data=100;   // assign the value in the head
 head->link=NULL;	// new space so that i can add more nodes in the list
 
 struct node* current=NULL;  // second node
 current=(struct node*)malloc(sizeof(struct node));  // define this line 
 current->data=200;   // assign the value in the current
 current->link=NULL;
 cout<<"   LINKED LIST "<<endl;
 cout<<"First element->"<<head->data<<endl;
 cout<<"Second element->"<<current->data<<endl;
 return 0;
}

/* 
 1. malloc function 
 2. single linked list 
 3. data strucutre ( linear)
 4. create a function to display all the element of linked list in a 
    sequence using user defined function
*/

