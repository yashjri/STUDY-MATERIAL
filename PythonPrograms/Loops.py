#BASIC FOR LOOP PROGRAM

letternum = 1
for letter in "Yash!":
    print("letter",letternum,"is", letter)
    letternum +=1
    
#PROGRAM FOR BREAKING LETTER USING FOR LOOP AND IF STATEMENT

value = input("Type less than 6 characters - ")
LetterNum = 1

for Letter in value:
    print("Letter",LetterNum,"is", Letter)
    LetterNum += 1
    if LetterNum > 3:
        print("The String is too long!")
        print("------------------------")
        break


#SAME PROGRAM USING CONTINUE STATEMENT

Letternum = 1
for letter in "Yash!":
    if letter == "s":
        continue
        #pass
        print("Encountered s,not processed.")
    print("Letter",Letternum,"is",letter)
    Letternum +=1

#SAME PROGRAM USING IF ELSE STATEMENT

value = input("Type less than 8 characters - ")
LetterNum = 1

for Letter in value:
    print("Letter",LetterNum,"is", Letter)
    LetterNum += 1
else:
    print("The string is blank.")
    print("------------------------")

#SIMPLE PROGRAM USING WHILE LOOP (TO COUNT NUMBERS)

counting = 0
while counting <= 10:
    print("The COUNT is",counting)
    counting += 1

#PROGRAM TO CREATE TABLE 1 TO 10

X = 1
Y = 1

print('{:>4}'.format(' '),end = ' ')

for X in range (1,11):
    print('{:>4}'.format(X),end = ' ')

print()

for X in range (1,11):
    print('{:>4}'.format(X),end = ' ')
    while Y <= 10:
        print('{:>4}'.format(X * Y),end = ' ')
        Y+= 1
print()
Y = 1
