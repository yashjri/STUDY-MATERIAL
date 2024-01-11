print("This is day 5th list ")
Bird=['Harpic eagle ','Falcon','Dove','Parrot','Ostrich']
for item in Bird:
    print(item)
print(len(Bird))
print("Biggest bird in the world is",Bird[4])
print("Let's add a new bird in the above list")
Bird.insert(3,"Moa")
print("The biggest bird in the Australia which is extinct is",Bird[3])
Bird.remove('Dove')
for item in Bird:
    print(item)
print("Let's create a new list which consist most venomous snakes and the gaint one which can eat a hole human\n")
snake=['King-cobra','Spectacel-cobra','Spitting-cobra','Inland-Taipan','Black-Mamba']
Gaint_snakes=['Reticulated-python','Indian-python','Green-anaconda','African rock-python','Burmes-python']
print("Biggest snake in the world is",Gaint_snakes[0])
print("Most venomous snake in the world is",snake[3])
print("\n")
print("Let's have a look at some of the snakes names")
all_snakes=snake+Gaint_snakes
for item in all_snakes:
    print(item,"\t")

