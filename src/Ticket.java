import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Класс билет.
 * Содержит номер билета, цену, место и дату,
 * а так же статус "свободен" и имя, кому принадлежит билет
 */
public class Ticket {
    long rootNumber;
    double price;
    int place;
    Date date = new GregorianCalendar().getTime();
    boolean isValid;
    String nameCustomer;

    public Ticket(long rootNumber, double price, int place, boolean isValid, String nameCustomer) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.place = place;
        this.isValid = isValid;
        this.nameCustomer = nameCustomer;
    }

    /**
     * Переопределили метод для более наглядного вывода информации
     * @return возвращает информацию о билете в читабельном формате
     */
    @Override
    public String toString() {
        return "Дата: " + this.date + ", Номер билета: " + this.rootNumber + ", Цена: " + this.price + ", Место: " +
                this.place + ", Наличие: " + this.isValid + ", Пассажир: " + this.nameCustomer;
    }
}
