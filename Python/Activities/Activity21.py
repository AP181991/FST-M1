import pytest


def test_addition():
	

	num1 = 12
	num2 = 20
    
	
	sum = num1 + num2

	
	assert sum == 32

# Subtraction test
def test_subtraction():
  
	
	num1 = 60
	num2 = 25
    
	
	diff = num1 - num2

	
	assert diff == 35

# Multiplication test
def test_multiplication():
  
	
	num1 = 10
	num2 = 5
    
	# Multiply them
	prod = num1 * num2

	# Assertion
	assert prod == 50

# Division test
def test_division():
  

	num1 = 60
	num2 = 5
    
	
	quot = num1 / num2

	
	assert quot == 12