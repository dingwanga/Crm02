package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.SysUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface SysUserMapper {

	public SysUser getSysUserById(@Param(value = "id") Long id)throws Exception;

	public List<SysUser> getSysUserListByMap(Map<String,Object> param)throws Exception;

	public Integer getSysUserCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertSysUser(SysUser sysUser)throws Exception;

	public Integer updateSysUser(SysUser sysUser)throws Exception;

	public Integer deleteSysUserById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteSysUser(Map<String,List<String>> params);

}
