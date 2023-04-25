package net.scl.dicj.converter.service;

import net.scl.dicj.converter.domain.Video;

import java.util.List;

public interface VideoService {

    List<Video> listVideo();

    void scheduleJobTest() throws Exception;

}
