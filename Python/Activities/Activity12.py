def calculateSum(num):
  if num:
    
    return num + calculateSum(num-1)
  else:
    return 0
 

sum = calculateSum(10)
 

print(sum)