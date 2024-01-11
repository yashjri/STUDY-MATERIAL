
										// QUEUE USING LINKED LIST
#include<iostream>
#include<stdlib.h>
using namespace std;

// FOR IMPLEMENTING STRUCTURE 
typedef struct node
{
	int data;
	struct node* next;
}node1;

node1* front = NULL;
node1* rear = NULL;

// FOR ENTERING THE DATA IN THE QUEUE
void enqueue()
{
	node1* temp;
	temp = (struct node*)malloc(sizeof(struct node));
	cout << "Enter data: ";
	cin >> temp->data;
	if (front == NULL)
	{
		temp->next = NULL;
		front = temp;
		rear = temp;
	}
	else
	{
		rear->next = temp;
		rear = temp;
		rear->next = NULL;
	}
}

// FOR DELETING THE DATA FROM QUEUE
void dequeue()
{
	node1* temp;
	struct node* ptr = NULL;
	ptr = front;
	front = front->next;
	cout << "Deleted element is " << ptr->data << endl;
	free(ptr);
}

// FOR DISPLAYING THE DATA FROM THE QUEUE
void display()
{
	node1* ptr;
	if (front == NULL)
	{
		cout << "Queue is empty" << endl;
	}
	else
	{
		for (ptr = front; ptr != NULL; ptr = ptr->next)
		{
			cout << ptr->data << " ";
		}
		cout << endl;
	}
}

int main()
{
	int ch;
	while (1)
	{
		cout << "1. Enqueue" << endl;
		cout << "2. Dequeue" << endl;
		cout << "3. Display" << endl;
		cout << "4. Exit" << endl;
		cout << "Enter your choice: ";
		cin >> ch;

		switch (ch)
		{
		case 1:
			enqueue();
			break;

		case 2:
			dequeue();
			break;

		case 3:
			display();
			break;

		case 4:
			exit(1);
			break;

		default:
			cout << "Entered choice is invalid" << endl;
		}
	}
	return 0;
}

