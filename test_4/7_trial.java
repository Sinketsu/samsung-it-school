class C implements Comparator<User> {
	@Override
	public int compare(User o1, User o2) {
		return o1.name.compareTo(o2.name);
	}
}
TreeSet<User> tree = new TreeSet<>(new C());