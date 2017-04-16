package transaction.employee;

public class EmployeeHandler implements Comparable {

	int tot, totalMoney, averageMoney;
	String name, lastName;

	/**
	 * @param averageMoney
	 * @param tot
	 * @param totalMoney
	 * @param name
	 * @param lastName
	 */
	public EmployeeHandler(int tot, int totalMoney, String name,
			String lastName) {
		this.tot = tot;
		this.totalMoney = totalMoney;
		this.name = name;
		this.lastName = lastName;
		averageMoney();
	}

	public void averageMoney() {
		averageMoney = (totalMoney / tot);
	}

	/**
	 * @return the averageMoney
	 */
	public int getAverageMoney() {
		return averageMoney;
	}

	public int compareTo(Object obj) {
		EmployeeHandler golfer = (EmployeeHandler) obj;
		if (this.getAverageMoney() > golfer.getAverageMoney()) {
			return -1;
		} else if (this.getAverageMoney() < golfer.getAverageMoney()) {
			return 1;
		} else {
			return 0;
		}

	}

	public String toString() {
		String r = String.format("%-15s %-15s %-20d %-7d", lastName, name, tot,
				averageMoney);
		return r;
	}

}
