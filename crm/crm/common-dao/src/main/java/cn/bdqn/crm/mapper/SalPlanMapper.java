package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.SalPlan;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SalPlanMapper {

	public SalPlan getSalPlanById(@Param(value = "id") Long id)throws Exception;

	public List<SalPlan>	getSalPlanListByMap(Map<String,Object> param)throws Exception;

	public Integer getSalPlanCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertSalPlan(SalPlan salPlan)throws Exception;

	public Integer updateSalPlan(SalPlan salPlan)throws Exception;

	public Integer deleteSalPlanById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteSalPlan(Map<String,List<String>> params);


}
