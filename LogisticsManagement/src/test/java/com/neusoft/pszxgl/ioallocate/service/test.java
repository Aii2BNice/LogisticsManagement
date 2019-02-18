package com.neusoft.pszxgl.ioallocate.service;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ncount = scan.nextInt(); // 数据个数
		int[] data = new int[ncount]; // 全部数据
		for (int i = 0; i < ncount; i++) {
			data[i] = scan.nextInt();
		}
		int page = scan.nextInt(); // 要查询的页数
		int maxNumOfPage = scan.nextInt(); // 每页最大数据个数
		scan.close();
		int number = maxNumOfPage * page; // 待访问的数据下标

		if (number >= data.length) {
			System.out.println("超出分页范围");
			return;
		}

		for (int i = 0; i < maxNumOfPage; i++) {
			number += i;
			if (number >= data.length) {
				return;
			}
			System.out.println(data[number]);
		}
	}
}
