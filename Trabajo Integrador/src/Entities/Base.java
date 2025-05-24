package Entities;

import java.util.Objects;

public class Base {
    private long id;

	public Base(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Base other = (Base) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "\nBase [id=" + id + "]";
	}
    
    
}
