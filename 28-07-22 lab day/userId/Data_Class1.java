package throw_Exception;
import java.util.Scanner;


public class Data_Class1 {
	Scanner sc = new Scanner(System.in);
	String name,add,ph,s;
	private String password,user_id;

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public static final int PASSWORD_LENGTH = 8;
	 
}