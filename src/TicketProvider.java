import java.util.ArrayList;
import java.util.List;

/**
 * Класс поставщика билетов.
 * Имеет два метода - получить билет и обновить данные по билетам
 */
public class TicketProvider {
    List<Ticket> ticketList = new ArrayList<>();
    /**
     * Метод получения билета
     * @param rootNumber на вход принимает номер билета
     * @return возвращает билет
     */
    public Ticket getTicket(long rootNumber){
        for (Ticket t : ticketList) {
            if (t.rootNumber == rootNumber) {
                return t;
            }
        }
        return null;
    }
}