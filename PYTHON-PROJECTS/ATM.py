print("welcome to the Central Bank Of India ")
restart=('Y')
chances = 3
balance= 67.14
while chances >=0:
    pin=int(input('Please enter your four digit pin '))
    if pin==(1234):
        print('Pin entered is correct')
        while restart not in ('n','No','no','N'):
            print("Press 1 for your balance \n")
            print("Press 2 for making a withdrawl\n")
            print("Press 3 to pay in\n")
            print("Press 4 to return \n")
            option = int(input("what would you like to choose?\n"))
            if option ==1:
                print("Your balance is ",balance,"\n")
                restart=input("would you like to go back?\n")
                if restart in ('n','No','no','N'):
                    print("Thank you")
                    break
                elif option==2:
                    option2=('Y')
                    withdrawl=float(input("How much you want to withdraw ? \n 100,500,1000,2000 for other enter 1:"))
                    if withdrawl in [100,500,1000,2000]:
                        balance= balance - withdrawl
                        print("your balance is now ",balance)
                        restart=input("would you like to go back ?")
                        if restart in ('n','No','no','N'):
                            print("Thank you")
                            break
                        elif withdrawl !=[100,500,1000,2000]:
                            print("Invalid amount , please re try \n")
                            restart=('Y')
                        elif withdrawl == 1:
                                withdrawl=float(input("Please enter your amount \n"))
                        elif option==3:
                                    pay_in=float(input("how much would you like to pay?\n"))
                                    blanace= balance+pay_in
                                    print("your balance is ",balance)
                                    restart=input("would you like to go back?\n")
                        if restart in ('n','No','no','N'):
                                        print("Thank you\n")
                                        break
                        elif option ==4:
                                        print("Please wait while your card is returned\n")
                                        print("Thank you ")
                                        break
                        else:
                                        print("please enter correct number\n")
                                        restart=('y')
                        elif pin!=('1234'):
                                            print("incorrect password")
                                            chances= chances -1
                        if chances==0:
                                                print("no more tries")
                                                break
