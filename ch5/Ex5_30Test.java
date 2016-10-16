package ch05;

public class Ex5_30Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex5_30 policy1 = new Ex5_30(11111111, "Toyota Camry", "NJ" );
		Ex5_30 policy2 = new Ex5_30(22222222, "Ford Fusion", "ME");
		Ex5_30 policy3 = new Ex5_30(33333333, "Ford Fusion", "CT");
		Ex5_30 policy4 = new Ex5_30(44444444, "Ford Fusion", "MA");
		Ex5_30 policy5 = new Ex5_30(55555555, "Ford Fusion", "NH");
		Ex5_30 policy6 = new Ex5_30(66666666, "Ford Fusion", "NY");
		Ex5_30 policy7 = new Ex5_30(77777777, "Ford Fusion", "PA");
		Ex5_30 policy8 = new Ex5_30(88888888, "Ford Fusion", "VT");
		
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
		policyInNoFaultState(policy3);
		policyInNoFaultState(policy4);
		policyInNoFaultState(policy5);
		policyInNoFaultState(policy6);
		policyInNoFaultState(policy7);
		policyInNoFaultState(policy8);
		
		policy8.setState("FL");
		policyInNoFaultState(policy8);
		
		policy8.setState("NY");
		policyInNoFaultState(policy8);
		
	}
	
	public static void policyInNoFaultState(Ex5_30 policy){
		System.out.println("The auto policy:");
		System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n", 
				policy.getAccountNumber(), 
				policy.getMakeAndModel(),
				policy.getState(),
				(policy.isNoFaultState() ? "is": "is not")
		);
	}
}
