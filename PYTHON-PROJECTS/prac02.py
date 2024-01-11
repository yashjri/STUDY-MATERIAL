'''This is the first program for python'''


'''def findArea(r):
	PI = 3.142
	return PI * (r*r);
print("Area is %.6f" % findArea(5));'''



radius=int(input("enter the value of radius\n"))
Pi=3.142
Area=radius*Pi
print("The area of circle is ",Area)
print("------------------------------------------------------")
try:
    value =int(input("write a number between 1 to 10\n"))
except ValueError:
    print("You must type a number between 1 and 10")
else:
    if(value>0)and(value<=10):
        print("you typed ",value)
    else:
        print("The value you typed is wrong")
print("-------------------------------------------------------")

actor=['Steve-carelle','Tom-cruize','Mark-ruffalo','Rainn-wilson']
for item in actor:
    print(item,end="\n")
print("--------------------------------------------------------\n")

lst = ['car','bike','bus', 'truck', 'train']
first_item, second_item, third_item, *rest = lst
print(lst)
print("now with the index , we can print the items  of list")
print("1.",lst[2])
print("2.",lst[4])
print("3.",lst[1])
lst.append('plan')
print(lst,end="\n")

print("--------------------------------------------------")




