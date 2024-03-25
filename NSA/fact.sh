read -p "Enter a number " n
fact=1
for i in $(seq $n)
do
	fact=$(($fact*$i))
done
echo "factorial: $fact"
