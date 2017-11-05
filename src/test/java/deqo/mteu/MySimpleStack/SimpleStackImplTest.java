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

    }

    @Test
    public void peek() throws Exception {
        simpleStack.push(item1);
        simpleStack.push(item2);
        final Item item = simpleStack.peek();
        assertThat(item, sameInstance(item2));

    }

    @Test
    public void pop() throws Exception {
    }

}