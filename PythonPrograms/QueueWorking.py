import queue

myqueue = queue.Queue(3)

print(myqueue.empty())
input("Press any key when ready...")

myqueue.put(1)
myqueue.put(2)
print(myqueue.full())
input("Press any key when ready...")

myqueue.put(3)
print(myqueue.full())
input("Press any key when ready...")

print(myqueue.get())
print(myqueue.empty())
print(myqueue.full())
input("Press any key when ready...")

print(myqueue.get())
print(myqueue.get())
