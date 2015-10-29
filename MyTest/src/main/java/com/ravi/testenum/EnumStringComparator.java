package com.ravi.testenum;

import java.util.Comparator;


public enum EnumStringComparator implements Comparator<String> {
	
    NATURAL {
        @Override
        public int compare(String s1, String s2) {
            return s1.compareTo(s2);
        }
    },
    REVERSE {
        @Override
        public int compare(String s1, String s2) {
            return -NATURAL.compare(s1, s2);
        }
    },
    LENGTH {
        @Override
        public int compare(String s1, String s2) {
            return new Integer(s1.length()).compareTo(s2.length());
        }
    };

    public abstract int compare(String s1, String s2);

    public static void main(String[] args) {
		System.out.println(EnumStringComparator.NATURAL.compare("1", "1"));
		System.out.println(EnumStringComparator.REVERSE.compare("22", "1"));
		System.out.println(EnumStringComparator.LENGTH.compare("122", "22"));
	}

}