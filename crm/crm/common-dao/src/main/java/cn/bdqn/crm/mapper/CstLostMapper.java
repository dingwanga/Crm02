package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.CstLost;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CstLostMapper {

	public CstLost getCstLostById(@Param(value = "id") Long id)throws Exception;

	public List<CstLost>	getCstLostListByMap(Map<String,Object> param)throws Exception;

	public Integer getCstLostCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCstLost(CstLost cstLost)throws Exception;

	public Integer updateCstLost(CstLost cstLost)throws Exception;

	public Integer deleteCstLostById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCstLost(Map<String,List<String>> params);


}
