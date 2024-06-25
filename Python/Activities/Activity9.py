list1 = [1,32,43,54,72,11,23]
list2 = [55,66,33,12,76,87,49]

print("My First List " , list1)
print("My Second List " ,list2)

list3 =[]

#even
for num1 in list1:
    if(num1%2==0):
     list3.append(num1)
#odd
for num2 in list2:
   if(num2%2!=0):
      list3.append(num2)

print(" My Final Output is : " ,list3)
