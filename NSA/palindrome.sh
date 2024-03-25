read -p "Enter the variable: " str

r="$(rev temp)"

if [ r -eq str ]
	then echo "palindrome"
	else
	echo "not palindrome"
fi

