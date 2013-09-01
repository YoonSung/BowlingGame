package com.rbgroup.print;

import java.util.List;

import com.rbgroup.play.Frame;

public class ConsolePrinter implements Printer{

	public static String NEW_LINE = System.getProperty("line.separator");
	private List<Frame> frames;
	
	@Override
	public void print() {
		generateScreen();
	}

	public ConsolePrinter(List<Frame> frames) {
		this.frames = frames;
	}
	
	private void generateScreen() {

		StringBuilder sb = new StringBuilder();
		
		for (Frame frame : frames) {
			
			sb.append(frame.getFrameNumber()); 
			sb.append("=");
			sb.append(frame.getFramePointString());
			sb.append("=");
			sb.append(frame.getScore());
			sb.append("|");
		}
//		sb.append(frameNumberPrint(currentFrameNumber));
//		sb.append(frameScorePrint(currentFrameNumber));
//		sb.append(frameAccumulatedScorePrint(currentFrameNumber));
	
		System.out.println(sb.toString());
	}
}
