fruit_dictionary={
"guava": 10,
"mango": 5,
"papaya": 20,
"orange": 5
}
check = input("What are you looking for? ").lower()
 
if(check in fruit_dictionary):
    print("Yes, this is available")
else:
    print("No, this is not available")
