import pytest

# Additon test
def test_addition():
	
    
	num1 = 6
	num2 = 7
    
	
	sum = num1 + num2

	
	assert sum == 13

# Subtraction test
def test_subtraction():
  
	num1 = 25
	num2 = 10
    
	# Subtract them
	diff = num1 - num2

	# Assertion
	assert diff == 15

# Multiplication test
@pytest.mark.activity
def test_multiplication():
  
	# Initialize two numbers
	num1 = 5
	num2 = 10
    
	# Multiply them
	prod = num1 * num2

	# Assertion
	assert prod == 50

# Division test
@pytest.mark.activity
def test_division():
  
	# Initialize two numbers
	num1 = 100
	num2 = 5
    
	# Divide them
	quot = num1 / num2

	# Assertion
	assert quot == 12