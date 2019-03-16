package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.Product;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {

	public Product getProductById(@Param(value = "id") Long id)throws Exception;

	public List<Product>	getProductListByMap(Map<String,Object> param)throws Exception;

	public Integer getProductCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertProduct(Product product)throws Exception;

	public Integer updateProduct(Product product)throws Exception;

	public Integer deleteProductById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteProduct(Map<String,List<String>> params);


}
