import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Activity1 {
	static ArrayList<String> list;
	
	@BeforeEach
	void SetUp() throws Exception {
		list = new ArrayList<String>();
        list.add("Anup"); 
        list.add("Amit"); 
    }
	
	@Test
	public void insertTest() {
	assertEquals(2,list.size(),"Correct Size");
	list.add(2,"Arup");
	assertEquals(3,list.size(),"Updated Array Size");
	assertEquals("Anup", list.get(0), "Correct element");
	assertEquals("Amit", list.get(1), "Correct element");
	assertEquals("Arup", list.get(2), "Correct element");
	}
	
	@Test
    public void replaceTest() {
       
        list.set(1, "Sourav");

        assertEquals(2, list.size(), "correct size");
        assertEquals("Anup", list.get(0), "Correct element");
        assertEquals("Sourav",list.get(1), "Correct element");
	}
	
}
