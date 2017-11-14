package com.lhn.tutor.tool;

import java.util.Random;

public final class MyRandom {
	
	public static String cRandom(int n) { // ����1������Ϊmֻ������ĸ������ַ���
        char[] chs = new char[n];
        for (int i = 0; i < n; i++) {
            chs[i] = cNumOrCharRandom();
        }
        return new String(chs);
    }
	
	public static char cNumOrCharRandom() { // ����һ��������ֻ���ĸ
        String temp = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        return (char) temp.charAt(iRandom(0, 61));
    }
	
	public static int iRandom(int m, int n) { // ����һ��[m,n)֮����������
        Random random = new Random();
        int small = m > n ? n : m;
        int big = m <= n ? n : m;
        return small + random.nextInt(big - small);
    }
}
