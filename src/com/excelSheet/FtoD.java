package com.excelSheet;

import java.util.HashMap;
import java.util.Map;

public class FtoD {


        public static String conversion(int numerator, int denominator) {
            if (numerator == 0) {
                return "0"; // A numerator of 0 means the result is 0
            }
            if (denominator == 0) {
                return "undefined"; // Division by zero is undefined
            }

            StringBuilder sb = new StringBuilder();

            // Append the sign if the result is negative
            if ((numerator < 0) ^ (denominator < 0)) {
                sb.append('-');
            }

            // Use absolute values to handle negative numbers
            long num = Math.abs((long) numerator);
            long den = Math.abs((long) denominator);

            // Append the integer part of the division
            sb.append(num / den);

            // Calculate the remainder
            long remainder = num % den;
            if (remainder == 0) {
                return sb.toString(); // If no remainder, return the integer part
            }

            // Append the decimal point
            sb.append(".");

            // Map to store the remainder and its corresponding position in the result
            Map<Long, Integer> remainderMap = new HashMap<>();
            // Store the remainder and its position in the result
            remainderMap.put(remainder, sb.length());

            // Multiply the remainder by 10 to calculate the next digit
            remainder *= 10;

            // Append the quotient of the division
            sb.append(remainder / den);

            // Update the remainder
            remainder %= den;

            while (remainder != 0) {
                // If the remainder is already seen, it means the decimal part is recurring
                if (remainderMap.containsKey(remainder)) {
                    int index = remainderMap.get(remainder); // Get the index of the first occurrence
                    sb.insert(index, '('); // Insert '(' at the start of the recurring part
                    sb.append(')'); // Append ')' at the end
                    break;
                }


            }

            return sb.toString();
        }

        public static void main(String[] args) {
            int numerator = 1;
            int denominator = 3;
            String result = conversion(numerator, denominator);
            System.out.println(result); // Expected output: 0.(3)
        }
    }

