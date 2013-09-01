package com.rbgroup.print;

import java.util.List;

import com.rbgroup.play.Frame;

public class ConsolePrinter implements Printer{

	public static String NEW_LINE = System.getProperty("line.separator");
	private List<Frame> frames;
	
	@Override
	public void print() {
		generateScreen(3);
	}

	public ConsolePrinter(List<Frame> frames) {
		this.frames = frames;
	}
	
	private void generateScreen(int currentFrameNumber) {
		StringBuilder sb = new StringBuilder();

		for (Frame frame : frames) {
			String result = frame.generateString();
			System.out.print(result);
			System.out.print("|");
		}
//		sb.append(frameNumberPrint(currentFrameNumber));
//		sb.append(frameScorePrint(currentFrameNumber));
//		sb.append(frameAccumulatedScorePrint(currentFrameNumber));
	
		System.out.println(sb.toString());
	}
}
