import com.example.demo.Repository

@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{

}