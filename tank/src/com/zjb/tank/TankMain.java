package com.zjb.tank;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankMain {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setTitle("tank war");
		frame.setSize(800, 600);
		// 设置窗口大小不可变
		frame.setResizable(false);
		// 添加窗口监听
		frame.addWindowListener(new WindowAdapter() {
			// 重写关闭事件
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		frame.setVisible(true);
	}

}
