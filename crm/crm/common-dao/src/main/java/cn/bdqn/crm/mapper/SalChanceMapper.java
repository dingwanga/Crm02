package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.SalChance;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SalChanceMapper {

	public SalChance getSalChanceById(@Param(value = "id") Long id)throws Exception;

	public List<SalChance>	getSalChanceListByMap(Map<String,Object> param)throws Exception;

	public Integer getSalChanceCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertSalChance(SalChance salChance)throws Exception;

	public Integer updateSalChance(SalChance salChance)throws Exception;

	public Integer deleteSalChanceById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteSalChance(Map<String,List<String>> params);


}
