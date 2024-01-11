import csv

class formatdata:
    def __init__(self,name="",age=0,married=False):
        self.name = name
        self.age = age
        self.married = married

    def __str__(self):
        outstring = "'{0}', {1}, {2}" .format(
            self.name,
            self.age,
            self.married)
        return outstring

def savedata(filename = "",datalist = []):
    with open(filename,
              "w",newline='\n')as csvfile:
        datawriter = csv.writer(
            csvfile,
            delimeter='\n',
            quotechar=" ",
            quoting=csv.QUOTE_NONNUMERIC)
        datawriter.writerow(datalist)
        csvfile,close()
        print("Data saved!")
