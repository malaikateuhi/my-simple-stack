package deqo.mteu.MySimpleStack;

/*
  Reponse exigence #1
 */

public class Item {

    private Object value;


    public Item(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
