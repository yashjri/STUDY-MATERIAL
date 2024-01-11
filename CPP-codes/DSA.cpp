/*
                                    # DSA #
!!intro---
 considered as a way of storing the information or raw information in computer is said to be data structure .
 DS are impelemented with the help of data types.
 operation , manipulation is done by any programming language.
 
 
!! Data 
   is a collection of raw hand information 
   it is collected in the form of characters, integer and text and code numbers.
   ex : int arr[]={1,2,3,4,5};
        string arr1[]={'a','b'};
     first name , middle name , last name     roll
      Max			Denial      mcgrawhill    41
      Max           Denial      chaltmete     42
      here group items :-   NAME
           elementry items :- Roll               
 
!! Record
   collection of the data items which may be differ from each other 

!! File
   collection of various type of record of same entity
   
!! Attribute & entity 
   entity is said to be a way or presenting the real world of object
   property of entity is said to be attribute
   
!! Field 
   single information about the entity which is represented by the attribute
   
   


!! Need of DS
1.data organization
2.it tell us how the data is being stored and how it can be access
3.sorting and searching of the data
4.manage the data is done by using the DS


!! Features of DS
1.Robustness
2.Adaptability
3.Reusability


//System.out.println();        // java.io uski yeh he ek package feature jo use kerta he java input/ouptut stream


!! Classification of DS
                                           |DS|
    |Primitive|                                                                           |Non-Primitive|
    1.INT                                                                                  A.Linear 
    2.CHAR                                                                                  Array,Linkedlist,Stacks,Queues
    3.BOOLEAN                                                                             B.Non-Linear
    4.REAL(leastused)                                                                                Tree,Graph,Heap
    5.String
    
    static ds--> array 
    dynamic ds --> linked list 
    
    
    
!! operation of DS
a.Traversing  
b.searching
c.inserting
d.deleting
e.sorting
f.merging
    
!!ADTs
  Abstract Data Types are the special data types which are likely user defined and mostly operation perform on them are done by using the function .
  Data structure like array , stack , linkedlist etc are example of ADTs.
  
  * Advantage of ADTs
    1.provide high level description of data structure and thier associated operation
    2.hides the internal representation & detail of the data structure
    3.operation , modification can be done easily by using them without affecting the code.
    


!! Algorithms:-
   It is step by step procedure whoch defines a set of instruction to be executed in certain order to get the desired output .
   categories of Algo-->
   1.Search
   2.Sort
   3.Delete
   4.Update
   5.Insert
   
   *Characterstics of algo-->
    1.Clear and unambigous
    2.well defined inputs
    3.finite mess 
    4.Feasible 
    5.Langugae independent
    
   *Advantage of algo-->
    1.Easy to understand
    2.Step wise procedure to any program
    3.Easy to modify
    
   *Disadvantage of algo-->
    1.Writing algo takes time
    2.looping and branching statement are difficult to represent in the algo
    3.can be complex
    
   *Approach to algo-->
    1.Top down ----> in this we start module from top and then incrementally add the data to cells
    2.Bottom down ----> in this we start module from bottom and then operation that provide layer of abstraction are implemented.
    
    EX -- Design a algo to add two numbers and display the result
          S1-Start
          S2-Declare a-10 , b=20 and sum as integer data type
          S3-Define value of a , b 
          S4-Add the value of a & b
          S5-Store the value in sum
          S6-Print sum
          S7-Stop
          
   *Algorthim Desgin Concepts
    1.Divide and conquer -->
      in this we divide a problem into sub problems and then we solve each problem and at last we joint the all sub problem's solution
      to get our main solution of our major problem.
      
    2.Backtraking -->
      technique used in computer programming to solve problems by exploring all possible solutions systematically backtracking involves 
	  trying out different options and undoing or "backtracking" whenever we reach a point where a particular option does not lead to a valid solution.
	  By doing this, we can efficiently explore different paths until we find the desired solution or exhaust all possibilities.
	  
	3.Dynamic programming -->
	  efficiently solve complex problems by breaking them down into overlapping subproblems and solving each subproblem only once. 
	  It stores the solutions of subproblems in a table or memoization array, so that the solutions can be reused whenever needed
	  avoiding redundant computations.
	
	870   
    
    total 
	structure 10 --- 5 easy ---  3 hard --- 2 own methods
	array     10 --- 5 easy ---  3 hard --- 2 own methods
    
    
    !! Stack 
       a stack is a linear data structure in which insertion and deletion are allowed only at 
       the end called the top of the stack.
       
       
       * operation of stacks
         1.push
         2.pop
         3.isEmpty
         4.isFull
         5.peek
         6.count
         7.change
         8.top
         9.size
    
*/
/*
#include<iostream>
using namespace std;
 

int main()
{
	int a,b,c;
	a=20;
    b=30;
    c=20+30;
    int arr[5]={1,2,4,5,6};
    cout<<c<<endl;
    for(int i=0;i<=5;i++)
    {
    	cout<<arr[i];
	}
    return 0;
}
*/


#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
struct Info
{
	string name;
	int roll;
};
class ted
{
	private:
		    int age;
	public :
		     void gets()
		     {
		     	cin>>age;
		
			 }
			 void display()
			 {
			 	cout<<"Age : "<<age<<endl;
			 }
};
int main()
{
	// one dimensional array
	int arr[5]={0,1,2,3,4};
	for(int i=0;i<5;i++)
	{
		cout<<"value of array is --> "<<arr[i]<<endl;
	}
	
	// structure
	Info i1;
	i1.name="Manan";        // object_name.struct_member="value assign";
	i1.roll=42;
	cout<<"Name : "<<i1.name<<endl;
	cout<<"Roll : "<<i1.roll<<endl;
	
	// class
	ted t1;
	t1.gets();
	t1.display();
	
	// two dimensional array
	string cars[][3]={
	                  {"BMW","MERCS","AUDI"},
	                  {"TOYOTA","LEXUS","HYUNDAI"}
	                };
	int row=sizeof(cars)/sizeof(cars[0]);
	int cols=sizeof(cars[0])/sizeof(cars[0][0]);
	for(int p=0;p<row;p++)
	{
		for(int j=0;j<cols;j++)
		{
			cout<<"Car name : "<<cars[p][j]<<endl;
		}
	}
	
	return 0;
}











