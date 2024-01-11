import collections

mydeque = collections.deque("abcdef",10)

print("Starting state:")
for item in mydeque:
    print(item, end=" ")

print("\r\n\r\nAppending  and extending right")
mydeque.append("h")
mydeque.extend("ij")

for item in mydeque:
    print(item,end=" ")
print("\r\nmydeque contains {0} items."
      .format(len(mydeque)))

print("\r\nPopping right")
print("Popping {0}".format(mydeque.pop()))
for item in mydeque:
      print(item,end=" ")

print("\r\n\r\nAppending and extending left")
mydeque.appendleft("a")
mydeque.extendleft("bc")
for item in mydeque:
      print(item,end=" ")
print("\r\nmydeque contains {0} items."
      .format(len(mydeque)))

print("\r\nPopping left")
print("Popping {0}".format(mydeque.popleft()))
for item in mydeque:
      print(item,end=" ")

print("\r\n\r\nRemoving")
mydeque.remove("a")
for item in mydeque:
      print(item,end=" ")
