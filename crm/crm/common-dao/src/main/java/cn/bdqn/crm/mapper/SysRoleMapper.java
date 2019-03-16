package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.SysRole;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRoleMapper {

	public SysRole getSysRoleById(@Param(value = "roleId") Integer roleId)throws Exception;

	public List<SysRole>	getSysRoleListByMap(Map<String,Object> param)throws Exception;

	public Integer getSysRoleCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertSysRole(SysRole sysRole)throws Exception;

	public Integer updateSysRole(SysRole sysRole)throws Exception;

	public Integer deleteSysRoleById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteSysRole(Map<String,List<String>> params);


}
