package UseMongoDB.UseMongDB;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository <Users, String> {
//	 public Users findByFirstName(String firstName);
//	 public List<Users> findByLastName(String lastName);
}
