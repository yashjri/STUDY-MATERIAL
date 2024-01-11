''' DAY 1 to 3 (all in one )'''

a=30
b=50
sum=a+b
mul=a*b
div=a/b
sub=a-b
print("The addition is ",sum)
print("The multiplication is",mul)
print("The divison is ",div)
print("The subtraction is",sub)
print("----------------------------------------------------------------------------------------------")
first_name="manan"
last_name="chawla"
print(first_name,last_name)
print("----------------------------------------------------------------------------------------------")


line='''This is the multiline strings which can be access by using print function and
        the variable use for function have to call in the print-function .'''
print(line)


print("----------------------------------------------------------------------------------------------")
print("I hope everyone is enjoying the python 30 days challenge")
print('day\tTopic\t')
print('1\tvariable')
print('2\toperators')
print("----------------------------------------------------------------------------------------------")
sub1=int(input("enter marks of maths"))
sub2=int(input("enter marks of english"))
sub3=int(input("enter marks of physics"))
sub4=int(input("enter marks of chemistry"))
sub5=int(input("enter marks of hindi"))
avg=(sub1+sub2+sub3+sub4+sub5)/5
if(avg>=90):
    print("grade A")
elif(avg>=80&avg<90):
    print("grade B")
elif(avg>=70&avg<80):
    print("grade C")
elif(avg>=60&avg<70):
    print("grade D")
else:
    print("grade F")

