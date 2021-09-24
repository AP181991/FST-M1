from typing import Pattern


def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))

Pattern = int(input("Enter a number: "))

if Pattern <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(Pattern):
        print(fibonacci(i))