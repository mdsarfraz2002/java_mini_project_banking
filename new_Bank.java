import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

class Account
{
    String Name,Password;
    int AccNo,Money;
    int dd,mm,yy;
    public Account(String n,int an,int mon,String p)
    {
        Name=n;
        AccNo=an;
        Money=mon;
        Password=p;
    }
}

class pic extends JFrame
{

    public void   display( )
    {

        setTitle("CITI BANK");
        setSize(235,900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("bank.jpg")));
        setSize(805,400);
    }
}

public class new_Bank
{

    public static Calendar c=Calendar.getInstance();
    public static int date=c.get(Calendar.DATE);
    public static int month=c.get(Calendar.MONTH);
    public static int year=c.get(Calendar.YEAR);
    public static InputStreamReader isr=new InputStreamReader(System.in);
    public static BufferedReader x=new BufferedReader(isr);
    public static int Ano=89510;

    public static Account Acc[]=new Account[1000000];

    public static void main() throws IOException
    {
        int hour=c.get(Calendar.HOUR);
        int minute=c.get(Calendar.MINUTE);
        int sec=c.get(Calendar.SECOND);
        int newmonth=month+1;

        try
        {
            int ch=1;

            System.out.println("");
            System.out.println("");
            System.out.print( "\t\t\t\t\t  Welcome to CITI BANK ");
            System.out.println("\t\t\t\t\t"+"DATE-:" +date+"/"+newmonth+"/"+year);
            System.out.println("");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t"+"TIME " +hour+":"+minute+":"+sec); 

            System.out.println("  PLEASE SELECT THE FOLLOWING OPTION TO PROCEED    ");
            System.out.println("");
            System.out.println("");
            System.out.println("  1 -> Create Account      ");
            System.out.println("  2 -> Withdrawl           ");
            System.out.println("  3 -> Deposited           ");
            System.out.println("  4 -> Check Account Balance    ");
            System.out.println("  5 -> Apply For Loan    ");
            System.out.println("  6 -> See Recent Feedback ");
            System.out.println("  7 -> BANK DATABASE (Access Only For  Authorised Person)");
            System.out.println("  8 TO Exit ");
            ch=Integer.parseInt(x.readLine());
            if (ch==8)
            {
                exit(); 
            }

            else
            {
                switch(ch)
                {
                    case 1: createAccount(); break;
                    case 2: withdrawl(); break;
                    case 3: deposit(); break;
                    case 4: checkAccount(); break;
                    case 5: loan(); break;
                    case 6: read(); break;
                    case 7: checkMaster(); break;
                    default:  JOptionPane.showMessageDialog( null,"YOU MADE SOME MISTAKE");

                }

                con();
            }
        }
        catch( Exception e){
            JOptionPane.showMessageDialog( null,"ohh!! YOU MADE SOME MISTAKE  ");
            con();
        }

    }

