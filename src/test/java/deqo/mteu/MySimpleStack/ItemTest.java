package deqo.mteu.MySimpleStack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item item;
    Object obj1, obj2;

    @Before
    public void setUp() throws Exception {
        obj1 = new String("Test string");
        obj2 = new Integer(2017);
    }
    /*

    public void testGetSet(){
    item = new Item(obj1);
    assertThat(item.getValue(),sameInstance(obj1));
    item.setValue(obj2);
    assertThat(item.getValue(),sameInstance(obj2));
    }
    */

    @Test
    public void getValue() throws Exception {
    }

    @Test
    public void setValue() throws Exception {
    }

}