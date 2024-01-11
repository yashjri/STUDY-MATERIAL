#PROGRAM TO DISPLAY A CALENDAR.
#IMPORING CALENDAR MODULE
import calendar
yy=int(input("Enter Year:")) #year
mm=int(input("Enter Month:"))  #month
#displaying calendar
print(calendar.month(yy,mm))
