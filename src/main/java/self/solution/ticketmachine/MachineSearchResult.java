package self.solution.ticketmachine;

import java.util.Collection;

public class MachineSearchResult {

    private Collection<String> resultValues;
    private Collection<Character> possibleNextCharacters;

    public MachineSearchResult(Collection<String> resultValues, Collection<Character> possibleNextCharacters) {
        this.resultValues = resultValues;
        this.possibleNextCharacters = possibleNextCharacters;
    }

    public Collection<String> getResultValues() {
        return resultValues;
    }

    public void setResultValues(Collection<String> resultValues) {
        this.resultValues = resultValues;
    }

    public Collection<Character> getPossibleNextCharacters() {
        return possibleNextCharacters;
    }

    public void setPossibleNextCharacters(Collection<Character> possibleNextCharacters) {
        this.possibleNextCharacters = possibleNextCharacters;
    }
}
