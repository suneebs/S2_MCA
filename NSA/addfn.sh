add(){
	read -p "enter num1 and num2: " a b 
	s=$(($a+$b))
	echo "Sum of $a and $b is: $s"
}

add 


