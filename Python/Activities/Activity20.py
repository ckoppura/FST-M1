import pandas

dataFrame = pandas.read_excel("sample.xlsx")
print(dataFrame)

print("number of rows and columns :" ,dataFrame.shape)	
print("Emails:")
print(dataFrame["Email"])
	
print(dataFrame.sort_values('Firstname'))