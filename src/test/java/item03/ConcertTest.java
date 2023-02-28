package item03;

import org.junit.jupiter.api.Test;

class ConcertTest {

    @Test
    void perform() {
//        Concert concert = new Concert(Elivs.getInstance());
        Concert concert = new Concert(new MockElvis());
        concert.perform();
    }
}