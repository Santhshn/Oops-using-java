import java.io.*;
import java.util.*;
class Student
{
int rollno;
String name;
void insertRecord(int r,String n);
{
rollno=r;
name=n;
}
void display information();
{
System.out.println(rollno+" "+name);
}
class TestStudent5
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();

s1.insertRecord(111,"karan");
s2.insertRecord(222,"Aryan");

s1.displayInformation();
s2.displayInformation();
}
}
}

























