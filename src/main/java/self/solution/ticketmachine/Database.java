package self.solution.ticketmachine;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class Database {

    private Collection<String> data;

    public Database() {

    }

    public Database(Collection<String> data){
        this.data = data;
    }

    public Set<Character> queryForPossibilities(String value) {
        if (this.data != null) {
            Collection<String> possibleValues = this.queryForValues(value);
            return possibleValues.stream()
                    .filter(s -> s.length() > value.length())
                    .map(s -> Character.valueOf(s.charAt(value.length())))
                    .collect(Collectors.toSet());
        } else {
            return Collections.emptySet();
        }
    }

    public Collection<String> queryForValues(String value) {
        if (this.data != null) {
            return this.data.stream()
                    .filter(s -> s.startsWith(value))
                    .collect(Collectors.toList());
        } else {
            return Collections.emptyList();
        }
    }

    public Collection<String> getData() {
        return data;
    }

    public void setData(Collection<String> data) {
        this.data = data;
    }
}
