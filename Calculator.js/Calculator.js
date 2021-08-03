var result;
const num1 = parseFloat(prompt("Enter first number"));
const num2 = parseFloat(prompt("Enter second number"));
const operator = prompt("Enter Operator(+ or - or * or /)");
switch(operator){
	case '+':
		result = num1 + num2;
		console.log('${num1} + ${num2} = ${result}');
		break;
	case '-':
		result = num1 - num2;
		console.log('${num1} - ${num2} = ${result}');
		break;
	case '*':
		result = num1 * num2;
		console.log('${num1} * ${num2} = ${result}');
		break;
	case '/':
		result = num1 / num2;
		console.log('${num1} / ${num2} = ${result}');
		break;
	default:
		console.log("Invalid operator is selected");
		break;
}