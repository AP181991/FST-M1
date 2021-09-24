	

listOne = [40, 80, 33, 41, 15]
listTwo = [13, 53, 32, 36, 24]
 

print("First List ", listOne)
print("Second List ", listTwo)
 

thirdList = []
 

for num in listOne:
    if (num % 2 != 0):
        thirdList.append(num)
        

for num in listTwo:
    if (num % 2 == 0):
        thirdList.append(num)
 

print("result List is:")
print(thirdList)
