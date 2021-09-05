package customermailapplication;

public class CustomerFactory {
    public static Customer createCustomer(String Type) {
        if (Type.equals("Regular Customer"))
            return new RegularCustomer();
            
        else if (Type.equals("Moutain Customer"))
        return new MountainCustomer();

        else if (Type.equals("Delinquent Customer"))
        return new DelinquentCustomer();

        return null;
        
        }
}
