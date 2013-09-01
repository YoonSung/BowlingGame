package com.rbgroup.print;

import java.util.List;
import com.rbgroup.play.Frame;

public class ConsolePrinter implements Printable{

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

		for (Frame frame : frames) {
			System.out.printf("%3d |", frame.getFrameNumber());
		}
		
		System.out.print(NEW_LINE);
		
		for (Frame frame : frames) {
			System.out.format("%-3s|", frame.getFramePointString());
		}
		
		System.out.print(NEW_LINE);
		
		int totalscore=0;
		for (Frame frame : frames) {
			totalscore += frame.getScore();
			System.out.format("%3d|", totalscore);
		}
		
		System.out.print(NEW_LINE);
		System.out.print(NEW_LINE);
	}
}
