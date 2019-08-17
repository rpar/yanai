package com.ravi.testenum;

public enum EnumStateMachine {
	
	NIGHT(null), EVENING(NIGHT), AFTERNOON(EVENING), MORNING(AFTERNOON) ;
	
	private EnumStateMachine nextEnums;
	
	private EnumStateMachine(EnumStateMachine i)
	{
		this.nextEnums = i;
	}
	
	public EnumStateMachine getNextEnum()
	{
		return nextEnums;
	}

	
	public static void main(String[] args) {
		
		EnumStateMachine e = EnumStateMachine.MORNING;
		
		//while(e.nextEnums != null)
		while(e.ordinal() >= 0)
		{
			System.out.println(e.ordinal() +", " + e.name() + ", Current==>" +e + ", Next==>" + e.getNextEnum());
			e = e.getNextEnum();
			if(e == null) break;
		}
		
	}
	
}
