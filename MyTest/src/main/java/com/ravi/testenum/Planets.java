package com.ravi.testenum;

interface Named {
    public String name();
    public int order();
}

enum Planets implements Named {
    Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune;
    // name() is implemented automatically.
    public int order() { return ordinal()+1; }
    
    public static void main(String[] args) {
		for(Planets p : values())
		{
			System.out.println(p.order() + "-" + p.name());
		}
		
	}
}