    private static void createAccount() throws IOException
    {
        try{

            Calendar c=Calendar.getInstance();
            int date=c.get(Calendar.DATE);
            int month=c.get(Calendar.MONTH);
            int year=c.get(Calendar.YEAR);
            String n,p;
            int m;
            long ad;
            System.out.println("##########################################");
            System.out.println("Please Enter The Following Details To Create Your Account ");
            System.out.println("");
            System.out.print("Your Name : ");
            n=x.readLine();
            System.out.print("Your 12 Digit AADHAR Number : ");
            ad=Long.parseLong(x.readLine());
            if(String.valueOf(ad).length()<12){
                 JOptionPane.showMessageDialog( null,"You Have Entered Wrong Aadhar Number");
            }
            else{
                System.out.print("Opening Balance : ");
                m=Integer.parseInt(x.readLine());
                p=JOptionPane.showInputDialog(null,"PLEASE SET YOUR PASSWORD" );
                JOptionPane.showMessageDialog(null,"YOUR ACCOUNT HAS BEEN CREATED");
                JOptionPane.showMessageDialog(null,"Your Account Number is : "+Ano);
                Acc[Ano]=new Account(n,Ano,m,p);
                
                int acc= Ano;

                if(acc==89510)
                    try{
                        PrintWriter w = new PrintWriter("89510.txt", "UTF-8");

                        w.println("  ACCOUNT NO = 89510");
                        w.println("  NAME = " +n);
                        w.println("  BALANCE = " +m);
                        w.println("  password = " +p);
                        w.close();
                    } catch (IOException e) {

                    }
                

                if(acc==89511)
                    try{
                        PrintWriter writer = new PrintWriter("89511.txt", "UTF-8");

                        writer.println("  ACCOUNT NO = 89511" );
                        writer.println("  NAME = " +n);
                        writer.println("  BALANCE = " +m);
                        writer.println("  password = " +p);
                        writer.close();
                    } catch (IOException e) {

                    }
                if(acc==89512)
                    try{
                        PrintWriter writer = new PrintWriter("89512.txt", "UTF-8");

                        writer.println("  ACCOUNT NO = 89512");
                        writer.println("  NAME = " +n);
                        writer.println("  BALANCE = " +m);
                        writer.println("  password = " +p);
                        writer.close();
                    } catch (IOException e) {

                    }
                if(acc==89513)
                    try{
                        PrintWriter writer = new PrintWriter("89513.txt", "UTF-8");

                        writer.println("  ACCOUNT NO = 89513");
                        writer.println("  NAME = " +n);
                        writer.println("  BALANCE = " +m);
                        writer.println("  password = " +p);
                        writer.close();
                    } catch (IOException e) {

                    }

                if(acc==89514)
                    try{
                        PrintWriter writer = new PrintWriter("89514.txt", "UTF-8");

                        writer.println("  ACCOUNT NO = 89514");
                        writer.println("  NAME = " +n);
                        writer.println("  BALANCE = " +m);
                        writer.println("  password = " +p);
                        writer.close();
                    } catch (IOException e) {

                    }
                if(acc==89515)
                    try{
                        PrintWriter writer = new PrintWriter("89515.txt", "UTF-8");

                        writer.println("  ACCOUNT NO = 89515" );
                        writer.println("  NAME = " +n);
                        writer.println("  BALANCE = " +m);
                        writer.println("  password = " +p);
                        writer.close();
                    } catch (IOException e) {

                    }
                if(acc==89516)
                    try{
                        PrintWriter writer = new PrintWriter("89516.txt", "UTF-8");

                        writer.println("  ACCOUNT NO = 89516" );
                        writer.println("  NAME = " +n);
                        writer.println("  BALANCE = " +m);
                        writer.println("  password = " +p);
                        writer.close();
                    } catch (IOException e) {

                    }
                    Ano++;
            }
        }

        catch( Exception e){
             JOptionPane.showMessageDialog( null,"ohh!! YOU MADE SOME MISTAKE  ");
             }

    }

    private static void withdrawl() throws IOException
    {
        try{
            String p;
            int no,amt;
            System.out.println("Please Enter The Following Details To Withdrawl ");
            System.out.print("Your Account Number : ");
            no=Integer.parseInt(x.readLine());
            System.out.print('\f');
            p=JOptionPane.showInputDialog(null,"ENTER YOUR ACCOUNT PASSWORD TO CONTINUE" );
            System.out.print('\f');
            if(no<Ano && p.equals(Acc[no].Password))
            {
                System.out.println("##########################################");
                System.out.println("Welcome "+Acc[no].Name);
                System.out.println("Balance available = " + Acc[no].Money); 
                System.out.print("Withdrawl Amount : ");
                amt=Integer.parseInt(x.readLine());
                int ad = Acc[no].Money-amt;

                if(amt<=Acc[no].Money)
                {

                    JOptionPane.showMessageDialog(null," Withdrawl Successful");
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    System.out.println("Balance left After Withdrawl = " +ad );
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    Acc[no].Money-=amt;
                }
                else
                {
                    
                    System.out.println("##########################################");
                    System.out.println("Only "+Acc[no].Money+" amount left in your Account");
                    System.out.println("So you cannot Withdrawl "+amt);
                    JOptionPane.showMessageDialog(null," WITHDRAWL FAILED");
                }

            }
            else{
                JOptionPane.showMessageDialog( null,"YOUR ACCOUNT DOES NOT EXIST IN BANK DATABASE");
                 }
        }
        catch( Exception e){
            JOptionPane.showMessageDialog( null,"ohh!! YOU MADE SOME MISTAKE  ");
            }

    }

