import com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{
    
}