read -p "Enter 3 numbers: " a b c
if [ $a -gt $b ]
then if [ $a -gt $c ]
	then echo $a "is greater"
	else
	echo $c "is greater"
	fi
fi
if [ $b -gt $a ]
then if [ $b -gt $c ]
	then echo $b "is greater"
	else
	echo $c "is greater"
	fi
fi

seq 5


