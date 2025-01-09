#!/bin/bash
 filename="sample.txt"
 while IFS= read -r line; do
 echo "$line"
 done < "$filename"
