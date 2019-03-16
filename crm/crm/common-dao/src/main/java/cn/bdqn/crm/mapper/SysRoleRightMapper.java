package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.SysRoleRight;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRoleRightMapper {

	public SysRoleRight getSysRoleRightById(@Param(value = "id") Long id)throws Exception;

	public List<SysRoleRight>	getSysRoleRightListByMap(Map<String,Object> param)throws Exception;

	public Integer getSysRoleRightCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertSysRoleRight(SysRoleRight sysRoleRight)throws Exception;

	public Integer updateSysRoleRight(SysRoleRight sysRoleRight)throws Exception;

	public Integer deleteSysRoleRightById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteSysRoleRight(Map<String,List<String>> params);


}
