package day20;




	
	class Employee implements Comparable<Employee> {
		int number;
		String name;
		String dept;
		
		
		
		
		
		
		
		public int getNumber() {
			return number;
		}












		public void setNumber(int number) {
			this.number = number;
		}












		public String getName() {
			return name;
		}












		public void setName(String name) {
			this.name = name;
		}












		public String getDept() {
			return dept;
		}












		public void setDept(String dept) {
			this.dept = dept;
		}












		@Override
		public String toString() {
			return "Employee [number=" + number + ", name=" + name + ", dept=" + dept + "]";
		}












		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((dept == null) ? 0 : dept.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + number;
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
			Employee other = (Employee) obj;
			if (dept == null) {
				if (other.dept != null)
					return false;
			} else if (!dept.equals(other.dept))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (number != other.number)
				return false;
			return true;
		}












		public Employee() {
			super();
		}
		
		










		public Employee(int number, String name, String dept) {
			super();
			this.number = number;
			this.name = name;
			this.dept = dept;
		}












		@Override
		public int compareTo(Employee o) {
			return number - o.number;
			
		}
		
		
		
		
		
	}


