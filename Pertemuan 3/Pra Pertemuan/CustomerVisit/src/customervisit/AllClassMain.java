package customervisit;

/**
 *
 * @author U53R
 */

import java.time.LocalDate;

public class AllClassMain {

  public static void main(String[] args) {
    Customer Gazali = new Customer("Gazali");
    Customer LaOde = new Customer("La Ode");
    Customer Muh = new Customer("dia");
    
    Gazali.setMember(true);
    Gazali.setMemberType("Premium");
    Muh.setMember(true);
    Muh.setMemberType("Silver");

    Visit Gazali1 = new Visit(Gazali, LocalDate.of(2023, 10, 14));
    Gazali1.setServiceExpense(6.25);
    Gazali1.setProductExpense(8.20);
    System.out.println(Gazali1);

    Visit Gazali2 = new Visit(Gazali, LocalDate.of(2023, 12, 17));
    Gazali2.setServiceExpense(8.0);
    Gazali2.setProductExpense(15.0);
    System.out.println(Gazali2);

    Visit LaOde1 = new Visit(LaOde, LocalDate.of(2024, 01, 05));
    LaOde1.setServiceExpense(20.25);
    LaOde1.setProductExpense(7.5);
    System.out.println(LaOde1);

    Visit Muh1 = new Visit(Muh, LocalDate.of(2024, 01, 02));
    Muh1.setServiceExpense(12.25);
    Muh1.setProductExpense(6);
    System.out.println(Muh1);
  }
}