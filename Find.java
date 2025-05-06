/* problem statement: There are 100 questions in a paper. Each question carries +3 marks for correct answer, -1 marks for incorrect answer and 0 marks for unattempted question.

It is given that Chef received exactly 
X (0≤X≤100) marks. Determine the minimum number of problems Chef marked incorrect.

Input Format
First line will contain 
T
T, number of test cases. Then the test cases follow.
Each testcase contains of a single integer 
X
X, marks that Chef received.
Output Format
For each test case, output the minimum number of problems Chef marked incorrect.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Find
{
	public static void main (String[] args
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int x = sc.nextInt();
        int count=0;
       if(x%3==0){
           System.out.println("0");
       }else {
           System.out.println(3-(x%3));
       }}}}