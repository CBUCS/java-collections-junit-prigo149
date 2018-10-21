public class HashMap<Key, Value> {
    static class Entry<Key, Value> {
        private final Key key;
        private Value value;
        private HashMap.Entry<Key, Value> next = null;

        public Entry(final Key key, final Value value) {
            this.key = key;
            this.value = value;
        }

        public Key getKey() {
            return key;
        }

        public Value getValue() {
            return value;
        }

        public void setValue(final Value value) {
            this.value = value;
        }

        public void setNext(final Entry<Key, Value> newEntry) {
            next = newEntry;
        }

        public Entry<Key, Value> getNext() {
            return next;
        }

        public boolean isNotLast() {
            return (next != null);
        }
    }

    private final static int maxSize = 16;
    private int size = maxSize;
    private Entry<Key, Value>[] values = null;

    public HashMap() {
        this(maxSize);
    }

    public HashMap(int Size) {
        if (Size < 0) {
            this.size = maxSize;
        }
        values = new Entry[this.size];
    }

    public void put(final Key key, final Value value) {
        final int index = getIndex(key.hashCode()); //get index from the hashcode
        Entry<Key, Value> current = values[index];
        if (current == null) { //if there is nothing at that index, cool
            values[index] = new Entry<Key, Value>(key, value);
        } else { //else we got to add in the list of entry bucket
            if (key.equals(current.getKey())) {
                current.setValue(value);
                return;
            }
            while (current.isNotLast()) {
                current = current.getNext();
                if (key.equals(current.getKey())) {
                    current.setValue(value);
                    return;
                }
            }
            // If nothing has happened yet.
            current.setNext(new Entry<Key, Value>(key, value));
        }
    }

    public boolean remove(final Key key) {
        final int index = getIndex(key.hashCode());
        Entry<Key, Value> current = values[index];
        Entry<Key, Value> previous = null;
        while (null != current) {
            if (key.equals(current.getKey())) {
                if (null == previous) {
                    values[index] = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                    current = null;
                }
                return true;
            }
            previous = current;
            current = current.getNext();
        }
        return false;
    }

    public Value get(final Key key) {
        final int index = getIndex(key.hashCode());
        Entry<Key, Value> current = values[index];
        while (null != current) {
            if (key.equals(current.getKey())) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    private int getIndex(int hash) {
        if (hash < 0) {
            hash = -hash;
        }
        return (hash % size);
    }
}