from collections import Counter

mylist = [1,2,3,4,1,2,3,1,2,1,5]
listcount = Counter(mylist)

print(listcount)

for thisitem in listcount.items():
    print("Item:",thisitem[0],
            "Appears:",thisitem[1])
print("The value 1 appears {0} times."
      .format(listcount.get(1)))    
