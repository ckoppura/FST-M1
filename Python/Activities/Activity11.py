fruits ={
    "apple" :10,
    "Banana" :16,
    "Papaya" : 25
}

checkIf_avilable = input("Check required fruit is present or not : ")

if(checkIf_avilable in fruits):
    print("Available")
else:
    print("Not Aviailable")