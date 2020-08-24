package self.solution;

import self.solution.ticketmachine.Database;
import self.solution.ticketmachine.MachineSearchResult;
import self.solution.ticketmachine.TicketMachine;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        Database database = new Database(Arrays.asList("DARTFORD", "DARTMOUTH", "TOWER HILL", "DERBY"));
        TicketMachine ticketMachine = new TicketMachine();
        ticketMachine.setDatabase(database);

        MachineSearchResult result = ticketMachine.search("DART");

        System.out.println(result.getPossibleNextCharacters());
        System.out.println(result.getResultValues());
    }
}
