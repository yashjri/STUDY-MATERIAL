#include<iostream>
#include<stdlib.h>
#include<string.h>
using namespace std;
// DECLARING THE STRUCTURE OF THE NODE 
struct node
{
    struct node* prev;
    int data;
    struct node* next;
};

// THIS IS FOR THE ADDING LIST ELEMENT IF LIST IS EMPTY
struct node* add_empty(struct node* head, int data)
{
    struct node* temp = NULL;
    temp = (struct node*)malloc(sizeof(struct node));
    temp->prev = NULL;
    temp->data = data;
    temp->next = NULL;
    head = temp;
    return head;
}


// THIS IS THE CODE FOR ADDING THE ELEMENT IN THE BEGINNING OF THE LIST
struct node* add_beg(struct node* head, int data)
{
    struct node* temp = NULL;
    temp = (struct node*)malloc(sizeof(struct node));
    temp->prev = NULL;
    temp->data = data;
    temp->next = NULL;
    if (head != NULL)
    {
        temp->next = head;
        head->prev = temp;
    }
    head = temp;
    return head;
}


// THIS IS THE CODE FOR THE ADDING OF THE ELEMENT AT THE END OF THE LIST
struct node* add_end(struct node* head, int data)
{
    struct node* temp = NULL;
    struct node* tp = head;
    temp = (struct node*)malloc(sizeof(struct node));
    temp->prev = NULL;
    temp->data = data;
    temp->next = NULL;

    if (head == NULL)
    {
        head = temp;
        return head;
    }

    while (tp->next != NULL)
    {
        tp = tp->next;
    }

    tp->next = temp;
    temp->prev = tp;
    return head;
}

// FOR DELETING THE FIRST DATA FROM THE LIST
struct node* del_first(struct node*head)
{
	struct node*temp=head;
	head=head->next;
	free(temp);
	temp=NULL;
	head->prev=NULL;
	return head;
}

// FOR DELETING THE LAST DATA FROM THE LIST
struct node* del_last(struct node*head)  
{
	struct node*temp=head;
	struct node*temp2;
	while(temp->next!=NULL)
	{
		temp=temp->next;
		temp2=temp->prev;
		temp2->next=NULL;
		free(temp);
	}
	return head;
}

// FOR PRINTING THE DATA FROM THE LIST
void print(struct node* head) 
{
	struct node*ptr=head;
	while(ptr!=NULL)
	{
		cout<<"List data-->"<<ptr->data<<endl;
		ptr=ptr->next;
	}
	cout<<"\n";
}


int main()
{
    struct node* head = NULL;
    struct node* ptr;
	// for inserting node in empty list 
    head = add_empty(head, 100);
    head = add_beg(head, 50);
    head = add_end(head, 200);
    head = add_end(head, 300);
    ptr = head;
    cout<<"ELEMENT OF THE LIST"<<endl;
    print(head); // for print the list
 	cout<<"After deleting the nodes from the list(first,last nodes)"<<endl;
	head=del_first(head); // it removed the first element from the list 
	head=del_last(head); // it removed the last element from the list
	// THIS IS FOR PRINTING THE ELEMENT  
    print(head);
    return 0;
}

