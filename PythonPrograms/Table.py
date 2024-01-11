num = int(input("Enter the number between 1 to 10: "))

if num >= 1 and num <= 10:
    print("Multiplication table of",num,"is :")
    for i in range (1,11):
        print(num,"x",i,"=",num * i)
else:
    print("Invalid number try again!")