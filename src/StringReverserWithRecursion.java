/*Bijon Mathew
 * 21/05/2017
 */
public class StringReverserWithRecursion implements StringReverser {
	
	long startTime;
	long endTime;
	long timeTaken;
	
	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public long getTimeTaken() {
		this.timeTaken = this.endTime - this.startTime;
		return timeTaken;
	}

	public void setTimeTaken(long timeTaken) {
		this.timeTaken = timeTaken;
	}

	public String reverse(String stringToBeReversed) {
		if ((stringToBeReversed == null) || (stringToBeReversed.length() <= 1)) {
			return stringToBeReversed;
		} else {
			return reverse(stringToBeReversed.substring(1)) + stringToBeReversed.charAt(0);
		}

	}

	public static void main(String[] args) {
		String stringToBeReversed = "My name is Bijon. I am learning Java";
		
		StringReverserWithRecursion clock = new StringReverserWithRecursion();
		clock.setStartTime(System.nanoTime());
		String output = new StringReverserWithRecursion().reverse(stringToBeReversed);
		
		clock.setEndTime(System.nanoTime());
		System.out.println("Input String : " + stringToBeReversed);
		System.out.println();
		System.out.println("Reversed String : "+output);
		System.out.println();
		
		long count = clock.getTimeTaken();
		System.out.println("Processing Time: "+count+ " nano seconds");

		

	}
}