package com.rbgroup.play;
import java.util.ArrayList;
import java.util.List;

import com.rbgroup.point.PointController;
import com.rbgroup.print.ConsolePrinter;


public class Game {
	
	private static Game instance = new Game();
	private List<Frame> frames = new ArrayList<Frame>(10);
	
	Game() {
		initialize();
	}
	
	Frame getFrame(int frameNumber) {
		return frames.get(frameNumber);
	}
	
	int getFrameSize() {
		return frames.size();
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

	static Game getInstance() {
		return instance;
	}
	
	void gameStart() {
		
		for (Frame frame : frames) {
			playFrameShoot(frame);
		}
	}
	
	private void playFrameShoot(Frame frame) {
		int totalPlayNumber = 2;
		int remainPinNumber = 10;
		PointController pointController = new PointController();
		
		while (totalPlayNumber != 0 && remainPinNumber != 0) {
			int knockDownPinNumber = PlayUtil.getKnockDownPinRandomNumber(remainPinNumber);
			frame.roll(pointController.getProperPoint(knockDownPinNumber));
			totalPlayNumber--;
			remainPinNumber -=knockDownPinNumber; 
		}
	}

	void screenPrint() {
		new ConsolePrinter(frames).print();
	}
}	
