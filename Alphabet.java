# set4
import java.io.*;
import java.util.*;
public class Alphabet
{
  public static void main(String args[])throws IOException
  {
    Scanner sc=new Scanner(System.in);
    char c= sc.nextLine().charAt(0);
    if((c>='a' && c<='z') || (c>='A' && c<='Z')) 
    {
      System.out.println("c is Alphabet");
      }
      else
      {
        System.out.println("c is not an Alphabet");
        }
        }
        }
