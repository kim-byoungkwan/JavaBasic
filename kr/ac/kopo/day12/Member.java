package kr.ac.kopo.day12;


public class Member {
	private String name;
	private String phone;

	public Member() {
	}

	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
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
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	
	/*
//	public boolean equals(Object obj = new Member("홍길동","010-1111-222")) 
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		Member m = (Member)obj;
		if(this.name != null && !this.name.equals(m.name)) {
			return false;
		}
		if(this.phone != null && !this.phone.equals(m.phone)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}
	*/

}

