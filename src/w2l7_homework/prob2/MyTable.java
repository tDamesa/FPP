package w2l7_homework.prob2;

public class MyTable {
	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('w', "Willie");
		System.out.println(t);
	}

	private Entry[] entries = new Entry[26];

	// returns the String that is matched with char c in the table
	public String get(char c) {
		return entries[getIndex(c)].getValue();
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		entries[getIndex(c)] = new Entry(c, s);
	}

	private int getIndex(char c) {
		if (c < 97 || c > 122)
			return -1;

		return c - 97;
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Entry e : entries) {
			if (e != null) {
				builder.append(e.toString());
				builder.append("\n");
			}
		}
		return builder.toString();
	}

	private class Entry {
		String s;
		char c;

		Entry(char ch, String str) {
			c = ch;
			s = str;
		}

		public String getValue() {
			return s;
		}

		public void setValue(String value) {
			this.s = value;
		}

		public char getKey() {
			return c;
		}

		public void setKey(char key) {
			this.c = key;
		}

		// returns a String of the form "ch->str"
		public String toString() {

			return c + "->" + s;
		}
	}
}

/*
 * Output: a->Andrew b->Billy w->Willie
 */