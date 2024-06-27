import pandas
from pandas import ExcelWriter

data = {
    "Firstname": ["Jake", "Hello"],
    "LastName": ["Taylor", "Rose"],
    "Email": ["Jake.Tylor@gmail.com", "Jake.Rose@gmail.com"],
    "Phone Number": ["9848022338", "9876543211"],
}

dataFrame = pandas.DataFrame(data)
print(dataFrame)

writer = ExcelWriter("sample.xlsx")
dataFrame.to_excel(writer, "Sheet1", index=False)
writer.close()
