print("------------------------Welcome--------------------")
print("-----------------CENTRAL BANK OF INDIA-------------")
balance=4000
pin=int(input("Enter your 4-digit pin for accessing the ATM\n"))
if(pin==1234):
    print("Choose option below \n")
    print("Press 1 for checking your balance\n")
    print("Press 2 for withdraw amount\n")
    print("Press 3 for adding amount in the account\n")
    print("Press 4 for changing PIN")
option=int(input("Enter option "))
if(option==1):
    print("Your current balance is",balance)
elif(option==2):
    withdraw=int(input("Enter amount you want to withdraw\n"))
    balance=balance-withdraw
    print("Your balance is ",balance)
elif(option==3):
    pay_in=int(input("Enter amount you want to add in the account\n"))
    balance=balance+pay_in
    print("Your balance is ",balance)
elif(option==4):
    old_pin=pin
    print("Your previous pin is",old_pin)
    New_pin=int(input("Enter your new pin\n"))
    pin=New_pin
    print("Your new pin is",New_pin)
else:
    print("You have choose wrong option , try again")
choice=input("press Y for to remove card\n")
if(choice=='Y'):
    print("Thanks for using our services\n")
    print("Best regards CENTRAL BANK OF INDIA\n")
else:
    print("choose option again")
    
        
