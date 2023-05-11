package by.andd3dfx.collections.custom;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CustomHashSetTest {

    @Test
    public void size() {
        CustomHashSet<String> set = new CustomHashSet<>();
        assertThat(set.size(), is(0));

        set.add("One");
        assertThat(set.size(), is(1));

        set.add("Two");
        assertThat(set.size(), is(2));

        set.add("Two");
        assertThat(set.size(), is(2));

        set.add("Three");
        assertThat(set.size(), is(3));

        set.add("One");
        assertThat(set.size(), is(3));
    }

    @Test
    public void isEmpty() {
        CustomHashSet<String> set = new CustomHashSet<>();
        assertTrue(set.isEmpty());
        set.add("One");
        assertFalse(set.isEmpty());
        set.add("Two");
        assertFalse(set.isEmpty());
    }

    @Test
    public void addNContains() {
        CustomHashSet<String> set = new CustomHashSet<>();
        assertFalse(set.contains("One"));
        assertFalse(set.contains("Two"));

        set.add("One");
        set.add("Two");

        assertTrue(set.contains("One"));
        assertTrue(set.contains("Two"));
        assertFalse(set.contains("Three"));
    }

    @Test
    public void addAllNContainsAll() {
        CustomHashSet<String> set = new CustomHashSet<>();
        assertTrue(set.containsAll(List.of()));

        set.addAll(List.of("One", "Two"));
        assertTrue(set.containsAll(List.of("One")));
        assertTrue(set.containsAll(List.of("Two", "One")));
        assertFalse(set.containsAll(List.of("Two", "One", "Three")));

        set.addAll(List.of("Three", "Four"));
        assertTrue(set.containsAll(List.of("Two", "One", "Three")));
    }

    @Test
    public void remove() {
        CustomHashSet<String> set = new CustomHashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        assertThat(set.size(), is(3));

        assertTrue(set.remove("Two"));
        assertFalse(set.remove("Two"));
        assertThat(set.size(), is(2));

        assertFalse(set.remove("Four"));
        assertThat(set.size(), is(2));

        set.add("Two");
        assertTrue(set.remove("Two"));
        assertFalse(set.remove("Two"));
        assertThat(set.size(), is(2));

        assertTrue(set.remove("One"));
        assertThat(set.size(), is(1));
    }

    @Test
    public void clear() {
        CustomHashSet<String> set = new CustomHashSet<>();
        assertThat(set.size(), is(0));
        set.add("One");
        set.add("Two");
        assertThat(set.size(), is(2));

        set.clear();

        assertThat(set.size(), is(0));
        assertTrue(set.isEmpty());
        assertFalse(set.contains("One"));
        assertFalse(set.contains("Two"));
    }
}
