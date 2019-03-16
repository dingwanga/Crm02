package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.SysRight;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRightMapper {

	public SysRight getSysRightById(@Param(value = "id") Long id)throws Exception;

	public List<SysRight>	getSysRightListByMap(Map<String,Object> param)throws Exception;

	public Integer getSysRightCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertSysRight(SysRight sysRight)throws Exception;

	public Integer updateSysRight(SysRight sysRight)throws Exception;

	public Integer deleteSysRightById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteSysRight(Map<String,List<String>> params);


}
