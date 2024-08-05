public class cafe {

    public static void main(String[] args) {

        // APP VARIABLES

        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double IceVanilla = 4.5;
        double SaltedCaramel = 6.5;
        double HotChocolate = 3.0;

        // Customer name variables (add yours below)
        String customer1 = "Dana";
        String customer2 = "Hala";
        String customer3 = "Ali";
        String customer4 = "Reem";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;


        // App interaction simulation (Add your code for the challenges below)
        
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Dana"
        
        // 1.) Dana ordered a coffee. 
        //     show her the status message.
        System.out.println(customer1 + pendingMessage);

        // 2.) Reem ordered a cappucino
        //     Check the status of his order and let him know. If it is ready, also tell him his total.
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + HotChocolate);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }
        
        // 3.) Hala ordered 2 lattes, and would like to know the total up front. 
        //      Also tell them their order status.
        System.out.println(displayTotalMessage + SaltedCaramel * 6);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }


        // 4.) Ali just realized he was charged for a coffee but had ordered a latte.
        //     Tell him his new total to make up the difference.
        System.out.println(displayTotalMessage + (SaltedCaramel - IceVanilla));

    }

}