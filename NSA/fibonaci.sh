read -p "Enter the range: " n
first=0
second=1
echo $first
echo $second
for i in $(seq $n)
do
	temp=$(($first+$second))
	first=$second
	second=$temp
	echo $second
done 
	
