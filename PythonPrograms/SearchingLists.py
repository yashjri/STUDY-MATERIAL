colors = ["red","orange","black","yellow","green","blue"]

colorselect = ""

while str.upper(colorselect) != "QUIT":
    colorselect = input("Please type a color name:")
    if(colors.count(colorselect) >= 1):
        print("The color exists in the list!")
    elif(str.upper(colorselect) != "QUIT"):
        print("The list doesnt contain the color.")
