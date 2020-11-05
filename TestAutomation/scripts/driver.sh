echo "Testing Openmrs:"
echo ""
cd api/src/main/java/org/openmrs
javac Tests.java
java Tests
xdg-open testReport.txt
echo ""
echo "Testing Complete"
