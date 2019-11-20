package online.shixun.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.shixun.project.mapper.LolMapper;
import online.shixun.project.pojo.Theme;

@Service
public class LolService {

	@Autowired
	LolMapper lolMapper;
	public List<Theme> getallLOL() {
	
		return lolMapper.getallLOL();
	}

}
