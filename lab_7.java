import java.util.*;

class WrongAge extends Exception{
    WrongAge(String message){
        super(message);
    }
}


class Father{
    int fage;
    Father(int fage) throws WrongAge{
        if (fage<0){
            throw new WrongAge("fathers age cant be less than 0");
        }
        
        System.out.println("Father's age is valid");
    }
    
        }


class Son extends Father{
        int sage;
        Son(int sage, int fage) throws WrongAge{
            super(fage);
            if (sage>=fage){
                throw new WrongAge("Son cant be older than father");
            }
            this.sage = sage;
            this.fage=fage;
            System.out.println("both ages are valid");
        }
        
        void display(){
            System.out.println("sons age is"+" " +sage);
            System.out.println("fathers age is" +" "+fage);
        }
}



public class lab_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sage, fage;
        
        try{
            System.out.println("Enter sons age:");
            sage = sc.nextInt();

            System.out.println("Enter fathers age:");
            fage = sc.nextInt();

            Son s = new Son(sage,fage);
            s.display();
        }catch(WrongAge e){
            System.out.println("error:"+ e.getMessage());
        }
    }
}

