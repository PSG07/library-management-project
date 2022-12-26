import java.util.*;
public class Solution {
    static void menu(int t,Book tempBook){
        if(t==1){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter appropriate integer to do operations");
            System.out.println("enter 1 to setdetails");
            System.out.println("enter 2 to getdetails");
            System.out.println("enter 3 to issue a book");
            System.out.println("enter 4 to return a book");
            System.out.println("enter 5 to EXIT");
            int temp3=sc.nextInt();
            switch(temp3)
            {
                case 1:
                tempBook.setDetails();
                break;
                case 2:
                tempBook.getDetails(12);
                break;
                case 3:
                tempBook.issue(temp3);
                break;
                case 4:
                tempBook.returne(temp3);
                break;
                case 5:
                return;
            }

        }
        else
        {
            return;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Book[]object;
        object=new Book[5];
        System.out.println("enter the no upto which u want to set details ofobjects");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            object[i]=new Book();
            object[i].setDetails();
        }
        object[0].getDetails(12);
        System.out.println("enter 0 to make an instance of book class");
        int temp=sc.nextInt();
        if(temp==0)
        {
            Book tempbook=new Book();
            System.out.println("enter 1 to go to menu and anything  if u dont want to go");
            int temp2=sc.nextInt();
            menu(temp2,tempbook);
        }
        System.out.println("enter book id to go to menu and do some operations");
        int ide=sc.nextInt();
        int i=0;
        while(true)
        {
            if(object[i].bookId==ide) break;
            else i++;
        }
        menu(1,object[i]);
    }
}
class Book{
    int bookId;
    private String bookTitle;
    private int yearOfPublication;
    private String authorName;
    private String publisherName;
    private int numberOfAvailableCopies;
    public Book()
    {
        bookId=0;
        bookTitle=null;
        yearOfPublication=0;
        authorName=null;
        publisherName=null;
        numberOfAvailableCopies=0;
    }
    public Book(int totalcopies)
    {
        bookId=0;
        bookTitle=null;
        yearOfPublication=0;
        authorName=null;
        publisherName=null;
        numberOfAvailableCopies=totalcopies;
    }
    public void setDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bookid");
        bookId=sc.nextInt();
        sc.nextLine();
        System.out.println("enter bookTitle");
        bookTitle=sc.nextLine();
        System.out.println("enter yearofpublication");
        yearOfPublication=sc.nextInt();
        sc.nextLine();
        System.out.println("enter authorname");
        authorName=sc.nextLine();
        System.out.println("enter publishername");
        publisherName=sc.nextLine();
        System.out.println("enter numberofavailablecopies");
        numberOfAvailableCopies=sc.nextInt();
        sc.nextLine();
    }
    public void setDetails(int id,String title,int year,String author,String publisher,int count)
    {
        bookId=id;
        bookTitle=title;
        yearOfPublication=year;
        authorName=author;
        publisherName=publisher;
        numberOfAvailableCopies=count;
    }
    public void getDetails(int id)
    {
        System.out.println("bookid= "+bookId);
        System.out.println("bookTitle= "+bookTitle);
        System.out.println("yearofpublication= "+yearOfPublication);
        System.out.println("authorname= "+authorName);
        System.out.println("publishrname= "+publisherName);
        System.out.println("numberofavailablecopies= "+numberOfAvailableCopies);
    }
    public void issue(int id)
    {
        System.out.println(bookTitle+" by "+authorName+" issued to you");
        numberOfAvailableCopies--;
    }
    public void returne(int id)
    {
        numberOfAvailableCopies++;
        System.out.println("thank you for returning "+bookTitle+" by "+authorName);
    }
}