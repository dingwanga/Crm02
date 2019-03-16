package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.Storage;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StorageMapper {

	public Storage getStorageById(@Param(value = "id") Long id)throws Exception;

	public List<Storage>	getStorageListByMap(Map<String,Object> param)throws Exception;

	public Integer getStorageCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertStorage(Storage storage)throws Exception;

	public Integer updateStorage(Storage storage)throws Exception;

	public Integer deleteStorageById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteStorage(Map<String,List<String>> params);


}
