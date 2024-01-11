number = float(input(" Please Enter any numeric Value : "))

square = number * number

print("The Square of a Given Number {0}  = {1}".format(number, square))


print("*******************************************************************\n")

import math

x1 = int(input("Enter the First Point Coordinate x1  = "))
y1 = int(input("Enter the First Point Coordinate y1  = "))
x2 = int(input("Enter the Second Point Coordinate x2 = "))
y2 = int(input("Enter the Second Point Coordinate y2 = "))


x = math.pow((x2 - x1), 2)
y = math.pow((y2 - y1), 2)

print("The distance between coordinates of x-axis is ",x)
print("The distance between coordinates of y-axis is ",y)
print(math.sqrt(x + y))
distance = math.sqrt(x + y)

print('The Distance Between Two Points = {0} Units'.format(distance))



print("********************************************************************\n")


key = input("Please enter the Key : ")
value = input("Please enter the Value : ")

myDict={}
myDict.update({key:value})
print("\nUpdated Dictionary = ", myDict)

print("*********************************************************************\n")

first_Dict = {1: 'apple', 2: 'Banana' , 3: 'Orange'}
second_Dict = { 4: 'Kiwi', 5: 'Mango'}
print("First : ", first_Dict)
print("Second : ", second_Dict)

first_Dict.update(second_Dict)
    
print("\nAfter Concatenating : ")
print(first_Dict)


print("*******************************************************************\n")

a = float(input('Please Enter the First side of a Triangle: '))
b = float(input('Please Enter the Second side of a Triangle: '))
c = float(input('Please Enter the Third side of a Triangle: '))


Perimeter = a + b + c


s = (Perimeter) / 2

Area = (s*(s-a)*(s-b)*(s-c)) ** 0.5

print("Area of the triangle is ",Area)

print("***********************************************************************\n")


width = float(input('Please Enter the Width of a Rectangle: '))
height = float(input('Please Enter the Height of a Rectangle: '))

Area = width * height


Perimeter = 2 * (width + height)

print("\n Area of a Rectangle is: %.2f" %Area)
print(" Perimeter of Rectangle is: %.2f" %Perimeter)

print("*************************************************************************\n")
