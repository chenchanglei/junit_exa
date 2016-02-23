package junittest;

public class Calculator {
	private static int result;
	public void jia(int n){
		result=result+n;
	}
	public void jian(int n){
		result=result-n;
	}
	public void kong(int n){
		//空方法
	}
	public void chu(int n){
		result=result/n;
	}
	public void mi(int n){
		result=n*n;
	}
	public void sixunhuan(int n){
		for(;;);
	}
	public void clear(){
		result=0;
	}
	public int getResult(){
		return result;
	}
}
