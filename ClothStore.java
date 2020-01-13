import java.rmi.Naming;

import java.net.MalformedURLException;

import java.rmi.NotBoundException;

import java.rmi.RemoteException;

import java.util.Scanner;


public class ClothStore {

    public static void main(String[] args)throws NotBoundException,MalformedURLException,RemoteException{

        int input = 4; 

        Scanner sc = new Scanner(System.in);

        try {

            ClothStoreInterface c = (ClothStoreInterface)Naming.lookup("rmi://localhost:1099/BS");

            System.out.println("Client is now connected to server");


                System.out.println("\n Enter your Choice :\n" 

                    +"1. Search for type of clothes (Avaialable Topics - Seasonal & Classical)\n"

                    +"2. View Details (Enter Product number:(Wedding Clothes: 100, Winter wear Clothes: 101, Daily wear: 102, Party wear: 103))\n"

                    +"3. Place your Order \n"

                    +"4. Exit \n");

                int choice = sc.nextInt();


                String x;

                int y;
	while(choice < 4){

			

        switch (choice)

        {

            case 1:

            {

                System.out.println("Enter Specific Topic");

                x=sc.next();

                System.out.println(c.lookUp(x));

                break;

            }

            case 2:

            {

                System.out.println("Enter an Item Number to look up");

                y=sc.nextInt();

                System.out.println(c.search(y));

                break;

            }

            case 3:

            {

                System.out.println("Enter an Item Number to Order a cloth ");

                y=sc.nextInt();

                System.out.println(c.order(y));

                break;

            }

            case 4:

            {

                System.exit(0);

                break;

            }

            

        	}
 		System.out.println("\n Enter your Choice :\n" 

                    +"1. Search Topic's (Avaialable Topics - Seasonal & Classical)\n"

  		     +"2. View Details (Enter Product number:(Wedding Clothes: 100, Winter wear Clothes: 101, Daily wear: 102, Party wear: 103))\n"

        		+"3. Place your Order \n"

                    +"4. Exit \n \n");
			choice = sc.nextInt();
		
	}

    }
           

        catch (Exception e) {

            System.out.println("Server isn't reachable");


        }

        
    }

}