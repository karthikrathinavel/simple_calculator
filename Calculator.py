num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
op = input("Enter operator(+ - * /): ")
result = 0;
if(op == '+'):
	result = num1 + num2
	print("sum: " + str(result))
elif(op == '-'):
	result = num1 - num2
	print("sub: " + str(result))
elif(op == '*'):
	result = num1 * num2
	print("Mul: " + str(result))
elif(op == '/'):
	result = num1 / num2
	print("Div: " + str(result))
else:
	print("Invalid operator")