package self.solution.ticketmachine;

import org.junit.jupiter.api.Test;

import java.util.*;

public class DatabaseTest {
    @Test
    void constructor () {
        Database db = new Database();
    }

    @Test
    void empty_return_values () {
        Database db = new Database();
        db.setData(Arrays.asList("adriano", "adrikei"));

        Collection<String> result = db.queryForValues("x");
        assert(result.equals(Collections.emptyList()));
    }

    @Test
    void should_return_values(){
        Database db = new Database();
        db.setData(Arrays.asList("adriano", "adrikei"));

        Collection<String> result = db.queryForValues("adri");
        assert(result.equals(Arrays.asList("adriano", "adrikei")));
    }

    @Test
    void empty_possibilities(){
        Database db = new Database(Arrays.asList("adriano", "adrikei"));

        Set<Character> result = db.queryForPossibilities("adrikei");
        assert(result.equals(Collections.emptySet()));
    }

    @Test
    void next_possible_chars(){
        Database db = new Database(Arrays.asList("adriano", "adrikei"));
        db.setData(Arrays.asList("adriano", "adrikei"));

        Set<Character> result = db.queryForPossibilities("adri");
        assert(result.equals(Set.of(Character.valueOf('a'), Character.valueOf('k'))));
    }
}
