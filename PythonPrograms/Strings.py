#PROGRAM OF STRINGS

string1 = "Hello Yash "
string2 = "Python is easy"

print(string1[0]) 
print(string1[0:5])#SAME
print(string1[6:11])##SAME
print(string1[:5]) #SAME
print(string1[6:])##SAME

string3 = string1[:6] + string2[:6]
print(string3)

print(string1[6:]*5) #PRINT YASH 5 TIMES
print(string2[:7]*5) #PRINT PYTHON 5 TIMES

print(string1.upper())
print(string1.lower())
print(string1.islower())
print(string1.isalnum())
print(string1.partition("Yash"))
