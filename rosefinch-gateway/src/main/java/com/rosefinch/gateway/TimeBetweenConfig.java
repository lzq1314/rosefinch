package com.rosefinch.gateway;

import java.time.LocalTime;

import org.springframework.stereotype.Component;

public class TimeBetweenConfig {

	private LocalTime start;
	private LocalTime end;
	public LocalTime getStart() {
		return start;
	}
	public void setStart(LocalTime start) {
		this.start = start;
	}
	public LocalTime getEnd() {
		return end;
	}
	public void setEnd(LocalTime end) {
		this.end = end;
	}
	
	
}
