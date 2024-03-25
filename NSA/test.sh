echo "Hello"
n=1
while [ $n -le 10 ]
do
	echo $n
	n=$((n+1)) 
done

echo ""
echo "Using seq:"
for i in $(seq 5) 
	do echo $i
	done
	
#seq 10
 # seq 5 10
  #seq 5 20 2
 # seq 5 10 
 # seq 0 2 10 
 # seq 5 2 20 
  #seq 5 1 0 
   #seq 5 0 
   #seq 1 -1 5 
   
#until :
#the until loop is executed as many times the condition or command evaluates to false, the loop terminates when the condition or command becomes true.

#syntax: until [ condition ]
#			do statements
#			done
			
echo ""
echo "using until"

i=1
until [ $i -ge 5 ]
do 
	echo $i
	i=$(($i+1))
done

echo ""
echo "colors:"
color="red,green,blue" 
for c in $color
do
	echo $c
done


#switch:

# case expr in 
# pattern1) 
# 	statement ;;
#  pattern2)
# 	statement ;;
#  *)
#  	stmt;;
#  esac	

#function:
#	syntax:
#		myfun() {
#			body
#		}
		
#		myfun   ---call the function


