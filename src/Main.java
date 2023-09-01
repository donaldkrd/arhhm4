import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        /**
         * Создаем объект класса TicketProvider, где будут храниться билеты
         * и добавляем несколько билетов
         */
        TicketProvider salon = new TicketProvider();
        salon.ticketList.add(new Ticket(1, 100, 1, true, "empty"));
        salon.ticketList.add(new Ticket(2, 100, 2, true, "empty"));
        salon.ticketList.add(new Ticket(3, 100, 3, true, "empty"));
        salon.ticketList.add(new Ticket(4, 100, 4, true, "empty"));
        printTickets(salon);
        System.out.println();
        /**
         * Создаем первого покупателя
         */
        Customer customer = new Customer(1,"Garry", new ArrayList<>());
        /**
         * Сперва проходим авторизацию, потом вносим данные
         * без авторизации, данные не внесутся
         */
        customer.cash.authorization(customer);
        customer.cash.setIdCard(123456789);
        customer.cash.setHashCode(987654321);
        customer.cash.setCash(100);
        printCustomer(customer);

        Customer customer1 = new Customer(2,"Alex", new ArrayList<>());
        customer1.cash.authorization(customer1);
        customer1.cash.setCash(25000);
        customer1.cash.setIdCard(147258369);
        customer1.cash.setHashCode(963852741);
        printCustomer(customer1);

        customer.buyTicket(salon.getTicket(3));
        System.out.println();

        printTickets(salon);
        System.out.println();

        customer.buyTicket(salon.getTicket(4));

        printTickets(salon);
        System.out.println();
        System.out.println(customer.searchTicket(3));
        System.out.println();
        customer1.buyTicket(salon.getTicket(4));
        printTickets(salon);
        System.out.println();
        printCustomer(customer);
        printCustomer(customer1);
    }

    /**
     * Метод printTickets() распечатывает имеющиеся билеты
     * @param salon на вход принимает салон ТС, в котором имеются билеты
     */
    static void printTickets(TicketProvider salon) {
        for (Ticket t: salon.ticketList) {
            System.out.printf("Дата: %s, Билет номер: %d, Цена: %.2f, Место: %d, Наличие: %s, Пассажир: %s\n",
                    t.date, t.rootNumber, t.price, t.place, t.isValid, t.nameCustomer);
        }
    }

    /**
     * Метод printCustomer() распечатываем данные по клиенту
     * @param customer на вход принимаем объект клиента
     */
    static void printCustomer(Customer customer){
        System.out.printf("ID Клиента: %d, Имя клиента: %s, Номер карты: %d, Авторизация: %s, Остаток на счете: %.2f\n",
                customer.id, customer.name, customer.cash.getIdCard(), customer.cash.isAuthorization, customer.cash.getCash());
    }

}