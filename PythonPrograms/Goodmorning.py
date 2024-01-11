# import time

# name = input("Enter your name: ")

# hours = int(time.strftime('%H'))

# if(0<=hours <= 11):
#     print("Hello",name,"Good Morning!")
# elif(12 <= hours <= 16):
#     print("Hello",name,"Good afternoon!")
# else:
#     print("Hello",name,"Good Evening")  

import time


timestamp = int(time.strftime('%H'))
print(timestamp)
timestamp = int(time.strftime('%M'))
print(timestamp)
timestamp = int(time.strftime('%S'))
print(timestamp)
if timestamp < 12:
    print("Good Morning!")
elif timestamp == 12 and timestamp > 12:
    print("Good afternoon!")
elif timestamp > 18:
    print("Good evening!")
else:
    print("Invalid time")              

