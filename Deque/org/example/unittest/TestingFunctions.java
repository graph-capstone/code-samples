// package org.example.unittest;

// import java.util.Arrays;

// public class TestingFunctions {
//     public void obscureFunction1(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % 2 == 0) {
//                 arr[i] = arr[i] / 2;
//             } else {
//                 arr[i] = arr[i] * 3 + 1;
//             }
//         }
//     }

//     public int obscureFunction2(int x, int y, int z) {
//         int result = 0;
//         if (x > 0) {
//             result += x;
//             if (y > 0) {
//                 result += y;
//                 if (z > 0) {
//                     result += z;
//                 } else {
//                     result -= z;
//                 }
//             } else {
//                 result -= y;
//                 if (z < 0) {
//                     result += z;
//                 } else {
//                     result -= z;
//                 }
//             }
//         } else {
//             result -= x;
//             if (y < 0) {
//                 result += y;
//                 if (z > 0) {
//                     result -= z;
//                 } else {
//                     result += z;
//                 }
//             } else {
//                 result -= y;
//                 if (z < 0) {
//                     result -= z;
//                 } else {
//                     result += z;
//                 }
//             }
//         }
//         return result;
//     }

//     public void obscureFunction3(String str) {
//         int len = str.length();
//         String result = "";
//         for (int i = 0; i < len; i++) {
//             char c = str.charAt(i);
//             if (i % 2 == 0) {
//                 result += Character.toUpperCase(c);
//             } else {
//                 result += Character.toLowerCase(c);
//             }
//         }
//         System.out.println(result);
//     }

//     public void obscureFunction4(int[] data) {
//         int temp = 0;
//         for (int i = 0; i < data.length; i++) {
//             for (int j = i + 1; j < data.length; j++) {
//                 if (data[i] > data[j]) {
//                     temp = data[i];
//                     data[i] = data[j];
//                     data[j] = temp;
//                 }
//             }
//         }
//         for (int k = 0; k < data.length; k++) {
//             if (data[k] % 2 == 0) {
//                 System.out.print(data[k] + " ");
//             } else {
//                 System.out.print("-" + data[k] + " ");
//             }
//         }
//     }

//     public void obscureFunction5(int[] data, int threshold) {
//         for (int i = 0; i < data.length; i++) {
//             if (data[i] > threshold) {
//                 data[i] = data[i] / 2;
//             } else {
//                 data[i] = data[i] * 2;
//             }
//             if (data[i] % 2 == 0) {
//                 data[i] += 1;
//             } else {
//                 data[i] -= 1;
//             }
//         }
//         for (int j = 0; j < data.length; j++) {
//             System.out.print(data[j] + " ");
//         }
//         System.out.println();
//     }

//     public Matrix transpose(Matrix m) {
//         int RowsM, ColsM, i, j;
//         Matrix mTemp;
//         RowsM = m.Row;
//         ColsM = m.Col;
//         mTemp = new Matrix(ColsM, RowsM);
//         for (i = 0; i < RowsM; i++) {
//             for (j = 0; j < ColsM; j++) {
//                 mTemp.setElmt(m.getElmt(j, i), i, j);
//             }
//         }
//         return mTemp;
//     }

//     // Check if element in row are all zero
//     public int countRowZero(Matrix m) {
//         int i, j, countRow, countZero;
//         countRow = 0;
//         countZero = 0;
//         for (i = 0; i < m.Row; i++) {
//             countZero = 0;
//             for (j = 0; j < m.Col; j++) {
//                 if (m.getElmt(i, j) == 0) {
//                     countZero++;
//                 }
//             }
//             if (countZero == m.Col) {
//                 countRow++;
//             }
//         }
//         return countRow;
//     }

//     public static int countDistinctElements(int n, int[] elements) {
//         int[] freq = new int[2 * n + 2];
//         int ans = 0;

//         for (int temp : elements) {
//             freq[temp]++;
//         }

//         for (int j = 0; j < 2 * n + 2; j++) {
//             if (freq[j] > 1) {
//                 freq[j + 1] += freq[j] - 1;
//                 freq[j] = 1;
//             }
//         }

//         for (int j = 0; j < 2 * n + 2; j++) {
//             if (freq[j] > 0) {
//                 ans++;
//             }
//         }

//         return ans;
//     }

//     public static void obscure6(int[] arr) {
//         int n = arr.length;
//         boolean swapped;
//         for (int i = 0; i < n - 1; i++) {
//             swapped = false;
//             for (int j = 0; j < n - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     // temp
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     swapped = true;
//                 }
//             }
//             // Break
//             if (!swapped)
//                 break;
//         }
//     }

//     public boolean isMatch(String s, String p) {
//         if (s == null || p == null)
//             return false;
//         boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
//         dp[0][0] = true;

//         for (int j = 1; j < p.length() + 1; j++) {
//             if (p.charAt(j - 1) == '*') {
//                 dp[0][j] = dp[0][j - 2];
//             }
//         }

//         for (int i = 1; i < s.length() + 1; i++) {
//             for (int j = 1; j < p.length() + 1; j++) {
//                 if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
//                     dp[i][j] = dp[i - 1][j - 1];
//                 } else if (p.charAt(j - 1) == '*') {
//                     dp[i][j] = dp[i][j - 2];
//                     if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
//                         dp[i][j] = dp[i][j] || dp[i - 1][j];
//                     }
//                 }
//             }
//         }
//         return dp[s.length()][p.length()];
//     }

//     public int lengthOfLIS(int[] nums) {
//         if (nums == null || nums.length == 0)
//             return 0;
//         int[] dp = new int[nums.length];
//         Arrays.fill(dp, 1);
//         int maxLength = 1;
//         for (int i = 1; i < nums.length; i++) {
//             for (int j = 0; j < i; j++) {
//                 if (nums[i] > nums[j]) {
//                     dp[i] = Math.max(dp[i], dp[j] + 1);
//                 }
//             }
//             maxLength = Math.max(maxLength, dp[i]);
//         }
//         return maxLength;
//     }

// }