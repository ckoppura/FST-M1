ListOfNumbers  = list(input("Enter list of numbers : ").split(","))
print("Given List Of Numbers : " ,ListOfNumbers)

if(ListOfNumbers[0]==ListOfNumbers[-1]):
    print (True)
else:
    print(False)