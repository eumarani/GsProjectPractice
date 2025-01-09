#!/bin/bash
counter=15
while [ $counter -gt 10 ]; do
	echo "loop $counter"
	((counter--))
done
