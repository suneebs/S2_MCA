# write a shell to check i value from i to 5 and print values 1 2 and 3 only.

for i in $(seq 5)
do
	if [ $i -eq 4 ]
		then continue
	fi
	echo "$i"
done

#fact, fibo, palindrome, reverse , reverse of string
#develop calculator
#reverse content of file

