package by.andd3dfx.collections;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CustomLinkedListTest {

    @Test
    public void addNGet() {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        assertThat(linkedList.size(), is(0));
        assertTrue(linkedList.isEmpty());

        linkedList.add(3);
        linkedList.add(7);

        assertThat(linkedList.size(), is(2));
        assertFalse(linkedList.isEmpty());
        assertThat(linkedList.get(0), is(3));
        assertThat(linkedList.get(1), is(7));

        linkedList.add(12);
        linkedList.add(34);

        assertThat(linkedList.size(), is(4));
        assertFalse(linkedList.isEmpty());
        assertThat(linkedList.get(0), is(3));
        assertThat(linkedList.get(1), is(7));
        assertThat(linkedList.get(2), is(12));
        assertThat(linkedList.get(3), is(34));
    }

    @Test
    public void reverse() {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(12);
        linkedList.add(34);

        assertThat(linkedList.size(), is(4));
        assertThat(linkedList.get(0), is(3));
        assertThat(linkedList.get(1), is(7));
        assertThat(linkedList.get(2), is(12));
        assertThat(linkedList.get(3), is(34));

        linkedList.reverse();

        assertThat(linkedList.size(), is(4));
        assertThat(linkedList.get(0), is(34));
        assertThat(linkedList.get(1), is(12));
        assertThat(linkedList.get(2), is(7));
        assertThat(linkedList.get(3), is(3));
    }

    @Test
    public void remove() {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(11);
        linkedList.add(7);
        linkedList.add(12);
        linkedList.add(34);

        var removed = linkedList.remove();

        assertThat(removed, is(11));
        assertThat(linkedList.size(), is(3));
        assertThat(linkedList.get(0), is(7));
        assertThat(linkedList.get(1), is(12));
        assertThat(linkedList.get(2), is(34));

        var removed2 = linkedList.remove();

        assertThat(removed2, is(7));
        assertThat(linkedList.size(), is(2));
        assertThat(linkedList.get(0), is(12));
        assertThat(linkedList.get(1), is(34));
    }

    @Test
    public void removeByIndex() {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(11);
        linkedList.add(7);
        linkedList.add(12);
        linkedList.add(34);

        var removed = linkedList.remove(2);

        assertThat(removed, is(12));
        assertThat(linkedList.size(), is(3));
        assertThat(linkedList.get(0), is(11));
        assertThat(linkedList.get(1), is(7));
        assertThat(linkedList.get(2), is(34));

        var removed2 = linkedList.remove(2);

        assertThat(removed2, is(34));
        assertThat(linkedList.size(), is(2));
        assertThat(linkedList.get(0), is(11));
        assertThat(linkedList.get(1), is(7));
    }

    @Test
    public void removeByValue() {
        CustomLinkedList<String> linkedList = new CustomLinkedList<>();
        linkedList.add("Andrei");
        linkedList.add("Tikhon");
        linkedList.add("Ilya");
        linkedList.add("Elena");
        linkedList.add("Yulia");

        var removeResult = linkedList.remove("Ilya");

        assertTrue(removeResult);
        assertThat(linkedList.size(), is(4));
        assertThat(linkedList.get(0), is("Andrei"));
        assertThat(linkedList.get(1), is("Tikhon"));
        assertThat(linkedList.get(2), is("Elena"));
        assertThat(linkedList.get(3), is("Yulia"));

        var removeResult2 = linkedList.remove("John");

        assertFalse(removeResult2);
        assertThat(linkedList.size(), is(4));
        assertThat(linkedList.get(0), is("Andrei"));
        assertThat(linkedList.get(1), is("Tikhon"));
        assertThat(linkedList.get(2), is("Elena"));
        assertThat(linkedList.get(3), is("Yulia"));
    }

    @Test
    public void removeByValueWhenAbsent() {
        CustomLinkedList<String> linkedList = new CustomLinkedList<>();
        linkedList.add("Andrei");
        linkedList.add("Tikhon");
        linkedList.add("Ilya");
        linkedList.add("Elena");
        linkedList.add("Yulia");

        var removed = linkedList.remove("Oksana");

        assertFalse(removed);
        assertThat(linkedList.size(), is(5));
        assertThat(linkedList.get(0), is("Andrei"));
        assertThat(linkedList.get(1), is("Tikhon"));
        assertThat(linkedList.get(2), is("Ilya"));
        assertThat(linkedList.get(3), is("Elena"));
        assertThat(linkedList.get(4), is("Yulia"));
    }

    @Test
    public void pushNPop() {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        assertTrue(linkedList.isEmpty());
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(36);
        linkedList.push(39);

        assertThat(linkedList.pop(), is(39));
        assertThat(linkedList.pop(), is(36));
        assertThat(linkedList.pop(), is(3));
        assertFalse(linkedList.isEmpty());
        assertThat(linkedList.pop(), is(2));
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void pushNPopNRemove() {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(36);    // 36 3 2
        assertThat(linkedList.remove(1), is(3));   // 36 2
        linkedList.push(39);
        linkedList.push(43);
        linkedList.push(45);    // 45 43 39 36 2
        assertThat(linkedList.remove(2), is(39));   // 45 43 36 2

        assertThat(linkedList.pop(), is(45));
        assertThat(linkedList.pop(), is(43));
        assertThat(linkedList.pop(), is(36));
        assertThat(linkedList.pop(), is(2));
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void testToString() {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(12);
        linkedList.add(34);

        var result = linkedList.toString();

        assertThat(result, is("CustomLinkedList{head={3, next={7, next={12, next={34}}}}}"));
    }
}
