package com.rbgroup.print;

import java.util.List;

import com.rbgroup.play.Frame;

public class ConsolePrinter implements Printer{

	public static String NEW_LINE = System.getProperty("line.separator");
	private List<Frame> frames;
	
	@Override
	public void print() {
		frameScreen(3);
	}

	public ConsolePrinter(List<Frame> frames) {
		this.frames = frames;
	}
	
	private void frameScreen(int currentFrameNumber) {
		StringBuilder sb = new StringBuilder();


		sb.append(frameNumberPrint(currentFrameNumber));
		sb.append(frameScorePrint(currentFrameNumber));
		sb.append(frameAccumulatedScorePrint(currentFrameNumber));
	
		System.out.println(sb.toString());
	}

	private String frameAccumulatedScorePrint(int currentFrameNumber) {
		int accumulatedScore = 300;
		int scoreLength = Integer.toString(accumulatedScore).length();
		
		StringBuilder sb = new StringBuilder();
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("*           ");
		}
		sb.append("*"+NEW_LINE);
		
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("*");
			
			for (int vacumSpace = 0 ; vacumSpace < 11 - scoreLength ; vacumSpace ++) {
				sb.append(" ");
			}
			
			sb.append(accumulatedScore);
		}
		sb.append("*"+NEW_LINE);
		
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("************");
		}
		sb.append("*"+NEW_LINE);
		
		
		return sb.toString();
	}

	private String frameScorePrint(int currentFrameNumber) {
		StringBuilder sb = new StringBuilder();
		
		int firstShoot = 1;
		int secondShoot = 2;
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("*           ");
		}
		sb.append("*"+NEW_LINE);
		
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("*   ");
			sb.append(firstShoot);
			sb.append("   ");
			sb.append(secondShoot);
			sb.append("   ");
		}
		sb.append("*"+NEW_LINE);
		
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("*           ");
		}
		sb.append("*"+NEW_LINE);
		
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("************");
		}
		
		sb.append("*"+NEW_LINE);
		
		
		return sb.toString();
	}

	private String frameNumberPrint(int currentFrameNumber) {
		StringBuilder sb = new StringBuilder();
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("* ");
			
			if (frameNumber < 10) {
				sb.append(" ");
			}
			
			sb.append(frameNumber);
			sb.append(" FRAME  ");
		}
		
		
		sb.append("*"+NEW_LINE);
		
		for (int frameNumber = 1; frameNumber <= currentFrameNumber; frameNumber++) {
			sb.append("************");
		}
		sb.append("*"+NEW_LINE);
		
		return sb.toString();
	}
}
