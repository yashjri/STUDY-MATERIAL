print("This is day 4th and it consist of String")
name='Manan_chawla'
print(name)
print(len(name))

sentence="I am Optimas prime , leader of autobots "
print(sentence)

first ="Optimas Prime : "
second="Honour to the end \n"
full=first+second
print(full)

first_name = 'Manan'
last_name = 'chawla'
language = 'Python'
formated_string = 'I am %s %s. I teach %s' %(first_name, last_name, language)
print(formated_string)

radius=int(input("Enter the value of raduis \n"))
pi = 3.14
area = pi * radius * radius
formated_string = 'The area of circle with a radius %d is %.2f.' %(radius, area) 
print(area)

a = int(input('enter the value of a '))
b = int(input('enter the value of b'))

print('{} + {} = {}'.format(a, b, a + b))
print('{} - {} = {}'.format(a, b, a - b))
print('{} * {} = {}'.format(a, b, a * b))
print('{} / {} = {:.2f}'.format(a, b, a / b))
print('{} % {} = {}'.format(a, b, a % b))
print('{} // {} = {}'.format(a, b, a // b))
print('{} ** {} = {}'.format(a, b, a ** b))

one='TANUDIDU'
a,b,c,d,e,f,g,h=one
print(a)
print(b)
print(c)
print(d)
print(e)
print(f)
print(g)
print(h)

greeting = 'Hello, Didu'
print(greeting[::-1])

challenge = 'tanu didu'
print(challenge.capitalize())
print(challenge.expandtabs())   
print(challenge.expandtabs(10))


first_name = 'Manan'
last_name = 'chawla'
age = 16
job = 'King'
country = 'Finland'
me = 'I am {} {}. I am {} years old.I am the {} of {}.'.format(first_name, last_name, age, job, country)
print(me)