    private static void deposit() throws IOException
    {
        try
        {
            String p;
            int no,amt;
            System.out.println("Please Enter The Following Details To DEPOSIT ");
            System.out.print("Your Account Number : ");             
            no=Integer.parseInt(x.readLine());
            System.out.print('\f');
            p=JOptionPane.showInputDialog(null,"ENTER YOUR ACCOUNT PASSWORD TO CONTINUE" );
            System.out.print('\f');
            if(no<Ano && p.equals(Acc[no].Password))
            {
                System.out.println("##########################################");
                System.out.println("Welcome "+Acc[no].Name);
                System.out.println("Current Balance = " +Acc[no].Money );
                System.out.print("Deposit Amount : ");
                amt=Integer.parseInt(x.readLine());
                int db=Acc[no].Money +amt;

                JOptionPane.showMessageDialog(null," Deposit  Successful");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("Balance After Deposit = " + db);
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                Acc[no].Money+=amt;

            }
            else{
                 JOptionPane.showMessageDialog( null,"YOUR ACCOUNT DOES NOT EXIST IN BANK DATABASE");
            }
        }
        catch( Exception e){
            JOptionPane.showMessageDialog( null,"ohh!! YOU MADE SOME MISTAKE  ");
        }

    }  

    private static void checkAccount() throws IOException
    {
        try{
            String p;
            int no,amt;
            System.out.println("Please Enter The Following Details ");
            System.out.print("Your Account Number : ");             
            no=Integer.parseInt(x.readLine());
            System.out.print('\f');
            p=JOptionPane.showInputDialog(null,"ENTER YOUR ACCOUNT PASSWORD TO CONTINUE" );
            System.out.print('\f');
            if(no<Ano && p.equals(Acc[no].Password))
            {
                System.out.println("##########################################");
                System.out.println("Your Account Number : "+ no);
                System.out.println("Your Password : "+ p);
                System.out.println("Your Name : "+Acc[no].Name);
                System.out.println("Balance Amount : "+Acc[no].Money);

            }
            else
            {
                 JOptionPane.showMessageDialog( null,"YOUR ACCOUNT DOES NOT EXIST IN BANK DATABASE");
            }

        }

        catch( Exception e){
            JOptionPane.showMessageDialog( null,"ohh!! YOU MADE SOME MISTAKE  ");
        }  
    }
    private static void checkMaster()
    {

        try{
            String password =  JOptionPane.showInputDialog(null,"ENTER THE MASTER PASSWORD TO CONTINUE" );
            System.out.print('\f');
            String pa= "SARFRAZ";

            if(password.equals(pa))
            {
                String C = "";
                String x = "";

                String z = "";
                String D = "";
                String Z = "";
                String L = "";
                String s = "", line = null;
                System.out.println("##########################################");
                System.out.println(" ACCOUNT DETAILS ->");   

                BufferedReader r = new BufferedReader( new FileReader( "89510.txt" ) );
                while ((line = r.readLine()) != null) {
                    s += line;

                }
                System.out.println("__________________________________________________________________________________________");
                System.out.println(s);
                BufferedReader l = new BufferedReader( new FileReader( "89511.txt" ) );
                while ((line = l.readLine()) != null) {
                    z += line;

                }
                System.out.println("__________________________________________________________________________________________");
                System.out.println(z);  
                BufferedReader Q = new BufferedReader( new FileReader( "89512.txt" ) );
                while ((line = Q.readLine()) != null) {
                    x += line;

                }
                System.out.println("__________________________________________________________________________________________");
                System.out.println(x);  
                BufferedReader P = new BufferedReader( new FileReader( "89513.txt" ) );
                while ((line = P.readLine()) != null) {
                    C += line;

                }
                System.out.println("__________________________________________________________________________________________");
                System.out.println(C);
                BufferedReader Y = new BufferedReader( new FileReader( "89514.txt" ) );
                while ((line = Y.readLine()) != null) {
                    D += line;

                }
                System.out.println("__________________________________________________________________________________________");
                System.out.println(D);
                BufferedReader V  = new BufferedReader( new FileReader( "89515.txt" ) );
                while ((line = V.readLine()) != null) {
                    Z += line;

                }
                System.out.println("__________________________________________________________________________________________");
                System.out.println(Z);
                BufferedReader U  = new BufferedReader( new FileReader( "89516.txt" ) );
                while ((line = U.readLine()) != null) {
                    L += line;

                }
                System.out.println("__________________________________________________________________________________________");
                System.out.println(L);
                System.out.println("__________________________________________________________________________________________");
            }
            else{
                 JOptionPane.showMessageDialog( null,"ENTERED PASSWORD IS WRONG");
                }
        }
        catch( Exception e){
        }

    }      

