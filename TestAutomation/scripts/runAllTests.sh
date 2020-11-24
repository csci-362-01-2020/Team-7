#!/bin/bash

rm ../reports/finalReport.html
rm ../oracles/results.txt

cd ../../openmrs-core/api/target/classes/org/openmrs

count=1

echo "<H1>Test Results:</H1><br>"  >> ../../../../../../TestAutomation/reports/finalReport.html

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
		cd ../../../../../../TestAutomation/testCases
		
		if [ $count -lt 10 ]; then
			file="testCase0"$count".txt"
		else
			file="testCase"$count".txt"
		fi

		info=(0 1 2 3 4 5)
		n=0
		
		while read line; do

			#echo "Line info: $line"
			info[$n]=$line
			n=$((n+1))

		done < $file

		cd ../../openmrs-core/api/target/classes/org/openmrs

		
		# Run an individual case
		count=$((count+1))

		cd ..
		cd ..
		
		java org/openmrs/$name ${info[4]} >> ../../../../TestAutomation/oracles/results.txt
		
		out="$(java org/openmrs/$name ${info[4]})"

		cd org/openmrs
		
		echo ""
		
		report=../../../../../../TestAutomation/reports/finalReport.html
		
		# HTML code for reporting the tests
		echo "<BLOCKQUOTE><B><U>Test ID ${info[0]}</U></B><br>" >> $report
		echo "<UL><LI>Requirements: ${info[1]}" >> $report
		echo "<LI>Component: ${info[2]}" >> $report
		echo "<LI>Method: ${info[3]}" >> $report
		echo "<LI>Test Input: ${info[4]}" >> $report
		echo "<LI>Expected Outcome: ${info[5]}" >> $report
		echo "<LI>Actual Outcome: $out</UL>" >> $report
		
		if [ $out = ${info[5]} ]; then
			echo "Passed</BLOCKQUOTE><br><br>" >> $report
		else
			echo "Failed</BLOCKQUOTE><br><br>" >> $report
		fi
		
	fi
		
done

xdg-open $report
