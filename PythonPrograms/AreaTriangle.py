#PROGRAM TO CALCULATE AREA OF TRIANGLE.
side1 = 5
side2 = 6
side3 = 7
#CALCULATE SEMI-PERIMETER
s=(side1+side2+side3)/2
#CALCULATE AREA
area=(s*(s-side1)*(s-side2)*(s-side3))**0.5
print('Area of Triangle is %0.2f'%area)
