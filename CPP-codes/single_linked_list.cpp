//                                           SINGLE LINKED LIST 

#include <iostream>
#include <stdlib.h>
using namespace std;

struct node    // declaring the node or strucutre to create the linked list 
{
    int data;
    struct node* link;
};

void countnode(struct node* head)    // to count the number of nodes in the list 
{
    int count = 0;
    if (head == NULL)
    {
        cout << "Linked list is empty";
    }
    else
    {
        struct node* ptr = head;
        while (ptr != NULL)
        {
            count++;
            ptr = ptr->link;
        }
        cout << "No of elements in linked list: " << count << endl;
    }
}

struct node* add_beg(struct node* head, int d)   // to add the data at the begining of the list
{
    struct node* ptr = NULL;
    ptr = (struct node*)malloc(sizeof(struct node));
    ptr->data = d;
    ptr->link = head;
    head = ptr;
    return head;
}

void at_end(struct node* head, int data)    // to add data at the end of the list
{
    struct node* ptr = head;
    struct node* temp = NULL;
    temp = (struct node*)malloc(sizeof(struct node));
    temp->data = data;
    temp->link = NULL;
    while (ptr->link != NULL)
    {
        ptr = ptr->link;
    }
    ptr->link = temp;
}

struct node* del_first(struct node* head) // for removing the element 
{
	if(head==NULL)
	{
		cout<<"list is empty"<<endl;
	}
	else
	{
		struct node* temp=head;
		head=head->link;
		free(temp);
		temp=NULL;
	}
	return head;
}

struct node* del_last(struct node* head)  // for removing the last element 
{
	if(head==NULL)
	{
		cout<<"Linked list is empty"<<endl;
	}
	else if(head->link==NULL)
	{
		free(head);
		head=NULL;
	}
	else
	{
		struct node*temp=head;
		struct node* temp2=head;
		while(temp->link!=NULL)
		{
			temp2=temp;
			temp=temp->link;
		}
		temp2->link=NULL;
		free(temp);
		temp=NULL;
	}
	return head;
}

void del_pos(struct node** head, int position)  // for deleting any node in the list at any position
{
	struct node*current=*head;
	struct node* previous = * head;
	if(*head==NULL)
	{
		cout<<"Linked list is empty"<<endl;
	}
	else if(position==1)
	{
		*head=current->link;
		free(current);
		current=NULL;
	}
	else
	{
		while(position!=1)
		{
			previous=current;
			current=current->link;
			position--;
		}
		previous->link=current->link;
		free(current);
		current=NULL;
	}
}
 
int main()
{
    struct node* head = NULL;
    head = (struct node*)malloc(sizeof(struct node));
    head->data = 100;
    head->link = NULL;

    struct node* current = NULL;
    current = (struct node*)malloc(sizeof(struct node));
    current->data = 150;
    head->link = current;

    current = (struct node*)malloc(sizeof(struct node));
    current->data = 200;
    current->link = NULL;
    head->link->link = current; // this represent that we create another data to enter in list with existing node of the list 

    int data = 50;
    head = add_beg(head, data); // this is used to add 50 at the beginining of the list 
    at_end(head, 250);  // this will add 400 at the end of the list 

    
    
    head=del_first(head);  // by using this we removed the first element in the linked list here we removed the 50 
    head=del_last(head);  //  by using this we removed the last element in the linked list here we removed the 250
    
    int position=3;
    del_pos(&head,position); // for deleting the node at any position in the linked list
    // Traversing and displaying all node data in the list
    struct node* temp = head;
    while (temp != NULL)
    {
        cout << "Node data: " << temp->data << endl;
        temp = temp->link;
    }
    // this is used for counting the number of nodes in the list 
    countnode(head);
    return 0;
}

