import gtts
import playsound

text = input("Enter what you want me to pronounce: ")
sound = gtts.gTTS(text, lang="en")
sound.save("Welcome.mp3")
playsound.playsound("Welcome.mp3")