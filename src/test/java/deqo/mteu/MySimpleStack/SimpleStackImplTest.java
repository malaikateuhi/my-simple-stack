package deqo.mteu.MySimpleStack;

import java.lang.String;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

public class SimpleStackImplTest {

    SimpleStack simpleStack;
    Item item1 = new Item(new String("item1"));
    Item item2 = new Item(new String("item2"));
    Item item3 = new Item(new Integer(8));

    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStackImpl();
        System.out.println("Je suis execute avant chaque test");
    }

    @Test
    public void isEmpty() throws Exception {
        assertThat(simpleStack.isEmpty(), is(true));
        simpleStack.push(item1);
        assertThat(simpleStack.isEmpty(), is(false));
    }

    @Test
    public void getSize() throws Exception {
        assertThat(simpleStack.getSize(), is(0));
        simpleStack.push(item1);
        assertThat(simpleStack.getSize(), is(1));
        simpleStack.push(item2);
        assertThat(simpleStack.getSize(), is(2));
    }

    @Test
    public void push() throws Exception {
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(item3);
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.peek();
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(item3.getValue(),integer);

    }

    @Test
    public void peek() throws Exception {
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(item3);
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.peek();
        Assert.assertEquals(1,simpleStack.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(item3.getValue(),integer);

    }

    @Test
    public void pop() throws Exception {
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(item3);
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.pop();
        Assert.assertEquals(0,simpleStack.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        Assert.assertEquals(8,integer.intValue());
        Assert.assertEquals(item3.getValue(),integer);
    }

}