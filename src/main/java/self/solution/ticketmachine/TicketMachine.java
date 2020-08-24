package self.solution.ticketmachine;

import java.util.Collection;
import java.util.Set;

public class TicketMachine {

    private Database database;

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public MachineSearchResult search(String value){

        Collection<String> values = database.queryForValues(value);
        Set<Character> possibileChars = database.queryForPossibilities(value);

        return new MachineSearchResult(values, possibileChars);
    }

}
