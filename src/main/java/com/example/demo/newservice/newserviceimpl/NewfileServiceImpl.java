import com.example.demo.newservice.NewfileServiceImpl;


public class NewfileServiceImpl implements NewfileService{

    private final NewfileRepo repo;
    @Override
    public NewfileServiceImpl(NewfileRepo repo){
        this.repo = repo;
    }
    
    public NewFileEntity savedata(NewFileEntity st){

    }

    @Override
    public NewFileEntity getidval(Long id){

    }

    @Override
    public List<NewFileEntity> getalldata(){

    }

    @Override
    public NewFileEntity update(Long id,NewFileEntity st){

    }

    @Override
    public void del(Long id){

    }
}