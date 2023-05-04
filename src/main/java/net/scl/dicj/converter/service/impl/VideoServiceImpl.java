package net.scl.dicj.converter.service.impl;

import net.scl.dicj.converter.domain.Video;
import net.scl.dicj.converter.mapper.VideoMapper;
import net.scl.dicj.converter.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VideoServiceImpl implements VideoService {


    @Autowired
    private VideoMapper videoMapper;


    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }

    @Override
    @Scheduled(fixedDelay = 2000)
    public void scheduleJobTest() throws Exception {
        System.out.println("Fixed Delay job test- test");
        //throw new CustomException("Custome Exception Info");
        //throw new Exception("Schedule Exception Test Success------");
    }
}
