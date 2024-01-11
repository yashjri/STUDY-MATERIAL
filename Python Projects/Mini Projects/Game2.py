import random

def rock_paper_scissors():
    print("Start rock paper scissors")

    r= "rock"
    p = "paper"
    s = "scissors"
    all_choices = [r,p,s]

    user = input(f"Enter a choice ({r},{p},{s}): ")

    if user not in all_choices:
        print("Invalid choice")
        return
    
    computer = random.choice(all_choices)
    print(f"User chose {user}, computer chose {computer}")

    # r>s, p>r, s>p

    if user == computer:
        print("tie")
    elif (user == r and computer == s)  or (user == p and computer == r) or (user == s and computer == p):
        print("You won")
    else:
        print("You lose")    