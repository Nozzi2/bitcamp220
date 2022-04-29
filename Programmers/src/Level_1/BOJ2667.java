package Level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ2667 {
	
	public int bolb(int[][] miro, int x, int y) {
		
		if(x<0 || y<0 || x>=miro.length || y>=miro[x].length) {
			return 0;
		} if (miro[x][y] != 1) {
			return 0;
		} else {
			miro[x][y] =2;
			return (1+bolb(miro,x+1,y)+bolb(miro,x,y+1)+bolb(miro,x-1,y)+bolb(miro,x,y-1));
		}
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sizeXY = Integer.parseInt(br.readLine());
		int[][] miro = new int[sizeXY][sizeXY];
		String s;
		for(int i=0; i<miro.length;i++) {
			s=br.readLine();
			for(int j=0; j<s.length(); j++) {
				miro[i][j] = Integer.parseInt(s.substring(j, j+1));
			}
		}
		
		BOJ2667 t = new BOJ2667();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int value;
		for(int i=0; i<miro.length;i++) {
			for(int j=0; j<miro[i].length; j++) {
				value = t.bolb(miro, i, j);
				if(value>0) {
					nums.add(value);
				}
			}
		}
		
		System.out.println(nums.size());
		Collections.sort(nums);
		for(int i=0; i<nums.size(); i++) {
			System.out.println(nums.get(i));
		}
	}
}
