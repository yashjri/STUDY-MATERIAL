print("Here we are creating a program to help user to get to know about the simple arthimetic operations\n")
print("Here Puts some values and you will get some intersting ouputs\n")
a=int(input("Enter the value of a \n"))
b=int(input("Enter the value of b \n"))
add=a+b
sub=a-b
mul=a*b
div=a/b
print("The value of the addition is : ",add)
print("The value of the subtraction is :",sub)
print("The value of the multiplication is :",mul)
print("The value of the divison is :",div)
print("================================================================")

print("Let's take next step, now learn about the list and tuples in python\n")
lst = []
n = int(input("Enter number of elements : "))
for i in range(0, n):
    ele = int(input())
  
    lst.append(ele) 
      
print(lst)
print("==============================================================")
print("now let's take an example for tuples.")
print("Here we are making a tuple which is pre-defined.")
tpl=('Morbius','Werewolf','Logan','Deadpool','Kraken')
for item in tpl:
    print(item,end="\n")
print("===============================================================")


print("Let's take a look at the statment available in the python")
print("1.For loop")
a=[1,2,3,4,5,6]
print(a)
print("Now we will print this using for loop seprately")
for item in a:
    print(item,end="\t")

print("2.if-statment")
print("Here we are making a program where we enter age of the candidate and if he/she is eligible for voting or not")
age=int(input("Enter the age of candidate\n"))
if(age>=18):
    print("candidate can vote in the election")
else:
    print("candidate can't vote in the election")

print("3.if-elif statement")
print("This will show the working of if-else-if statement")
salary=int(input("Enter the salary\n"))
if(salary<10000):
    print("Are you a intern?")
elif(salary<20000):
    print("So you are a temp")
elif(salary<50000):
    print("You earning a good amount")
else:
    print("You earning more than 50k that's impressive")

