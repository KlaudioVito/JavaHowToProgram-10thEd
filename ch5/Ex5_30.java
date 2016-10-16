package ch05;

public class Ex5_30 {
	private int accountNumber; 
	private String makeAndModel;
	private String state;
	
	public Ex5_30(int accountNumber, String makeAndModel, String state) {
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}
	
	public String getMakeAndModel() {
		return makeAndModel;
	}
	
	public void setState(String state) {
		if(state.equals("MA") || 
				state.equals("NJ") || 
				state.equals("NY") || 
				state.equals("PA") || 
				state.equals("CT") || 
				state.equals("ME") || 
				state.equals("NH") || 
				state.equals("VT"))
					this.state = state;
		else
			System.out.println("Error. Cannot set state");
	}
	
	public String getState() {
		return state;
	}
	
	public boolean isNoFaultState(){
		boolean noFaultState;
		switch (getState()) {
		case "MA": case "NJ": case "NY": case "PA": case "CT": case "ME": case "NH": case "VT":
			noFaultState = true;
			break;
		default:
			noFaultState = false;
			break;
		}
		return noFaultState;
	}
}
