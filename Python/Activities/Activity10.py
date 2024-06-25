tupple = tuple(input("Enter Your Tupple Number : ").split(","))
print("Given list is ", tupple)

print("Elements that are divisible by 5:")
for num in tupple:
    if (int(num) % 5 == 0):
        print(num)