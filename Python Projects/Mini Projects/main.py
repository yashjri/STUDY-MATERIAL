from Game1 import guess_the_number
from Game2 import rock_paper_scissors
from Game3 import TicTacToe




while True:
    txt = """" MINI GAMES!!!
    -Guess the Number(1)
    -Rock,Paper,Scissors(2)
    -Tic Tac Toe(3)
    -ConnectFour(4)
    -Wordle(5)
Select a game (press a number or 'q' to quit):"""
    value = input(txt)
    if value == "1":
        guess_the_number(100)
    elif value == "2":
        rock_paper_scissors()
    elif value == "3":
        game = TicTacToe()
        game.play()
    elif value == "4":
        pass
    elif value == "5":
        pass
    elif value == "q":
        break