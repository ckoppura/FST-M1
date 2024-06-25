numbers = [1,2,3,4,5,66]

def sum(listOfNumbers):
    sum=0
    for number in numbers:
        sum=sum+number
    return sum

result = sum(numbers)

print(result)