package ejercicio2.cachelist;

public class IntObject {
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		return i;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof IntObject)) {
			return false;
		}
		IntObject other = (IntObject) obj;
		if (i != other.i) {
			return false;
		}
		return true;
	}
	
}
