#!/bin/bash
read -p "Enter the number:" number
if [ $number -gt 10 ]; then
	echo "Entered no. is greater than 10"
else
	echo "Enterd no. is lesser than 10"
fi
