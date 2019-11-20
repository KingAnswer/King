package online.shixun.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import online.shixun.project.pojo.Theme;

@Mapper
public interface LolMapper {

	List<Theme> getallLOL();

}
