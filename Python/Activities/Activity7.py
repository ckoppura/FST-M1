numbers = list(input("Enter list of numbers : ").split(","))
sum =0

for number in numbers:
    sum =sum+int(number)
    
print(sum)