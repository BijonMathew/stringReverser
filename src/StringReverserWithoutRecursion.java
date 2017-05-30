/*Bijon Mathew
 * 21/05/2017
 */
public class StringReverserWithoutRecursion implements StringReverser {

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
		StringBuffer theReverser = new StringBuffer(stringToBeReversed);
		theReverser.reverse();
		return theReverser.toString();

	}

	public static void main(String[] args) {
		String stringToBeReversed = "My name is Bijon. I am learning Java.";

		StringReverserWithoutRecursion clockOne = new StringReverserWithoutRecursion();
		clockOne.setStartTime(System.nanoTime());

		String output = new StringReverserWithoutRecursion().reverse(stringToBeReversed);

		clockOne.setEndTime(System.nanoTime());

		System.out.println("Input string : " + stringToBeReversed  );
		System.out.println();
		System.out.println("Reversed string : " +output);
		System.out.println();

		long count = clockOne.getTimeTaken();

		System.out.println("Processing Time : "+count+ " nano seconds");
	}

}
