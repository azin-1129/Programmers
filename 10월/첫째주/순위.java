package _10월._1째주;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 순위 {
	static int N;
	static int[][] map;
	static int wCnt, lCnt;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N=Integer.parseInt(br.readLine());
		
		map=new int[N+1][N+1];
		
		int total=0;
		
		for(int n=0;n<N;n++) {
			st=new StringTokenizer(br.readLine());
			map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]=1;
		}
		
		for(int n=1;n<=N;n++) {
			wCnt=0;
			lCnt=0;
			
			int res=wCnt+lCnt;
			
			if(res!=(N-1)) {
				continue;
			}else {
				total+=1;
			}
		}
		
		bw.write(total+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void win(int row) {
		for(int n=1;n<=N;n++) {
			if(map[row][n]==1) {
				wCnt+=1;
				win(n);
			}
		}
	}
	
	public static void lose(int col) {
		for(int n=1;n<=N;n++) {
			if(map[n][col]==1) {
				lCnt+=1;
				lose(n);
			}
		}
	}
}
