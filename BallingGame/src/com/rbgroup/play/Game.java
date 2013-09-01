package com.rbgroup.play;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.rbgroup.point.PointController;
import com.rbgroup.print.ConsolePrinter;


public class Game {
	
	private List<Frame> frames;
	Scanner scanner = new Scanner(System.in); //its for play game. scanner is pause every rolling time
	
	
	Game() {
		frames = new ArrayList<Frame>(10);
		initialize();
		AutoPlayStart();
	}
	
	private void initialize() {
		frames.add(new Frame(1));
		frames.add(new Frame(2));
		frames.add(new Frame(3));
		frames.add(new Frame(4));
		frames.add(new Frame(5));
		frames.add(new Frame(6));
		frames.add(new Frame(7));
		frames.add(new Frame(8));
		frames.add(new Frame(9));
		frames.add(new Frame(10));
	}

	int getScore(){
		int totalScore = 0;
		
		for (Frame frame : frames) {
			totalScore += frame.getScore();
		}
		return totalScore;
	}
	
	int getCurrentFrameNumber() {
		int currentFrameNumber = 1;
		
		for (Frame frame : frames) {
			if (!frame.isFrameEnd()) {
				currentFrameNumber = frame.getFrameNumber();
				break;
			}
		}
		
		return currentFrameNumber;
	}
	
	int getCurrentRollingNumber() {
		int frameNumber = getCurrentFrameNumber();
		int rollingIndex = frames.get(frameNumber-1).getRollingIndex();
		
		return rollingIndex;
	}
	
	void AutoPlayStart() {
		
		pause();
		
		for (Frame frame : frames) {
			play(frame);
		}
	}
	
	private void play(Frame frame) {
		int remainPinNumber = 10;
		PointController pointController = new PointController();
		
		while (!frame.isFrameEnd()) {
			int knockDownPinNumber = PlayUtil.getKnockDownPinRandomNumber(remainPinNumber);
			frame.roll(pointController.getProperPoint(knockDownPinNumber));
			remainPinNumber -=knockDownPinNumber; 
			pause();
		}
	}

	private void pause() {
		System.out.println("continue (Press Anykey)");
		showScoreBoard();
		scanner.nextLine();
	}

	void showScoreBoard() {
		new ConsolePrinter(frames).print();
	}
	
	boolean isGameEnd() {
		Frame lastFrame = frames.get(9);
		return lastFrame.isFrameEnd();
	}
}	
