package AviaSouls;

import TicketManager.Ticket;
import org.junit.jupiter.api.Test;

class AviaSoulsTest {

    @Test
    public void testSortTickets() {
      AviaSoulsTest souls = new AviaSoulsTest();
        Ticket ticket1 = new Ticket("Москва", "Сочи", 600, 10, 11);
        Ticket ticket2 = new Ticket("Москва", "Калининград", 500, 22, 2);
        Ticket ticket3 = new Ticket("Стамбул", "Москва", 1200, 15, 18);
        Ticket ticket4 = new Ticket("Москва", "Сочи", 550, 3, 5);
        Ticket ticket5 = new Ticket("Москва", "Сочи", 400, 12, 13);
        Ticket ticket6 = new Ticket("Чита", "Владивосток", 600, 15, 23);
        Ticket ticket7 = new Ticket("Москва", "Сочи", 800, 12, 17);
        Ticket ticket8 = new Ticket("Чита", "Москва", 600, 10, 16);
        Ticket ticket9 = new Ticket("Москва", "Сочи", 250, 13, 23);
        Ticket ticket10 = new Ticket("Ташкент", "Москва", 1500, 15, 1);
        souls.add(ticket1);
        souls.add(ticket2);
        souls.add(ticket3);
        souls.add(ticket4);
        souls.add(ticket5);
        souls.add(ticket6);
        souls.add(ticket7);
        souls.add(ticket8);
        souls.add(ticket9);
        souls.add(ticket10);

        Ticket[] expected = { ticket9, ticket5, ticket4, ticket1, ticket7 };
        Ticket [] actual = souls.findAll("Москва", "Сочи");
    }

}