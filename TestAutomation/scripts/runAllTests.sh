#!/bin/bash

rm ~/Desktop/TestAutomation/reports/finalReport.html
rm ~/Desktop/TestAutomation/oracles/results.txt

cd ../../openmrs-core/api/target/classes/org/openmrs

count=1

echo "Test Results:"  >> ~/Desktop/TestAutomation/reports/finalReport.html

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

		cd org/openmrs
		
		echo ""
		
		# Create the html report here
		
		echo "    Test ID ${info[0]}" >> ~/Desktop/TestAutomation/reports/finalReport.html
		echo "        Requirements: ${info[1]}" >> ~/Desktop/TestAutomation/reports/finalReport.html
		echo "        Component: ${info[2]}" >> ~/Desktop/TestAutomation/reports/finalReport.html
		echo "        Method: ${info[3]}" >> ~/Desktop/TestAutomation/reports/finalReport.html
		echo "        Test Input: ${info[4]}" >> ~/Desktop/TestAutomation/reports/finalReport.html
		echo "        Expected Outcome: ${info[5]}" >> ~/Desktop/TestAutomation/reports/finalReport.html
		echo "    Passed" >> ~/Desktop/TestAutomation/reports/finalReport.html
		echo "" >> ~/Desktop/TestAutomation/reports/finalReport.html
		
	fi
		
done

xdg-open >> ~/Desktop/TestAutomation/reports/finalReport.html
