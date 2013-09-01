package com.rbgroup.play;
import java.util.ArrayList;
import java.util.List;

import com.rbgroup.point.PointController;
import com.rbgroup.print.ConsolePrinter;


public class Game {
	
	private List<Frame> frames;
	private int lastFrameNumber = 10;
	
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


	Frame getFrame(int frameNumber) {
		return frames.get(frameNumber);
	}
	
	int getScore(){
		int totalScore = 0;
		
		for (Frame frame : frames) {
			totalScore += frame.getScore();
		}
		return totalScore;
	}
	
	void AutoPlayStart() {
		
		for (Frame frame : frames) {
			playFrameShoot(frame);
		}
	}
	
	private void playFrameShoot(Frame frame) {
		int remainPinNumber = 10;
		PointController pointController = new PointController();
		
		while (!frame.isFrameEnd()) {
			int knockDownPinNumber = PlayUtil.getKnockDownPinRandomNumber(remainPinNumber);
			frame.roll(pointController.getProperPoint(knockDownPinNumber));
			remainPinNumber -=knockDownPinNumber; 
		}
	}

	void screenPrint() {
		new ConsolePrinter(frames).print();
	}
}	
