package cn.bdqn.crm.mapper;
import cn.bdqn.crm.pojo.CstLinkman;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CstLinkmanMapper {

	public CstLinkman getCstLinkmanById(@Param(value = "id") Long id)throws Exception;

	public List<CstLinkman>	getCstLinkmanListByMap(Map<String,Object> param)throws Exception;

	public Integer getCstLinkmanCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertCstLinkman(CstLinkman cstLinkman)throws Exception;

	public Integer updateCstLinkman(CstLinkman cstLinkman)throws Exception;

	public Integer deleteCstLinkmanById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteCstLinkman(Map<String,List<String>> params);


}
