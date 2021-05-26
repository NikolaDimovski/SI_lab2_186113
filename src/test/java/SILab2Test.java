import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


class SILab2Test {

    private static SILab2 lab = new SILab2();

    private List<String> getList(String... strings){
        return new ArrayList<>(Arrays.asList(strings));
    }

    @Test
    void EveryBranchTest() {
        IllegalArgumentException ex = null;
        ex=assertThrows(IllegalArgumentException.class, () -> lab.function(new ArrayList<>()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        assertEquals(getList("1", "#", "2", "#"), object.function(getList("0", "#", "0", "#")));
    }

    @Test
    void MultipleTest(){
        //i - 1 >= 0 && list.get(i - 1).equals("#")
        //T&&T
        //T&&F
        //F&&X
        IllegalArgumentException ex = null;
        ex=assertThrows(IllegalArgumentException.class, () -> lab.function(new ArrayList<>()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        assertEquals(getList("0"), object.function(getList("0")));
        assertEquals(getList("1", "#", "2", "#"), object.function(getList("0", "#", "0", "#")));

        //i + 1 < list.size() && list.get(i + 1).equals("#")
        //T&&T
        //T&&F
        //F&&X
        IllegalArgumentException ex = null;
        ex=assertThrows(IllegalArgumentException.class, () -> lab.function(new ArrayList<>()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        assertEquals(getList("0"), object.function(getList("0")));
        assertEquals(getList("1", "#", "2", "#"), object.function(getList("0", "#", "0", "#")));
    }
}