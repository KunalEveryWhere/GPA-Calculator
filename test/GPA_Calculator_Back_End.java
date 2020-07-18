/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import gpa.calculator.*;

/**
 *
 * @author Kunal Prasad
 */
public class GPA_Calculator_Back_End {
    private static final int grade_point_S = 10;
    private static final int grade_point_A = 9;
    private static final int grade_point_B = 8;
    private static final int grade_point_C = 7;
    private static final int grade_point_D = 6;
    private static final int grade_point_U = 0;
    private static double error_code = 0.00;
    private boolean Credit_Validator (int credit)
    {
        if(credit > 0 && credit <= 30)
            return true;
        else
            return false;
    }
    private boolean Grade_Validator (String grade)
    {
        char c = grade.charAt(0);
        if((c == 'S') || (c == 'A') || (c == 'B') || (c == 'C') || (c == 'D') ||
                (c == 'U'))
            return true;
        else
            return false;
    }
    private String Grade_Manupulation (String grade)
    {
        String s = grade.trim();
        s = s.toUpperCase();
        return (s);
    }
    private int Grade_Point_Calculator (String grade)
    {
        int point;
        switch (grade)
        {
            case "S":
                point = grade_point_S;
                break;
            case "A":
                point = grade_point_A;
                break;
            case "B":
                point = grade_point_B;
                break;
            case "C":
                point = grade_point_C;
                break;
            case "D":
                point = grade_point_D;
                break;
            case "U":
                point = grade_point_U;
                break;
            default:
                point = -1;
                break;
        }
        return (point);
    }
    private double Round_Off_GPA (double value, int places) 
    {
    if (places < 0)
    {
        throw new IllegalArgumentException();
    }
    long factor = (long) Math.pow(10, places);
    value = value * factor;
    long tmp = Math.round(value);
    return (double) tmp / factor;
    }
    protected double GPA_Calculator (String grade[], int credit[])
    {
       double temp_sum = 0.00;
       double gpa = 0.00;
       String temp_grade = "";
       int temp_credit = 0;
       int temp_credit_sum = 0;
       int temp_grade_point = 0;
       if(grade.length != credit.length)
       {
           error_code = -1.03;
           this.Error_Message(error_code);
       }
       for(int i=0;i<(grade.length);i++)
       {
          temp_grade = grade[i];
          temp_credit = credit[i];
          temp_credit_sum = temp_credit_sum + temp_credit;
          temp_grade = this.Grade_Manupulation(temp_grade);
          temp_grade_point = this.Grade_Point_Calculator(temp_grade);
          if ((this.Grade_Validator(temp_grade) == true) && (this.Credit_Validator(temp_credit)))
          {
            temp_sum = temp_sum + (temp_credit * temp_grade_point);
          }
          else if (this.Grade_Validator(temp_grade) == false)
          {
              error_code = -1.01;
              this.Error_Message(error_code);
          }
          else if (this.Credit_Validator(temp_credit) == false)
          {
              error_code = -1.02;
              this.Error_Message(error_code);
          }
       }
       gpa = temp_sum / temp_credit_sum;
       gpa = this.Round_Off_GPA(gpa, 2);
       return (gpa);
    }
    private String Error_Log (double value)
    {
        String Log [] ={
            "Invalid Grade Entry",
            "Invalid Credit Entry",
            "The number of Credit and Grade Entries Do Not Match"
        } ;
        return (Log [(int)value - 1]);
    }
    public void Error_Message (double value)
    {
            value = -1 * value;
            int prefix = (int) value;
            double postfix = (value - prefix) * 100;
            value = postfix;
            System.out.println(this.Error_Log(value));
            System.exit(0);
    }
    public static void main(String[] args) {
        String grade[] = {"A","S","A"};
        int credit[] = {3,5,3};
        GPA_Calculator_Back_End z = new GPA_Calculator_Back_End ();
        System.out.println("GPA :"+ z.GPA_Calculator(grade, credit));
    }
}
    
