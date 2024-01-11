#include <iostream>
#include<cstring>
using namespace std;

/*
// write a c++ program to  append string and also how to use strcat method
int main()
{
    char str[40];
    strcpy(str,"one , ");
    strcat(str,"two , ");
    strcat(str,"three , ");
    cout<<str<<endl;
    return 0;
}
*/


/*
// write a c++ program to represent the use of strcmp() method
int main()
{
    char n1[40]="MANAN";
    char n2[40]="MANAN";
    int result=strcmp(n1,n2);
    if(result==0)
    {
        cout<<"they are equal";
    }
    else if (result>=0)
    {
        cout<<"first is not matched with second ";
    }
    else
    {
        cout<<"they are not equal";
    }
    return 0;
}
*/

/*
// write a c++ program to show how to use strcpy method
int main()
{
    char name[30];
    strcpy(name,"Manan");
    cout<<"the name is "<<name<<endl;
    return 0;
}
*/



/*
// write a c++ code to represent the use of strlen
int main()
{
    char line[100];
    cout<<"Enter a line "<<endl;
    cin.get(line,100);
    cout<<"The length of line is "<<strlen(line)<<endl;
    return 0;
}
*/


/*
// write a c++ program to show the use of strrev method
int main()
{
    char n[100];
    cout<<"Enter the value of name"<<endl;
    cin.get(n,100);
    cout<<"Reverse string is : "<<strrev(n);
    return 0;
}
*/

/*
//write a c++ code to represent the use of strlwr or strupr method
int main()
{
	char s1[100]="THIS IS ME ";
	cout<<"LOWER_CASE : "<<strlwr(s1)<<endl;
	
	char s2[100]="this is you";
	cout<<"UPPER_CASE : "<<strupr(s2);
	return 0;
}
*/


/*
//         LINEAR SEARCH 
int main()
{
	int a[5]={12,13,14,15,16};
	int chk;
	cout<<"Enter the value "<<endl;
	cin>>chk;
	for(int idx=0;idx<5;idx++)
	{
		if(chk==a[idx])
		{
			cout<<"Value is found"<<endl;
			break;
		}
	}
	return 0;
}
*/

/*
//      BINARY SERACH 
int main()
{
	int a[5]={1,2,3,4,5};   // ascending order
	int first = 0, last = 4, num, mid;
    num = 3;
    bool found = false;
    do 
	{
        mid = (first + last) / 2;
        if (a[mid] == num) 
		{
            cout << "Value is found" << endl;
            found = true;
            break;
        } 
		else if (a[mid] < num) 
		{
            first = mid + 1;
        } 
		else 
		{
            last = mid - 1;
        }
    } while (first <= last);

    if (!found) 
	{
        cout << "Not found" << endl;
    }

    return 0;
}
*/





//        SELECTION SORT
int main()
{
	int a[5]={4,1,3,2,5};
	int i,j,cn,temp;
	for(i=0;i<4;i=i+1)
	{
		cn=i;
		for(j=0;j<5;j=j+1)
		{
			if(a[cn]>a[j])
			{
				cn=j;
				temp=a[cn];
				a[cn]=a[i];
				a[i]=temp;
			}
		}
	}
	
	cout << "Sorted array: ";
    for (i = 0; i < 5; i = i + 1) {
        cout << a[i] << " ";
    }
    cout << endl;
	return 0;
}
