//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = (int) (Math.random()*10);
		}
		
		return arr;
	}
	public static void shiftEm(int[] array)
	{
		int[] temp = new int[array.length];
		int index = 0;
		int count = 0;
		for(int y = 0; y < array.length; y++) {
			if(array[y] == 7) {
				temp[index] = 7;
				index++;
			}
		
	}
}