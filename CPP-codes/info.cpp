#include<iostream>
#include<stdlib.h>
#include<cstring>
using namespace std;
struct info
{
	int roll;
	string name;
	string course;
	string address;
};
int main()
{
	info s1;
	s1.roll=41;
	s1.name="Manan";
	s1.course="BCA";
	s1.address="P-57,Ishwar Nagar , loha-mandi , Jaipur ";
	cout<<s1.roll<<endl;
	cout<<s1.name<<endl;
	cout<<s1.course<<endl;
	cout<<s1.address<<endl;
	return 0;
}
