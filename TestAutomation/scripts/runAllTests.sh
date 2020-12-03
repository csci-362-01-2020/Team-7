#!/bin/bash

rm ../reports/finalReport.html
rm ../oracles/results.txt

cd ../testCases

count=1

echo "<H1>Open MRS Test Results:</H1><br>"  >> ../reports/finalReport.html

for file in *
	do
	#Current test case
	echo "$file"

	info=(0 1 2 3 4 5 6)
	n=0
	
	while read line; do

		#echo "Line info: $line"
		info[$n]=$line
		n=$((n+1))

	done < $file

	# Go to drivers
	cd ../../openmrs-core/api/target/classes
	
	java org/openmrs/${info[3]} ${info[5]} >> ../../../../TestAutomation/oracles/results.txt
	
	out="$(java org/openmrs/${info[3]} ${info[5]})"
	
	echo ""
	#ls
	report=../../../../TestAutomation/reports/finalReport.html
	
	# HTML code for reporting the tests
	echo "<BLOCKQUOTE><B><U>Test ID ${info[0]}</U></B><br>" >> $report
	echo "<UL><LI>Requirements: ${info[1]}" >> $report
	echo "<LI>Component: ${info[2]}" >> $report
	echo "<LI>Driver: ${info[3]}" >> $report
	echo "<LI>Method: ${info[4]}" >> $report
	echo "<LI>Test Input: ${info[5]}" >> $report
	echo "<LI>Expected Outcome: ${info[6]}" >> $report
	echo "<LI>Actual Outcome: $out</UL>" >> $report
	
	if [ $out = ${info[6]} ]; then
		echo "Passed</BLOCKQUOTE><br><br>" >> $report
	else
		echo "Failed</BLOCKQUOTE><br><br>" >> $report
	fi
	
	cd ../../../../TestAutomation/testCases
	
done

xdg-open ../../TestAutomation/reports/finalReport.html
