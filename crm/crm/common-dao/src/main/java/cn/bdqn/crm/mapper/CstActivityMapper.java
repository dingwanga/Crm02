package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.CstActivity;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CstActivityMapper {

	public CstActivity getCstActivityById(@Param(value = "id") Long id)throws Exception;

	public List<CstActivity>	getCstActivityListByMap(Map<String,Object> param)throws Exception;

	public Integer getCstActivityCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCstActivity(CstActivity cstActivity)throws Exception;

	public Integer updateCstActivity(CstActivity cstActivity)throws Exception;

	public Integer deleteCstActivityById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCstActivity(Map<String,List<String>> params);


}
