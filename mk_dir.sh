#!/bin/bash -x
mkdir mydir
if [ $? -eq 0 ]; then
	echo "directory is created successfully"
else 
	echo "directory is not created successfully"
fi
