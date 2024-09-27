package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

      // Transient State to Manage State
       /* Customer customer=new Customer();
       customer.setId("1");
        customer.setName("Sayuri");
        customer.setAddress("Kandy");
        session.save(customer);
        transaction.commit();
        session.close();*/

        /* Object ekak database eken aragena get() eka true Manage State ekata pass
         karala ayema commit eken database ekata pass kara gannawa */

      /*  Customer customer=session.get(Customer.class,1);
        customer.setName("K");
        transaction.commit();
        session.close();*/


        /*database eken aragena Manage state ekata pass karala  Manage State eken detach() use
         karala eka Detach State ekat pass karanwa
         Detach State eke thiyana ewa Durty checking disable */


       /* Customer customer=session.get(Customer.class,1);
        session.detach(customer);
        customer.setName("K");
        transaction.commit();
        session.close();*/

        /*merge() eka true enne object eke clone ekak e nisa database ekat real object eka save wenne na*/
      /*  Customer customer=session.get(Customer.class,1);
        session.detach(customer);
        session.merge(customer);
        customer.setName("K");
        transaction.commit();
        session.close();*/


        /*update nisa Object eka save wenawa */
     /*   Customer customer=session.get(Customer.class,1);
        session.detach(customer);
        session.update(customer);
        customer.setName("K");
        transaction.commit();
        session.close();*/



        //id ekata adala object eka Manage State eke thiyanawa nm eya apahu database eka true ganna one na
        // 1st level Cash(session ekak athule vithrai wada karanne)
       /* Customer customer=session.get(Customer.class,1);
        System.out.println(customer);

        Customer customer1=session.get(Customer.class,1);
        System.out.println(customer1);*/


        // 2nd level Cash??
        //Detach State to remove State??
        //cascade type??



    }
}