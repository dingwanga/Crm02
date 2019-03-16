package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.Orders;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersMapper {

	public Orders getOrdersById(@Param(value = "id") Long id)throws Exception;

	public List<Orders>	getOrdersListByMap(Map<String,Object> param)throws Exception;

	public Integer getOrdersCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertOrders(Orders orders)throws Exception;

	public Integer updateOrders(Orders orders)throws Exception;

	public Integer deleteOrdersById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteOrders(Map<String,List<String>> params);


}
