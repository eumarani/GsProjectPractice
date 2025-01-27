package com.excelSheet;

public class AtoIConversion {
    public static int conversion(String s1) {
        String s = s1.trim();
        if (s.isEmpty() || s.length() == 0) {
            System.out.println("Invalid Entry:");
            return -1;
        }
            boolean isNegative = false;
            boolean isStarted = false;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '-') {
                    if (isStarted) {
                        break;
                    }
                    isNegative = true;
                    continue;
                }
                if (c == '+') {
                    if (isStarted) {
                        break;
                    }
                    isNegative = false;
                    continue;
                }
                if (c >= '0' && c <= '9') {
                    sb.append(c);
                    isStarted = true;

                } else {
                    if (isStarted) {
                        System.out.println("Invalid Entry:");
                        return -1;
                    }
                }
            }
            if (sb.length() == 0) {
                return -1;
            }
            int result = Integer.parseInt(sb.toString());
            return isNegative ? -result : result;
        }
        public static void main(String[] arg){
            String s2 = "-12142";
            System.out.println(conversion(s2));

            String s3 = "12142";
            System.out.println(conversion(s3));

            String s4 = "12q42";
            System.out.println(conversion(s4));
        }
    }
