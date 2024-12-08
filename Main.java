import java.util.Scanner;
class MyExcepation extends Exception{
    @Override
    public String toString(){
        return "hello string methods toString()!";
    }
    @Override
    public String getMessage(){
        return "hello getMessage methods!";
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Exception class......!");
		int a = 8;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if(a<99){
		    try{
		        throw new MyExcepation();
		    }
		    catch(Exception e){
		        System.out.println(e.getMessage());
		        System.out.println(e.toString());
		        System.out.println(e);
		    }
		}
		
	}
}
