package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.BasDict;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BasDictMapper {
	//分页数量
	Integer getTotalCountByMap(Map<String,Object> param) throws Exception;

	BasDict getBasDictById(@Param(value = "id") Long id)throws Exception;

	//分页集合
	List<BasDict> getBasDictListByMap(Map<String,Object> param)throws Exception;

	Integer getBasDictCountByMap(Map<String,Object> param)throws Exception;

	Integer insertBasDict(BasDict basDict)throws Exception;

	Integer updateBasDict(BasDict basDict)throws Exception;

	Integer deleteBasDictById(@Param(value = "id") Long id)throws Exception;

	Integer batchDeleteBasDict(Map<String,List<String>> params);


}
