package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.CstCustomer;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CstCustomerMapper {

	public CstCustomer getCstCustomerById(@Param(value = "id") Long id)throws Exception;

	public List<CstCustomer>	getCstCustomerListByMap(Map<String,Object> param)throws Exception;

	public Integer getCstCustomerCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCstCustomer(CstCustomer cstCustomer)throws Exception;

	public Integer updateCstCustomer(CstCustomer cstCustomer)throws Exception;

	public Integer deleteCstCustomerById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCstCustomer(Map<String,List<String>> params);


}
