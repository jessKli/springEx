package UseMongoDB.UseMongDB;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Users {
	@Id
	public String id;
	public String userName;
	public String password;
	public int role;
	
	public Users(){}
	
//	public Users(String firstName,String lastName) {
//		this.userName=firstName;
//		this.password=lastName;
//		
//	}
	
	 @Override
	    public String toString() {
	        return String.format(
	                "Customer[id=%s, userName='%s', password='%s',role=%s]\n",
	                id, userName, password,role);
	    }

}
