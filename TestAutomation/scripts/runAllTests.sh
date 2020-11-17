#!/bin/bash

cd ../../api/target/classes/org/openmrs

count=1

for file in *
	do
	
	cFile=$(echo $file | tr "." "\n")

	num=1
	
	for part in $cFile
		do
		if [ $num = 1 ]; then
			name=$part
		fi
		num=2
	done
	
	if [ $count -lt 10 ]; then
		test="Test0"$count
	else
		test="Test"$count
	fi
	
	#echo "Is $name = to $test"
	if [ $name = $test ]; then
	
		# Insert portion to travel to the test case information files
		# and read in the needed arguments to run the current test case
		# Currently, all arguments are hardcoded.
		# Other parts in this area will be creating the test results html file
		
		count=$((count+1))
		echo "$name"
		#echo "$count"
		cd ..
		cd ..
		java org/openmrs/$name
		#java org/openmrs/Test10
		#cd ~/Desktop/openmrs-core/TestAutomation/oracles Location where we will eventually print the raw test results
		cd org/openmrs
	fi
		
done
