class Employee:
    def __init__(self, name,salary):
        self.name = name
        self.salary = salary

    def getSalary(self):
       print(self.salary)
       # return self.salary

yash = Employee("Yash","50000")
print(yash.name)
# print(yash.salary)
yash.getSalary()

manan = Employee("Manan","20000")
print(manan.name)
# print(manan.salary)
manan.getSalary()