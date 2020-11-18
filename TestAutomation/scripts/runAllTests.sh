#!/bin/bash

rm ~/Desktop/TestAutomation/oracles/results.txt

cd ../../openmrs-core/api/target/classes/org/openmrs

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
	
	if [ $name = $test ]; then
		
		#Current test case
		echo "$name"
		
		
		# Find test case info
		cd ~/Desktop/TestAutomation/testCases
		
		if [ $count -lt 10 ]; then
			file="testCase0"$count".txt"
		else
			file="testCase"$count".txt"
		fi

		echo "$file"

		info=(0 1 2 3 4 5)
		n=0
		
		while read line; do

			#echo "Line info: $line"
			info[$n]=$line
			n=$((n+1))

		done < $file

		#echo ${info[4]}

		cd ../../openmrs-core/api/target/classes/org/openmrs

		
		# Run an iindividual case
		count=$((count+1))

		cd ..
		cd ..
		
		java org/openmrs/$name ${info[4]}
		
		echo ${info[5]} >> ~/Desktop/TestAutomation/oracles/results.txt

		#echo java org/openmrs/$name ${info[4]} | tee ~/Desktop/TestAutomation/oracles/results.txt

		#cd ~/Desktop/openmrs-core/TestAutomation/oracles Location where we will eventually print the raw test results

		cd org/openmrs
		
		echo ""
	fi
		
done
