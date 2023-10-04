package _10월._1째주;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 퇴사2 {
	static int[][] table;
	static int N;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N=Integer.parseInt(br.readLine());
		int[] moneys=new int[N+1];
		int[] times=new int[N+1];
		
		for(int n=0;n<N;n++) {
			st=new StringTokenizer(br.readLine());
			moneys[n]=Integer.parseInt(st.nextToken());
			times[n]=Integer.parseInt(st.nextToken());
		}
		table=new int[N+1][N+1];
		
		bw.write(knapsack(N,times,moneys)+"\n");
		bw.flush();
		bw.close();
		br.close();
//		int money=Integer.parseInt(br.readLine());
//		N=Integer.parseInt(br.readLine());	
	}
	
	public static int knapsack(int day, int[] dur, int[] ms) {
		for(int n=0;n<=N;n++) {
			for(int d=0;d<=day;d++) {
				if(n==0 || d==0) {
					table[n][d]=0;
				}else if(dur[n-1]<=d) {
					table[n][d]=Integer.max(ms[n-1]+table[n-1][d-dur[n-1]], table[n-1][d]);
				}else {
					table[n][d]=table[n-1][d];
				}
			}
		}
		
		return table[N][day];
	}
}
