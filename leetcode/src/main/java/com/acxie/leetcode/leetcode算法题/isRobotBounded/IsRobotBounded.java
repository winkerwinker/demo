package com.acxie.leetcode.leetcode算法题.isRobotBounded;/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */

import java.util.HashMap;

/**
 *
 * @author xichang 88
 * @version merge.MergeTwoList.java, v 0.1 2023年12月15日 11:14 AM xichang
https://leetcode.cn/problems/robot-bounded-in-circle/description/

重要思想， 一次之后
判断是不是否同点
或者异点 不同方向
方向简单，就是所有的G在一起
 */
public class IsRobotBounded {
	public static void main(String[] args) {
		IsRobotBounded isRobotBounded = new IsRobotBounded();

		System.out.println(isRobotBounded.isRobotBounded("GGLLGG"));
	}

	public boolean isRobotBounded(String instructions) {

		String nowDireaction = "Y+";
		HashMap<String, String> nextDirection = new HashMap<>();
		nextDirection.put("Y+", "X-");
		nextDirection.put("X-", "Y-");
		nextDirection.put("Y-", "X+");
		nextDirection.put("X+", "Y+");

		HashMap<String, String> nextDirectionR = new HashMap<>();
		nextDirectionR.put("X-","Y+");
		nextDirectionR.put("Y-","X-");
		nextDirectionR.put("X+","Y-");
		nextDirectionR.put("Y+","X+");

		// 设计一个direction 的状态机器
		HashMap<String, Integer> stringStringHashMap = new HashMap<>();
		stringStringHashMap.put("X", 0);
		stringStringHashMap.put("Y", 0);
		for (int i = 0; i < instructions.length(); i++) {
			char c = instructions.charAt(i);
			if (c == 'G') {
				if (nowDireaction.equals("X+")) {
					Integer x = stringStringHashMap.get("X");
					stringStringHashMap.put("X", ++x);
				}
				if (nowDireaction.equals("X-")) {
					Integer x = stringStringHashMap.get("X");
					stringStringHashMap.put("X", --x);
				}
				if (nowDireaction.equals("Y-")) {
					Integer y = stringStringHashMap.get("Y");
					stringStringHashMap.put("Y", --y);
				}
				if (nowDireaction.equals("Y+")) {
					Integer y = stringStringHashMap.get("Y");
					stringStringHashMap.put("Y", ++y);
				}
			}
			if (c == 'L') {
				nowDireaction = nextDirection.get(nowDireaction);
			}
			if (c == 'R') {
				nowDireaction = nextDirectionR.get(nowDireaction);
			}
		}

		//
		//System.out.println(stringStringHashMap.get("X"));
		//System.out.println(stringStringHashMap.get("Y"));
		//System.out.println(nowDireaction);
		if (stringStringHashMap.get("X") == 0 && stringStringHashMap.get("Y") == 0) {
			return true;
		} else {
			return !nowDireaction.equals("Y+");
		}




	}

}