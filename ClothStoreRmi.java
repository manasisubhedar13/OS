import java.rmi.RemoteException;

import java.rmi.server.UnicastRemoteObject;


public class ClothStoreRmi extends UnicastRemoteObject implements ClothStoreInterface{

        public int s1 = 10;

        public int s2 = 10;

        public int s3 = 10;

        public int s4 = 10;

        public int c1 = 500;

        public int c2 = 350;

        public int c3 = 250;

        public int c4 = 150;

        int i1 = 100;

        int i2 = 101;

        int i3 = 102;

        int i4 = 103;

        String t1 = "Seasonal";

        String t2 = "Classical";

        String b1 = "Seasonal Clothes: "+ System.lineSeparator() +"1. Wedding Clothes - Item Number  - 100" + System.lineSeparator()+ "2. Winter wear Clothes - Item Number - 101";

        String b2 = "Classical Clothes: "+ System.lineSeparator() +"Daily wear Clothes - Item Number - 102" + System.lineSeparator() + "Party wear Clothes - Item Number - 103";

        String b3 = "Invalid Topic" + System.lineSeparator() +"Please try again !" ;

        String j = "Product Detials"+ System.lineSeparator() +"Cloth Type: Wedding Clothes" + System.lineSeparator() + "Avaiable Items: " + s1 + System.lineSeparator() + "Cost: " + c1+ System.lineSeparator() + "Type: Seasonal Clothes" ;

        String k = "Product Detials"+ System.lineSeparator() +"Winter wear Clothes" + System.lineSeparator() + "Avaiable Items: " + s2 + System.lineSeparator() + "Cost: " + c2+ System.lineSeparator() + "Type: Seasonal Clothes" ;

        String l = "Items Detials"+ System.lineSeparator() +"Daily Wear clothes" + System.lineSeparator() + "Avaiable Items: " + s3 + System.lineSeparator() + "Cost: " + c3+ System.lineSeparator() + "Type : Classic Clothes" ;
        
        String m = "Items Detials"+ System.lineSeparator() +"Party Wear Clothes" + System.lineSeparator() + "Avaiable Items: " + s4 + System.lineSeparator() + "Cost: " + c4+ System.lineSeparator() + "Topic : Classic Clothes" ;

        String o = "Invalid product number" + System.lineSeparator() +"Please try again !" ;

        String s = "Order placed successfully"; 

        String f = "Invalid product number" + System.lineSeparator() +"Please try again !" ;

        String ns = "Sorry, the product you searched for is not available. " ;

    public ClothStoreRmi() throws RemoteException 

    {

        
        String x;

        int a;
    }

    public String lookUp(String x)throws RemoteException

    {

        System.out.println("x");

        if(x.equalsIgnoreCase(t1))
        {
            return b1;

        }

        else if (x.equalsIgnoreCase(t2))
        {
            return b2;
        }

        else
            return b3;

    }

    public String search(int a)throws RemoteException

    {

       if (a == i1)

        return "Product Detials"+ System.lineSeparator() +"Cloth Type: Wedding Clothes" + System.lineSeparator() + "Avaiable Items: " + s1 + System.lineSeparator() + "Cost: " + c1+ 		System.lineSeparator() + "Type: Seasonal Clothes" ;

       else if (a == i2)
        
        return "Product Detials"+ System.lineSeparator() +"Winter wear Clothes" + System.lineSeparator() + "Avaiable Items: " + s2 + System.lineSeparator() + "Cost: " + c2+ System.lineSeparator() + "Type: Seasonal Clothes" ;

       else if (a == i3)
        
        return "Items Detials"+ System.lineSeparator() +"Daily Wear clothes" + System.lineSeparator() + "Avaiable Items: " + s3 + System.lineSeparator() + "Cost: " + c3+ System.lineSeparator() + "Type : Classic Clothes" ;

       else if (a == i4)
        
        return "Items Detials"+ System.lineSeparator() +"Party Wear Clothes" + System.lineSeparator() + "Avaiable Items: " + s4 + System.lineSeparator() + "Cost: " + c4+ System.lineSeparator() + "Topic : Classic Clothes" ;

       else 
        
        return "Invalid product number" + System.lineSeparator() +"Please try again !" ;

    }

    public String order(int a)throws RemoteException

    { 

        if (a == i1 && s1 > 0)
            {
                s1--;
                return s;
            }

        else if (a == i2 && s2 > 0)
            {
                s2--;
                return s;
            }

        else if (a == i3 && s3 > 0)
            {
                s3--;
                return s;
            }
    
        else if (a == i4 && s4 > 0)
            {
                s4--;
                return s;
            }

        else if (a == i1 && s1 == 0)
            {
                return ns;
            }

         else if (a == i2 && s2 == 0)
            {
                return ns;
            }

        else if (a == i3 && s3 == 0)
            {
                return ns;
            }

        else if (a == i4 && s4 == 0)
            {
                return ns;
            }

        else

            return f;
    
    }


}