    private static void loan()throws IOException
    {
        String p;
        int no;
        int RAN = (int) Math.ceil(Math.random()*100000);
        try{
            System.out.print('\f');
            System.out.println("   SELECT THE FOLLOWING OPTION TO PROCEED    ");
            System.out.println(" 1 -> FOR HOME LOAN");
            System.out.println(" 2 -> FOR EDUCATION LOAN");
            System.out.println(" 3 -> FOR Personal LOAN");
            System.out.println(" 4 -> FOR CAR LOAN");
            int chh=Integer.parseInt(x.readLine());

            switch(chh)
            {

                case 1: System.out.println("Please Enter The Following Details To APPLY FOR A LOAN ");
                        System.out.println("");
                        System.out.println("ENTER The Amount You Want");
                        int lam=Integer.parseInt(x.readLine());
                        System.out.println("");
                        System.out.println("For How Many Years you want It");
                        int lye=Integer.parseInt(x.readLine());
                        System.out.print("Your Account Number : ");             
                       no=Integer.parseInt(x.readLine());
                        p=JOptionPane.showInputDialog(null,"ENTER YOUR ACCOUNT  PASSWORD TO CONTINUE" );
                        double pay = lam+((lam*lye*8.35)/100);
                        if(no<Ano && p.equals(Acc[no].Password))
                        {
                            System.out.print('\f');
                            System.out.println("COGRATULATION!! YOU HAVE SUCCESSFULLY APPLIED FOR LOAN ");
                            System.out.println("INTREST ON LOAN IS 8.35%");
                            System.out.println("The Amount YOU Have TO pay After " + lye + " years is "+pay  );
                            System.out.println("IT WILL TAKE SOME TIME TO PROCEED ");
                            System.out.println("YOUR REFERENCE NUMBER = " + RAN );
                            System.out.println("PLEASE NOTE DOWN YOUR REFERENCE NUMBER ");
        
                        }
                        else
                        {
                            System.out.print('\f');
                           JOptionPane.showMessageDialog( null,"YOUR ACCOUNT DOES NOT EXIST IN BANK DATABASE");
        
                        }
                break;
                case 2:System.out.println("Please Enter The Following Details To APPLY FOR A LOAN ");
                System.out.println("ENTER The Amount YOU Want");
                lam=Integer.parseInt(x.readLine());
                System.out.println("For How Many Years you want It");
                lye=Integer.parseInt(x.readLine());
                System.out.print("Your Account Number : ");             
                no=Integer.parseInt(x.readLine());
                p=JOptionPane.showInputDialog(null,"ENTER YOUR ACCOUNT PASSWORD TO CONTINUE" );
                pay = lam+((lam*lye*8.0)/100);
                if(no<Ano && p.equals(Acc[no].Password))
                {
                    System.out.print('\f');
                    System.out.println("COGRATULATION!! YOU HAVE SUCCESSFULLY APPLIED FOR LOAN ");
                    System.out.println("INTREST ON LOAN IS 8.00%");
                    System.out.println("The Amount YOU Have TO pay After " + lye + " years is "+pay  );
                    System.out.println("IT WILL TAKE SOME TIME TO PROCEED ");
                    System.out.println("YOUR REFERENCE NUMBER = " + RAN );
                    System.out.println("PLEASE NOTE DOWN YOUR REFERENCE NUMBER ");

                }
                else
                {
                    System.out.print('\f');
                    JOptionPane.showMessageDialog( null,"YOUR ACCOUNT DOES NOT EXIST IN BANK DATABASE");

                }

                break;
                case 3:System.out.println("Please Enter The Following Details To APPLY FOR A LOAN ");
                System.out.println("ENTER The Amount YOU Want");
                lam=Integer.parseInt(x.readLine());
                System.out.println("For How Many Years you want It");
                lye=Integer.parseInt(x.readLine());
                System.out.println("INTREST = 11.0%");
                System.out.print("Your Account Number : ");             
                no=Integer.parseInt(x.readLine());
                p=JOptionPane.showInputDialog(null,"ENTER YOUR ACCOUNT  PASSWORD TO CONTINUE" );
                pay = lam+((lam*lye*11.0)/100);
                if(no<Ano && p.equals(Acc[no].Password))
                {
                    System.out.print('\f');
                    System.out.println("COGRATULATION!! YOU HAVE SUCCESSFULLY APPLIED FOR LOAN ");
                    System.out.println("INTREST ON LOAN IS 11.0%");
                    System.out.println("The Amount YOU Have TO pay After " + lye + " years is "+pay  );
                    System.out.println("IT WILL TAKE SOME TIME TO PROCEED ");
                    System.out.println("YOUR REFERENCE NUMBER = " + RAN );
                    System.out.println("PLEASE NOTE DOWN YOUR REFERENCE NUMBER ");
                }
                else
                {
                    System.out.print('\f');
                    JOptionPane.showMessageDialog( null,"YOUR ACCOUNT DOES NOT EXIST IN BANK DATABASE");
                }

                break;
                case 4: System.out.println("Please Enter The Following Details To APPLY FOR A LOAN ");
                System.out.println("ENTER The Amount YOU Want");
                lam=Integer.parseInt(x.readLine());
                System.out.println("For How Many Years you want It");
                lye=Integer.parseInt(x.readLine());
                System.out.print("Your Account Number : ");             
                no=Integer.parseInt(x.readLine());
                p=JOptionPane.showInputDialog(null,"ENTER YOUR ACCOUNT  PASSWORD TO CONTINUE" );
                pay = lam+((lam*lye*8.4)/100);
                if(no<Ano && p.equals(Acc[no].Password))
                {
                    System.out.print('\f');
                    System.out.println("COGRATULATION!! YOU HAVE SUCCESSFULLY APPLIED FOR LOAN ");
                    System.out.println("INTREST ON LOAN IS 8.4%");
                    System.out.println("The Amount YOU Have TO pay After " + lye + " years is "+pay  );
                    System.out.println("IT WILL TAKE SOME TIME TO PROCEED ");
                    System.out.println("YOUR REFERENCE NUMBER = " + RAN );
                    System.out.println("PLEASE NOTE DOWN YOUR REFERENCE NUMBER ");
                }
                else
                {
                    System.out.print('\f');
                    JOptionPane.showMessageDialog( null,"YOUR ACCOUNT DOES NOT EXIST IN BANK DATABASE");

                }
                break;
                default : JOptionPane.showMessageDialog( null,"ohh!! YOU MADE SOME MISTAKE  ");
            }

        }  
        catch( Exception e){
            JOptionPane.showMessageDialog( null,"ohh!! YOU MADE SOME MISTAKE  ");
            }
    }
    private static void feedback ()
    {      
        int reply = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO LEAVE A FEEDBACK ? IT WILL BE REALLY HELPFUL FOR US","FEEDBACK DIALOG!!", JOptionPane.YES_NO_OPTION);
        if ( reply == JOptionPane.YES_OPTION)
        {
            String x=JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME\u263A " );
            String p=JOptionPane.showInputDialog(null,"PLEASE WRITE YOUR FEEDBACK\u263A " );
            try{
                PrintWriter writer = new PrintWriter("FEEDBACK.txt", "UTF-8");
                writer.println(x+"  FEEDBACK -> "+p);
                writer.close();
            } catch (IOException e) {}

            JOptionPane.showMessageDialog( null," THANK YOU "+x+" FOR YOUR FEEDBACK");

        }
    }
    private static void read()throws IOException
    {
        String f = "", line = null;
        BufferedReader l = new BufferedReader( new FileReader( "FEEDBACK.txt" ) );
        while ((line = l.readLine()) != null) {
            f += line;

        }
        System.out.println("Recent feedback is");
        System.out.println(f);
    }
    private static void exit()throws IOException
    {
        int reply = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO EXIT?","WARNING!", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
        {
            feedback();
            System.out.print('\f'); 
            System.out.println("O O  O O  O O  O O  O O  O O");
            System.out.println(" *    ^    ^    ^    ^    ^ ");
            System.out.println(""); 
            System.out.println("Thank You For Banking with us ");
            System.out.println("Have A  GOOD DAY "); 
            System.out.println("Hope You Have Liked It");
             pic cus=new pic();
            cus.display();
            
        }
        else if(reply == JOptionPane.NO_OPTION)
        {
            System.out.print('\f');  
            main();
        }
    }

    private static void con()throws IOException
    {
         int reply = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO CONTINUE?","CITI BANK", JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION)
        {
            System.out.print('\f');  
            main(); 
        }
        else if(reply == JOptionPane.NO_OPTION)
        {
            exit();

        }
    }
}
