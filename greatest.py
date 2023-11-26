num1 = int(input("Enter a number: "))
num2 = int(input("Enter a number: "))
num3 = int(input("Enter a number: "))

if num1 > num2:
	if num1 > num3:
		print(f"{num1} is the greatest")
if num2 > num1:
	if num2 > num3:
		print(f"{num2} is the greatest")
if num3 > num2:
	if num3 > num1:
		print(f"{num3} is the greatest")