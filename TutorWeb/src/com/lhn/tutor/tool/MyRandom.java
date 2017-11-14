package com.lhn.tutor.tool;

import java.util.Random;

public final class MyRandom {
	
	public static String cRandom(int n) { // 产生1个长度为m只含有字母的随机字符串
        char[] chs = new char[n];
        for (int i = 0; i < n; i++) {
            chs[i] = cNumOrCharRandom();
        }
        return new String(chs);
    }
	
	public static char cNumOrCharRandom() { // 产生一个随机数字或字母
        String temp = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        return (char) temp.charAt(iRandom(0, 61));
    }
	
	public static int iRandom(int m, int n) { // 产生一个[m,n)之间的随机整数
        Random random = new Random();
        int small = m > n ? n : m;
        int big = m <= n ? n : m;
        return small + random.nextInt(big - small);
    }
}
