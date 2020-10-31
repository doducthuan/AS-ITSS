/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raphaellevy.fullscreen;

/**
 *
 * @author apple
 */
public class FullScreenException extends Exception{
    private static final long serialVersionUID = 1L;
	public static final int CLASS_DOES_NOT_EXIST = 0;
	public static final int REFLECTION_ERROR = 1;
	
	FullScreenException(int reason) {
		super(intToMethod(reason));
	}
	private static String intToMethod(int reason) {
		switch (reason) {
		case CLASS_DOES_NOT_EXIST:
			return "Full Screen not Available on this computer; are you running macOS?";
		case REFLECTION_ERROR:
			return "Error Opening Full Screen";
		}
		return "";
	}
}
