package self.solution.ticketmachine;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketMachineTest {

    @Test
    void constructors(){
        TicketMachine ticketMachine = new TicketMachine();
    }

    @Test
    void searchResult1(){
        Database database = new Database(Arrays.asList("DARTFORD", "DARTMOUTH", "TOWER HILL", "DERBY"));
        TicketMachine ticketMachine = new TicketMachine();
        ticketMachine.setDatabase(database);

        MachineSearchResult result = ticketMachine.search("DART");
        List<String> expectedResults = Arrays.asList("DARTFORD", "DARTMOUTH");
        assert(result.getResultValues().stream().allMatch(e -> expectedResults.contains(e)));
        List<Character> expectedPossibleChars = Arrays.asList('F', 'M');
        assert(result.getPossibleNextCharacters().stream().allMatch(e -> expectedPossibleChars.contains(e)));
    }

    void searchResult2(){
        Database database = new Database(Arrays.asList("LIVERPOOL", "LIVERPOOL LIME STREET", "PADDINGTON"));
        TicketMachine ticketMachine = new TicketMachine();
        ticketMachine.setDatabase(database);

        MachineSearchResult result = ticketMachine.search("LIERPOOL");
        List<String> expectedResults = Arrays.asList("LIERPOOL", "LIVERPOOL LIME STREET");
        assert(result.getResultValues().stream().allMatch(e -> expectedResults.contains(e)));
        List<Character> expectedPossibleChars = Arrays.asList(' ');
        assert(result.getPossibleNextCharacters().stream().allMatch(e -> expectedPossibleChars.contains(e)));
    }

    void searchResult3(){
        Database database = new Database(Arrays.asList("", "", ""));
        TicketMachine ticketMachine = new TicketMachine();
        ticketMachine.setDatabase(database);

        MachineSearchResult result = ticketMachine.search("LIERPOOL");
        List<String> expectedResults = Arrays.asList("LIERPOOL", "LIVERPOOL LIME STREET");
        assert(result.getResultValues().stream().allMatch(e -> expectedResults.contains(e)));
        List<Character> expectedPossibleChars = Arrays.asList(' ');
        assert(result.getPossibleNextCharacters().stream().allMatch(e -> expectedPossibleChars.contains(e)));
    }
}
