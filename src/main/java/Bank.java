import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer>customers;

    public Bank() {
        customers = new ArrayList<>();
     }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void printAllCustomers(){
        for(Customer customer : customers){
            System.out.println(customer.getAccount().printAccountInfo());
        }
    }




}
