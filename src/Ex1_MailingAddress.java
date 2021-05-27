/* display name and mailing address */

public class Ex1_MailingAddress {
    String name = "Joe Doe";
    String address1 = "20 Main Street";
    String address2 = "London";
    String address3 = "WC1E 7HX ";

    public void printAddress(){
        System.out.println(name);
        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);
    }


    public static void main(String[] args) {
        printAddress();
    }
}
