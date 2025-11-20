class IdGenerator {
	static long next = 1;
	public static synchronized long  nextId(){
		return next++;
	}
}
