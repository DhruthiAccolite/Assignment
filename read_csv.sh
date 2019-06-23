#!/bin/sh
#while read line 
#do
#IFS=',' read -r NAMES     #Convert string to array
#print $NAMES
#Print all names from array
#for i in "${NAMES[@]}"; do
 #  echo $i
#done < '100 CC Records.csv'
#echo "line:",$line
#echo "word:",$line[0]
#done
#while read line
#do
#while IFS=, read NAMES
#do

   # echo "$NAMES"
#done    
#done < 
while IFS=, read -r cardTypeCode cardTypeFullName issuingBank cardNumber cardHoldersName cVV issueDate expiryDate billingDate cardPIN creditLimit ; do
    IFS='/' # space is set as delimiter
	read -ra ADDR <<< "$expiryDate" # str is read into an array as tokens separated by IFS
#	for i in "${ADDR[@]}"; do # access each element of array
 #   		echo "$i"
	#done
	if (("${ADDR[1]}">"2019")) ;
	then
	expiry="active"
	
	elif ((${ADDR[1]} == 2019 && ${ADDR[0]}>6)) ;
	then
	expiry="active"
	else 
	 expiry="expired"    
	fi
	credit=$(sed ':a;s/\B[0-9]\{3\}\>/,&/;ta' <<< $creditLimit)
	
	mkdir "$cardTypeFullName"
	mkdir "$cardTypeFullName/$issuingBank"
	
   echo "Card Type Code: $cardTypeCode 
Card Type Full Name: $cardTypeFullName 
Issuing Bank: $issuingBank 
Card Number: $cardNumber
Card Holder's Name: $cardHoldersName
CVV/CVV2: $cVV 
Issue Date: $issueDate
Expiry Date: $expiryDate
Billing Date: $billingDate
Card PIN: $cardPIN 
Credit Limit: $credit" >"$cardTypeFullName/$issuingBank/$cardNumber.$expiry.txt"

done < '100 CC Records.csv'
rm -r Card\ Type\ Full\ Name
