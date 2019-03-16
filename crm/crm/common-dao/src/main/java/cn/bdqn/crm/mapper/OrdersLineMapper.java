package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.OrdersLine;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersLineMapper {

	public OrdersLine getOrdersLineById(@Param(value = "id") Long id)throws Exception;

	public List<OrdersLine>	getOrdersLineListByMap(Map<String,Object> param)throws Exception;

	public Integer getOrdersLineCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertOrdersLine(OrdersLine ordersLine)throws Exception;

	public Integer updateOrdersLine(OrdersLine ordersLine)throws Exception;

	public Integer deleteOrdersLineById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteOrdersLine(Map<String,List<String>> params);


}
