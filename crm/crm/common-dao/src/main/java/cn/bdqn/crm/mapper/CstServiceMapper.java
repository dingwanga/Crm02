package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.CstService;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CstServiceMapper {

	public CstService getCstServiceById(@Param(value = "id") Long id)throws Exception;

	public List<CstService>	getCstServiceListByMap(Map<String,Object> param)throws Exception;

	public Integer getCstServiceCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCstService(CstService cstService)throws Exception;

	public Integer updateCstService(CstService cstService)throws Exception;

	public Integer deleteCstServiceById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCstService(Map<String,List<String>> params);


}
