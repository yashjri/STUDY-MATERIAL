def printblue():
    print("You chose Blue!\r\n")
def printred():
    print("You choose Red!\r\n")
def printorange():
    print("You choose Orange!\r\n")
    
colorselect = {
    0:printblue,
    1:printred,
    2:printorange
}

selection = 0
while(selection != 3):
    print("0. Blue")
    print("1. Red")
    print("2. Orange")
    print("3. Quit")
    
    selection = int(input("Select a color option:"))
    if(selection >= 0) and (selection < 3):
        colorselect[selection]()
