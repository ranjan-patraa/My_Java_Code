package functionalprogramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        Customer maria = new Customer("Maria","9999") ;

        // normal java function

        greetCustomer(maria) ;
        greetCustomer2Argument(maria,false);

        // Consumer

        greetCustomerConsumer.accept(maria) ;

        greetCustomerBiConsumer.accept(maria,false) ;
    }

    static void greetCustomer( Customer customer ) {

        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " + customer.customerPhoneNumber);


    }

    static void greetCustomer2Argument( Customer customer , boolean b) {

        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                ( b ? customer.customerPhoneNumber :"**********"));


    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
                                                    System.out.println("Hello " + customer.customerName +
                                       ", thanks for registering phone number " + customer.customerPhoneNumber);


    static BiConsumer<Customer,Boolean> greetCustomerBiConsumer = (customer,showPhoneNumber)->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNumber :"**********"));




    static  class Customer {

        private final String customerName ;
        private final String customerPhoneNumber ;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
