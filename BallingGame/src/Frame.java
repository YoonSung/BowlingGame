
public class Frame {

	int frameNumber;
	
	public Frame(int frameNumber) {
		this.frameNumber = frameNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + frameNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Frame other = (Frame) obj;
		if (frameNumber != other.frameNumber)
			return false;
		return true;
	}
}
