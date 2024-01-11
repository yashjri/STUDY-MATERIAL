#PROGRAM TO CHOOSE YOUR FAVORITE COLOR
print("1.Red")
print("2.Green")
print("3.Blue")
print("4.Orange")
print("5.Yellow")
print("6.Black")

choice = int(input("Select Your Favorite Color - "))

if(choice==1):
    print("You choose Red!")
elif(choice==2):
    print("You choose Green!")
elif(choice==3):
    print("You choose Blue!")
elif(choice==4):
    print("You choose Orange!")
elif(choice==5):
    print("You choose Yellow!")
elif(choice==6):
    print("You choose Black!")
else:
    print("You made an invalid choice!")


#PROGRAM OF SECRET NUMBER USING NESTED IF STATEMENTS

one = int(input("Type a number between 1 and 10 - "))    
two = int(input("Type a number between 1 and 10 - "))

if(one >= 1) and (one <= 10):
    if(two >= 1) and (two <= 10):
        print("Your secret number is - ",one * two)
    else:
        print("Incorrect second value!")
else:
    print("Incorrect first value!")


#PROGRAM OF CREATING A BREAKFAST MENU

print("1.Eggs")
print("2.Pancakes")
print("3.Waffles")
print("4.Oatmeal")

mainchoice = int(input("Choose a breakfast item - "))

if(mainchoice == 2):
    meal = "Pancakes"
elif(mainchoice == 3):
    meal = "Waffles"

if(mainchoice == 1):
   print("1.Wheat Toast")
   print("2.Sour DOUGH")
   print("3.Rye Toast")
   print("4.Pancakes")
   bread = int(input("Choose a type of bread - "))

   if(bread == 1):
       print("You choose Eggs with Wheat Toast.")
   elif(bread == 2):
       print("You choose Eggs with Sour DOUGH.")
   elif(bread == 3):
       print("You choose Eggs with Rye Toast.")
   elif(bread == 4):
       print("You choose Eggs with Pancakes.")
   else:
       print("We have Eggs,but not that kind of bread.")

elif(mainchoice == 2) or (mainchoice == 3 ):
    print("1.Syrup")
    print("2.Strawberries")
    print("3.Powdered Sugar")
    topping  = int(input("Choose a topping - "))

    if(topping == 1):
        print("You choose " + meal + " with Syrup.")
    elif(topping == 2):
        print("You choose " + meal + " with Strawberries.")
    elif(topping == 3):
        print("You choose " + meal + " with Powdered Sugar.")
    else:
        print("We have " + meal + ",but not that topping.")

elif(mainchoice == 4):
    print("You choose Oatmeal.")

else:
    print("We dont serve that breakfast item!")
